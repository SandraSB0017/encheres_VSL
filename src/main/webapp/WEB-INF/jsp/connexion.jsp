<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<jsp:include page="/WEB-INF/fragments/head.jsp"></jsp:include>
<body class ="container col-12">
	<header class="container">
		<div class="row">
			<h1 class="col-6">ENI-Enchères</h1>
		</div>
	</header>
	
	<div class="row">
		<div class="col-md-6 col-md-offset-3">
			<form method="post">
				
					<div class="form-floating mb-3">
						<input type="email" class="form-control" id="floatingInput"
							placeholder="name@example.com"> <label for="floatingInput">Email
							address</label>
					</div>
					<div class="form-floating">
						<input type="password" class="form-control" id="floatingPassword"
							placeholder="Password"> <label for="floatingPassword">Password</label>
					</div>
			</form>
		</div>	
</div>


	<%@ include file="/WEB-INF/fragments/footer.html"%>
</body>
</html>