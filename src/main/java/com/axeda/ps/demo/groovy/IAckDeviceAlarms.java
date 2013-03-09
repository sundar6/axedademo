package com.axeda.ps.demo.groovy;

/**
 * Created by IntelliJ IDEA.
 * User: jeff
 * Date: 4/12/12
 * Time: 8:25 PM
 * To change this template use File | Settings | File Templates.
 */
public interface IAckDeviceAlarms {
    
    public void ackDeviceAlarms(String deviceid, String username,String password,String url);
    
}
