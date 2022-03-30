<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    if (request.getMethod().equalsIgnoreCase("post")) {
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        if (name.equals("admin") && password.equals("password")) {
            response.sendRedirect("/profile.jsp");
        }
    }
%>
<html>
<head>

</head>
<body>
<jsp:include page="Partials/navbar.jsp" />
<div class="container">
    <h1>Log In Here</h1>
    <form action="/login.jsp">
        <div class="form-group">
            <label for="name">Name</label>
            <input id="name" name="name" class="form-control" type="text">
        </div>
        <div class="form-group">
            <label for="password">Password</label>
            <input id="password" name="password" class="form-control" type="password">
        </div>
        <input type="submit" class="btn btn-primary" value="Log In">
    </form>
</div>
</body>
</html>
