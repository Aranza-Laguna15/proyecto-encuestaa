<%@ page language="java" import="javax.servlet.jsp.PageContext" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html lang="en">
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
  
<title>LOGIN</title>
<link rel="stylesheet" href="bootstrap-3.3.4-dist/css/bootstrap.min.css" >
<link href="bootstrap-3.3.4-dist/css/bootstrap.css" rel="stylesheet">
 <link href="bootstrap-3.3.4-dist/css/dashboard.css" rel="stylesheet">
</head>
<body class="sig">
 <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href=<c:url value="index.htm"/>>Encuesta</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
        </div><!--/.navbar-collapse -->
      </div>
    </nav>
    
<div class="jumbotron"> 
<h1 class="text-center"> INICIA SESIÓN </h1>
</div>
<h2 class="jaja" style="color:red">${message}</h2>
<div class="container">
<form:form class="form-signin" method="post" action="j_spring_security_check" 
    modelAttribute="usuario">
  <fieldset>
    <legend>INICIA SESION</legend>
      <label for="inputText" class="sr-only">USERNAME</label>
        <form:input type="text" class="form-control" path="username" placeholder="Nombre de usuario / Username"></form:input>
    
      <label for="inputPassword" class="sr-only">PASSWORD</label>
     
        <form:input type="password" class="form-control" path="password" placeholder="Contraseña / Password"></form:input>
    
        <button type="submit" class="btn btn-lg btn-warning btn-block">Iniciar sesión</button>
     
  </fieldset>
</form:form>
</div>
<!-- Librería jQuery requerida por los plugins de JavaScript -->
 <script src="bootstrap-3.3.4-dist/libs/jquery-1.11.3.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="bootstrap-3.3.4-dist/js/bootstrap.min.js"></script>
</body>

</html>