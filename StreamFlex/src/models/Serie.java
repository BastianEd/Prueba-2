/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Cetecom
 */
public class Serie extends Contenidos implements Minions{
    //Atributos
    private int numeroTemporadas;
    private boolean finalizado;
    
    //Constructor

    public Serie() {
    }

    public Serie(int numeroTemporadas, boolean finalizado, String idContenido, String recomendado) {
        super(idContenido, recomendado);
        this.numeroTemporadas = numeroTemporadas;
        this.finalizado = finalizado;
    }


    
    //Getters and Setters

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }
    
    //toString

    @Override
    public String toString() {
        return "Serie{" + "numeroTemporadas=" + numeroTemporadas + ", finalizado=" + finalizado + '}';
    }
    
    //Metodos
    public double costoSuscripcion(){
        double costoMensual = COSTO_BASE_SUSCRIPCION;
        if(numeroTemporadas >= 3){
            costoMensual = seriesProm * costoMensual;
        }
        return costoMensual;
    }
}
