<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>

<html>
<head>
    <title>Spring MVC Forms</title>
</head>
<body>
<h1>
    Sent <c:out value="${usermessage.dataItemName}"></c:out>=<c:out value="${usermessage.value}"></c:out>
</h1>
</body>
</html>