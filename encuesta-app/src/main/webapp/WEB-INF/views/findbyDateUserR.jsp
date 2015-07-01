<%@ page language="java" import="javax.servlet.jsp.PageContext" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="/bootstrap-3.3.4-dist/css/bootstrap.min.css" rel="stylesheet" media="screen">
<title>Result</title>
<script src="http://maps.googleapis.com/maps/api/js"></script>
<script>
var lat = [
           	<c:forEach var="ef" items="${ef}">
			<c:out value="${ef.lat}"/>
       		</c:forEach>        ];   
var lgt=[
			<c:forEach var="ef" items="${ef}">
			<c:out value="${ef.lgt}"/>
			</c:forEach>        ]; 
			
			
var myCenter=new google.maps.LatLng(lat,lgt);
function initialize() {
  var mapProp = {
    center:myCenter,
    zoom:18,
    mapTypeId:google.maps.MapTypeId.HYBRID
  };
  var map=new google.maps.Map(document.getElementById("googleMap"),mapProp);

var marker=new google.maps.Marker({
position:myCenter,
title:'Click yo zoom'
});
marker.setMap(map);
google.maps.event.addListener(marker,'click',function() {
  map.setZoom(10);
  map.setCenter(marker.getPosition());
  });
}

google.maps.event.addDomListener(window, 'load', initialize);


</script>
</head>
<body>

<h1 class="text-center">Result Dates</h1>
<table class="table table-hover" border="1">

<c:forEach items="${ef}" var="ef">

<tr><td><c:out value="${ef.idinformacion}"/></td>
<td><c:out value="${ef.nombreNegocio}"/> </td>
<td><c:out value="${ef.giroNegocio}"/></td>
<td><c:out value="${ef.nombre}"/></td>
<td><c:out value="${ef.telefono}"/></td>
<td><c:out value="${ef.direccion}"/></td>
<td><c:out value="${ef.cmpActual}"/></td>
<td><c:out value="${ef.comiActual}"/></td>
<td><c:out value="${ef.lat}"/></td>
<td><c:out value="${ef.lgt}"/></td>
<td><c:out value="${ef.username}"/></td>
<td><c:out value="${ef.fecha}"/></td></tr>
</c:forEach>

</table>
<h1>Ubicación</h1>
<div id="googleMap" style="width:500px;height:380px;"></div>
</body>
</html>