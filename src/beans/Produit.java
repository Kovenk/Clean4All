package beans;

public class Produit {
	
	private String nomProduit;
	private int prixProduit;
	private String imgProduit;
	
	
	public Produit(String nomProduit, int prixProduit) {
		this.nomProduit = nomProduit;
		this.prixProduit = prixProduit;
	}
	
	public Produit(String nomProduit, int prixProduit, String imgProduit) {
		
		this.nomProduit = nomProduit;
		this.prixProduit = prixProduit;
		this.imgProduit = imgProduit;
	}



	@Override
	public String toString() {
		return "Produit [nomProduit=" + nomProduit + ", prixProduit=" + prixProduit + "]";
	}
	
	
	public String getNomProduit() {
		return nomProduit;
	}
	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}
	public int getPrixProduit() {
		return prixProduit;
	}
	public void setPrixProduit(int prixProduit) {
		this.prixProduit = prixProduit;
	}
	public String getImgProduit() {
		return imgProduit;
	}
	public void setImgProduit(String imgProduit) {
		this.imgProduit = imgProduit;
	}
	

}
