<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>USERS</title>
</head>
<body>
<h3> USUARIOS NUEVOS</h3>
<table>
<tr><td style="width: 30px; "> ID</td><td style="width: 150px; "> USERNAME</td><td style="width: 150px; "> PASSWORD</td>
<td style="width: 150px; "> NAME</td><td style="width: 150px; "> ENABLED</td><td style="width: 150px; "> FECHA CREACIÓN</td></tr>
<c:forEach items="${user_nuevos}" var="us">
<tr><td><c:out value="${us.id_historial}"/></td>
<td><c:out value="${us.username}"/></td>
<td><c:out value="${us.password}"/></td>
<td><c:out value="${us.name}"/></td>
<td><c:out value="${us.enabled}"/></td>
<td><c:out value="${us.fecha_insercion}"/></td>
</tr>
</c:forEach>
</table>
<form action=<c:url value="index.htm"/>>
<input type="submit" value="REGRESAR" >
</form>
</body>
</html>
