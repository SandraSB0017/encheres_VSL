<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<jsp:include page="/WEB-INF/fragments/head.jsp"></jsp:include>
<link href="css/profil.css" rel="stylesheet">


<body>
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
										<label for="rue" class="label1 ">Pseudo : ${utilisateur.pseudo}</label>
									</div>
								</div><br>
								
								<div class="row col-md-12 form-row text-center">
									<div class="col-12 ">
										<label for="rue" class="label1 ">Nom: ${utilisateur.nom}</label>
									</div>
								</div><br>	
								
								<div class="row col-md-12 form-row text-center">
									<div class="col-12 ">
										<label for="rue" class="label1 ">Prenom: ${utilisateur.prenom}</label>
									</div>
								</div><br>	
								
								<div class="row col-md-12 form-row text-center">
									<div class="col-12 ">
										<label for="rue" class="label1 ">Email: ${utilisateur.email}</label>
									</div>
								</div><br>	
								
								<div class="row col-md-12 form-row text-center">
									<div class="col-12 ">
										<label for="rue" class="label1 ">Téléphone: ${utilisateur.telephone}</label>
									</div>
								</div><br>	
								
								<div class="row col-md-12 form-row text-center">
									<div class="col-12 ">
										<label for="rue" class="label1 ">Rue: ${utilisateur.rue}</label>
									</div>
								</div><br>	
								<div class="row col-md-12 form-row text-center">
									<div class="col-12 ">
										<label for="rue" class="label1 ">Code postal: ${utilisateur.codePostal}</label>
									</div>
								</div><br>	
								<div class="row col-md-12 form-row text-center">
									<div class="col-12">
										<label for="rue" class="label1 ">Ville: ${utilisateur.ville}</label>
									</div>
								</div><br>	
								<a href="${pageContext.request.contextPath}/ServletProfilEdit"><input type="button" name="modifierProfil" class="btn btn-info btn-md" value="Modifier"></a>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

	<%@ include file="/WEB-INF/fragments/footer.html"%>
	
	
</body>
</html>