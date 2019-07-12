<%--
  Created by IntelliJ IDEA.
  User: e5570910
  Date: 12.07.2019
  Time: 11:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Przelicznik tekstu</title>
  <style type="text/css">
    .form {
      padding-left: 1cm;
      padding-right:1cm;
    }
  </style>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>
<h1 class="form">Przelicznik tekstu</h1>
<form method="post" action="textCounter">
  <br/>
  <textarea rows="10" cols="50" name="t" placeholder="wpisz tekst"> </textarea><br/>
  <input type="submit" value="Wyślij">
</form>
</body>
</html>