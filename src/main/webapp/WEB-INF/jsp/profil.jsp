<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
    <!-- Bootstrap core CSS -->
  <link href="${pageContext.request.contextPath}/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet"> 
  <link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet">
  <link href="${pageContext.request.contextPath}/css/profil.css" rel="stylesheet">
    <title>Application enchères</title>
</head>

<body>
<header class="container-fluid">
		<div class="row col-12">
			<h1 class="col-4"><a class="eniHome" href="http://localhost:8080/encheres_VSL/ServletAccueil" rel="stylesheet">ENI-Enchères</a></h1>
			<ul class=" col-8 nav justify-content-end mt-3">
				<li class="nav-item"><a class="nav-link " 
					href="${pageContext.request.contextPath}/ServletNouvelleVente">Enchères</a></li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/ServletNouvelleVente">Vendre
						un article</a></li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/ServletDeconnexion">Déconnexion</a>
				</li>
			</ul>
		</div>
</header>			




	<div id="login">
		<div class="container">
			<div id="login-row"
				class="row justify-content-center align-items-center">
				<div id="login-column" class="col-md-6">
					<div id="login-box" class="col-md-12">
						<form id="login-form" class="form" action="" method="post">
							<h3 class="text-center text-info">Mon profil</h3>
							<div class="form-group ">
								<div class="row col-md-12 form-row text-center">
									<div class="col-12 mt-4">
										<label for="rue" class="label1 ">Pseudo : <span class="label-monProfil">${utilisateur.pseudo}</span></label>
										
									</div>
								</div><br>
								
								<div class="row col-md-12 form-row text-center">
									<div class="col-12 ">
										<label for="rue" class="label1 ">Nom : <span class="label-monProfil"> ${utilisateur.nom}</span></label>
									</div>
								</div><br>	
								
								<div class="row col-md-12 form-row text-center">
									<div class="col-12 ">
										<label for="rue" class="label1 ">Prenom :  <span class="label-monProfil"> ${utilisateur.prenom}</span></label>
									</div>
								</div><br>	
								
								<div class="row col-md-12 form-row text-center">
									<div class="col-12 ">
										<label for="rue" class="label1 ">Email : <span class="label-monProfil"> ${utilisateur.email}</span></label>
									</div>
								</div><br>	
								
								<div class="row col-md-12 form-row text-center">
									<div class="col-12 ">
										<label for="rue" class="label1 ">Téléphone : <span class="label-monProfil"> ${utilisateur.telephone}</span></label>
									</div>
								</div><br>	
								
								<div class="row col-md-12 form-row text-center">
									<div class="col-12 ">
										<label for="rue" class="label1 ">Rue : <span class="label-monProfil"> ${utilisateur.rue}</span></label>
									</div>
								</div><br>	
								<div class="row col-md-12 form-row text-center">
									<div class="col-12 ">
										<label for="rue" class="label1 ">Code postal : <span class="label-monProfil"> ${utilisateur.codePostal}</span></label>
									</div>
								</div><br>	
								<div class="row col-md-12 form-row text-center">
									<div class="col-12">
										<label for="rue" class="label1 ">Ville : <span class="label-monProfil"> ${utilisateur.ville}</span></label>
									</div>
								</div>	
								<div class="container-btn-profil">
								<a href="${pageContext.request.contextPath}/ServletProfilEdit"><input type="button" name="modifierProfil" class="btn btn-info btn-md mt-3" value="Modifier"></a>
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<a class="btn-retour" onclick="history.go(-1)"><img alt="logo-fleche-retour" src="<%=request.getContextPath()%>/ressources/retour.png"class="logo-btn-rond-accueil"></a>

	<%@ include file="/WEB-INF/fragments/footer.html"%>
	
	
</body>
</html>