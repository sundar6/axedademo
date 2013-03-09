package com.axeda.ps.demo.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created with IntelliJ IDEA.
 * User: jellin
 * Date: 4/12/12
 * Time: 10:27 AM
 * To change this template use File | Settings | File Templates.
 */

@XmlRootElement ( name = "AssetDetail")
public class AssetDetail {


    private String serialNumber;
    private String modelNumber;
    private String region;
    private String country;
    private String location;
    private String color;
    private String size;
    private String language;

    public AssetDetail() {
    }

    public AssetDetail(String serialNumber, String modelNumber, String region, String country, String location, String color, String size, String language) {
        this.serialNumber = serialNumber;
        this.modelNumber = modelNumber;
        this.region = region;
        this.country = country;
        this.location = location;
        this.color = color;
        this.size = size;
        this.language = language;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
