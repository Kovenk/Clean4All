package beans;

import java.util.HashMap;

public class Cart {

	
	private HashMap<Integer, Integer> articleList;
	
	public Cart() {
		this.articleList = new HashMap<Integer, Integer>();
	}
	
	
	public void addCart(int idProduit, int qttProduit) {
		if(this.articleList.containsKey(idProduit)) {
			
		this.articleList.put(idProduit, this.articleList.get(idProduit) + qttProduit);
		}
		else {
			this.articleList.put(idProduit, qttProduit);
		}
	}
	
	
	
	/**
	 * @return the articleList
	 */
	public HashMap<Integer, Integer> getArticleList() {
		return articleList;
	}
	
	public int totalQtt() {
	
		int total = 0;
		for (int qttProduit : this.articleList.values()) {
			total+= qttProduit;
		}
		
		return total;
	
	}
}
