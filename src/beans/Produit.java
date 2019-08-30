package beans;

public class Produit {
	
	private int idProduit;
	private String nomProduit;
	private int prixProduit;
	private String imgProduit;
	private String descProduit;
	



	
	public Produit(int idProduit,String nomProduit, int prixProduit) {
		
		this.idProduit = idProduit;
		this.nomProduit = nomProduit;
		this.prixProduit = prixProduit;
	}
	
	public Produit(int idProduit,String nomProduit, int prixProduit, String imgProduit) {
		
		this.idProduit = idProduit;
		this.nomProduit = nomProduit;
		this.prixProduit = prixProduit;
		this.imgProduit = imgProduit;
	}


	public Produit(int idProduit, String nomProduit, int prixProduit, String imgProduit, String descProduit) {
		
		this.idProduit = idProduit;
		this.nomProduit = nomProduit;
		this.prixProduit = prixProduit;
		this.imgProduit = imgProduit;
		this.descProduit = descProduit;
	}

	@Override
	public String toString() {
		return "Produit [nomProduit=" + nomProduit + ", prixProduit=" + prixProduit + "]";
	}
	
	public int getIdProduit() {
		return idProduit;
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

	public String getDescProduit() {
		return descProduit;
	}

	public void setDescProduit(String descProduit) {
		this.descProduit = descProduit;
	}
	

}