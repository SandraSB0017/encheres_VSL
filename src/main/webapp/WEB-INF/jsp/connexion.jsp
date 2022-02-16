<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	
<!DOCTYPE html>
<html>
<jsp:include page="/WEB-INF/fragments/head.jsp"></jsp:include>



<body>






    <c:if test="${ !empty sessionScope.pseudo && !empty sessionScope.motDePasse }">
        <p class="txt-connexion">Vous êtes ${ sessionScope.pseudo } ${ sessionScope.motDePasse } !</p>
    </c:if>

   
    
    <div class="row mb-3 justify-content-center ">
    <form method="post" action="ServletConnexion" class="container-form" >
    
  <div class="form-group col">
    
      <label class="sr-only" for="pseudo">Name</label>
      <input type="text" name="pseudo" class="form-control" id="pseudo" placeholder="votre identifiant">
    </div>
    <div class="form-group col">
      <label class="sr-only" for="motDePasse">mot de passe</label>
      <input type="text" name="motDePasse" class="form-control" id="motDePasse" placeholder="votre mot de passe">
    </div>
    
      <div class="form-check col">
        <input class="form-check-input" type="checkbox" id="autoSizingCheck2">
        <label class="form-check-label" for="autoSizingCheck2"> Se souvenir de moi </label>
       </div>
  
    <div class="btn-connexion">
      <button type="submit" class="btn btn-primary">Connexion</button>
    </div><br>
    <div class="btn-connexion">
      <a href="${pageContext.request.contextPath}/ServletNewUtilisateur"><input type="button" name="creerUnCompte" value="Créer un compte"></a>
    </div>
 
</form>

</div>

	<%@ include file="/WEB-INF/fragments/footer.html"%>
</body>
</html>