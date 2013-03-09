package com.axeda.ps.demo.awp.web;


public class DataMessage {
    private String dataItemName;
    private String value;
    private String type;
    private String serialNumber;
    private String modelNumber;

    public String getDataItemName() {
        return dataItemName;
    }

    public void setDataItemName(String dataItemName) {
        this.dataItemName = dataItemName;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    @Override
    public String toString() {
        return "DataMessage{" +
                "dataItemName='" + dataItemName + '\'' +
                ", value='" + value + '\'' +
                ", type='" + type + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", modelNumber='" + modelNumber + '\'' +
                '}';
    }

    boolean validate(){
        if(modelNumber!=null && serialNumber!=null && dataItemName!=null && value!=null && type !=null
        && !modelNumber.equals("") && !serialNumber.equals("") && !dataItemName.equals("") && !value.equals("") && !type.equals("")){
            return true;
        }   else{
            return false;
        }
    }
}