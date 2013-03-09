<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>

<html>
<head>
    <title>Spring MVC Forms</title>
</head>
<body>
<h1>
    Sent Alarm: <c:out value="${usermessage.alarmName}"></c:out>:<c:out value="${usermessage.alarmDescr}"></c:out>
</h1>
</body>
</html>