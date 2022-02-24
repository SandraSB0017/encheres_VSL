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
				<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/ServletProfil">le profil de ${ sessionScope.pseudo }</a></li>
				<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/ServletDeconnexion">Déconnexion</a></li>
			</ul>
		</div>
	</header>

	<div class="container-fluid ">
		<div class="container">
			<div class="row mt-5">
				<article class="col-md-3"></article>
				<article class="col-md-7">
					<form method="post" action="">
						<div class="row">
							<div class="col-md-3">
								<label for="article" class="text">Article</label>
							</div>
							<div class="col-md-7">
								<input type="text" class="form-control" id="article"
									aria-describedby="nomArticle">
							</div>
						</div>
						<br>
						<div class="row">
							<div class="col-md-3">
								<label for="article" class="text">Description</label>
							</div>
							<div class="col-md-7">
								<textarea style="resize: none" name="description" rows="5"
									cols="55"></textarea>
							</div>
						</div>
						<br>
						<div class="row">
							<div class="col-md-3">
								<label for="article" class="text">Catégorie</label>
							</div>
							<div class="col-md-7">
								<select id="categorie" name="categorie" size="1"
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
								<label for="article" class="text">Mise à prix</label>
							</div>
							<div class="col-md-7">
								<input type="number" class="form-control" id="prix">
							</div>
						</div>
						<br>
						<div class="row">
							<div class="col-md-3">
								<label for="article" class="text">Début de l'enchère</label>
							</div>
							<div class="col-md-7">
								<input type="date" class="form-control" id="debutEnchere">
							</div>
						</div>
						<br>
						<div class="row">
							<div class="col-md-3">
								<label for="article" class="text">Fin de l'enchère</label>
							</div>
							<div class="col-md-7">
								<input type="date" class="form-control" id="finEnchere">
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
														<input type="text" class="form-control" id="nomRue">
													</div>
													</div>
													<br>
													<div class="row col-md-12 form-row text-center">
													<div class="col-3">
														<label for="rue" class="label2 "> Code postal :</label>
													</div>
													<div class="col-9">
														<input type="text" class="form-control" id="numCP">
													</div>
													</div>
													<br>
													<div class="row col-md-12 form-row text-center">
													<div class="col-3">
														<label for="rue" class="label3 "> Ville :</label>
													</div>
													<div class="col-9">
														<input type="text" class="form-control" id="nomVille">
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
			<input type="submit" name="Connexion" class="btn btn-info btn-md col-3" value="Enregistrer">
			<input type="reset" name="Connexion" class="btn btn-danger btn-md col-3" value="Annuler">
			<input type="reset" name="Connexion" class="btn btn-danger btn-md col-5" value="Annuler la vente">
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