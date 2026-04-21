
package it.univaq.disim.bpd.businesstravelclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per travelClass complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="travelClass">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="travelclasstype" type="{http://businesstravel.bpd.disim.univaq.it/}travelClassType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "travelClass", propOrder = {
    "travelclasstype"
})
public class TravelClass {

    @XmlSchemaType(name = "string")
    protected TravelClassType travelclasstype;

    /**
     * Recupera il valore della proprietà travelclasstype.
     * 
     * @return
     *     possible object is
     *     {@link TravelClassType }
     *     
     */
    public TravelClassType getTravelclasstype() {
        return travelclasstype;
    }

    /**
     * Imposta il valore della proprietà travelclasstype.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelClassType }
     *     
     */
    public void setTravelclasstype(TravelClassType value) {
        this.travelclasstype = value;
    }

}
