package com.axeda.ps.demo.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jellin
 * Date: 4/12/12
 * Time: 11:12 AM
 * To change this template use File | Settings | File Templates.
 */
@XmlRootElement
public class DataItemList {

    private List<DataItem> dataitems;

    public DataItemList(List<DataItem> dataitems) {

          this.dataitems = dataitems;
      }

      public DataItemList() {
      }

    @XmlElement(name="dataitem")
    public List<DataItem> getDataitems() {
        return dataitems;
    }

    public void setDataitems(List<DataItem> dataitems) {
        this.dataitems = dataitems;
    }


}
