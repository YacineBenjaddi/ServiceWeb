package bean;

import java.util.HashSet;
import java.util.Set;

public class Categorie {
	
	private Integer idCategorie;
	private String designation; 
	private String description;
	

	

	public Categorie(Integer idCategorie, String designation, String description) {
		super();
		this.idCategorie = idCategorie;
		this.designation = designation;
		this.description = description;
		
	}

	public Categorie( String designation, String description) {
		this.designation = designation;
		this.description = description;
	}

	// Constructeur vide 
	public Categorie() {
		super();
	}
	
	// Getters and setters 
	public Integer getIdCategorie() {
		return idCategorie;
	}
	public void setIdCategorie(Integer idCategorie) {
		this.idCategorie = idCategorie;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	
}
