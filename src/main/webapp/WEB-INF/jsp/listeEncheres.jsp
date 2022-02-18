<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<jsp:include page="/WEB-INF/fragments/head.jsp"></jsp:include>

<body>
	<c:if test="${ !empty sessionScope.pseudo}">
		<p class="txt-connexion">Vous êtes ${ sessionScope.pseudo } !</p>
	</c:if>
	<header class="container">
		<div class="row">
			<h1 class="col-6">ENI-Enchères</h1>
			<ul class="nav justify-content-end">
				<li class="nav-item"><a class="nav-link" aria-current="page"
					href="${pageContext.request.contextPath}/ServletNouvelleVente">Enchères</a></li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/ServletNouvelleVente">Vendre
						un article</a></li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/ServletProfil">Mon
						profil</a></li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/ServletDeconnexion">Déconnexion</a>
				</li>
			</ul>
		</div>
	</header>
	<h2>Liste des enchères</h2>
	<div class="container-fluid">
		<form class="rechercher-encheres-connect-form" action="" method="post">
			<div class="row">
				<div class="col-md-5">
					<label for="username" class="text-info">Filtres :</label><br>
					<input type="text" name="recherche" id="recherche"
						class="recherche" placeholder="Le nom de l'article contient"
						style="width: 300px"><br> <br>
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
						<div class="container-fluid">
							<div class="row">
								<div class="col-md-6">
									<div class="form-check">
										<input class="form-check-input" type="radio"
											name="radioAchatsVentes" id="radioAchats" checked="checked">
										<label class="form-check-label" for="radioAchats">Achats</label>
									</div>
									<div class="check-encheres-ventes">
										<div class="form-check">
											<input class="form-check-input" type="checkbox"
												id="encheresOuvertes" checked> <label
												class="form-check-label" for="encheresOuvertes">
												enchères ouvertes </label>
										</div>
										<div class="form-check">
											<input class="form-check-input" type="checkbox"
												id="encheresEnCours"> <label
												class="form-check-label" for="encheresEnCours"> mes
												enchères en cours </label>
										</div>
										<div class="form-check">
											<input class="form-check-input" type="checkbox"
												id="encheresRemportees"> <label
												class="form-check-label" for="encheresRemportees">
												mes enchères remportées </label>
										</div>
									</div>
								</div>
								<div class="col-md-6">

									<div class="form-check">
										<input class="form-check-input" type="radio"
											name="radioAchatsVentes" id="radioVentes"> <label
											class="form-check-label" for="radioVentes">Mes ventes</label>
									</div>

									<div class="check-encheres-ventes">
										<div class="form-check">
											<input class="form-check-input" type="checkbox"
												id="encheresOuvertes" checked> <label
												class="form-check-label" for="encheresOuvertes"> mes
												ventes en cours </label>
										</div>
										<div class="form-check">
											<input class="form-check-input" type="checkbox"
												id="encheresEnCours"> <label
												class="form-check-label" for="encheresEnCours">
												ventes non débutées </label>
										</div>
										<div class="form-check">
											<input class="form-check-input" type="checkbox"
												id="encheresRemportees"> <label
												class="form-check-label" for="encheresRemportees">
												ventes terminées </label>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-7">
					<input type="submit"
						class="btn btn-info btn-md mt-3 btn-profil btn-recherche-encheres"
						value="Rechercher">
				</div>
			</div>
		</form>
	</div>
	<%@ include file="/WEB-INF/fragments/footer.html"%>
</body>
</html>
