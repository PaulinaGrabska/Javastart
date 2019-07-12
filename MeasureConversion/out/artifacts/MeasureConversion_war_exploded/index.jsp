<%--
  Created by IntelliJ IDEA.
  User: e5570910
  Date: 11.07.2019
  Time: 23:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Przelicznik</title>
  <style type="text/css">
    .form {
      padding-left: 1cm;
      padding-right:1cm;
    }
  </style>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>
<h1 class ="form" font face="Impact" >Przelicznik Metryczny</h1>
<form class="form" method="post" action="converter">
  <br/>
  <input type="text" name="m" placeholder="metry"><br/>
  <input type="text" name="cm" placeholder="centymetry"><br/>
  <input type="text" name="mm" placeholder="milimetry"><br/>

  <input type="submit" value="Przelicz">

  <h1 class ="form" font face="Impact" >Przelicznik wag</h1>
  <form class="form" method="post" action="converter">
    <br/>
    <input type="text" name="kg" placeholder="kilogramy"><br/>
    <input type="text" name="g" placeholder="gramy"><br/>
    <input type="text" name="mg" placeholder="miligramy"><br/>

    <input type="submit" value="Przelicz">
</form>
</body>
</html>
