<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<jsp:include page="/WEB-INF/fragments/head.jsp"></jsp:include>


<title>Vente remportée</title>

<body>

<header class="container-fluid">
		<div class="row col-12">
			<h1><a class="eniHome" href="http://localhost:8080/encheres_VSL/ServletAccueil" rel="stylesheet">ENI-Enchères</a></h1>
			<ul class=" col-8 nav justify-content-end mt-3">
				
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/ServletListeEncheres">Liste des enchères</a></li>
				<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/ServletProfil">Mon profil</a></li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/ServletDeconnexion">Déconnexion</a>
				</li>
			</ul>
		</div>
</header>	

<h2 class="mt-5 mb-5">Vous avez remporté la vente</h2>	


	<div class="container ">
		<div class="row ">
			<div class="col-sm-6  ">
		<div class=" d-flex justify-content-center ">
			<img src="https://dummyimage.com/300x300/17a3b8/fff.png&text=image+de+l'objet+300x300" class="img-fluid justify-content-center" alt="image 200*200">
		</div>		
		</div>
		
		
		<div class="col-sm-6 ">
		
		
		<form method="post" action="">
						
						
						
					<label for="nomArticle" class="label1 "><span class="label-monProfil"> PC GAMER pour travailler</span></label> <br>
					<label for="description" class="label1 ">Description : <span class="label-monProfil"></span></label>
						<textarea class="form-control" placeholder="" id="floatingTextarea2" style="height: 100px"></textarea>
					
					<label for="meilleureOffre" class="label1 ">Meilleure offre : <span class="label-monProfil"></span></label> <br>
					<label for="miseAPrix" class="label1 ">Mise à prix : <span class="label-monProfil"></span></label> <br>
					
					<label for="retrait" class="label1 ">Retrait : <span class="label-monProfil"></span></label><br>
					<label for="vendeur" class="label1 ">Vendeur : <span class="label-monProfil"></span></label><br>
					<label for="vendeur" class="label1 ">Tèl : <span class="label-monProfil"></span></label><br>
					
					<div class="row">
							
							
							<div class="container-btn-detailVente mt-2">
								<a href="${pageContext.request.contextPath}/ServletListeEncheres"><input type="button" name="back" class="btn-detailVente " value="Back"></a>
								</div>
					
							
		
		
		
		
		
		
		
		</form>

		</div>
	
		
		</div>
	
	
	
	
	
	











</div>	

				
				
			
			
		
</body>
</html>