<%@ include file="../header.jsp" %>


	<div id="registerDiv" class="uk-width-1-3@m">
		<div class="uk-card uk-card-default uk-card-body">
		<h4>INSCRIPTION</h4>
		<form id="registerForm" method="post" action="register">
		
			<input class="uk-form-large" type="text" name="username" placeholder="Nom d'utilisateur"><br>
			<input class="uk-form-large" type="text" name="email" placeholder="Adresse Email"><br>
			<input class="uk-form-large"  type="password" name="password" placeholder="Mot de passe"><br>
		
			<input class="uk-button uk-button-default uk-button-large" type="submit" value="Valider">
		</form>
		
		</div>
	</div>
	
	
<%@ include file="../footer.jsp" %>