<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Employee Details</h3>
	<table>
	<tr>
		<td>Employee Id</td>
		<td>first Name</td>
		<td>Last Name</td>
		<td>Date of joining</td>
		<td>Department</td>
	</tr>
	</tr>
	<c:forEach var="employee" items="${myList}">
	<tr>
		<td><c:out value="${employee.eid}"/></td>
		<td><c:out value="${employee.fname}"/></td>
		<td><c:out value="${employee.lname}"/></td>
		<td><c:out value="${employee.doj}"/></td>
		<td><c:out value="${employee.dept}"/></td>
	</tr>
	</c:forEach>
	
	</table>
</body>
</html>