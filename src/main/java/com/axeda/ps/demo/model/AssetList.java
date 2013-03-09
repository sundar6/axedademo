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
public class AssetList {

    private List<Asset> assets;

    public AssetList(List<Asset> assets) {

          this.assets = assets;
      }

      public AssetList() {
      }

    @XmlElement(name="asset")
    public List<Asset> getAssets() {
        return assets;
    }

    public void setAssets(List<Asset> assets) {
        this.assets = assets;
    }


}
