<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border=1>
		<tr>
			<th>Cno</th>
			<th>Name</th>
			<th>Address</th>
			<th>Mobile no</th>
		</tr>
		<c:forEach var="c" items="${custs}">
			<tr>
				<td>${c.cno}</td>
				<td>${c.name}</td>
				<td>${c.address}</td>
				<td>${c.mobileno}</td>
			</tr>
		</c:forEach>
	</table>
	<a href="./adminhome">Admin hOME</a><br/><br/><br/>

</body>
</html>