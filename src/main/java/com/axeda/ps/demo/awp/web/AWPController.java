package com.axeda.ps.demo.awp.web;


import com.axeda.protocol.awp.*;
import com.axeda.protocol.common.ChannelProvider;
import com.axeda.protocol.common.SocketChannelProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;


@Controller
public class AWPController {

    private String serverAddress = null;
    private int timeout = 30;


    @Value("${platform.awp}")
    public void setServerAddress(String serverAddress) {
        this.serverAddress = serverAddress;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        return "redirect:senddata";
    }

    @RequestMapping(value = "/senddata", method = RequestMethod.GET)
    public void setupData(Model model) {


        model.addAttribute("dataitem", new DataMessage());
    }

    @RequestMapping(value = "/sendalarm", method = RequestMethod.GET)
    public void setupAlarm(Model model) {


        model.addAttribute("alarm", new AlarmMessage());
    }

    @RequestMapping(value = "/transmitAlarm", method = RequestMethod.POST)
    public ModelAndView transmitAlarm(@ModelAttribute("alarm") AlarmMessage alarm, Model model) {

        try {
            DataItem dataItem = null;

            if (!alarm.validate()) {
                ModelAndView mav = new ModelAndView("error");
                mav.addObject("usermessage", "Error Sending Alarm Check Input");
                return mav;
            }

            if (alarm.getType().equals("string")) {
                String value = alarm.getValue();
                dataItem = new DataItem(alarm.getDataItemName(), value);
            } else if (alarm.getType().equals("analog")) {
                Long value = Long.parseLong(alarm.getValue());
                dataItem = new DataItem(alarm.getDataItemName(), value);
            } else if (alarm.getType().equals("digital")) {
                Boolean value = Boolean.parseBoolean(alarm.getValue());
                dataItem = new DataItem(alarm.getDataItemName(), value);

            }

            Header header = new Header(alarm.getModelNumber(), alarm.getSerialNumber(), "default", false, false);
            Transmission transmission = new Transmission(header);
            com.axeda.protocol.awp.AlarmMessage alarmMessage = new com.axeda.protocol.awp.AlarmMessage(alarm.getAlarmName(), alarm.getAlarmDescr(),
                    alarm.getSeverity(), dataItem, new Date(), 5);
            transmission.addMessage(alarmMessage);
            sendAndReceive(transmission);
            ModelAndView mav = new ModelAndView("transmitAlarm");
            mav.addObject("usermessage", alarm);
            return mav;
        } catch (Exception e) {
            ModelAndView mav = new ModelAndView("error");
            mav.addObject("usermessage", "Error Sending DataItem:" + e.getMessage());
            return mav;
        }
    }

    @RequestMapping(value = "/transmitDataItem", method = RequestMethod.POST)
    public ModelAndView transmitDataItem(@ModelAttribute("dataitem") DataMessage dataitem, Model model) {

        try {
            if (!dataitem.validate()) {
                ModelAndView mav = new ModelAndView("error");
                mav.addObject("usermessage", "Error Sending DataItem Check Input");
                return mav;
            }

            DataItem dataItem = null;

            if (dataitem.getType().equals("string")) {
                String value = dataitem.getValue();
                dataItem = new DataItem(dataitem.getDataItemName(), value);
            } else if (dataitem.getType().equals("analog")) {
                Long value = Long.parseLong(dataitem.getValue());
                dataItem = new DataItem(dataitem.getDataItemName(), value);
            } else if (dataitem.getType().equals("digital")) {
                Boolean value = Boolean.parseBoolean(dataitem.getValue());
                dataItem = new DataItem(dataitem.getDataItemName(), value);

            }

            Header header = new Header(dataitem.getModelNumber(), dataitem.getSerialNumber(), "default", false, false);
            Transmission transmission = new Transmission(header);
            com.axeda.protocol.awp.DataMessage dataMessage = new com.axeda.protocol.awp.DataMessage(dataItem, new Date(), 0);
            transmission.addMessage(dataMessage);
            sendAndReceive(transmission);
            System.out.println("transmission complete");
            //model.addAttribute("usermessage", dataitem);
            ModelAndView mav = new ModelAndView("transmitDataItem");
            mav.addObject("usermessage", dataitem);
            return mav;
        } catch (Exception e) {
            ModelAndView mav = new ModelAndView("error");
            mav.addObject("usermessage", "Error Sending DataItem:" + e.getMessage());
            return mav;
        }
    }


    /* Use Transport mechanism to send AWP messages to Axeda Platform. */
    private  void sendAndReceive(Transmission trans) {
        TransmissionTransport transport = new StreamTransmissionTransport(
                getChannelProvider(), serverAddress);
        try {
            System.out.print("sending....");
            transport.send(trans, timeout);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* Create Socket-based channel provider. */
    private  ChannelProvider getChannelProvider() {
        return (new SocketChannelProvider());
    }
}
