<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<jsp:include page="/WEB-INF/fragments/head.jsp"></jsp:include>
<link href="css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<link href="css/style.css" rel="stylesheet">
<head>
<meta charset="UTF-8">
</head>


<body>
	<header class="container">
		<div class="row">
			<h1 class="col-6">ENI-Enchères</h1>
		</div>
	</header>

	<div class="container-fluid">
		<div class="container">
			<div class="row">
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
								<input type="text" class="form-control" id="photoArticle"
									aria-describedby="photoArticle">
							</div>
						</div>
						<br>
						<div class="row">
							<div class="col-md-3">
								<label for="article" class="text">Mise à prix</label>
							</div>
							<div class="col-md-7">
								<input type="text" class="form-control" id="photoArticle"
									aria-describedby="photoArticle">
							</div>
						</div>
						<br>
						<div class="row">
							<div class="col-md-3">
								<label for="article" class="text">Début de l'enchère</label>
							</div>
							<div class="col-md-7">
								<input type="date" class="form-control" id="debutEnchere"
									aria-describedby="dateDebutEnchere">
							</div>
						</div>
						<br>
						<div class="row">
							<div class="col-md-3">
								<label for="article" class="text">Fin de l'enchère</label>
							</div>
							<div class="col-md-7">
								<input type="date" class="form-control" id="finEnchere"
									aria-describedby="dateFinEnchere">
							</div>
						</div>
						<br>
						<div class="row">
							<div class="col-md-10">
								<div class="container">
									<div class="panel">
										<div class="panel-body">
											<h3 class="text-on-pannel">
												<strong class="text"> Retrait </strong>
											</h3>
											<div ID="textField" class="form-row text-center">
												<div class="row">
													<div class=col-3>
														<label for="rue" class="label1"> Rue :</label>
													</div>
													<div class=col-8>
														<input type="text" class="form-control" id="photoArticle"
															aria-describedby="photoArticle">
													</div>
													<br>
													<div class="row"></div>
													<div class=col-3>
														<label for="rue" class="label1"> Code postal :</label>
													</div>
													<div class=col-8>
														<input type="text" class="form-control" id="photoArticle"
															aria-describedby="photoArticle">
													</div>
													<br>
													<div class="row"></div>
													<div class=col-3>
														<label for="rue" class="label1"> Ville :</label>
													</div>
													<div class=col-8>
														<input type="text" class="form-control" id="photoArticle"
															aria-describedby="photoArticle">
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
	<br>
	<div id="validerSaisie" class="form-row text-center">
		<div class=col-8>
			<input type="submit" name="Connexion"
				class="btn btn-info btn-md col-3" value="Enregistrer"> <input
				type="reset" name="Connexion" class="btn btn-danger btn-md col-3"
				value="Annuler">
		</div>
	</div>

	</form>
	</article>
	<article class="col-md-2"></article>
	</div>
	</div>
	</div>
	<%@ include file="/WEB-INF/fragments/footer.html"%>
</body>
</html>