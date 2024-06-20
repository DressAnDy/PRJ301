<%-- 
    Document   : user
    Created on : Feb 22, 2024, 2:19:57 PM
    Author     : Admin
--%>

<%@page import="sample.sp24.t4s2.user.UserDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1> User information: </h1>
        <% 
        UserDTO loginUser = (UserDTO) session.getAttribute("LOGIN_USER");
       if(loginUser == null) {
           loginUser = new  UserDTO();
       }
        %>
    <br/>   UserID: <%= loginUser.getUserID()%>
    <br/>   FullName: <%= loginUser.getFullName()%>
    <br/>   RoleID: <%= loginUser.getRoleID()%>
    <br/>   Password: <%= loginUser.getPassword()%>

    </body>
</html>
