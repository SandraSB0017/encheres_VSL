<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<%@include file="/WEB-INF/fragments/head.html"%>
<body>
	
	<header class="container-fluid">
		<div class="row col-12">
			<h1 class="col-4"><a class="eniHome" href="http://localhost:8080/encheres_VSL/ServletAccueil" rel="stylesheet">ENI-Enchères</a></h1>
			
			<ul class="col-8 nav justify-content-end mt-3">
				<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/ServletNouvelleVente">Enchères</a></li>
				<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/ServletNouvelleVente">Vendre un article</a></li>
				<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/ServletProfil">Bonjour ${ sessionScope.pseudo }</a></li>
				<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/ServletDeconnexion">Déconnexion</a></li>
			</ul>
		</div>
	</header>
	<h2 class="mt-5">Liste des enchères</h2>
	<div class="container">
			<div class="row">
				<article class="col-6">
				<div class="col-md-5 mt-5">
					<label for="username" class="text-info">Filtres :</label><br>
					<input type="text" name="recherche" id="recherche" class="recherche" placeholder="Le nom de l'article contient" size="50">
					<div class="row mt-2">
						<div class="col-md-5">
							<label for="article" class="text ">Catégorie :</label>
						</div>
						<div class="col-md-7">
							<select id="categorie" name="categorie" size="1"  class="fld-field">
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
				</article>	
				<article class="col-6 mt-3">
				<div class="row mt-3 form-row text-center">
					<div class="col-md-3">
							<input type="submit" class="btn btn-info btn-md mt-5 btn-profil btn-recherche-encheres " value="Rechercher">
					</div>
				</div>
				</article>
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
		<a class="btn-retour" onclick="history.go(-1)"><img alt="logo-fleche-retour" src="<%=request.getContextPath()%>/ressources/retour.png"class="logo-btn-rond-accueil"></a>
		
	<%@ include file="/WEB-INF/fragments/footer.html"%>
</body>
</html>
