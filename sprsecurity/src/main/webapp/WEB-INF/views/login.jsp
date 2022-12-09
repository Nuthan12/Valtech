<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Enter Your Username and Password To Proceed
	<form action="/login" method="post">
		Username : <input name="username" type="text"/><br/>
		Password : <input name="password" type="text"/><br/>
		
		<input name="submit" value="Login" type="submit"/>
	</form>
</body>
</html>