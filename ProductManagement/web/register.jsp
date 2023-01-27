<%-- 
    Document   : register
    Created on : 9 Jan, 2023, 8:10:20 PM
    Author     : Adnan Warwande
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String uname=request.getParameter("userName");
            String password=request.getParameter("password");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/inventoryMGMT","adnan","adnan123");
            if(password.length()>=5){
                   PreparedStatement ps=con.prepareStatement("insert into login_info values(?,?)");
                   ps.setString(1,uname);
                   ps.setString(2,password);
                   ps.executeUpdate();
                   response.sendRedirect("./login.jsp");
            }
            else{
                out.print("password length is less than 8 characters");
}
       

%>
                
    </body>
</html>
