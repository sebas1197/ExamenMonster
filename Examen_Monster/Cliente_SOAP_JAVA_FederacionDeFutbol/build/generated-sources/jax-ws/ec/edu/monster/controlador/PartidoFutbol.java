
package ec.edu.monster.controlador;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para partidoFutbol complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="partidoFutbol">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="equipoLocal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="equipoVisita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lugar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "partidoFutbol", propOrder = {
    "codigo",
    "equipoLocal",
    "equipoVisita",
    "fecha",
    "lugar"
})
public class PartidoFutbol {

    protected int codigo;
    protected String equipoLocal;
    protected String equipoVisita;
    protected String fecha;
    protected String lugar;

    /**
     * Obtiene el valor de la propiedad codigo.
     * 
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     * 
     */
    public void setCodigo(int value) {
        this.codigo = value;
    }

    /**
     * Obtiene el valor de la propiedad equipoLocal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipoLocal() {
        return equipoLocal;
    }

    /**
     * Define el valor de la propiedad equipoLocal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipoLocal(String value) {
        this.equipoLocal = value;
    }

    /**
     * Obtiene el valor de la propiedad equipoVisita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipoVisita() {
        return equipoVisita;
    }

    /**
     * Define el valor de la propiedad equipoVisita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipoVisita(String value) {
        this.equipoVisita = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad lugar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLugar() {
        return lugar;
    }

    /**
     * Define el valor de la propiedad lugar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLugar(String value) {
        this.lugar = value;
    }

}
