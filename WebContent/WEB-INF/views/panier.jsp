<%@ include file="../header.jsp" %>



	<div id="registerDiv" class="uk-width-1-3@m">
		<div class="uk-card uk-card-default uk-card-body">
			<table class="uk-table">
			    <caption>Panier</caption>
			    <thead>
			        <tr>
			            <th>Produit</th>
			            <th>Quantité</th>
			            <th>Prix unitaire</th>
			            <th>Prix Total<th>
			        </tr>
			    </thead>
			    <tbody>
			    
				    <c:forEach items="${sessionScope.cart.articleList }" var="article">
				        <tr>
				            <td>${ panier.ProduitbyId(article.key)}</td>
				            <td>${ sessionScope.cart.totalQtt() }</td>
				            <td>${ sessionScope.articleList }&euro;</td>
				            <td>${sessionScope.articleList } &euro;</td>
				            
				            
				        </tr>
					</c:forEach>
			    </tbody>
			</table>
		
		</div>
	</div>

<%@ include file="../footer.jsp" %>

