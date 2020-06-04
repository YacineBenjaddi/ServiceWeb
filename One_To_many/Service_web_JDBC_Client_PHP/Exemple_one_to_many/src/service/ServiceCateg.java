package service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import javax.jws.WebMethod;
import javax.jws.WebService;

import java.sql.Statement;
import bean.Categorie;
import util.Connec;

@WebService(name="Service")
public class ServiceCateg {
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
	        conn.close();
	        rs.close();
	        stmt.close();
	                  
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
