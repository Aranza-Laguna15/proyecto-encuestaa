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
<h1 class="text-center"> U S U A R I O S </h1>
</div>
<ul class="nav nav-tabs" id="myTab">
  <li><a href="#user-create" data-toggle="tab">CREAR USUARIO</a></li>
   <li><a href="#users" data-toggle="tab">USUARIOS</a></li>
  <li><a href="#user-new" data-toggle="tab">USUARIOS NUEVOS</a></li>
  <li><a href="#user-edit" data-toggle="tab">USUARIOS EDITADOS</a></li>
  <li><a href="#user-delete" data-toggle="tab">USUARIOS ELIMINADOS</a></li>
</ul>

<div class="tab-content">
    <div class="tab-pane fade" id="user-create">
  <iframe class="fram-tab" src=<c:url value="addUser.htm"/>></iframe>
  </div>
  <div class="tab-pane fade" id="users">
  <iframe class="fram-tab" src=<c:url value="usersAll.htm"/>></iframe>
  </div>
  <div class="tab-pane fade" id="user-new">
  <iframe class="fram-tab" src=<c:url value="usersNew.htm"/>></iframe>
  </div>
  <div class="tab-pane fade" id="user-edit">
  <iframe class="fram-tab" src=<c:url value="usersEdit.htm"/>></iframe>
  </div>
  <div class="tab-pane fade" id="user-delete">
  <iframe class="fram-tab" src=<c:url value="usersDel.htm"/>></iframe>
  </div>

</div>

 
 <!-- Librería jQuery requerida por los plugins de JavaScript -->
 <script src="bootstrap-3.3.4-dist/libs/jquery-1.11.3.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="bootstrap-3.3.4-dist/js/bootstrap.min.js"></script>
</body>
</html>

