<%@ page language="java" import="javax.servlet.jsp.PageContext" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@page import="org.encuesta.controllers.*"  %>
<!DOCTYPE html>

<html lang="en">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>ENCUESTA APP</title>
<link href="/bootstrap-3.3.4-dist/css/bootstrap.min.css" rel="stylesheet" media="screen">
</head>
<body>
<h1 class="text-center"> USUARIOS </h1>

<form:form commandName="user">

<form:input path="username" /> <!--  path="username" commandName="username"--><br><br>


<input type="submit" value="BUSCAR" />
<br><br>

<table class="table table-hover" border="1">

<tr><td style="width: 150px; "> USERNAME</td><td style="width: 156px; "> PASSWORD</td>
<td style="width: 123px; "> NAME</td><td style="width: 136px; "> ENABLED</td></tr>
<%

 %>
<c:forEach items="${users}" var="us">
<tr><td><c:out value="${us.username}"/></td> 
<td><c:out value="${us.password}"/></td> 
<td><c:out value="${us.name}"/></td> 
<td><c:out value="${us.enabled}"/></td></tr>

</c:forEach>
</table>
</form:form>


<!--  <table class="table table-hover" border="1">
<tr><td style="width: 150px; "> USERNAME</td><td style="width: 156px; "> PASSWORD</td>
<td style="width: 123px; "> NAME</td><td style="width: 136px; "> ENABLED</td></tr>
<c:forEach items="${users}" var="us">
<tr><td><c:out value="${us.username}"/></td> 
<td><c:out value="${us.password}"/></td> 
<td><c:out value="${us.name}"/></td> 
<td><c:out value="${us.enabled}"/></td></tr>

</c:forEach>
</table>-->
<form action=<c:url value="usersDel.htm"/>>
<input type="submit" value="USERS DELETE"/>
</form>
<form action=<c:url value="usersEdit.htm"/>>
<input type="submit" value="USERS EDITADOS">
</form>
<form action=<c:url value="usersNew.htm"/>>
<input type="submit" value="USERS NUEVOS"/>
</form>

 <!-- Librería jQuery requerida por los plugins de JavaScript -->
 <script src="http://code.jquery.com/jquery.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="/bootstrap-3.3.4-dist/js/bootstrap.min.js"></script>
</body>
</html>
