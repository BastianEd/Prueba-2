/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Cetecom
 */
public class Documental extends Contenidos implements Minions{
    //Atributos
    private boolean Educativo;
    private int minutos;
    
    //Constructor

    public Documental() {
    }

    public Documental(boolean Educativo, int minutos, String idContenido, String recomendado) {
        super(idContenido, recomendado);
        this.Educativo = Educativo;
        this.minutos = minutos;
    }


    //Getters and Setters

    public boolean isEducativo() {
        return Educativo;
    }

    public void setEducativo(boolean enfoqueEducativo) {
        this.Educativo = enfoqueEducativo;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
    
    //toString

    @Override
    public String toString() {
        return "Documental{" + "enfoqueEducativo=" + Educativo + ", minutos=" + minutos + '}';
    }
    
    //Metodos
    public double costoSuscripcion(){
        double costoMensual = COSTO_BASE_SUSCRIPCION;
        if(minutos >= 90){
            costoMensual = documentalProm * costoMensual;
        }
        return costoMensual;
    }
    
    
    
}
