
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour produit complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="produit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="designationProd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idCategorie" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idProd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "produit", propOrder = {
    "designationProd",
    "idCategorie",
    "idProd"
})
public class Produit {

    protected String designationProd;
    protected int idCategorie;
    protected int idProd;

    /**
     * Obtient la valeur de la propriété designationProd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignationProd() {
        return designationProd;
    }

    /**
     * Définit la valeur de la propriété designationProd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignationProd(String value) {
        this.designationProd = value;
    }

    /**
     * Obtient la valeur de la propriété idCategorie.
     * 
     */
    public int getIdCategorie() {
        return idCategorie;
    }

    /**
     * Définit la valeur de la propriété idCategorie.
     * 
     */
    public void setIdCategorie(int value) {
        this.idCategorie = value;
    }

    /**
     * Obtient la valeur de la propriété idProd.
     * 
     */
    public int getIdProd() {
        return idProd;
    }

    /**
     * Définit la valeur de la propriété idProd.
     * 
     */
    public void setIdProd(int value) {
        this.idProd = value;
    }

}
