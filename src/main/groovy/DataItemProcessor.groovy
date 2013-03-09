import com.axeda.ps.demo.groovy.IDataItemProcessor
import com.axeda.ps.demo.model.DataItem

public class DataItemProcessor implements IDataItemProcessor{

    DataItem parseMessage(String messsage) {
        def records = new XmlSlurper().parseText(messsage);
        println(records.value);
        println(records.serialnumber)
        println(records.name)
        def dataItem = new DataItem(records.name.toString(),records.value.toString(),records.serialnumber.toString());
        return dataItem;
    }
}