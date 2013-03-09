package com.axeda.ps.demo.awp.web;

/**
 * Created with IntelliJ IDEA.
 * User: jellin
 * Date: 4/15/12
 * Time: 12:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class AlarmMessage extends DataMessage {

    private String alarmName;
    private String alarmDescr;
    private long severity;

    public String getAlarmName() {
        return alarmName;
    }

    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName;
    }

    public String getAlarmDescr() {
        return alarmDescr;
    }

    public void setAlarmDescr(String alarmDescr) {
        this.alarmDescr = alarmDescr;
    }

    public long getSeverity() {
        return severity;
    }

    public void setSeverity(long severity) {
        this.severity = severity;
    }

    public boolean validate(){
        boolean parent = super.validate();
        if(parent){
            if (alarmDescr!=null && !alarmDescr.equals("") && alarmName!=null && !alarmName.equals("")){
                return true;
            }else return false;
        } else{
            return false;
        }
    }
}
