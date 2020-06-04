package service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import bean.Categorie;
import bean.Produit;
import util.Connec;

@WebService(name="Service")
public class Service {
	
	 @WebMethod(operationName="recherche")
		public LinkedList<Produit> rechercheProd(@WebParam(name="id")int idCategorie) {
		 LinkedList<Produit> listeC = new LinkedList<Produit>();
			Produit produit=null;
		
			String req="Select * from produit where idCategorie='"+idCategorie+"'";
			//System.out.println(req);
			Connection cnx = Connec.getConnection();
			try {
			Statement stm=cnx.createStatement();
			ResultSet rs=stm.executeQuery(req);
			while(rs.next()) {
			int id=rs.getInt(1);
			String designationProd=rs.getString(2);
			int idCategorie1=rs.getInt(3);
			
			produit=new Produit(id,designationProd,idCategorie1);
			listeC.add(produit); 
			}
			}
			catch(Exception e) {
				System.err.println("probleme dans methode jdbc"+ e.getMessage());
			}
			return listeC;
			
		}
	 
	 
	 @WebMethod(operationName="get")
		public  LinkedList<Categorie> getAllCateg(){
		       
		    LinkedList<Categorie> listeC = new LinkedList<Categorie>();
		    String req = "SELECT * FROM categorie ";
		            Categorie c = null;
		    try{
		        java.sql.Connection conn = Connec.getConnection();
		        Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
		                                              ResultSet.CONCUR_UPDATABLE);
		        stmt = conn.createStatement();
		        ResultSet rs = stmt.executeQuery(req);
		        while (rs.next()) {
		                           int id = rs.getInt(1);
		                           String designation = rs.getString(2);
		                           String description = rs.getString(3);
		                        
		   
		               c = new Categorie(id, designation,description);
		               listeC.add(c);      
		        }
		        //conn.close();
		        //rs.close();
		        //stmt.close();
		                  
		        }catch(SQLException e){
		            System.out.println("Problème durant la récupération de la liste "
		                                    + "des clients");
		            System.out.println("SQLException: " + e.getMessage());
		            System.out.println("SQLState: "     + e.getSQLState());
		            System.out.println("VendorError: "  + e.getErrorCode());
		        }
		    return listeC;
		}

}
