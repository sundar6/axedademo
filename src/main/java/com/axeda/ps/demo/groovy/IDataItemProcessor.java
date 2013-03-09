package com.axeda.ps.demo.groovy;

import com.axeda.ps.demo.model.DataItem;

/**
 * Created by IntelliJ IDEA.
 * User: jeff
 * Date: 4/12/12
 * Time: 9:39 PM
 * To change this template use File | Settings | File Templates.
 */
public interface IDataItemProcessor {
    
    public DataItem parseMessage(String messsage);
}
