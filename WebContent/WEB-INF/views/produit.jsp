
<%@ include file="../header.jsp" %>

	<div id="registerDiv" class="uk-width-1-3@m">
		<div class="uk-card uk-card-default uk-card-body">
			<h4>${ produit.nomProduit }</h4>
			<div class="container">
				<img class="image" src="ressources/img/produit/${produit.imgProduit }"/>
				<div class="overlay">${produit.descProduit }</div>
			</div>
			<button id="price" class="uk-button uk-button-default uk-button-large">PRIX : ${ produit.prixProduit } &euro;</button>
			<form id="formAddCart" method="post" action="addCart">
				<input type="hidden" name="idProduit" value="${ produit.idProduit }">
				<input class="uk-input uk-form-width-small" type="number" value="1" min="1" placeholder="Qte" name="qttProduit">	
				<input id="addCart" class="uk-button uk-button-default uk-button-large" type="submit" value="Ajouter au panier">
			
			</form>
		</div>
	</div>
	
<%@ include file="../footer.jsp" %>


