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

<title>USUARIOS</title>
 <link href="bootstrap-3.3.4-dist/css/bootstrap.css" rel="stylesheet">
<link href="bootstrap-3.3.4-dist/css/dashboard.css" rel="stylesheet">
<script> 
function actualiza_2_frames(){ 
   	window.parent.frames[1].location="usersAll.htm" 
   	window.location="addUserR.htm" 
} 
</script>
</head> 
<body role="document">

 <h2><c:out value="${us}"/></h2>
 <ul class="pager">
  <li><a href="javascript:actualiza_2_frames()" ><span class="glyphicon glyphicon-repeat" aria-hidden="true"></span> Regresar</a></li>
</ul>
 <!-- Librería jQuery requerida por los plugins de JavaScript -->
 <script src="bootstrap-3.3.4-dist/libs/jquery-1.11.3.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="bootstrap-3.3.4-dist/js/bootstrap.min.js"></script>
</body>
</html>

