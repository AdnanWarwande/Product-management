<%-- 
    Document   : Registration
    Created on : 9 Jan, 2023, 7:46:30 PM
    Author     : Adnan Warwande
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
                <link rel="stylesheet" href="style.css">

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>REGISTER</title>
    </head>
    <body>
        <div align="center">
            <form action="register.jsp" method="post" class="loginForm" >
                            <h1>REGISTER</h1>
                            <label for="userName">Create User Name</label><input type="text" id="userName" name="userName" class="searchTextField"/><br><br>
                            <label for="password">Create Password</label>
				<input type="password" id="password" name="password" class="searchTextField"/>
                                <br><br>
				
                                            <input type="submit" value="REGISTER" class="actionBtn"/><br><br>
                                            
                                            <b >Already have an  account? &nbsp;&nbsp;</b><a href='login.jsp' style="color:blue;">Login</a>
                                           
		</form>
            	</div>
    </body>
</html>
