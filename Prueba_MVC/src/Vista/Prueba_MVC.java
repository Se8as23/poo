/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.FigurasControlador;
import Controlador.JefeProyectoControlador;
import Controlador.LineasControlador;
import Controlador.PlanosContorlador;
import Controlador.ProyectoControlador;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class Prueba_MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FigurasControlador jjj=new FigurasControlador();
    
        
        FigurasControlador Figuras=new  FigurasControlador();
        JefeProyectoControlador Jefe=new JefeProyectoControlador ();
        LineasControlador Lineas =new LineasControlador();
        PlanosContorlador Planos = new  PlanosContorlador();
        ProyectoControlador Proyecto= new  ProyectoControlador();
        
        int count = 1;
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        while (!salir) {
            String cedula1;
            System.out.println("");
            System.out.println("*******************************");
            System.out.println("");
            System.out.println("***MENU PRINCIPAL***");
            System.out.println("1.SUBMENU JEFE PROYECTO-----");
            System.out.println("2.SUBMENU PROYECTO-----");
            System.out.println("3.SUBMENU PLANOS");
            System.out.println("4.SUBMENU FIGURAS------");
            System.out.println("5.SUBMENU LINEAS-------");
            System.out.println("6.SALIR------***");
            
            
            opcion = sn.nextInt();
            switch (opcion) {

                case 1:
                    
                    Jefe.iniciar();
                    break;

                case 2:
                    Proyecto.iniciar();
                  
                    break;

                case 3:
                    Planos.iniciar();
                   
                    
                    break;
                case 4:
                    
                  Figuras.iniciar();
                    break;
                    
                    
                    
                    
                    
                case 5:
                    
                   Lineas.iniciar(); 
                   
                    break;                  
                    
                case 6:
                    System.out.println("Su opccion fue salir.");
                    salir = true;
                    break;
                    default:
                    System.out.println("Solo números entre 1 y 6");
            }
        }
    }
    
}
