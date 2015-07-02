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
<link rel="stylesheet" href="bootstrap-3.3.4-dist/css/bootstrap.min.css" >
<link href="bootstrap-3.3.4-dist/css/bootstrap.css" rel="stylesheet">
 <link href="bootstrap-3.3.4-dist/css/dashboard.css" rel="stylesheet">
</head> 
<body role="document">
 <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container-fluid">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">Encuesta</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <form class="navbar-form navbar-right">
            <input type="text" class="form-control" placeholder="Search...">
          </form>
        </div>
      </div>
    </nav>
    
<div class="jumbotron">
<h1 class="text-center"> BIENVENIDO </h1>
</div>
<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
          <h1 class="page-header">USUARIOS</h1>

          <div class="row placeholders">
            <div class="col-xs-6 col-sm-3 placeholder">
              <h4> USUARIOS NUEVOS</h4><br>
              <form action=<c:url value="usersNew.htm"/>>
				<button type="submit" class="btn btn-lg btn-info">MOSTRAR</button>
				</form>
            </div>
            <div class="col-xs-6 col-sm-3 placeholder">
              <h4>USUARIOS EDITADOS</h4><br>
              <form action=<c:url value="usersEdit.htm"/>>
				<button type="submit" class="btn btn-lg btn-info">MOSTRAR</button>
			  </form>
            </div>
            <div class="col-xs-6 col-sm-3 placeholder">
               <h4>USUARIOS ELIMINADOS</h4><br>
              <form action=<c:url value="usersDel.htm"/>>
				<button type="submit" class="btn btn-lg btn-info">MOSTRAR</button>
				</form> 
            </div>
            <div class="col-xs-6 col-sm-3 placeholder">
              <h4>MOSTRAR TODOS</h4><br>
  				 <form action=<c:url value=".htm"/>>
					<button type="submit" class="btn btn-lg btn-info">MOSTRAR</button>
				 </form> 
            </div>
          </div>
          </div>

 <!-- Librería jQuery requerida por los plugins de JavaScript -->
 <script src="bootstrap-3.3.4-dist/libs/jquery-1.11.3.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="bootstrap-3.3.4-dist/js/bootstrap.min.js"></script>
</body>
</html>
