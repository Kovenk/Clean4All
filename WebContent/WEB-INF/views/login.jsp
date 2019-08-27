<%@ include file="../header.jsp" %>



${msg }
<form method="post" action="login">

	<input class="uk-form-width-medium" type="text" name="username" placeholder="Username"><br>
	<input class="uk-form-width-medium" type="password" name="password" placeholder="Password"><br>
	<input class="uk-button uk-button-primary" type="submit" value="Connexion">
</form>

<%@ include file="../footer.jsp" %>
