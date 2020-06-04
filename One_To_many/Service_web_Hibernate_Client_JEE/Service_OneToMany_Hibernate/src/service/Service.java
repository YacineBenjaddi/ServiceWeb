
package service;

import java.util.LinkedList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.hibernate.Session;

import bean.Categorie;
import bean.Produit;
import util.HibernateUtil;

@WebService(name="Service")

public class Service {
	
	 @WebMethod(operationName="getAllCateg")
		
     
	 public List<Categorie> getAllCategories(){
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			List<Categorie> ls = new LinkedList<Categorie>();
			return session.createQuery("from Categorie").list();
		}

	 @WebMethod(operationName="getProduct")
		
	
	 public List<Produit> getProduct(@WebParam(name="idCat")int idCategorie){
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			List<Produit> l = session.createQuery("from Produit where idCategorie = '" + idCategorie + "'" ).list();
			return l;
		}
		

}
