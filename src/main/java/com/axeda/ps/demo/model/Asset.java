package com.axeda.ps.demo.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created with IntelliJ IDEA.
 * User: jellin
 * Date: 4/14/12
 * Time: 9:39 PM
 * To change this template use File | Settings | File Templates.
 */
@XmlRootElement
public class Asset
{

    private String serialnumber;
    private String modelnumber;
    private String deviceid;
    private String registrationdate;

    public Asset(String serialnumber, String modelnumber, String deviceid, String registrationdate) {
        this.serialnumber = serialnumber;
        this.modelnumber = modelnumber;
        this.deviceid = deviceid;
        this.registrationdate = registrationdate;
    }

    public Asset() {
    }

    public String getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber;
    }

    public String getModelnumber() {
        return modelnumber;
    }

    public void setModelnumber(String modelnumber) {
        this.modelnumber = modelnumber;
    }

    public String getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid;
    }

    public String getRegistrationdate() {
        return registrationdate;
    }

    public void setRegistrationdate(String registrationdate) {
        this.registrationdate = registrationdate;
    }
}
