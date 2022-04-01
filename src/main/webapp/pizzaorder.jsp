<%--
  Created by IntelliJ IDEA.
  User: charles
  Date: 3/31/22
  Time: 11:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order</title>
</head>
<body>
<div class="container">
    <h1>Create your pizza here!</h1>
    <form method="post">
        <div class="form-group">
            <label for="sauce">Sauce</label>
            <select id="sauce" name="sauce">
                <option value="marinara">Marinara</option>
                <option value="alfredo">Alfredo</option>
                <option value="bbq">BBQ</option>
            </select>
        </div>
        <div class="form-group">
            <label for="size">Size</label>
            <select id="size" name="size">
                <option value="small">Small</option>
                <option value="medium">Medium</option>
                <option value="large">Large</option>
            </select>
        </div>
        <div class="form-group">
            <label for="crust">Crust</label>
            <select id="crust" name="crust">
                <option value="thin">Thin</option>
                <option value="handtossed">Hand Tossed</option>
                <option value="pan">Pan</option>
            </select>
        </div>
        <div class="form-group">
            <input type="checkbox" id="pepperoni" name="toppings" value="pepperoni">
            <label for="pepperoni">Pepperoni</label><br>
            <input type="checkbox" id="sardines" name="toppings" value="sardines">
            <label for="sardines">Sardines</label><br>
        </div>
        <div class="form-group">
            <label for="address">Delivery address: </label>
            <input type="text" id="address" name="address">
        </div>
        <input type="submit" class="btn btn-primary btn-block" value="Submit">
    </form>
</div>
</body>
</html>
