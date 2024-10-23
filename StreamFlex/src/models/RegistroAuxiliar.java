/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Cetecom
 */
public class RegistroAuxiliar{
    //Atributos
    private List<Usuario> listaUsuarios = new ArrayList<>();
    private List<Contenidos> listaContenido = new ArrayList<>();
    
    //Constructor
    public RegistroAuxiliar() {
    }
    
    
    
    
    //Getters and Setters

    //Metodos
        //Validacion de contenido
    public void validadContenido(Scanner scanner){
        
        System.out.println("Ingrese el ID para Validad si EXISTE dentro del Sistema");
        String newID = scanner.nextLine();
        for(Contenidos contenido: listaContenido){
            if(newID.equals(contenido.getIdContenido())){
                System.out.println("El contenido ya es Existente");
            }
            else{
                System.out.println("El ID esta Disponible");
            }
        }
    }
        //Listar el Contenido Streming
    public void listarUsuario(){
        System.out.println("Lista de Usuarios y su Consumo");
        for(Usuario usuario: listaUsuarios){
            System.out.println(usuario.toString());
        }
    }
        //Agregar Contenido
    public void agregarContenido(Scanner scanner){
        String idNuevoC= scanner.nextLine();
        System.out.println("¿Es Contenido Recomendable?");
        String nuevoRecomendado = scanner.nextLine();
        System.out.println("¿Que tipo de Contenido es?");
        System.out.println("1- Pelicula");
        System.out.println("2- Serie");
        System.out.println("3- Documental");
        int tipo = scanner.nextInt();
        if(tipo == 1){
            System.out.println("Ingrese Duración");
            int duracion = scanner.nextInt();
            System.out.println("Calificación");
            double calificacion = scanner.nextInt();
            Pelicula nuevaPelicula = new Pelicula(duracion,calificacion,idNuevoC,nuevoRecomendado);
            listaContenido.add(nuevaPelicula);
            System.out.println("AGREGADO");
        }
        if(tipo == 2){
            System.out.println("Ingrese el Numero de Temporadas");
            int temporadas = scanner.nextInt();
            System.out.println("¿Esta finalizado? true/false");
            boolean finalizado = scanner.nextBoolean();
            Serie nuevaSerie = new Serie(temporadas,finalizado,idNuevoC,nuevoRecomendado);
            listaContenido.add(nuevaSerie);
            System.out.println("AGREGADO");

        }
        if(tipo == 3){
            System.out.println("¿Es un Contenido Educativo? true/false");
            boolean educativo = scanner.nextBoolean();
            System.out.println("Ingrese Duración");
            int duracion = scanner.nextInt();
            Documental nuevoDocumental = new Documental(educativo, duracion, idNuevoC, nuevoRecomendado);
            listaContenido.add(nuevoDocumental);
            System.out.println("AGREGADO");

        }
            System.out.println("Volviendo al menu principal");
    }
        // Agregar Usuarios
    public void agregarUsuario(Scanner scanner){
        System.out.println("Ingrese ID del Usuario");
        String idUsuario = scanner.nextLine();
        System.out.println("Ingrese el Nombre de Usuario");
        String nombre = scanner.nextLine();
        System.out.println("Contenido que te gusta");
        String contenido = scanner.nextLine();
        Usuario nuevoUser = new Usuario(idUsuario,nombre,contenido);
        System.out.println("AGREGADO");
    }
        //Listado de Contenido
    public void listarContenido(){
        System.out.println("Lista de Contenido");
        for(Contenidos con: listaContenido){
            System.out.println(con.toString());
        }
    }
        //Mostrar Usuarios
        public void mostrarUsuario(){
        System.out.println("UsuariosRegistrados");
            for(Usuario usuario : listaUsuarios){
                System.out.println(usuario.toString());
            }
    }
    
}
