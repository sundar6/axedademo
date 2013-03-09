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
public class AssetDetailList {

    private List<AssetDetail> assets;

    public AssetDetailList(List<AssetDetail> assets) {

          this.assets = assets;
      }

      public AssetDetailList() {
      }

    @XmlElement(name="AssetDetail")
    public List<AssetDetail> getAssetDetail() {
        return assets;
    }

    public void setAssetDetail(List<AssetDetail> assets) {
        this.assets = assets;
    }


}
