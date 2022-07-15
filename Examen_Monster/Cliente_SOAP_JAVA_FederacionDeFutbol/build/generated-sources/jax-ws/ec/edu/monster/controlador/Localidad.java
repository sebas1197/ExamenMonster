
package ec.edu.monster.controlador;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para localidad complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="localidad">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoLocalidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="disponibilidad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="partido" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "localidad", propOrder = {
    "codigoLocalidad",
    "disponibilidad",
    "id",
    "partido",
    "precio"
})
public class Localidad {

    protected String codigoLocalidad;
    protected int disponibilidad;
    protected int id;
    protected int partido;
    protected float precio;

    /**
     * Obtiene el valor de la propiedad codigoLocalidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoLocalidad() {
        return codigoLocalidad;
    }

    /**
     * Define el valor de la propiedad codigoLocalidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoLocalidad(String value) {
        this.codigoLocalidad = value;
    }

    /**
     * Obtiene el valor de la propiedad disponibilidad.
     * 
     */
    public int getDisponibilidad() {
        return disponibilidad;
    }

    /**
     * Define el valor de la propiedad disponibilidad.
     * 
     */
    public void setDisponibilidad(int value) {
        this.disponibilidad = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad partido.
     * 
     */
    public int getPartido() {
        return partido;
    }

    /**
     * Define el valor de la propiedad partido.
     * 
     */
    public void setPartido(int value) {
        this.partido = value;
    }

    /**
     * Obtiene el valor de la propiedad precio.
     * 
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * Define el valor de la propiedad precio.
     * 
     */
    public void setPrecio(float value) {
        this.precio = value;
    }

}
