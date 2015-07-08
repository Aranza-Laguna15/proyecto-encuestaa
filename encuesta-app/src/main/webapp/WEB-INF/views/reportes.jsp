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

<title>Reportes</title>
 <link href="bootstrap-3.3.4-dist/css/bootstrap.css" rel="stylesheet">
<link href="bootstrap-3.3.4-dist/css/dashboard.css" rel="stylesheet">

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
<h1 class="text-center"> R E P O R T E S </h1>
</div>
<ul class="nav nav-tabs" id="myTab">
  <li class="active"><a href="#date" data-toggle="tab">FECHAS</a></li>
  <li><a href="#user" data-toggle="tab">USUARIOS</a></li>
  <li><a href="#date-user" data-toggle="tab">FECHA - USUARIO</a></li>
  <li><a href="#date-loc" data-toggle="tab">FECHA CON UBICACIÓN</a></li>
   <li><a href="#user-loc" data-toggle="tab">USUARIO CON UBICACIÓN</a></li>
</ul>
<div class="tab-content">
  <div class="tab-pane fade active in" id="date">
  <iframe class="fram-tab" src=<c:url value="findbyDate.htm"/>></iframe>
  </div>
  <div class="tab-pane fade" id="user">
  <iframe class="fram-tab" src=<c:url value="findbyUser.htm"/>></iframe>
  </div>
  <div class="tab-pane fade" id="date-user">
  <iframe class="fram-tab" src=<c:url value="findbyDateUser.htm"/>></iframe>
  </div>
  <div class="tab-pane fade" id="date-loc">
  <iframe class="fram-tab" src=<c:url value="findbyDateLoc.htm"/>></iframe>
  </div>
  <div class="tab-pane fade" id="user-loc">
  <iframe class="fram-tab" src=<c:url value="findbyUserLoc.htm"/>></iframe>
  </div>
</div>

 
 <!-- Librería jQuery requerida por los plugins de JavaScript -->
 <script src="bootstrap-3.3.4-dist/libs/jquery-1.11.3.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="bootstrap-3.3.4-dist/js/bootstrap.min.js"></script>
<script src="bootstrap-3.3.4-dist/js/bootstrap-tab.js"></script>
</body>
</html>

