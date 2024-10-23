/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Cetecom
 */
public class Pelicula extends Contenidos implements Minions{
    //Atributos
    private int duracion;
    private double calificacion;
    
    //Constructor

    public Pelicula() {
    }

    public Pelicula(int duracion, double calificacion, String idContenido, String recomendado) {
        super(idContenido, recomendado);
        this.duracion = duracion;
        this.calificacion = calificacion;
    }



    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getCalificacion() {
        return calificacion;
    }

    //Getters and Setters
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    //toString
    @Override
    public String toString() {
        return "Pelicula{" + "duracion=" + duracion + ", calificacion=" + calificacion + '}';
    }
    
    //Metodos
    public double costoSuscripcion(){
        double costoMensual = COSTO_BASE_SUSCRIPCION;
        if(getCalificacion() >= 4.5){
            costoMensual = peliculasProm * costoMensual;
        }
        return costoMensual;
    }
    
    
}
