/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.monster.controlador;

import ec.edu.monster.modelo.Localidad;
import ec.edu.monster.modelo.PartidoFutbol;
import ec.edu.monster.service.PartidoFutbolService;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author SebastianLG
 */
@WebService(serviceName = "WS_PartidoFubtol")
public class WS_PartidoFubtol {

    private PartidoFutbolService service = new PartidoFutbolService();
    
    @WebMethod(operationName = "partidosDisponibles")
    public List<PartidoFutbol> partidosDisponibles() {
        return this.service.partidosDisponibles();
    }
    
    @WebMethod(operationName = "listarLocalidades")
    public List<Localidad> listarLocalidades(@WebParam(name = "codigoPartido") int codigoPartido){
        return this.service.listarLocalidades(codigoPartido);
    }
    
}
