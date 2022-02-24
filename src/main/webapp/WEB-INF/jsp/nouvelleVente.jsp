<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
    <!-- Bootstrap core CSS -->
  <link href="${pageContext.request.contextPath}/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet"> 
  <link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet">

    <title>Application enchères</title>
</head>
<body>
	<header class="container-fluid mb-3">
		<div class="row col-12">
			<h1 class="col-4"><a class="eniHome" href="http://localhost:8080/encheres_VSL/ServletAccueil" rel="stylesheet">ENI-Enchères</a></h1>
			
				<ul class="col-8 nav justify-content-end mt-3">
				<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/ServletListeEncheres">Accueil enchères</a></li>
				<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/ServletProfil">Mon profil (${ sessionScope.pseudo })</a></li>
				<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/ServletDeconnexion">Déconnexion</a></li>
			</ul>
		</div>
	</header>

	<div class="container-fluid ">
		<div class="container">
			<div class="row mt-5">
				<article class="col-md-3"></article>
				<article class="col-md-7">
					<form method="post" action="${pageContext.request.contextPath}/ServletNouvelleVente">
						<div class="row">
							<div class="col-md-3">
								<label for="nomArticle" name="nomArticle" class="text">Article</label>
							</div>
							<div class="col-md-7">
								<input type="text" class="form-control" id="nomArticle" name="nomArticle"
									aria-describedby="nomArticle">
							</div>
						</div>
						<br>
						<div class="row">
							<div class="col-md-3">
								<label for="description" name="description" class="text">Description</label>
							</div>
							<div class="col-md-7">
								<textarea style="resize: none" name="description" rows="5"
									cols="55"></textarea>
							</div>
						</div>
						<br>
						<div class="row">
							<div class="col-md-3">
								<label for="libelleCategorie" name="libelleCategorie" class="text">Catégorie</label>
							</div>
							<div class="col-md-7">
								<select id="libelleCategorie" name="libelleCategorie" size="1"
									class="fld-field">

									<option>Maison</option>
									<option>Voiture</option>
									<option>Art</option>
									<option>Vetement homme</option>
									<option>Vetement femme</option>
								</select>
							</div>
						</div>
						<br>
						<div class="row">
							<div class="col-md-3">
								<label for="article" class="text">Photo de l'article</label>
							</div>
							<div class="col-md-7">
								<div class="button_outer">
									<div class="btn_upload">
										<input type="file" id="upload_file" name="importImage">
									</div>
									<div class="processing_bar"></div>
									<div class="success_box"></div>
								</div>
							</div>
						</div>
						<br>
						<div class="row">
							<div class="col-md-3">
								<label for="prixInitial" name="prixInitial" class="text">Mise à prix</label>
							</div>
							<div class="col-md-7">
								<input type="number" class="form-control" id="prixVente" name="prixInitial">
							</div>
						</div>
						<br>
						<div class="row">
							<div class="col-md-3">
								<label for="dateDebutEncheres" name="dateDebutEncheres" class="text">Début de l'enchère</label>
							</div>
							<div class="col-md-7">
								<input type="date" class="form-control" id="dateDebutEncheres" name="dateDebutEncheres">
							</div>
						</div>
						<br>
						<div class="row">
							<div class="col-md-3">
								<label for="dateFinEncheres" name="dateFinEncheres" class="text">Fin de l'enchère</label>
							</div>
							<div class="col-md-7">
								<input type="date" class="form-control" id="finEnchere" name="dateFinEncheres">
							</div>
						</div>
						<br>
						<div class="row">
							<div class="col-md-10">
								<div class="container">
									<div class="panel">
										<div class="panel-body">
											<h3 class="text-on-pannel"><strong class="text"> Retrait </strong></h3>
												
											
											<div ID="textField" class="mt-4">
												<div class="row col-md-12 form-row text-center">
													<div class="col-3">
														<label for="rue" class="label1 "> Rue :</label>
													</div>
													<div class="col-9">
														<input type="text" class="form-control" id="rue" name="rue">
													</div>
													</div>
													<br>
													<div class="row col-md-12 form-row text-center">
													<div class="col-3">
														<label for="codePostal" class="label2 "> Code postal :</label>
													</div>
													<div class="col-9">
														<input type="text" class="form-control" id="codePostal" name="codePostal">
													</div>
													</div>
													<br>
													<div class="row col-md-12 form-row text-center">
													<div class="col-3">
														<label for="ville" class="label3 "> Ville :</label>
													</div>
													<div class="col-9">
														<input type="text" class="form-control" id="ville" name="ville">
													</div>
													</div>
													<br>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						
	<br>
	<div id="validerSaisie" class="form-row text-center">
		<div class=col-8>
			<input type="submit" name="Connexion" class="btn btn-info btn-md col-3" value="Enregistrer"> <input type="reset" name="Connexion" class="btn btn-danger btn-md col-3" value="Annuler">
		</div>
	</div>

	</form>
	</article>
	<article class="col-md-2"></article>
	</div>
	</div>
	</div>
	<a class="btn-retour" onclick="history.go(-1)"><img alt="logo-fleche-retour" src="<%=request.getContextPath()%>/ressources/retour.png"class="logo-btn-rond-accueil"></a>
	
	<%@ include file="/WEB-INF/fragments/footer.html"%>
</body>
</html>