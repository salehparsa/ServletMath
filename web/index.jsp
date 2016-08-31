<%--
  Created by IntelliJ IDEA.
  User: saleh
  Date: 8/28/16
  Time: 8:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
  </head>
  <body>
  <form method="get" action="/Servlet" >
    <h1>This Application calculates famous series and formula</h1>
    Please Enter your Number Here:<br>
    <input type="number" name="number">
    </br>
    <input type="radio" name="radio" value="Fibonacci" checked> Fibonacci<br>
    <input type="radio" name="radio" value="Factorial"> Factorial<br>
    <input type="radio" name="radio" value="isEven">Odd or Even<br>
    <input type="radio" name="radio" value="isPrime">Is it Prime number?<br>
    <input type="submit" value="Submit">
  </form>
  </body>
</html>
