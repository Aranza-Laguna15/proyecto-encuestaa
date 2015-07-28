<%@ page language="java" import="javax.servlet.jsp.PageContext" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html lang="en">
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
  
<title>ENCUESTA APP</title>
<link rel="stylesheet" href="bootstrap-3.3.4-dist/css/bootstrap.min.css" >
<link href="bootstrap-3.3.4-dist/css/bootstrap.css" rel="stylesheet">
 <link href="bootstrap-3.3.4-dist/css/dashboard.css" rel="stylesheet">
 <script>
 $(document).ready(function(){
    setTimeout(function() {
        $.blockUI({message: $('#loginForm')});
        }  , 50);
});
</script>
</head> 
<body role="document">
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
<h1 class="text-center"> BIENVENIDO </h1>
</div>
<div class="container marketing">

      <!-- Three columns of text below the carousel -->
      <div class="row">
        <div class="col-lg-4">
          <img class="img-circle" src="bootstrap-3.3.4-dist/images/usuario.png" alt="Generic placeholder image" width="140" height="140">
          <h2>USUARIOS</h2>
          <p>Visualice todos los usuarios nuevos, editados y eliminados.</p>
          <p><a class="btn btn-default" href="<c:url value="users.htm"/>" role="button">Ir &raquo;</a></p>
        </div><!-- /.col-lg-4 -->
        <div class="col-lg-4">
          <img class="img-circle" src="bootstrap-3.3.4-dist/images/Reportes.png" alt="Generic placeholder image" width="140" height="140">
          <h2>REPORTES</h2>
          <p>Visualice la información de los usuarios encuestados.</p>
          <p><a class="btn btn-default" href="reportes.htm" role="button">Ir &raquo;</a></p>
        </div><!-- /.col-lg-4 -->
        
      </div><!-- /.row -->
</div>
<div class="page-header">

</div>
<div id="loginForm" style="display:none">
   <p><label>Username:</label><input type="text" name="demo1" /></p>
   <p><label>Password:</label><input type="text" name="demo1" /></p>
        </div>

 <!-- Librería jQuery requerida por los plugins de JavaScript -->
 <script src="bootstrap-3.3.4-dist/libs/jquery-1.11.3.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="bootstrap-3.3.4-dist/js/bootstrap.min.js"></script>
</body>
</html>
