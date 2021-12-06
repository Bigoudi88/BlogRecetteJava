<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="header.jsp"></jsp:include>
<h1>Inscription</h1>
<div id="inscription">
<form method="post" action="inscription" >
<input id="nom" name="nom" type="text" class="inputChamp"
placeholder="Votre nom *" /><br />
<input id="pseudo" name="pseudo" type="text"
class="inputChamp" placeholder="Votre pseudo *" /><br />
<input id="email" name="email" type="text"
class="inputChamp" placeholder="Votre email *" /><br />
<input id="mdp" name="mdp" type="password"
class="inputChamp" placeholder="Votre mot de passe *" /><br />
<br />
<input type="submit" value="Je m'inscris"
class="submitBtn" />
</form>
</div>
<div id="erreur">
<p> ${erreurs} </p>
</div>
<jsp:include page="footer.jsp"></jsp:include>