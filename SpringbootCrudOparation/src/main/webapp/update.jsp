<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Update form</h1>
<form action="update">
<label>Id</label><input type="num" name="id" value="${obj.id}"><br>
<label>Name</label><input type="text" name="name" value = "${obj.name}" > 
<br>
<label>LastName:</label><input type="text" name="lname" value = "${obj.lname}"><br>
<label>SarName:</label><input type="text" name="sarname" value = "${obj.sarname}"><br>
<label>Pass:</label><input type="text" name="password" value = "${obj.password}"><br>
<button type="submit">SUBMIT</button>
</form>
</body>
</html>