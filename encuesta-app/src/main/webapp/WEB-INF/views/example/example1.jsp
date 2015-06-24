<%@ page language="java" import="javax.servlet.jsp.PageContext" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html lang="en">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Example1</title>
<link href="/bootstrap-3.3.4-dist/css/bootstrap.min.css" rel="stylesheet" media="screen">
</head>
<body>
<h1 class="text-center"> Ingrese valor</h1>
<form action="example1.htm" method="post">
    <label>Valor:</label>
    <input type="text" required="required" name="paramValue"/>
    <input type="submit" value="Aceptar">
</form>
</body>
</html>