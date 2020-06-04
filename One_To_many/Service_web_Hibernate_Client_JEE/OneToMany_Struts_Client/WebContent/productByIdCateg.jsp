<%@page import="java.util.ArrayList"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.List"%>
<%@page import="service.ServiceService"%>
<%@page import="service.Categorie"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

        <%@ page import="service.Produit" %>
        <%@ page import="java.util.LinkedList" %>
   
<%@ page import="service.*"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>


%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>STRUTS</title>
</head>
<body   >
<center>
<h1 style="color:green ;text-decoration: underline;">Chercher un produit avec l'identifiant de la categorie</h1><br>
<form action="getAllCateg" method="get"><br>
<strong style="color:black;">Entrer l'indentifiant de la categorie:</strong>
<input type="text" id="idCat" name ="idCat" /><br><br>
<input type="submit" value="Rechercher"><br>
</form>
<br>
<b style="color:#02BF1E;">La liste des produits :<br><br>

<c:forEach var="prod" items="${l}" varStatus="i" >
	<li> <c:out value="${prod.getDesignationProd()}" /> </li>

</c:forEach>

<!--  <c:forEach items="${res}" var="res">
 
</c:forEach>-->

</b>
</center>
</body>

</html>