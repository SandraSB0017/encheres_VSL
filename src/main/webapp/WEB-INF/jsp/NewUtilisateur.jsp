<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<jsp:include page="/WEB-INF/fragments/head.jsp"></jsp:include>
<link href="css/style-profil.css" rel="stylesheet">

<body>

	<header class="container">
		<div class="row">
			<h1 class="col-4"><a class="eniHome" href="http://localhost:8080/encheres_VSL/ServletAccueil" rel="stylesheet">ENI-Enchères</a></h1>
		</div>
	</header>

	<h2>Mon profil</h2>


	<div class="container-formulaire-profil">

		<form action="${pageContext.request.contextPath}/ServletNewUtilisateur" method="post" class="container-fluid ">
			<div class="row justify-content-sm-center">
				<div class="form-gauche mr-5">
					<div class="form-group">
						<label for="pseudo">Pseudo:</label> <input type="text"
							class="form-control" name="pseudo" id="pseudo"
							placeholder="pseudo">
					</div>
					<div class="form-group">
						<label for="prenom">Prénom:</label> <input type="text"
							class="form-control" name="prenom" id="prenom"
							placeholder="prénom">
					</div>
					<div class="form-group">
						<label for="telephone">Téléphone:</label> <input type="tel"
							class="form-control" name="telephone" id="telephone"
							placeholder="telephone">
					</div>
					<div class="form-group">
						<label for="codePostal">Code postal:</label> <input type="text"
							class="form-control" name="codePostal" id="codePostal"
							placeholder="code postal">
					</div>
					<div class="form-group">
						<label for="motDePasse">Mot de passe:</label> <input
							type="password" class="form-control" name="motDePasse"
							id="motDePasse" placeholder="mot de passe">

					</div>
				

				</div>
				<div class="form-droite">
					<div class="form-group">
						<label for="nom">Nom:</label> <input type="text"
							class="form-control" name="nom" id="nom" placeholder="nom">
					</div>
					<div class="form-group">
						<label for="email">Email:</label> <input type="email"
							class="form-control" name="email" id="email" placeholder="email">
					</div>
					<div class="form-group">
						<label for="rue">Rue:</label> <input type="text"
							class="form-control" name="rue" id="rue" placeholder="rue">
					</div>
					<div class="form-group">
						<label for="ville">Ville:</label> <input type="text"
							class="form-control" name="ville" id="ville" placeholder="ville">
					</div>
					<div class="form-group">
						<label for="confirmation">Confirmation:</label> <input
							type="password" class="form-control" name="confirmation"
							id="confirmation" placeholder="confirmation ">

					</div>

				</div>
			
	
	<div class="container-btn-profil">

		
		
		<input type="submit" class="btn btn-info btn-md mt-3 btn-profil" value ="créer"></input>
		<a href="${pageContext.request.contextPath}/ServletConnexion" type="reset" class="btn btn-info btn-md mt-3 btn-profil">Annuler</a>
			
	</div>
	
</div>
	</form>

	</div>
	
	
	<%@ include file="/WEB-INF/fragments/footer.html"%>
</body>
</html>