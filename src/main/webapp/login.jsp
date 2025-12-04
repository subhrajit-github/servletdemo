<html>
<head>
<meta charset="UTF-8">
<title>Login page</title>
</head>
<body>
<body>
	<h2>Welcome to Register page</h2>
	<form action="login" method="post">
		<%
		String user = request.getParameter("name");
		%>
		<h1>
			WELCOME
			<%=user%>
			login to your account
		</h1>
		USERNAME:<input type="text" name="username"><br>
		PASSWORD:<input type="text" name="password"><br> <input
			type="submit" value="LogIn"><br>
	</form>
</body>
</body>
</html>