<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>USERS</title>
</head>
<body>
<h3> USUARIOS EDITADOS</h3>
<table>
<tr><td style="width: 30px; "> ID</td><td style="width: 150px; "> USERNAME ANT</td><td style="width: 150px; "> USERNAME NEW</td>
<td style="width: 150px; "> PASSWORD ANT</td><td style="width: 150px; "> PASSWORD NEW</td><td style="width: 150px; "> NAME ANT</td>
<td style="width: 150px; "> NAME NEW</td><td style="width: 150px; "> ENABLED ANT</td><td style="width: 150px; "> ENABLED NEW</td>
<td style="width: 150px; "> FECHA EDICIÓN</td></tr>
<c:forEach items="${user_editados}" var="us">
<tr><td><c:out value="${us.id_edicion}"/></td>
<td><c:out value="${us.username_ant}"/></td>
<td><c:out value="${us.username_new}"/></td>
<td><c:out value="${us.password_ant}"/></td>
<td><c:out value="${us.password_new}"/></td>
<td><c:out value="${us.name_ant}"/></td>
<td><c:out value="${us.name_new}"/></td>
<td><c:out value="${us.enabled_ant}"/></td>
<td><c:out value="${us.enabled_new}"/></td>
<td><c:out value="${us.fecha_edicion}"/></td>
</tr>
</c:forEach>
</table>
<form action=<c:url value="index.htm"/>>
<input type="submit" value="REGRESAR" >
</form>
</body>
</html>
