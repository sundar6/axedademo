package com.axeda.ps.demo.controllers;

import com.axeda.ps.demo.groovy.IAckDeviceAlarms;
import com.axeda.ps.demo.model.*;
import org.springframework.beans.factory.annotation.Autowired;
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
public class DataItemController {

    public void setJdbcTemplate(SimpleJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }



    @Autowired
    private SimpleJdbcTemplate jdbcTemplate = null;
    
    @Autowired
    private IAckDeviceAlarms ackDeviceAlarms = null;

    @RequestMapping(method = RequestMethod.GET, value = "/dataitem/list")
    public
    @ResponseBody
    DataItemList getDataItems() {
        List<DataItem> al = jdbcTemplate.query("select * from dataitems", new ParameterizedRowMapper<DataItem>() {
            public DataItem mapRow(ResultSet resultSet, int i) throws SQLException {
                return new DataItem(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3));
            }

        });

        return new DataItemList(al);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/dataitem/clear" )
            public @ResponseBody
             Result clearDataItem() {
                   jdbcTemplate.update("delete from dataitems");
                   return new Result(Result.OK,null);
               }

    
}
