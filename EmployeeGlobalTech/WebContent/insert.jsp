<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="insert.do">
		<table>
			<tr>
				<td>First Name:</td>
				<td><input type="text" name="fname"></td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><input type="text" name="lname"></td>
			</tr>
			<tr>
				<td>date Of Joining:</td>
				<td><input type="text" name="doj"></td>
			</tr>
			<tr>
				<td>Department:</td>
				<td><input type="text" name="dept"></td>
			</tr>
				<td></td>
				<td><input type="submit" value="insert"></td>
			<tr>
		</table>
	</form>
</body>
</html>