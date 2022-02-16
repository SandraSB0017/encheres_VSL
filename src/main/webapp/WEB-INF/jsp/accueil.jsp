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
		<div class="btn col-6" >
	
			<a href="${pageContext.request.contextPath}/ServletConnexion">S'inscrire - se connecter</a>
		</div>
	</div>
	</header>
	<h2>Liste des enchères</h2>

	<%@ include file="/WEB-INF/fragments/footer.html"%>
</body>
</html>