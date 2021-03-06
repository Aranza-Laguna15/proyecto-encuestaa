<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html lang="en">
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>USERS</title>
 <link href="bootstrap-3.3.4-dist/css/bootstrap.css" rel="stylesheet">
<link href="bootstrap-3.3.4-dist/css/dashboard.css" rel="stylesheet">
<script> 
function actualiza_2_frames(){ 
   	window.parent.frames[1].location="usersEdit.htm" 
   	window.location="usersAll.htm" 
} 
function actualiza_delete(){
window.parent.frames[1].location="usersDel.htm" 
   	window.location="usersAll.htm" 
}
</script>
</head>
<body>

<h2 class="sub-header"> USUARIOS </h2>
<div class="table-responsive">
<table class="table table-striped">
<tr><th> USERNAME</th><th> PASSWORD</th><th> NOMBRE</th><th> ENABLED</th><th>ACCIÓN</th></tr>

<c:forEach items="${users}" var="us">
<tr><td><c:out value="${us.username}"/></td>
<td><c:out value="${us.password}"/></td>
<td><c:out value="${us.name}"/></td>
<td><c:out value="${us.enabled}"/></td>
<td><a type="button" class="btn btn-default" aria-label="Left Align" data-toggle="modal" data-target="#gridSystemModal_${us.username}">
<span class="glyphicon glyphicon-edit" aria-hidden="true"></span>
</a> / <a type="button" class="btn btn-default" aria-label="Left Align" href="delete.htm?username=${us.username}" onclick="javascript:actualiza_delete()">
  <span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
</a></td></tr>
<!-- data-toggle="modal" data-target="#modaldelete" -->
<div id="gridSystemModal_${us.username}" class="modal fade" role="dialog" aria-labelledby="gridSystemModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="gridSystemModalLabel">EDITAR USUARIO</h4>
      </div>
      <form:form commandName="usuario" action="edit.htm" method="GET">
      <div class="modal-body">
    <div class="form-group">
      <h2 class="jaja"> <c:out value="${us.username}"/></h2>
      <div class="col-lg-10" style='display:none;'>
        <form:input type="text" class="form-control" path="username" value="${us.username}" name="username"/>
      </div>
       <label class="col-lg-2 control-label">NOMBRE</label>
      <div class="col-lg-10">
        <form:input type="text" class="form-control" path="name" value="${us.name}" required="required"/>
      </div>
       <label class="col-lg-2 control-label">CONTRASEÑA</label>
      <div class="col-lg-10">
        <form:input type="password" class="form-control" path="password" required="required"/>
      </div>
        </div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">CANCELAR</button>
        <form:button type="submit" class="btn btn-primary" href="javascript:actualiza_2_frames()">GUARDAR USUARIO</form:button>
      </div>
         </form:form>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->

</c:forEach>
</table>
</div>



<!-- Librería jQuery requerida por los plugins de JavaScript -->
 <script src="bootstrap-3.3.4-dist/libs/jquery-1.11.3.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="bootstrap-3.3.4-dist/js/bootstrap.min.js"></script>
</body>
</html>
