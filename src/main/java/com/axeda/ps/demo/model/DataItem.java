package com.axeda.ps.demo.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created with IntelliJ IDEA.
 * User: jellin
 * Date: 4/14/12
 * Time: 5:25 PM
 * To change this template use File | Settings | File Templates.
 */

@XmlRootElement
public class DataItem {

    private String name;
    private String value;
    private String serialnumber;

    public DataItem(String name, String value, String serialnumber) {
        this.name = name;
        this.value = value;
        this.serialnumber = serialnumber;
    }

    public DataItem() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber;
    }

    @Override
    public String toString() {
        return "DataItem{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                ", serialnumber='" + serialnumber + '\'' +
                '}';
    }
}
