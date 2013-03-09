<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ page session="false" %>
<html>
<Title>Axeda Integration Test Harness</Title>
<head>
<link rel="stylesheet" type="text/css"  href="/styles.css">
    <link rel="stylesheet" type="text/css" href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.10/themes/humanity/jquery-ui.css">
     <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
     <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.8.18/jquery-ui.min.js"></script>
     <script>
         $(document).ready(function()
         {

             $("#openers").click(function(e)
             {
                 e.preventDefault();
                 var serializedForm = $("#alarmselectform").serialize()
                 var url = "/app/transmitAlarm"
                 $.post(url, serializedForm,function(myXML) {
                     $('#alarmresult').html(myXML);
                 });
                 alert(serializedForm)
             });
         });



     </script>
</head>

    <p>Send an Alarm to an Asset</p>
<div id="alarmresult"></div>

    <f:form method="post" id="alarmselectform" action="transmitAlarm" commandName="alarm">
        <table>
            <tr>
                <td><f:label path="modelNumber">ModelNumber</f:label></td>
                <td><f:input path="modelNumber" size="25"  cssClass="text ui-widget-content ui-corner-all"/></td>
            </tr>
            <tr>
                <td><f:label path="serialNumber">SerialNumber</f:label></td>
                <td><f:input path="serialNumber" size="25"  cssClass="text ui-widget-content ui-corner-all"/></td>
            </tr>
            <tr>
                <td><f:label path="type">Type</f:label></td>
                <td><f:select path="type" cssClass="text ui-widget-content ui-corner-all"><f:option value="string"/>
                               <f:option value="analog"/>
                                <f:option value="digital"/></f:select>
                </td>
            </tr>
            <tr>
                <td><f:label path="dataItemName">DataItem Name</f:label></td>
                <td><f:input path="dataItemName" size="25"  cssClass="text ui-widget-content ui-corner-all"/></td>
            </tr>
            <tr>
                <td><f:label path="value">DataItem Value</f:label></td>
                <td><f:input path="value" size="25" cssClass="text ui-widget-content ui-corner-all"/></td>
            </tr>

            <tr>
                          <td><f:label path="alarmName">Alarm Name</f:label></td>
                          <td><f:input path="alarmName" size="25"  cssClass="text ui-widget-content ui-corner-all"/></td>
                      </tr>
            <tr>
                          <td><f:label path="alarmDescr">Alarm Desc</f:label></td>
                          <td><f:input path="alarmDescr" size="25"  cssClass="text ui-widget-content ui-corner-all"/></td>
                      </tr>
            <tr>
            <tr>
                                  <td><f:label path="severity">Alarm Severity</f:label></td>
                                  <td><f:input path="severity" size="25" cssClass="text ui-widget-content ui-corner-all"/></td>
                              </tr>
            </f:form>

            <tr>
                <td colspan="2">
                    <button id="openers">Send Alarm</button>
                </td>
            </tr>
            </tr>
        </table>

</div>


</body>
</html>