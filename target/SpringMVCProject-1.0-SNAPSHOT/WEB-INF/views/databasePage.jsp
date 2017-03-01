<%--
  Created by IntelliJ IDEA.
  User: hyunchoi
  Date: 2/28/17
  Time: 2:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

<ul>
    <c:forEach var="listValue" items="${message}">
        <li>${listValue.ID}</li>
    </c:forEach>
</ul>
</body>
</html>
