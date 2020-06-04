
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetProduct_QNAME = new QName("http://service/", "getProduct");
    private final static QName _GetProductResponse_QNAME = new QName("http://service/", "getProductResponse");
    private final static QName _GetAllCategResponse_QNAME = new QName("http://service/", "getAllCategResponse");
    private final static QName _GetAllCateg_QNAME = new QName("http://service/", "getAllCateg");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllCategResponse }
     * 
     */
    public GetAllCategResponse createGetAllCategResponse() {
        return new GetAllCategResponse();
    }

    /**
     * Create an instance of {@link GetProduct }
     * 
     */
    public GetProduct createGetProduct() {
        return new GetProduct();
    }

    /**
     * Create an instance of {@link GetProductResponse }
     * 
     */
    public GetProductResponse createGetProductResponse() {
        return new GetProductResponse();
    }

    /**
     * Create an instance of {@link GetAllCateg }
     * 
     */
    public GetAllCateg createGetAllCateg() {
        return new GetAllCateg();
    }

    /**
     * Create an instance of {@link Categorie }
     * 
     */
    public Categorie createCategorie() {
        return new Categorie();
    }

    /**
     * Create an instance of {@link Produit }
     * 
     */
    public Produit createProduit() {
        return new Produit();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getProduct")
    public JAXBElement<GetProduct> createGetProduct(GetProduct value) {
        return new JAXBElement<GetProduct>(_GetProduct_QNAME, GetProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getProductResponse")
    public JAXBElement<GetProductResponse> createGetProductResponse(GetProductResponse value) {
        return new JAXBElement<GetProductResponse>(_GetProductResponse_QNAME, GetProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCategResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getAllCategResponse")
    public JAXBElement<GetAllCategResponse> createGetAllCategResponse(GetAllCategResponse value) {
        return new JAXBElement<GetAllCategResponse>(_GetAllCategResponse_QNAME, GetAllCategResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCateg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getAllCateg")
    public JAXBElement<GetAllCateg> createGetAllCateg(GetAllCateg value) {
        return new JAXBElement<GetAllCateg>(_GetAllCateg_QNAME, GetAllCateg.class, null, value);
    }

}
