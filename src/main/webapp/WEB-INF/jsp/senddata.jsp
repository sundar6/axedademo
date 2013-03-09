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
        $(function()
        {

            $("#opener").click(function(e)
            {
                e.preventDefault();
                var serializedForm = $("#selectform").serialize()
                var url = "/app/transmitDataItem"
                $.post(url, serializedForm,function(myXML) {
                    $('#result').html(myXML);
                });
            });
        });



    </script>

</head>
<div>
           <div id="result"></div>
    <p>Send a DataItem to an Asset</p>

    <f:form id="selectform" method="post"  commandName="dataitem">
        <table>
            <tr>
                <td><f:label path="modelNumber">ModelNumber</f:label></td>
                <td><f:input path="modelNumber" size="25" cssClass="text ui-widget-content ui-corner-all"/></td>
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
            </f:form>

            <tr>
                <td colspan="2">
                    <button id="opener">Send DataItem</button>
                </td>
            </tr>
        </table>

</div>








</body>
</html>