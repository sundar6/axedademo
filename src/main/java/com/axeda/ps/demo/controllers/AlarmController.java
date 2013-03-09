package com.axeda.ps.demo.controllers;

import com.axeda.ps.demo.groovy.IAckDeviceAlarms;
import com.axeda.ps.demo.model.Alarm;
import com.axeda.ps.demo.model.AlarmList;
import com.axeda.ps.demo.model.Asset;
import com.axeda.ps.demo.model.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jellin
 * Date: 4/12/12
 * Time: 11:16 AM
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class AlarmController {

    public void setJdbcTemplate(SimpleJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void setAckDeviceAlarms(IAckDeviceAlarms ackDeviceAlarms) {
        this.ackDeviceAlarms = ackDeviceAlarms;
    }

    @Autowired
    private SimpleJdbcTemplate jdbcTemplate = null;
    
    @Autowired
    private IAckDeviceAlarms ackDeviceAlarms = null;

    private String username = null;
    private String password = null;
    private String axedaUrl = null;

    @Value("${platform.username}")
    public void setUsername(String username) {
        this.username = username;
    }
    @Value("${platform.password}")
    public void setPassword(String password) {
        this.password = password;
    }

    @Value("${platform.url}")
    public void setAxedaUrl(String axedaUrl) {
        this.axedaUrl = axedaUrl;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/alarm/list")
    public
    @ResponseBody
    AlarmList getAlarms() {
        List<Alarm> al = jdbcTemplate.query("select * from alarms", new ParameterizedRowMapper<Alarm>() {
            public Alarm mapRow(ResultSet resultSet, int i) throws SQLException {
                return new Alarm(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6));
            }

        });

        return new AlarmList(al);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/alarm/new" )
    public @ResponseBody Result addAlarm(@RequestBody Alarm alarm) {
           jdbcTemplate.update("insert into alarms values (?,?,?,?,?,?)",alarm.getSerialnumber(),alarm.getModelnumber(),alarm.getDeviceid(),alarm.getName(), alarm.getDescription(),alarm.getSeverity());
           return new Result(Result.OK,null);
       }

    @RequestMapping(method = RequestMethod.GET, value = "/alarm/ackdevice/{deviceid}")
    public @ResponseBody Result ackDeviceAlarms(@PathVariable String deviceid){
        ackDeviceAlarms.ackDeviceAlarms(deviceid, username, password,axedaUrl);
        return new Result(Result.OK,null);

    }

    @RequestMapping(method = RequestMethod.GET, value = "/alarm/clear" )
          public @ResponseBody
           Result clearAlarm() {
                 jdbcTemplate.update("delete from alarms");
                 return new Result(Result.OK,null);
             }
    
}
