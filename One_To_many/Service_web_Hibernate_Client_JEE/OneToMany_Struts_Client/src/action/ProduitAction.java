package action;

import service.*;
import java.util.*;
public class ProduitAction {
	
	// attributs pour soumettre un res 
	private List<Produit> l;
	private String idCat;
	


	public String AllProduct(){
	
		String resultat = "success"; 
		// invoquer le service 
		 Service stub =new ServiceService().getServicePort();
		 Integer idcateg= Integer.parseInt(getIdCat());
		 List<Produit> list=stub.getProduct(idcateg);
		// System.out.println(list.size());
		this.setL(list);
		
		//LinkedList<Produit> lp = stub.();
		// envoyer vers vue
	//	this.setL(lp);
		
		return resultat;
		
	}
	
	public String getIdCat() {
		return idCat;
	}
	public List<Produit> getL() {
		return l;
	}

	public void setL(List<Produit> l) {
		this.l = l;
	}

	public void setIdCat(String idCat) {
		this.idCat = idCat;
	}


	
}
