<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: abrarhayat
  Date: 16/11/2022
  Time: 4:09 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Grocery List</title>
</head>
<body>
<c:forEach items="${groceries}" var="grocery">
    <img src="images/${grocery.filename}"><br>
    <h1>${grocery.title}</h1>
    Type: ${grocery.type}<br>
    Height: ${grocery.height}<br>
    Width: ${grocery.width}<br>
    Rating: ${grocery.rating}<br>
    <br>
</c:forEach>
</body>
</html>
