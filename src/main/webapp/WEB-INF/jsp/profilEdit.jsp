<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<jsp:include page="/WEB-INF/fragments/head.jsp"></jsp:include>
<link href="css/style.css" rel="stylesheet">

<title>page profil utilisateur</title>

<body>
	<header class="container-fluid">
		<div class="row col-12">
			<h1><a class="eniHome" href="http://localhost:8080/encheres_VSL/ServletAccueil" rel="stylesheet">ENI-Enchères</a></h1>
				<div class="col-4"></div>
				<div class="btn col-4"></div>
		</div>
	</header>

	<h2>Mon profil</h2>
	<div class="container-formulaire-monProfil">
		<form action="${pageContext.request.contextPath}/modifier"method="post" class="container-fluid mt-2">
			
			<div class="row justify-content-sm-center">
				<div class="form-gauche mr-5">
					<div class="form-group">
						<label for="pseudo">Pseudo:</label> <input type="text"
							class="form-control" name="pseudo" id="pseudo"
							value="${utilisateur.pseudo}" required>
					</div>
					<div class="form-group">
						<label for="prenom">Prénom:</label> <input type="text"
							class="form-control" name="prenom" id="prenom"
							value="${utilisateur.prenom}" required>
					</div>
					<div class="form-group">
						<label for="telephone">Téléphone:</label> <input type="tel"
							class="form-control" name="telephone" id="telephone"
							value="${utilisateur.telephone}" required>
					</div>
					<div class="form-group">
						<label for="codePostal">Code postal:</label> <input type="text"
							class="form-control" name="codePostal" id="codePostal"
							value="${utilisateur.codePostal}" required>
					</div>
					<div class="form-group">
						<label for="motDePasse">Mot de passe:</label> <input
							type="password" class="form-control" name="motDePasse"
							id="motDePasse" required>

					</div>
					<div class="form-group">
						<label for="motDePasse">Nouveau mot de passe:</label> <input
							type="password" class="form-control" name="motDePasse"
							id="motDePasse" required>

					</div>
					 <div class="form-group">
    					<label for="credit"><strong>Crédit: ${utilisateur.credit}</strong></label>
 					 </div>


				</div>
				<div class="form-droite">
					<div class="form-group">
						<label for="nom">Nom:</label> <input type="text"
							class="form-control" name="nom" id="nom" value="${utilisateur.nom}" required>
					</div>
					<div class="form-group">
						<label for="email">Email:</label> <input type="email"
							class="form-control" name="email" id="email" value="${utilisateur.email}" required>
					</div>
					<div class="form-group">
						<label for="rue">Rue:</label> <input type="text"
							class="form-control" name="rue" id="rue" value="${utilisateur.rue}" required>
					</div>
					<div class="form-group">
						<label for="ville">Ville:</label> <input type="text"
							class="form-control" name="ville" id="ville" value="${utilisateur.ville}" required>
					</div>
					<div class="divConfirmation">
					<div class="form-group ">
						<label for="confirmation">Confirmation:</label> <input
							type="password" class="form-control" name="confirmation"
							id="confirmation" required>

					</div>
				</div>
				</div>


				<div class="container-btn-profil">



					<input type="submit" class="btn btn-info btn-md mt-3 btn-profil"value="Enregistrer"></input>
					 <a href="${pageContext.request.contextPath}/supprimer"type="submit" class="btn btn-info btn-md mt-3 btn-profil">Supprimer
						mon compte</a>
				</div>

			</div>
		</form>

	</div>















	<%@ include file="/WEB-INF/fragments/footer.html"%>
</body>
</html>