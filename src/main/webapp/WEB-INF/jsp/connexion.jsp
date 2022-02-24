<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
    <!-- Bootstrap core CSS -->
  <link href="${pageContext.request.contextPath}/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet"> 
  <link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet">
    <title>Application enchères</title>
</head>


<body>
	<header class="container-fluid">
		<div class="row col-12">
			<h1 class="col-4"><a class="eniHome" href="http://localhost:8080/encheres_VSL/ServletAccueil" rel="stylesheet">ENI-Enchères</a></h1>
				<div class="col-4"></div>
				<div class="btn col-4"></div>
		</div>
	</header>
	
	<div id="login">
		<div class="container">
			<div id="login-row" class="row justify-content-center align-items-center">
				<div id="login-column" class="col-md-6">
					<div id="login-box" class="col-md-12">
						<form id="login-form" class="form" action="" method="post">
							<h3 class="text-center text-info">Connexion</h3>
							<div class="form-group">
								<label for="username" class="text-info">Identifiant:</label><br>
								<input type="text" name="pseudo" id="pseudo"
									class="form-control" value="${utilisateur.pseudo}"> <span
									class="erreur">${form.erreurs['pseudo']}</span>
							</div>
							<div class="form-group">
								<label for="password" class="text-info">Mot de passe:</label><br>
								<input type="password" name="motDePasse" id="motDePasse"
									class="form-control"> <span class="erreur">${form.erreurs['motDePasse']}</span>
							</div>
							<div class="form-group">
								<label for="remember-me" class="text-info"><span>Se
										souvenir de moi</span> <span><input id="remember-me"
										name="remember-me" type="checkbox"></span></label><br> <a
									href="${pageContext.request.contextPath}/ServletConnexion"><input
									type="submit" name="Connexion" class="btn btn-info btn-md"
									value="Connexion"></a> <a
									href="${pageContext.request.contextPath}/ServletNewUtilisateur"><input
									type="button" name="CreerCompte" class="btn btn-info btn-md"
									value="Créer un compte"></a>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	<a class="btn-retour" onclick="history.go(-1)"><img alt="logo-fleche-retour" src="<%=request.getContextPath()%>/ressources/retour.png"class="logo-btn-rond-accueil"></a>
	
	<%@include file="/WEB-INF/fragments/footer.html"%>
</body>
</html>