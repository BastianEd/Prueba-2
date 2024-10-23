/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Cetecom
 */
public abstract class Contenidos implements Minions{
    //Atributos
    private String idContenido;
    private String recomendado;// la pasaste a string?
    
    //Constructor

    public Contenidos() {
    }

    public Contenidos(String idContenido, String recomendado) {
        this.idContenido = idContenido;
        this.recomendado = recomendado;
    }
    
    //Getters and Setters

    public String getIdContenido() {
        return idContenido;
    }

    public void setIdContenido(String idContenido) {
        this.idContenido = idContenido;
    }

    public String isRecomendado() {
        return recomendado;
    }

    public void setRecomendado(String recomendado) {
        this.recomendado = recomendado;
    }
    
    //toString
    @Override
    public String toString() {
        return "Contenidos{" + "idContenido=" + idContenido + ", recomendado=" + recomendado + '}';
    }
    
    //Metodos
        //Costo de Suscripcion
    public abstract double costoSuscripcion();

    
    
}
