<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kamel
  Date: 1/12/2017
  Time: 3:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome!</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

</head>
<body>
<div class="container">
    <div class="jumbotron" style="background:url(https://www.goodfreephotos.com/albums/people/people-in-a-coffee-shop.jpg);
                                      background-position: 0% 25%;
                                      background-size: cover;
                                      background-repeat: no-repeat;
                                      color: white;
                                      text-shadow: black 0.3em 0.3em 0.3em;
                                      height: 100vh;">
        <div class="jumbotron" style="background-color:rgba(0, 0, 0, 0.6);
                    height: 100%">
            <h1>
                ${welcome}
            </h1>

            <hr>
            <br>
            <div class="text-center"><h2>insert table here</h2></div>

            <table class="table table-hover">
                <tr>
                    <th>Product</th>
                    <th>Type</th>
                    <th>Price</th>
                </tr>
                 <c:forEach var="listValue" items="${message}">
                     <tr>
                     <td>${listValue.name}</td>
                     <td>${listValue.price}</td>
                     </tr>
                </c:forEach>
            </table>
            <!--
            <ul>
                <c:forEach var="listValue" items="${message}">
                    <li>${listValue.name}</li>
                </c:forEach>
            </ul>

            -->
        </div>
    </div>
</div>



</body>
</html>
