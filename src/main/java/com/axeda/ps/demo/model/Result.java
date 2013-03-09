package com.axeda.ps.demo.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by IntelliJ IDEA.
 * User: jeff
 * Date: 4/12/12
 * Time: 6:49 PM
 * To change this template use File | Settings | File Templates.
 */
@XmlRootElement
public class Result {
    
    public static String OK = "OK";
    public static String FAIL = "FAIL";
    
    
   private String status;
   private String message;


    public Result(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public Result() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
