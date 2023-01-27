<%-- 
    Document   : login
    Created on : 5 Jan, 2023, 11:00:58 PM
    Author     : Adnan Warwande
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>

<link rel="stylesheet" href="style.css">
</head>
<body>
	<div align="center">
            <form action="processLogin.jsp" method="post" class="loginForm">
                <h1>PRODUCT MANAGEMENT SYSTEM</h1>                  <br><br>
			<label for="userName">User Name</label>
                        <input type="text" id="userName" name="userName" class="searchTextField"/><br><br>
				
					<label for="password">Password</label>
                                        <input type="password" id="password" name="password" class="searchTextField"/><br><br>
                                            <input type="submit" value="Login" class="actionBtn" /><br>
                                            
                                            
	<br>
                <b >Don't have an  account? &nbsp;&nbsp;</b><a href='registration.jsp' style="color:blue;">Register</a>
               		
		</form>
            

	</div>
</body>
</html>
