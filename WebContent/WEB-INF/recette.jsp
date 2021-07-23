<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <jsp:include page="header.jsp"></jsp:include>

        <article>
            <header>
                <img class="imgRecette" src="img/${recette.photo}" alt="${recette.titre}" />
                <h1 class="titreRecette">
                    "${recette.titre}"
                </h1>
                <span class="fa fa-star checked"></span>
                <span class="fa fa-star checked"></span>
                <span class="fa fa-star checked"></span>
                <span class="fa fa-star checked"></span>
                <span class="fa fa-star"></span>
                </br>
                <time>
"${recette.dateCreation}"
</time>
            </header>
            <p>
                "${recette.description}"
            </p>
        </article>
        <hr />
        <header>
            <h2 id="titreIngredient">
                Ingrédients :
            </h2>
            <ul>
                <c:forEach items="${recette.ingredients}" var="ingredient">
                    <li>${ingredient.quantite} ${ingredient.unit} ${ingredient.nom}</li>
                </c:forEach>
            </ul>
        </header>


        <jsp:include page=" footer.jsp "></jsp:include>