package com.axeda.ps.demo.amq;

import com.axeda.ps.demo.groovy.IDataItemProcessor;
import com.axeda.ps.demo.model.DataItem;
import com.axeda.ps.demo.model.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;


/**
 * Created by IntelliJ IDEA.
 * User: jeff
 * Date: 4/12/12
 * Time: 9:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class DataItemListener implements MessageListener {

    public void setJdbcTemplate(SimpleJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void setDataItemProcessor(IDataItemProcessor dataItemProcessor){
        this.dataItemProcessor = dataItemProcessor;
    }

    private   SimpleJdbcTemplate jdbcTemplate;

    private IDataItemProcessor dataItemProcessor;

    public void onMessage(Message message) {
        try {
            TextMessage tm = (TextMessage)message;
            String strMessage =   tm.getText();
            System.out.println(strMessage);
            DataItem dataItem = dataItemProcessor.parseMessage(strMessage);
            System.out.println(dataItem);
            System.out.println(jdbcTemplate==null);
            jdbcTemplate.update("insert into dataitems values (?,?,?)",dataItem.getName(),dataItem.getValue(),dataItem.getSerialnumber());


        } catch (JMSException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
            //To change body of catch statement use File | Settings | File Templates.
        }
    }

    public void initialize(){

    }

}
