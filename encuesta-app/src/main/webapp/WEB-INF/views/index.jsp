<%@ page language="java" import="javax.servlet.jsp.PageContext" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@page import="org.encuesta.controllers.*"  %>
<!DOCTYPE html>

<html lang="en">
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>ENCUESTA APP</title>
<link rel="stylesheet" href="/bootstrap-3.3.4-dist/css/bootstrap.min.css" >
<link href="/bootstrap-3.3.4-dist/css/bootstrap.css" rel="stylesheet">
</head>
<body role="document">
<div class="jumbotron">
<h1 class="text-center"> BIENVENIDO </h1>
</div>
<div class="page-header">
<form action=<c:url value="usersDel.htm"/>>
<button type="submit" class="btn btn-lg btn-info">USERS DELETE</button>
</form> 
<form action=<c:url value="usersEdit.htm"/>>
<input type="submit" value="USERS EDITADOS">
</form>
<form action=<c:url value="usersNew.htm"/>>
<input type="submit" value="USERS NUEVOS"/>
</form>
<form action=<c:url value="findbyUser.htm"/>>
<input type="submit" value="FIND BY USER"/>
</form> 
<form action=<c:url value="findbyDate.htm"/>>
<input type="submit" value="FIND BY DATE"/>
</form> 
</div>
 <!-- Librería jQuery requerida por los plugins de JavaScript -->
 <script src="/bootstrap-3.3.4-dist/libs/jquery-1.11.3.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="/bootstrap-3.3.4-dist/js/bootstrap.min.js"></script>
</body>
</html>
