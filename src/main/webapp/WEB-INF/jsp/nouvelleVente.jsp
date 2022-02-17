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
				<article class="col-md-3">
					
				</article>
				<article class="col-md-7">
					<form method="post" action="">
						<div class="row">
						  <div class="col-md-3">
						    <label for="article" class="text">Article</label>
						  </div> 
						  <div class="col-md-7">
						    <input type="text" class="form-control" id="article" aria-describedby="nomArticle">
						  </div> 
						 </div><br>
						 <div class="row">
						  <div class="col-md-3">
						    <label for="article" class="text">Description</label>
						  </div>
						  <div class="col-md-7">
						    <textarea style="resize:none" name="description" rows="5" cols="55" ></textarea>
						  </div> 
						 </div><br>
						 <div class="row">
						  <div class="col-md-3">
						    <label for="article" class="text">Catégorie</label>
						  </div>
						  <div class="col-md-7">
						    <select id="categorie" name="categorie" size="1"  class="fld-field">
							
								<option>Maison</option>
								<option>Voiture</option>
								<option>Art</option>
								<option>Vetement homme</option>
								<option>Vetement femme</option>
						</select>
						  </div> 
						 </div><br>
						 <div class="row">
						  <div class="col-md-3">
						    <label for="article" class="text">Photo de l'article</label>
						  </div>
						  <div class="col-md-7">
						    <input type="text" class="form-control" id="photoArticle" aria-describedby="photoArticle">
						  </div> 
						 </div><br>
						  <div class="row">
						  <div class="col-md-3">
						    <label for="article" class="text">Mise à prix</label>
						  </div>
						  <div class="col-md-7">
						    <input type="text" class="form-control" id="photoArticle" aria-describedby="photoArticle">
						  </div> 
						 </div><br>
						  <div class="row">
						  <div class="col-md-3">
						    <label for="article" class="text">Début de l'enchère</label>
						  </div>
						  <div class="col-md-7">
						    <input type="date" class="form-control" id="debutEnchere" aria-describedby="dateDebutEnchere">
						  </div> 
						 </div><br>
						  <div class="row">
						  <div class="col-md-3">
						    <label for="article" class="text">Fin de l'enchère</label>
						  </div>
						  <div class="col-md-7">
						    <input type="date" class="form-control" id="finEnchere" aria-describedby="dateFinEnchere">
						  </div> 
						 </div><br>
						 <div class="row">
						 	<div class="col-md-10">
						 		<fieldset>
		                            <legend>Retrait</legend>
		                            <label for="rue" class="label1">Rue :</label>
		                            <input type="text" name="rue" id="rue" placeholder="Rue des Tilleuls" required>
		                            <label for="codePostal" class="label1"> Code postal :</label>
		                            <input type="text" name="codePostal" id="codePostal" placeholder="31100" required>
		                            <label for="ville" class="label1"> Ville :</label>
		                            <input type="text" name="ville" id="ville" placeholder="Toulouse">
                       			 </fieldset>
						 	</div>
						 </div>
						 
					 </form>
				</article>
				<article class="col-md-2">
					<h1>Test Article 3 </h1>
					<p>
					Le Lorem Ipsum est simplement du faux texte employé dans la composition et la mise en page avant impression. Le Lorem Ipsum est le faux texte standard de l'imprimerie depuis les années 1500, quand un imprimeur anonyme assembla ensemble des morceaux de texte pour réaliser un livre spécimen de polices de texte. Il n'a pas fait que survivre cinq siècles, mais s'est aussi adapté à la bureautique informatique, sans que son contenu n'en soit modifié. Il a été popularisé dans les années 1960 grâce à la vente de feuilles Letraset contenant des passages du Lorem Ipsum, et, plus récemment, par son inclusion dans des applications de mise en page de texte, comme Aldus PageMaker.
					</p>
				</article>
			</div>
		</div>
	</div>
	<%@ include file="/WEB-INF/fragments/footer.html"%>
</body>
</html>