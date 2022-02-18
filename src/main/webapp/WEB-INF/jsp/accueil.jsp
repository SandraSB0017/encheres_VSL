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
			<h1 class="col-4">ENI-Enchères</h1>
			<div class="col-4"></div>
				<div class="btn col-4">
					<a class="nav-link" href="${pageContext.request.contextPath}/ServletConnexion">S'inscrire - Se connecter</a>
				</div>
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
				<article class="col-6">
				<div class="row mt-3 form-row text-center">
					<div class="col-md-3">
							<input type="submit" class="btn btn-info btn-md mt-5 btn-profil btn-recherche-encheres " value="Rechercher">
					</div>
				</div>
				</article>
			</div>
			
				
		
	</div>
	<%@ include file="/WEB-INF/fragments/footer.html"%>
	
	
	<form class="rechercher-encheres-form" action="" method="post"></form>
</body>
</html>