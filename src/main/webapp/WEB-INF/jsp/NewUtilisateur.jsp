<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<jsp:include page="/WEB-INF/fragments/head.jsp"></jsp:include>

<body>

	<header class="container">
		<div class="row">
				<h1 class="col-6">ENI-Enchères</h1>
		</div>
	</header>
	
	<h2>Mon profil</h2>
<div >
	<form name="form_compte" action="ServletNewUtilisateur" method="post" class="col-6">
		<div class="row mb-3" >
		<div class="form-line gauche">
			<div class="form-label col">
				<label for="id-fld-name">Pseudo : </label>
			</div>
			<div class="form-field col">
				<input id="pseudo" name="pseudo" type="text"
					class="fld-field" required="required" placeholder="Votre pseudo ?" />
			</div>
			<div class="form-label col">
				<label for="id-fld-name">Prénom : </label>
			</div>
			<div class="form-field col">
				<input id="prenom" name="prenom" type="text"
					class="fld-field" required="required" placeholder="Votre prénom ?" />
			</div>
			<div class="form-label col">
				<label for="id-fld-name">Téléphone : </label>
			</div>
			<div class="form-field col">
				<input id="telephone" name="telephone" type="text"
					class="fld-field" required="required" placeholder="06.0...... ?" />
			</div>
			<div class="form-label col">
				<label for="id-fld-name">Code postal : </label>
			</div>
			<div class="form-field col">
				<input id="id-fld-name" name="fld-name" type="text"
					class="codePostal" required="codePostal"
					placeholder="Votre code postal ?" />
			</div>
			<div class="form-label col">
				<label for="id-fld-password">Mot de passe : </label>
			</div>
			<div class="form-field col">
				<input id="motDePasse" name="motDePasse" type="password"
					class="fld-field" required="required" />
			</div>
			</div>
		</div>

		<div class="row mb-3">
		<div class="form-line droite" >
			<div class="form-label">
				<label for="fld-first-name">Nom : </label>
			</div>
			<div class="form-field">
				<input id="nom" name="nom"
					class="fld-field" type="text" required="required"
					placeholder="Votre nom ?" />
			</div>

			<div class="form-line">
				<div class="form-label">
					<label for="id-fld-email">Email : </label>
				</div>
				<div class="form-field">
					<input id="email" name="email" type="email"
						class="fld-field" required="required" placeholder="Votre email ?" />
				</div>

				<div class="form-label">
					<label for="id-fld-tel">Rue : </label>
				</div>
				<div class="form-field">
					<input id="rue" type="tel" name="rue" class="fld-field"
						required="required" placeholder="Votre rue ?" />
				</div>
				<div class="form-label">
					<label for="id-fld-tel">Ville : </label>
				</div>
				<div class="form-field">
					<input id="ville" type="tel" name="ville" class="fld-field"
						required="required" placeholder="Votre ville ?" />
				</div>
				<div class="form-label">
					<label for="id-fld-repeat-password">confirmation: </label>
				</div>
				<div class="form-field">
					<input id="confirmation" name="confirmation"
						type="password" class="fld-field" required="required" />
				</div>
			</div>
		</div>
		</div>
		<div class="btn-connexion">
      <button type="submit" class="btn btn-primary">Créer</button><br>
      <div class="btn-connexion">
    </div>
    </div>
	</form>
</div>

	<%@ include file="/WEB-INF/fragments/footer.html"%>
</body>
</html>