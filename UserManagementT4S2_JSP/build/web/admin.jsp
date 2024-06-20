<%-- 
    Document   : admin
    Created on : Feb 22, 2024, 2:21:07 PM
    Author     : Admin
--%>

<%@page import="sample.sp24.t4s2.user.UserDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Page</title>
    </head>
    <body>
           <% 
        UserDTO loginUser = (UserDTO) session.getAttribute("LOGIN_USER");
       if(loginUser == null) {
           loginUser = new  UserDTO();
       }
        %>
        Welcome: <h1><%= loginUser.getFullName()%></h1>
    </body>
</html>
