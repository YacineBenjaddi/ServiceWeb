
package service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Service", targetNamespace = "http://service/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Service {


    /**
     * 
     * @return
     *     returns java.util.List<service.Categorie>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllCateg", targetNamespace = "http://service/", className = "service.GetAllCateg")
    @ResponseWrapper(localName = "getAllCategResponse", targetNamespace = "http://service/", className = "service.GetAllCategResponse")
    @Action(input = "http://service/Service/getAllCategRequest", output = "http://service/Service/getAllCategResponse")
    public List<Categorie> getAllCateg();

    /**
     * 
     * @param idCat
     * @return
     *     returns java.util.List<service.Produit>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProduct", targetNamespace = "http://service/", className = "service.GetProduct")
    @ResponseWrapper(localName = "getProductResponse", targetNamespace = "http://service/", className = "service.GetProductResponse")
    @Action(input = "http://service/Service/getProductRequest", output = "http://service/Service/getProductResponse")
    public List<Produit> getProduct(
        @WebParam(name = "idCat", targetNamespace = "")
        int idCat);

}
