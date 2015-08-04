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

</head> 
<body >
<c:url var="actionUrl" value="addUser.htm"/>
<form:form commandName="usuario" action="${actionUrl }" method="post" >
	<legend>Nuevo Usuario</legend>
    <div class="form-group">
      <label class="col-lg-2 control-label">Username</label>
      <div class="col-lg-10">
        <form:input class="form-control" path="username" placeholder="Username" required="required"/>
      </div>
       <label class="col-lg-2 control-label">Nombre</label>
      <div class="col-lg-10">
        <form:input class="form-control" path="name" placeholder="Name" required="required"/>
      </div>
       <label class="col-lg-2 control-label">Contraseña</label>
      <div class="col-lg-10">
        <form:input type="password" class="form-control" path="password" placeholder="Password" required="required"/>
      </div><br>
      <div class="col-lg-10 col-lg-offset-2">
        <form:button type="submit" class="btn btn-warning">GUARDAR</form:button>
      </div>
      </div>
</form:form>

 <!-- Librería jQuery requerida por los plugins de JavaScript -->
 <script src="bootstrap-3.3.4-dist/libs/jquery-1.11.3.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="bootstrap-3.3.4-dist/js/bootstrap.min.js"></script>
</body>
</html>

