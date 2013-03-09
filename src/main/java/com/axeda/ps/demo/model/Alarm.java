package com.axeda.ps.demo.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created with IntelliJ IDEA.
 * User: jellin
 * Date: 4/12/12
 * Time: 11:10 AM
 * To change this template use File | Settings | File Templates.
 */
@XmlRootElement
public class Alarm {

    private String   serialnumber;
    private String   modelnumber;
    private String   deviceid;
    private String   name;
    private String   description;
    private String   severity;

    public Alarm() {
    }

    public Alarm(String serialnumber, String modelnumber, String deviceid, String name, String description, String severity) {
        this.serialnumber = serialnumber;
        this.modelnumber = modelnumber;
        this.deviceid = deviceid;
        this.name = name;
        this.description = description;
        this.severity = severity;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    @Override
    public String toString() {
        return "Alarm{" +
                "serialnumber='" + serialnumber + '\'' +
                ", modelnumber='" + modelnumber + '\'' +
                ", deviceid='" + deviceid + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", severity='" + severity + '\'' +
                '}';
    }
}

