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
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class="alert alert-dismissible alert-danger">
 <h1>  
   ACCESO DENEGADO <span style="color: red;">${403}</span>  
  </h1>  
  <c:url var="logoutUrl" value="/j_spring_security_logout" />  
  <form action="${logoutUrl}" method="post">  
   <input type="submit" value="INTENTAR DE NUEVO" class="btn btn-danger" /> <input type="hidden"  
    name="${_csrf.parameterName}" value="${_csrf.token}" />  
  </form>  
</div>

<footer>
<div>
<img src="bootstrap-3.3.4-dist/images/homero.png" class="footer" width="500" height="500">
</div>
</footer>
<!-- Librería jQuery requerida por los plugins de JavaScript -->
 <script src="bootstrap-3.3.4-dist/libs/jquery-1.11.3.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="bootstrap-3.3.4-dist/js/bootstrap.min.js"></script>
</body>
</html>