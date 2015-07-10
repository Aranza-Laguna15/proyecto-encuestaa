<%@ page language="java" import="javax.servlet.jsp.PageContext" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html lang="en">
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>USERS</title>
 <link href="bootstrap-3.3.4-dist/css/bootstrap.css" rel="stylesheet">
<link href="bootstrap-3.3.4-dist/css/dashboard.css" rel="stylesheet">
<script src="http://maps.googleapis.com/maps/api/js?v=3.11&sensor=false"></script>
<script type="text/javascript">	
 function initialize() {
var marcadores = [
           <c:forEach var="ef" items="${ef}">
	['<c:out value="${ef.nombreNegocio}"/>', <c:out value="${ef.lat}"/> , <c:out value="${ef.lgt}"/>],
        </c:forEach>        ];
        
  var myCenter=new google.maps.LatLng(20.080580,-98.368956);

  var map = new google.maps.Map(document.getElementById("googleMap"),{
    zoom:12,
    center:myCenter,
    mapTypeId:google.maps.MapTypeId.ROADMAP
  });
  
  var infowindow=new google.maps.InfoWindow();
  
  var marker, i;
  
  for(i=0; i<marcadores.length; i++) {
  
  marker=new google.maps.Marker({
   
  position:new google.maps.LatLng(marcadores[i][1],marcadores[i][2]),
  map:map
  });

  google.maps.event.addListener(marker,'click', (function(marker,i){
  return function(){
	infowindow.setContent(marcadores[i][0]);
	 infowindow.open(map,marker);
	}
  })(marker,i));
  }
  }
google.maps.event.addDomListener(window, 'load', initialize);

</script>
</head>
<body>

<h1 class="sub-header">INFORMACIÓN</h1>
<div class="table-responsive">
<table class="table table-striped">
<tr><th> ID</th><th> NEGOCIO</th><th> GIRO</th><th>NOMBRE </th><th> TELEFONO</th><th>DIRECCIÓN</th>
<th> COMPAÑIA ACTUAL</th><th> COMISIÓN</th><th> USERNAME</th><th>FECHA</th></tr>
<c:forEach items="${ef}" var="ef">
<tr><td><c:out value="${ef.idinformacion}"/></td>
<td><c:out value="${ef.nombreNegocio}"/> </td>
<td><c:out value="${ef.giroNegocio}"/></td>
<td><c:out value="${ef.nombre}"/></td>
<td><c:out value="${ef.telefono}"/></td>
<td><c:out value="${ef.direccion}"/></td>
<td><c:out value="${ef.cmpActual}"/></td>
<td><c:out value="${ef.comiActual}"/></td>
<td><c:out value="${ef.username}"/></td>
<td><c:out value="${ef.fecha}"/></td></tr>
</c:forEach>
</table>
</div>
<h1 class="sub-header">Ubicación</h1>
<div id="googleMap" class="map"></div>
<ul class="pager">
  <li><a href="findbyDateLoc.htm"><span class="glyphicon glyphicon-repeat" aria-hidden="true"></span> Realizar nueva busqueda</a></li>
</ul>
 <!-- Librería jQuery requerida por los plugins de JavaScript -->
 <script src="bootstrap-3.3.4-dist/libs/jquery-1.11.3.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="bootstrap-3.3.4-dist/js/bootstrap.min.js"></script>
</body>
</html>