<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="header.jsp"></jsp:include>


<c:forEach items="${recettes}" var="recette" >
<article>
<header>
<img class="imgRecette" src="img/${recette.photo}" width="300px"
height="242px" alt="Tartiflette" />
<a href="recette?id=${recette.id}">
<h1 class="titreRecette">
${recette.titre}
</h1>
</a>
<time>
${recette.dateCreation}
</time>
</header>
<p>
${recette.description}
</p>
</article>
<hr />
</c:forEach>







<jsp:include page="footer.jsp"></jsp:include>