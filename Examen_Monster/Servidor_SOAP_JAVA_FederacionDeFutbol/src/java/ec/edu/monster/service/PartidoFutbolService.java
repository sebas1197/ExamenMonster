/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.monster.service;

import ec.edu.monster.db.AccesoDB;
import ec.edu.monster.modelo.Localidad;
import ec.edu.monster.modelo.PartidoFutbol;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SebastianLG
 */
public class PartidoFutbolService {
    
    public List<PartidoFutbol> partidosDisponibles(){
        
        Connection cn = null;
        List<PartidoFutbol> listaPartidoFutbol = new ArrayList<PartidoFutbol>();

        try {
            cn = AccesoDB.getConecction();
            cn.setAutoCommit(false);

            String sql = "SELECT * FROM partido_futbol WHERE FECHA >= '2022-07-15';";

            PreparedStatement pstm = cn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();

            while(rs.next()){
                PartidoFutbol partidoFutbol = new PartidoFutbol();
                partidoFutbol.setCodigo(rs.getInt(1));
                partidoFutbol.setEquipoLocal(rs.getString(2));
                partidoFutbol.setEquipoVisita(rs.getString(3));
                partidoFutbol.setFecha(rs.getString(4));
                partidoFutbol.setLugar(rs.getString(5));
                
                listaPartidoFutbol.add(partidoFutbol);
            }
            rs.close();
            return listaPartidoFutbol;
            
        } catch (SQLException e) {
            try {
                cn.rollback();
                return null;
            } catch (Exception e1) {
            }
            throw new RuntimeException(e.getMessage());
        } finally {
            try {
                cn.close();
            } catch (Exception e) {
            }
        }

        
    }
    
    public List<Localidad> listarLocalidades(int codigoPartido){
        
        Connection cn = null;
        List<Localidad> listalocalidades = new ArrayList<Localidad>();

        try {
            cn = AccesoDB.getConecction();
            cn.setAutoCommit(false);

            String sql = "SELECT * FROM localidad_partido JOIN partido_futbol on localidad_partido.partido =" + codigoPartido +" AND DISPONIBILIDAD > 0";

            PreparedStatement pstm = cn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();

            while(rs.next()){
                Localidad localidad = new Localidad();
                localidad.setId(rs.getInt(1));
                localidad.setPartido(rs.getInt(2));
                localidad.setCodigoLocalidad(rs.getString(3));
                localidad.setDisponibilidad(rs.getInt(4));
                localidad.setPrecio(rs.getFloat(5));
                
                listalocalidades.add(localidad);
            }
            rs.close();
            return listalocalidades;
            
        } catch (SQLException e) {
            try {
                cn.rollback();
                return null;
            } catch (Exception e1) {
            }
            throw new RuntimeException(e.getMessage());
        } finally {
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
   
    }
    
}
