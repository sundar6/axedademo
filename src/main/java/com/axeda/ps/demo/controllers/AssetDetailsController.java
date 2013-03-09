package com.axeda.ps.demo.controllers;

import com.axeda.ps.demo.model.Asset;
import com.axeda.ps.demo.model.AssetDetail;
import com.axeda.ps.demo.model.AssetDetailList;
import com.axeda.ps.demo.model.AssetList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jellin
 * Date: 4/12/12
 * Time: 10:29 AM
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class AssetDetailsController {

    public void setJdbcTemplate(SimpleJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Autowired
    private SimpleJdbcTemplate jdbcTemplate = null;

    @RequestMapping(method = RequestMethod.GET, value = "/assetdetail/{model}/{serial}")
    public
    @ResponseBody
    AssetDetail getAssetDetails(@PathVariable String model, @PathVariable String serial) {

        String sql = "select * from assetdetails where modelnumber = ? and serialnumber = ?";

        AssetDetail ao = jdbcTemplate.queryForObject(sql,
                new ParameterizedRowMapper<AssetDetail>() {
                    public AssetDetail mapRow(ResultSet resultSet, int i) throws SQLException {
                        return new AssetDetail(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6), resultSet.getString(7), resultSet.getString(8));
                    }
                }, model, serial);

        return ao;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/assetdetail/list")
           public
           @ResponseBody
        AssetDetailList getAssets() {

               String sql = "select * from assetdetails";

               List<AssetDetail> ao = jdbcTemplate.query(sql,
                       new ParameterizedRowMapper<AssetDetail>() {
                           public AssetDetail mapRow(ResultSet resultSet, int i) throws SQLException {
                               return new AssetDetail(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6), resultSet.getString(7), resultSet.getString(8));
                           }
                       });

               return new AssetDetailList(ao);
           }


}
