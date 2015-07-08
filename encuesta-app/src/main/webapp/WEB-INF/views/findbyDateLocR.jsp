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
<script src="http://maps.googleapis.com/maps/api/js?sensor=false"></script>
<script>	
function initialize() {
var marcadores = [
           <c:forEach var="ef" items="${ef}">
[<c:out value="${ef.nombreNegocio}"/>,<c:out value="${ef.lat}"/>,<c:out value="${ef.lgt}"/>]
        </c:forEach>        ];
        alert(marcadores);
        
var myCenter=new google.maps.LatLng(20.080580,-98.368956);
  var mapProp = {
    zoom:8,
    center:myCenter,
    mapTypeId:google.maps.MapTypeId.HYBRID,
    
  }
  var map=new google.maps.Map(document.getElementById("googleMap"),mapProp);
 setMarkers(map,marcadores);
  
  }

var infowindow;
function setMarkers(map,marcadores) {
for(var i=0; i<marcadores.length; i++) {
  var myLatLng = new google.maps.LatLng([i][1],[i][2]);
  var marker=new google.maps.Marker({
  position:myLatLng,
  map:map,
  title:marcadores[i][0],
  });
  (function(i,marker){
  google.maps.event.addListener(marker,'click', function(){
  if(!infowindow){
  infowindow=new google.maps.InfoWindow();
  }
  infowindow.setContent(markers[i][0]);
  infowindow.open(map,marker);
  });
    })(i,marker);
   }
   };
   
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
<h1>Ubicación</h1>
<div id="googleMap" style="width:500px;height:380px;"></div>
</body>
</html>