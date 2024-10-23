/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Cetecom
 */
public class Usuario implements Minions{
    private String idUsuario, nombre,contenidoConsumido;

    public Usuario() {
    }

    public Usuario(String idUsuario, String nombre, String contenidoConsumido) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.contenidoConsumido = contenidoConsumido;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContenidoConsumido() {
        return contenidoConsumido;
    }

    public void setContenidoConsumido(String contenidoConsumido) {
        this.contenidoConsumido = contenidoConsumido;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", nombre=" + nombre + ", contenidoConsumido=" + contenidoConsumido + '}';
    }
    
    //Metodos
    private double consumoMensual(){
        double mensual = COSTO_BASE_SUSCRIPCION;
        if(getContenidoConsumido().equals("Peliculas")){
            mensual = COSTO_BASE_SUSCRIPCION * peliculasProm;
        }
        if(getContenidoConsumido().equals("Series")){
            mensual = COSTO_BASE_SUSCRIPCION * seriesProm;
        }
        if(getContenidoConsumido().equals("Documentales")){
            mensual = COSTO_BASE_SUSCRIPCION * documentalProm;
        }
        return mensual;
    }
}
