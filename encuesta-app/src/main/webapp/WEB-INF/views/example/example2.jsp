<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="html" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Ingrese el dato</h1>
	<html:form action="example2.htm" method="post" commandName="bean">
		<html:label path="searchValue">Buscar</html:label>
		<html:input path="searchValue" required="required"/>
		<input type="submit" value="Buscar"/>
	</html:form>
</body>
</html>