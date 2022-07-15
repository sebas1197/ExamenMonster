/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.monster.modelo;

/**
 *
 * @author SebastianLG
 */
public class Localidad {
    
    private int id;
    private int partido;
    private String codigoLocalidad;
    private int disponibilidad;
    private float precio;

    public int getPartido() {
        return partido;
    }

    public void setPartido(int partido) {
        this.partido = partido;
    }

    public Localidad() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigoLocalidad() {
        return codigoLocalidad;
    }

    public void setCodigoLocalidad(String codigoLocalidad) {
        this.codigoLocalidad = codigoLocalidad;
    }

    public int getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(int disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
    
}
