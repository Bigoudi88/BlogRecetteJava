<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="fr">
<head>
<meta charset="UTF-8" />
<link rel="stylesheet" href="style/style.css" />
<title>Mon Blog de Recettes</title>
</head>
<body>
<header id="header">
<a href="index"><h1 id="titreBlog">Mon Blog de Recettes</h1></a>
<div style="width:300px;margin:20px auto;">Bienvenue sur mon blog de
recettes</div>
<div id="loginBar">
<div class="login">
<c:choose>
<c:when test="${not empty sessionScope.membre}">
<div class="primaryBtn login" >
Bonjour ${sessionScope.membre.nom} ${sessionScope.membre.pseudo}
</div>
</c:when>
<c:otherwise>
<a class="primaryBtn login" href="inscription">Inscription</a>
</c:otherwise>
</c:choose>


</div>
</div>
</header>
<div id="global">
