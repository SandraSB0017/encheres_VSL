<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<jsp:include page="/WEB-INF/fragments/head.jsp"></jsp:include>
<link href="css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<link href="css/style.css" rel="stylesheet">

<body>
	<header class="container-fluid">
		<div class="row col-12">
			<h1><a class="eniHome" href="http://localhost:8080/encheres_VSL/ServletAccueil" rel="stylesheet">ENI-Enchères</a></h1>
				<ul class="col-8 nav justify-content-end mt-3">
					<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/ServletConnexion">S'inscrire - Se connecter</a></li>
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
				<div id="cards">
					<div class="row">
					  <div class="col-sm-6">
					    <div class="card">
					      <div class="card-body">
					        <h5 class="card-title"><a href="${pageContext.request.contextPath}/ServletDetailVente">PC Gamer pour travailler</a></h5>
					        <label for="prix" class="prix "> Prix :</label><br>
					        <label for="finEnchere" class="finEnchere "> Fin de l'enchère :</label><br>
					        <label for="vendeur" class="vendeur "> Vendeur : <a href="">jojo44</a></label>
					      </div>
					    </div>
					  </div>
					  <div class="col-sm-6">
					    <div class="card">
					      <div class="card-body">
					        <h5 class="card-title"><a href="">Rocket stove pour riz et pâtes</a></h5>
					       <label for="prix" class="prix "> Prix :</label><br>
					        <label for="finEnchere" class="finEnchere "> Fin de l'enchère :</label><br>
					        <label for="vendeur" class="vendeur "> Vendeur : <a href="">NineJea</a></label>
					      </div>
					    </div>
					  </div>
					</div>
				</div>
	</div>
	<%@ include file="/WEB-INF/fragments/footer.html"%>
</body>
</html>