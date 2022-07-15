/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.monster.modelo;

import java.util.Date;

/**
 *
 * @author SebastianLG
 */
public class PartidoFutbol {
    
    private int codigo;
    private String equipoLocal;
    private String equipoVisita;
    private String fecha;
    private String lugar;

    public PartidoFutbol() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public String getEquipoVisita() {
        return equipoVisita;
    }

    public void setEquipoVisita(String equipoVisita) {
        this.equipoVisita = equipoVisita;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

 
    
    
    
}
