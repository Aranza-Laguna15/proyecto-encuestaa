<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>USERS</title>
</head>
<body>

<h3> USUARIOS ELIMINADOS</h3>

<table border=1 >
<tr><td style="width: 30px; "> ID</td><td style="width: 150px; "> USERNAME</td><td style="width: 150px; "> PASSWORD</td>
<td style="width: 150px; "> NAME</td><td style="width: 150px; "> ENABLED</td><td style="width: 150px; "> FECHA ELIMINACION</td><td>ELIMINADO POR</td></tr>

<c:forEach items="${user_eliminados}" var="us">
<tr><td><c:out value="${us.id_eliminado}"/></td>
<td><c:out value="${us.username}"/></td>
<td><c:out value="${us.password}"/></td>
<td><c:out value="${us.name}"/></td>
<td><c:out value="${us.enabled}"/></td>
<td><c:out value="${us.fecha_eliminacion}"/></td>
<td><c:out value="${us.eliminado_por}"/></td></tr>

</c:forEach>
</table>
<form action=<c:url value="index.htm"/>>
<input type="submit" value="REGRESAR" >
</form>
</body>
</html>
