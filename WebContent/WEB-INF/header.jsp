<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CLEAN 4 ALL</title>
<!-- UIkit CSS -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/uikit/3.1.7/css/uikit.min.css" />

<!-- UIkit JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/uikit/3.1.7/js/uikit.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/uikit/3.1.7/js/uikit-icons.min.js"></script>
  <link rel="stylesheet" href="ressources/css/main.css">
</head>
<body>






<nav class="uk-navbar-container" uk-navbar>
    <div class="uk-navbar-left">
	    <ul id="Menu">
	    	<li><button class="uk-button uk-button-primary">Home</button></li>
			<li><button class="uk-button uk-button-primary">Contacts</button></li>

		</ul>
    </div>
	<div class="uk-navbar-center">
		<div class="typewriter">
			<c:if test="${ !empty sessionScope.user}">
				<h3>Bienvenue ${fn:toUpperCase(sessionScope.user.username) } !</h3>
			</c:if>
			<c:if test="${ empty sessionScope.user}">
				<h3>Bienvenue invité !</h3>
			</c:if>
		</div>    
	</div>
    <div class="uk-navbar-right">
    
	<c:if test="${ empty sessionScope.user}">
		<ul id="Loginbar">
			<li><a href="login"><button class="uk-button uk-button-primary">Connexion</button></a></li>
			<li><a href="register"><button class="uk-button uk-button-primary">Inscription</button></a></li>
		</ul>
	</c:if>
	
	<c:if test="${ !empty sessionScope.user}">
		<ul id="Logbar">
			<li><a href="panier"><button class="uk-button uk-button-primary">Mon Panier</button></a></li>
			<li><a href="logout"><button class="uk-button uk-button-primary">Deconnexion</button></a></li>
		</ul>
	</c:if>

	</div>
</nav>



	



