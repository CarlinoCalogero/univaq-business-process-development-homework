
package it.univaq.disim.bpd.aaclient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per travelClassType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="travelClassType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ECONOMY"/>
 *     &lt;enumeration value="BUSINESS"/>
 *     &lt;enumeration value="FIRST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "travelClassType")
@XmlEnum
public enum TravelClassType {

    ECONOMY,
    BUSINESS,
    FIRST;

    public String value() {
        return name();
    }

    public static TravelClassType fromValue(String v) {
        return valueOf(v);
    }

}
