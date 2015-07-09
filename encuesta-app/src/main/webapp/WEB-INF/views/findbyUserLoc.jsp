<%@ page language="java" import="javax.servlet.jsp.PageContext" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html lang="en">
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
  
<title>Find by User</title>
<link rel="stylesheet" href="bootstrap-3.3.4-dist/css/bootstrap.min.css" >
<link href="bootstrap-3.3.4-dist/css/bootstrap.css" rel="stylesheet">
</head>
<body>

<h2 class="sub-header">B U S C AR</h2>

<form action="findbyUserLoc.htm" method="post">
<div class="form-group">
   <span class="label label-default">USERNAME</span>
    <input type="text" required="required" name="user"/>
    <input type="submit" value="Buscar">
    <input type="submit" class="btn btn-warning"value="Buscar">
    </div>
</form>
<br>
<div class="alert alert-dismissible alert-danger">
  <button type="button" class="close" data-dismiss="alert">×</button>
  <strong>ERROR</strong> <c:out value="${ERROR}"></c:out> <a href="#" class="alert-link"> Vuelve a intentarlo</a>
</div>
 <!-- Librería jQuery requerida por los plugins de JavaScript -->
 <script src="bootstrap-3.3.4-dist/libs/jquery-1.11.3.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="bootstrap-3.3.4-dist/js/bootstrap.min.js"></script>
</body>
</html>