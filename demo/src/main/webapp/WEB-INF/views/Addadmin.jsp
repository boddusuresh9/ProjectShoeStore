<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<f:form action="./addadmin" method="post" modelAttribute="admin">
		Name:<f:input path="name" /><br>
		Password:<f:input path="password" /><br>
		<input type="submit" value="Submit">
	</f:form>
</body>
</html>