<%@ page language="java" import="javax.servlet.jsp.PageContext" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="/bootstrap-3.3.4-dist/css/bootstrap.min.css" rel="stylesheet" media="screen">
<title>Result</title>
</head>
<body>
<h1 class="text-center">Result Dates</h1>

<c:forEach items="${informacion}" var="ef">
<c:out value="${ef.idinformacion}"/>
<c:out value="${ef.nombreNegocio}"/> 
<c:out value="${ef.giroNegocio}"/>
<c:out value="${ef.enabled}"/>
<c:out value="${ef.nombre}"/>
<c:out value="${ef.telefono}"/>
<c:out value="${ef.direccion}"/>
<c:out value="${ef.cmpActual}"/>
<c:out value="${ef.comiActual}"/>
<c:out value="${ef.lat}"/>
<c:out value="${ef.lgt}"/>
<c:out value="${ef.username}"/>
<c:out value="${ef.fecha}"/>
</c:forEach>


</body>
</html>