/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.JefeProyectoInterface;
import Modelo.JefeProyecto;
import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class JefeProyectoControlador implements JefeProyectoInterface{
    
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
            System.out.println("***SUBMENU JEFE PROYECTO***");
            System.out.println("1.CREAR JEFE PROYECTO-----");
            System.out.println("2.ACTUALIZAR JEFE PROYECTO-----");
            System.out.println("3.LISTAR JEFE PROYECTO");
            System.out.println("4.ELIMINAR JEFE PROYECTO");
            System.out.println("5.BUSCAR JEFE PROYECTO");
            System.out.println("6.SALIR------***");
            
            
            int opcioni = sn.nextInt();
            switch (opcioni) {

                case 1:
                    System.out.println("SI INGRESO");
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
                    System.out.println("Ingrese el codigo del Jefe a buscar: ");
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
         System.out.println("Ingrese el direccion: ");
         String Direccion = snnk.nextLine();
         System.out.println("Ingrese el telefono: ");
         String Telefono = snnk.nextLine();
         
        JefeProyecto jefe=new JefeProyecto( Codigo, Nombre, Direccion, Telefono);
       
        ListaJefes.add(jefe);
        
        
        
        
    }

    @Override
    public void Listar() {
        
        for (JefeProyecto j:ListaJefes){
            System.out.println("  Codigo: "+j.getCodigo()+"  Nombre: "+j.getNombre()+"  Direccion: "+j.getDireccion()+"  Telefono: "+j.getTelefono());
            
        }
    
    
    }

    @Override
    public void Actualizar() {
        
     Scanner snk = new Scanner(System.in);
        System.out.println("Ingrese el codigo: ");
        int Codigo = snk.nextInt();
        
        JefeProyecto jef= Buscar(Codigo);
        if(jef!=null){
            
            
            Eliminar2(Codigo);
            
            Scanner snnk = new Scanner(System.in);
            System.out.println("Ingrese el nombre: ");
            String Nombre = snnk.nextLine();
            System.out.println("Ingrese el direccion: ");
            String Direccion = snnk.nextLine();
            System.out.println("Ingrese el telefono: ");
            String Telefono = snnk.nextLine();
            JefeProyecto jefe=new JefeProyecto( Codigo, Nombre, Direccion, Telefono);
            try {
                ListaJefes.add(jefe);
                System.out.println("Registro actualizado con exito!!");
            } catch (Exception e) {
            }
            
            
        }else{
            System.out.println("No se encontro e registro!!");
        }
        
        
        
    
    
    
    }

    @Override
    public void Eliminar() {
        
        Scanner snkl = new Scanner(System.in);
        System.out.println("Ingrese el codigo del Proyecto a eliminar: ");
        int Codigol = snkl.nextInt();
        try {
            ListaJefes.remove(Buscar(Codigol));
            System.out.println("Exito al eliminar");
            
        } catch (Exception e) {
            System.out.println("Error al eliminar");
        }
        
    
    
    
    }
    
     public void Eliminar2(int Codigol) {
        
        ListaJefes.remove(Buscar(Codigol));
    
    
    
    }
    
    
    
    public JefeProyecto Buscar(int id) {
        
    JefeProyecto fin=null;
    for (JefeProyecto j:ListaJefes){
            if(j.getCodigo()==id){
                fin=j;
            }
    
    }
    
    return (fin);
    
    
    }
    
   public void Buscar2(int id) {
        
    JefeProyecto j=null;
    for (JefeProyecto jj:ListaJefes){
            if(jj.getCodigo()==id){
               j=jj;
            }
    
    }
    
       System.out.println("Proyecto de Proyecto contrado:");
       System.out.println("  Codigo: "+j.getCodigo()+"  Nombre: "+j.getNombre()+"  Direccion: "+j.getDireccion()+"  Telefono: "+j.getTelefono());
            
        
    
    
    }
}
