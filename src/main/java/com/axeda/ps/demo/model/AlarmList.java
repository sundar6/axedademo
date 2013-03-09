package com.axeda.ps.demo.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jellin
 * Date: 4/12/12
 * Time: 11:12 AM
 * To change this template use File | Settings | File Templates.
 */
@XmlRootElement
public class AlarmList {

    private List<Alarm> alarms;

    public AlarmList(List<Alarm> alarms) {

          this.alarms = alarms;
      }

      public AlarmList() {
      }

    @XmlElement(name="alarm")
    public List<Alarm> getAlarms() {
        return alarms;
    }

    public void setAlarms(List<Alarm> alarms) {
        this.alarms = alarms;
    }


}
