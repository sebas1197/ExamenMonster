
package ec.edu.monster.controlador;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ec.edu.monster.controlador package. 
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

    private final static QName _ListarLocalidades_QNAME = new QName("http://controlador.monster.edu.ec/", "listarLocalidades");
    private final static QName _PartidosDisponibles_QNAME = new QName("http://controlador.monster.edu.ec/", "partidosDisponibles");
    private final static QName _ListarLocalidadesResponse_QNAME = new QName("http://controlador.monster.edu.ec/", "listarLocalidadesResponse");
    private final static QName _PartidosDisponiblesResponse_QNAME = new QName("http://controlador.monster.edu.ec/", "partidosDisponiblesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ec.edu.monster.controlador
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PartidosDisponibles }
     * 
     */
    public PartidosDisponibles createPartidosDisponibles() {
        return new PartidosDisponibles();
    }

    /**
     * Create an instance of {@link PartidosDisponiblesResponse }
     * 
     */
    public PartidosDisponiblesResponse createPartidosDisponiblesResponse() {
        return new PartidosDisponiblesResponse();
    }

    /**
     * Create an instance of {@link ListarLocalidadesResponse }
     * 
     */
    public ListarLocalidadesResponse createListarLocalidadesResponse() {
        return new ListarLocalidadesResponse();
    }

    /**
     * Create an instance of {@link ListarLocalidades }
     * 
     */
    public ListarLocalidades createListarLocalidades() {
        return new ListarLocalidades();
    }

    /**
     * Create an instance of {@link Localidad }
     * 
     */
    public Localidad createLocalidad() {
        return new Localidad();
    }

    /**
     * Create an instance of {@link PartidoFutbol }
     * 
     */
    public PartidoFutbol createPartidoFutbol() {
        return new PartidoFutbol();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarLocalidades }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controlador.monster.edu.ec/", name = "listarLocalidades")
    public JAXBElement<ListarLocalidades> createListarLocalidades(ListarLocalidades value) {
        return new JAXBElement<ListarLocalidades>(_ListarLocalidades_QNAME, ListarLocalidades.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartidosDisponibles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controlador.monster.edu.ec/", name = "partidosDisponibles")
    public JAXBElement<PartidosDisponibles> createPartidosDisponibles(PartidosDisponibles value) {
        return new JAXBElement<PartidosDisponibles>(_PartidosDisponibles_QNAME, PartidosDisponibles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarLocalidadesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controlador.monster.edu.ec/", name = "listarLocalidadesResponse")
    public JAXBElement<ListarLocalidadesResponse> createListarLocalidadesResponse(ListarLocalidadesResponse value) {
        return new JAXBElement<ListarLocalidadesResponse>(_ListarLocalidadesResponse_QNAME, ListarLocalidadesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartidosDisponiblesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controlador.monster.edu.ec/", name = "partidosDisponiblesResponse")
    public JAXBElement<PartidosDisponiblesResponse> createPartidosDisponiblesResponse(PartidosDisponiblesResponse value) {
        return new JAXBElement<PartidosDisponiblesResponse>(_PartidosDisponiblesResponse_QNAME, PartidosDisponiblesResponse.class, null, value);
    }

}
