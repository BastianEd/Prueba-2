/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package streamflex;

import java.util.Scanner;

//Importar Packages de models
import models.Contenidos;
import models.Documental;
import models.Pelicula;
import models.RegistroAuxiliar;
import models.Serie;
import models.Usuario;
import models.Minions;



/**
 *
 * @author Cetecom
 */
public class StreamFlex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RegistroAuxiliar registro = new RegistroAuxiliar();

        int op = 3;
        while(op !=6){
            System.out.println("=====MENU=====");
            System.out.println("[1] Agregar contenido");
            System.out.println("[2] Valida Contenido");
            System.out.println("[3] Listar Contenido");
            System.out.println("[4] Agregar Usuario");
            System.out.println("[5] Mostrar Usuario");
            System.out.println("[6] Salir");
            System.out.println("===SELECCIONES UNA DE LAS OPCIONES===");
            Scanner scanner = new Scanner(System.in);
            
            if (scanner.hasNextInt()) { // Comprobar si la entrada es un entero
                op = scanner.nextInt();
                switch (op) {
                    case 1:
                        registro.agregarContenido(scanner);
                        break;
                    case 2:
                        registro.validadContenido(scanner);
                        break;
                    case 3:
                        registro.listarContenido();
                        break;
                    case 4:
                        registro.agregarUsuario(scanner);
                        break;
                    case 5:
                        registro.listarUsuario();
                        break;
                    case 6:
                        System.out.println("Saliendo del sistema!!");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                }
            } else {
                System.out.println("Entrada no válida. Por favor, ingrese un número.");
                scanner.next(); // Limpiar el buffer
            }
        }

        }
    }

