package com.axeda.ps.demo.controllers;

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
 * Date: 4/14/12
 * Time: 9:44 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class AssetController {

    public void setJdbcTemplate(SimpleJdbcTemplate jdbcTemplate) {
            this.jdbcTemplate = jdbcTemplate;
        }

        @Autowired
        private SimpleJdbcTemplate jdbcTemplate = null;

    @RequestMapping(method = RequestMethod.GET, value = "/asset/list")
        public
        @ResponseBody
        AssetList getAssets() {

            String sql = "select * from assets";

            List<Asset> ao = jdbcTemplate.query(sql,
                    new ParameterizedRowMapper<Asset>() {
                        public Asset mapRow(ResultSet resultSet, int i) throws SQLException {
                            return new Asset(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4));
                        }
                    });

            return new AssetList(ao);
        }

    @RequestMapping(method = RequestMethod.POST, value = "/asset/new" )
       public @ResponseBody
        Result addAsset(@RequestBody Asset asset) {
              jdbcTemplate.update("insert into assets values (?,?,?,?)",asset.getSerialnumber(),asset.getModelnumber(),asset.getDeviceid(),asset.getRegistrationdate());
              return new Result(Result.OK,null);
          }

    @RequestMapping(method = RequestMethod.GET, value = "/asset/clear" )
          public @ResponseBody
           Result clearAssets() {
                 jdbcTemplate.update("delete from assets");
                 return new Result(Result.OK,null);
             }

}
