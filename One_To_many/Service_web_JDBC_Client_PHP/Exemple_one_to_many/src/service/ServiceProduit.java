package service;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import bean.Produit;
import util.Connec;


@WebService(name="Service")
 public class ServiceProduit {
	 @WebMethod(operationName="recherche")
	public Produit rechercheProd(@WebParam(name="id")int idProd) {
		Produit produit=null;
	
		String req="Select * from produit where idProd='"+idProd+"'";
		//System.out.println(req);
		Connection cnx = Connec.getConnection();
		try {
		Statement stm=cnx.createStatement();
		ResultSet rs=stm.executeQuery(req);
		rs.next();
		int id=rs.getInt(1);
		String designationProd=rs.getString(2);
		int idCategorie=rs.getInt(3);
		
		produit=new Produit(id,designationProd,idCategorie);
		
		}
		catch(Exception e) {
			System.err.println("probleme dans methode jdbc"+ e.getMessage());
		}
		return produit;
		
	}
	 
	 
	
	 
}
