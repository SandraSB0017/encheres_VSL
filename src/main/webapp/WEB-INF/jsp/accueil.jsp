<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<jsp:include page="/WEB-INF/fragments/head.jsp"></jsp:include>

<body>
	<header class="container">
		<div class="row">
			<h1 class="col-6">ENI-Enchères</h1>
			<div class="btn col-6">
				<a href="${pageContext.request.contextPath}/ServletConnexion">S'inscrire
					- Se connecter</a>
			</div>
		</div>
	</header>
	<h2>Liste des enchères</h2>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-6">
				<label for="username" class="text-info">Filtres :</label><br> <input
					type="text" name="recherche" id="recherche" class="recherche"
					placeholder="Le nom de l'article contient"><br> <br>
				<div class="row">
					<div class="col-md-6">
						<label for="article" class="text">Catégorie : </label> <select
							id="categorie" name="categorie" size="1" class="fld-field">
							<option>Toutes</option>
							<option>Maison</option>
							<option>Voiture</option>
							<option>Art</option>
							<option>Vêtement homme</option>
							<option>Vêtement femme</option>
						</select>
					</div>
				</div>
			</div>
			<div class="col-md-6">
				<button type="button" class="btn-rechercher">Rechercher</button>
			</div>
		</div>
	</div>
	<%@ include file="/WEB-INF/fragments/footer.html"%>
</body>
</html>