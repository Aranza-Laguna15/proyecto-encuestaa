<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>USERS</title>
 <link href="bootstrap-3.3.4-dist/css/bootstrap.css" rel="stylesheet">
<link href="bootstrap-3.3.4-dist/css/dashboard.css" rel="stylesheet">
</head>
<body>
<h2 class="sub-header"> USUARIOS EDITADOS</h2>
<div class="table-responsive">
<table class="table table-striped">
<tr><th> ID</th><th> USERNAME ANT</th><th> USERNAME NEW</th>
<th> PASSWORD ANT</th><th> PASSWORD NEW</th><th> NAME ANT</th>
<th> NAME NEW</th><th> ENABLED ANT</th><th> ENABLED NEW</th>
<th> FECHA EDICIÓN</th></tr>
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
</div>

<!-- Librería jQuery requerida por los plugins de JavaScript -->
 <script src="bootstrap-3.3.4-dist/libs/jquery-1.11.3.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="bootstrap-3.3.4-dist/js/bootstrap.min.js"></script>
</body>
</html>
