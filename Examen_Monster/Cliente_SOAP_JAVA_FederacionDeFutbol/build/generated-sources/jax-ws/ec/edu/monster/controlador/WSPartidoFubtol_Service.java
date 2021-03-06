
package ec.edu.monster.controlador;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WS_PartidoFubtol", targetNamespace = "http://controlador.monster.edu.ec/", wsdlLocation = "http://localhost:8080/Servidor_SOAP_JAVA_FederacionDeFutbol/WS_PartidoFubtol?wsdl")
public class WSPartidoFubtol_Service
    extends Service
{

    private final static URL WSPARTIDOFUBTOL_WSDL_LOCATION;
    private final static WebServiceException WSPARTIDOFUBTOL_EXCEPTION;
    private final static QName WSPARTIDOFUBTOL_QNAME = new QName("http://controlador.monster.edu.ec/", "WS_PartidoFubtol");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Servidor_SOAP_JAVA_FederacionDeFutbol/WS_PartidoFubtol?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSPARTIDOFUBTOL_WSDL_LOCATION = url;
        WSPARTIDOFUBTOL_EXCEPTION = e;
    }

    public WSPartidoFubtol_Service() {
        super(__getWsdlLocation(), WSPARTIDOFUBTOL_QNAME);
    }

    public WSPartidoFubtol_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSPARTIDOFUBTOL_QNAME, features);
    }

    public WSPartidoFubtol_Service(URL wsdlLocation) {
        super(wsdlLocation, WSPARTIDOFUBTOL_QNAME);
    }

    public WSPartidoFubtol_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSPARTIDOFUBTOL_QNAME, features);
    }

    public WSPartidoFubtol_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSPartidoFubtol_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WSPartidoFubtol
     */
    @WebEndpoint(name = "WS_PartidoFubtolPort")
    public WSPartidoFubtol getWSPartidoFubtolPort() {
        return super.getPort(new QName("http://controlador.monster.edu.ec/", "WS_PartidoFubtolPort"), WSPartidoFubtol.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSPartidoFubtol
     */
    @WebEndpoint(name = "WS_PartidoFubtolPort")
    public WSPartidoFubtol getWSPartidoFubtolPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://controlador.monster.edu.ec/", "WS_PartidoFubtolPort"), WSPartidoFubtol.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSPARTIDOFUBTOL_EXCEPTION!= null) {
            throw WSPARTIDOFUBTOL_EXCEPTION;
        }
        return WSPARTIDOFUBTOL_WSDL_LOCATION;
    }

}
