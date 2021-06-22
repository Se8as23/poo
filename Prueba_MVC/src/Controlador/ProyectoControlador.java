/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import static DAO.JefeProyectoInterface.ListaJefes;
import DAO.ProyectoInterface;
import Modelo.JefeProyecto;
import Modelo.Proyecto;
import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class ProyectoControlador implements ProyectoInterface {

    public void iniciar(){
            
       
        int count = 1;
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        //Guardaremos la opcion del usuario
        while (!salir) {
            String cedula1;
            System.out.println("");
            System.out.println("--------------------------------");
            System.out.println("");
            System.out.println("***SUBMENU PROYECTO***");
            System.out.println("1.CREAR PROYECTO-----");
            System.out.println("2.ACTUALIZAR PROYECTO-----");
            System.out.println("3.LISTAR PROYECTO");
            System.out.println("4.ELIMINAR PROYECTO");
            System.out.println("5.BUSCAR PROYECTO");
            System.out.println("6.SALIR------***");
            
            
            int opcioni = sn.nextInt();
            switch (opcioni) {

                case 1:
                    Crear();
                    break;
                case 2:
                    Actualizar();
                    break;
                case 3:
                   Listar();
                    break;
                case 4:
                  Eliminar();
                    break;
                case 5:
                    
                    Scanner snkl = new Scanner(System.in);
                    System.out.println("Ingrese el codigo del proyecto a buscar: ");
                    int Codigol = snkl.nextInt();
                    
                    Buscar2(Codigol);
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
    
    

    @Override
    public void Crear() {
        
        Scanner snk = new Scanner(System.in);
        System.out.println("Ingrese el codigo: ");
        int Codigo = snk.nextInt();
         Scanner snnk = new Scanner(System.in);
         System.out.println("Ingrese el nombre: ");
         String Nombre = snnk.nextLine();
         System.out.println("Ingrese el id del Jefe de Proyecto: ");
         int idd = snnk.nextInt();
         
        Proyecto proyecto=new Proyecto( Codigo, Nombre, idd);
       
        ListaProyectos.add( proyecto);
         
    }

    @Override
    public void Listar() {
        
        for (Proyecto j:ListaProyectos){
            System.out.println("  Codigo: "+j.getCodigo()+"  Nombre: "+j.getNombre()+"  Jefe Proyecto: "+j.getJefe());
            
        }
    
    
    }

    @Override
    public void Actualizar() {
        
     Scanner snk = new Scanner(System.in);
        System.out.println("Ingrese el codigo: ");
        int Codigo = snk.nextInt();
        
        Proyecto jef= Buscar(Codigo);
        if(jef!=null){
            
            
            Eliminar2(Codigo);
            
            Scanner snnk = new Scanner(System.in);
            System.out.println("Ingrese el nombre: ");
            String Nombre = snnk.nextLine();
            System.out.println("Ingrese el direccion: ");
            String Direccion = snnk.nextLine();
            System.out.println("Ingrese el id del Jefe del Proyecto ");
            int jefe = snnk.nextInt();
            Proyecto jefee=new Proyecto( Codigo, Nombre,jefe );
            try {
                ListaProyectos.add(jefee);
                System.out.println("Regsitro actualizado con exito!!");
            } catch (Exception e) {
            }
            
            
        }else{
            System.out.println("No se encontro e registro!!");
        }
        
        
        
    
    
    
    }

    @Override
    public void Eliminar() {
        
        Scanner snkl = new Scanner(System.in);
        System.out.println("Ingrese el codigo del Jefe a eliminar: ");
        int Codigol = snkl.nextInt();
        try {
            ListaProyectos.remove(Buscar(Codigol));
            System.out.println("Exito al eliminar");
            
        } catch (Exception e) {
            System.out.println("Error al eliminar");
        }
        
    
    
    
    }
    
     public void Eliminar2(int Codigol) {
        
        ListaProyectos.remove(Buscar(Codigol));
    
    
    
    }
    
    
    
    public Proyecto Buscar(int id) {
        
     Proyecto fin=null;
    for (Proyecto j:ListaProyectos){
            if(j.getCodigo()==id){
                fin=j;
            }
    
    }
    
    return (fin);
    
    
    }
    
   public void Buscar2(int id) {
        
    Proyecto j=null;
    for (Proyecto jj:ListaProyectos){
            if(jj.getCodigo()==id){
               j=jj;
            }
    
    }
    
       System.out.println("Jefe de Proyecto contrado:");
       System.out.println("  Codigo: "+j.getCodigo()+"  Nombre: "+j.getNombre()+"  Jefe Proyecto: "+j.getJefe());
            
        
    
    
    }
}
