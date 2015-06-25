<%@ page language="java" import="javax.servlet.jsp.PageContext" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="/bootstrap-3.3.4-dist/css/bootstrap.min.css" rel="stylesheet" media="screen">
<title>Result</title>
</head>
<body>
<h1 class="text-center">Result</h1>
<table class="table table-hover" border="1">

<tr><td style="width: 150px; "> USERNAME</td><td style="width: 156px; "> PASSWORD</td>
<td style="width: 123px; "> NAME</td><td style="width: 136px; "> ENABLED</td></tr>

<c:forEach items="${user}" var="us">
<tr><td><c:out value="${us.username}"/></td> 
<td><c:out value="${us.password}"/></td> 
<td><c:out value="${us.name}"/></td> 
<td><c:out value="${us.enabled}"/></td></tr>

</c:forEach>
</table>
</body>
</html>