package bean;

public class Produit {
	private int idProd; 
	private String designationProd;
	private int idCategorie; 
	// constructeur sans id
	
	
	public Produit(String designationProd, int idCategorie) {
		super();
		this.designationProd = designationProd;
		this.idCategorie = idCategorie;
	}
	public Produit() {
	
		super();
	}

	public int getIdProd() {
		return idProd;
	}

	public void setIdProd(int idProd) {
		this.idProd = idProd;
	}

	public String getDesignationProd() {
		return designationProd;
	}

	public void setDesignationProd(String designationProd) {
		this.designationProd = designationProd;
	}

	public int getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(int idCategorie) {
		this.idCategorie = idCategorie;
	}

	public Produit(int idProd, String designationProd, int idCategorie2) {
		super();
		this.idProd = idProd;
		this.designationProd = designationProd;
		this.idCategorie = idCategorie2;
	}

	
	
}