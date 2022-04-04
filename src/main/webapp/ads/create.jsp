<%--
  Created by IntelliJ IDEA.
<%--  User: charles--%>
<%--  Date: 4/4/22--%>
<%--  Time: 11:38 AM--%>
<%--  To change this template use File | Settings | File Templates.--%>
<%--&ndash;%&gt;--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Ad</title>
</head>
<body>
<h1>Create A Product</h1>
<form action="/ads/create" method="post">
    <label for="id">ID</label>
    <input type="text" name="id" id="id">
    <label for="userId">User Id</label>
    <input type="text" name="userId" id="userId">
    <label for="title">Title</label>
    <input name="title" id="title" type="text">
    <br />
    <label for="description">Description</label>
    <input name="description" id="description" type="text">
    <br />
    <input type="submit">
</form>
</body>
</html>
