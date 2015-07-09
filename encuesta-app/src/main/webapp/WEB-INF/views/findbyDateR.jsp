<%@ page language="java" import="javax.servlet.jsp.PageContext" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html lang="en">
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
  
<title>Result by Dates</title>
<link rel="stylesheet" href="bootstrap-3.3.4-dist/css/bootstrap.min.css" >
<link href="bootstrap-3.3.4-dist/css/bootstrap.css" rel="stylesheet">
</head>
<body>

<h1 class="sub-header">Información</h1>
<div class="table-responsive">
<table class="table table-striped">
<tr><th> ID</th><th> NEGOCIO</th><th> GIRO</th><th>NOMBRE </th><th> TELEFONO</th><th>DIRECCIÓN</th>
<th> COMPAÑIA ACTUAL</th><th> COMISIÓN</th><th> USERNAME</th><th>FECHA</th></tr>
<c:forEach items="${ef}" var="ef">

<tr><td><c:out value="${ef.idinformacion}"/></td>
<td><c:out value="${ef.nombreNegocio}"/> </td>
<td><c:out value="${ef.giroNegocio}"/></td>
<td><c:out value="${ef.nombre}"/></td>
<td><c:out value="${ef.telefono}"/></td>
<td><c:out value="${ef.direccion}"/></td>
<td><c:out value="${ef.cmpActual}"/></td>
<td><c:out value="${ef.comiActual}"/></td>
<td><c:out value="${ef.username}"/></td>
<td><c:out value="${ef.fecha}"/></td></tr>
</c:forEach>
</table>
</div>
 <!-- Librería jQuery requerida por los plugins de JavaScript -->
 <script src="bootstrap-3.3.4-dist/libs/jquery-1.11.3.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="bootstrap-3.3.4-dist/js/bootstrap.min.js"></script>
</body>
</html>