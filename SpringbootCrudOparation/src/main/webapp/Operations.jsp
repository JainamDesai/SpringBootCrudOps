<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome in OPeration page</h1>
<form action="operations">
<label>Id:</label><input type="number" name="id"><br>
<select name ="ddlflag">
<option name="select" value="Select">Select Op</option>
<option name="update" value="Update">Update op</option>
<option name = "delete" value="Delete">Delete op</option>
</select>
<button type="submit">CLICK NOW</button>
</form>

</body>
</html>