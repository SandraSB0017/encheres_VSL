<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	
<!DOCTYPE html>
<html>
<jsp:include page="/WEB-INF/fragments/head.jsp"></jsp:include>



<body>
    <c:if test="${ !empty sessionScope.pseudo && !empty sessionScope.motDePasse }">
        <p>Vous êtes ${ sessionScope.pseudo } ${ sessionScope.motDePasse } !</p>
    </c:if>
    
    
    <form method="post" action="ServletConnexion">
        <p>
            <label for="pseudo">Nom : </label>
            <input type="text" name="pseudo" id="pseudo" />
        </p>
        <p>
            <label for="motDePasse">mot de passe : </label>
            <input type="password" name="motDePasse" id="motDePasse" />
        </p>
        
        <input type="submit" />
    </form>
    
    
    
    <form>
  <div class="form-row ">
    <div class="col-sm-3 my-1">
      <label class="sr-only" for="pseudo">Name</label>
      <input type="text" class="form-control" id="pseudo" placeholder="votre identifiant">
    </div>
    <div class="col-sm-3 my-1">
      <label class="sr-only" for="motDePasse">mot de passe</label>
      <div class="input-group">
        <div class="input-group-prepend">
          
        </div>
        <input type="text" class="form-control" id="motDePasse" placeholder="votre mot de passe">
      </div>
    </div>
    <div class="col-auto my-1">
      <div class="form-check">
        <input class="form-check-input" type="checkbox" id="autoSizingCheck2">
        <label class="form-check-label" for="autoSizingCheck2">
         Se souvenir de moi
        </label>
      </div>
    </div>
    <div class="col-auto my-1">
      <button type="submit" class="btn btn-primary">Submit</button>
    </div>
  </div>
</form>



	<%@ include file="/WEB-INF/fragments/footer.html"%>
</body>
</html>