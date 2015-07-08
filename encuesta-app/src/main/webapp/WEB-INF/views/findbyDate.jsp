<%@ page language="java" import="javax.servlet.jsp.PageContext" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html lang="en">
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
  
<title>Find by Dates</title>
<link rel="stylesheet" href="bootstrap-3.3.4-dist/css/bootstrap.min.css" >
<link href="bootstrap-3.3.4-dist/css/bootstrap.css" rel="stylesheet">
</head>
<body>

<h2>B U S C AR</h2>

<form action="findbyDate.htm" method="post">
<div class="form-group">
    <label>De: </label>
    <input type="date" class="form-control" required="required" format="yyyy-MM-dd" name="fech1"/>
    <label>Hasta: </label>
    <input type="date" class="form-control" required="required" format="yyyy-MM-dd" name="fech2"/> 
    <input type="submit" class="btn btn-warning"value="Buscar">
    </div>
</form>
<br>
<h2><c:out value="${ERROR}"></c:out></h2>
 <!-- Librería jQuery requerida por los plugins de JavaScript -->
 <script src="bootstrap-3.3.4-dist/libs/jquery-1.11.3.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="bootstrap-3.3.4-dist/js/bootstrap.min.js"></script>
</body>
</html>