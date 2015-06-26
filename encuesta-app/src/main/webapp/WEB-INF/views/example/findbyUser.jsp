<%@ page language="java" import="javax.servlet.jsp.PageContext" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="/bootstrap-3.3.4-dist/css/bootstrap.min.css" rel="stylesheet" media="screen">
<title>Find by UserName</title>
</head>
<body>
<h1 class="text-center">Find by UserName</h1>

<form action="findbyUser.htm" method="post">
    <label>Valor:</label>
    <input type="text" required="required" name="user"/>
    <input type="submit" value="Buscar">
</form>
<br>
<h2><c:out value="${ERROR}"></c:out></h2>
</body>
</html>