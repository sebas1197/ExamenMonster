/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.monster.service;

/**
 *
 * @author SebastianLG
 */
public class PartidoFutbolService {

    public java.util.List<ec.edu.monster.controlador.PartidoFutbol> partidosDisponibles() {
        ec.edu.monster.controlador.WSPartidoFubtol_Service service = new ec.edu.monster.controlador.WSPartidoFubtol_Service();
        ec.edu.monster.controlador.WSPartidoFubtol port = service.getWSPartidoFubtolPort();
        return port.partidosDisponibles();
    }

    public java.util.List<ec.edu.monster.controlador.Localidad> listarLocalidades(int codigoPartido) {
        ec.edu.monster.controlador.WSPartidoFubtol_Service service = new ec.edu.monster.controlador.WSPartidoFubtol_Service();
        ec.edu.monster.controlador.WSPartidoFubtol port = service.getWSPartidoFubtolPort();
        return port.listarLocalidades(codigoPartido);
    }
    
    
}
