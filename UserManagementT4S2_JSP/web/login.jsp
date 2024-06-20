<%-- 
    Document   : login
    Created on : Feb 22, 2024, 2:19:03 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login page</title>
    </head>
    <body>
        <div>Input your information: </div>
        <form action="./login" method="POST">
            UserID <input type="text" name="userID"/><br/>
            Password<input type="password" name="password"/><br/>
            <input type="submit" name="action"  value="Login"/>
            <input type="reset" value="Reset" />
        </form>
<% 
    String error = (String ) request.getAttribute("Error");
    if(error == null) error ="";
    %>
    <%= error %>
    </body>
</html>
