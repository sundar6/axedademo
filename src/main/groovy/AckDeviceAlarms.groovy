import groovyx.net.http.HTTPBuilder

import static groovyx.net.http.Method.*

import static groovyx.net.http.ContentType.XML
import com.axeda.ps.demo.groovy.IAckDeviceAlarms;
/**
 * Created by IntelliJ IDEA.
 * User: jeff
 * Date: 4/12/12
 * Time: 7:11 PM
 * To change this template use File | Settings | File Templates.
 */

public class AckDeviceAlarms implements IAckDeviceAlarms {

    @Override
    void ackDeviceAlarms(String deviceid, String username,String password,String url) {


        def http = new HTTPBuilder(url)

        http.request(POST, XML) {
            uri.path = '/services/v1/rest/Scripto/execute/axd_scripto_ackDeviceAlarms'
            uri.query = [deviceid: deviceid]

            headers = ['Content-Type': 'application/x-www-form-urlencoded', x_axeda_wss_username: username, x_axeda_wss_password: password]


        }

    }


}


