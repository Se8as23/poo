/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.FigurasInterface;
import static DAO.ProyectoInterface.ListaProyectos;
import Modelo.Figuras;
import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class FigurasControlador implements  FigurasInterface{

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
            System.out.println("***SUBMENU FIGURAS***");
            System.out.println("1.CREAR FIGURAS-----");
            System.out.println("2.ACTUALIZAR FIGURAS-----");
            System.out.println("3.LISTAR FIGURAS");
            System.out.println("4.ELIMINAR FIGURAS");
            System.out.println("5.BUSCAR FIGURAS");
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
                    System.out.println("Ingrese el codigo del Figuras a buscar: ");
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
        System.out.println("Ingrese el Identificador: ");
        int Codigo = snk.nextInt();
        Scanner snnk = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        String Nombre = snnk.nextLine();
        System.out.println("Ingrese el numero de lineas: ");
        int idd = snnk.nextInt();
        System.out.println("Ingrese el id del plano: ");
        int iddf = snnk.nextInt();
         
        Figuras proyecto=new Figuras( Codigo, Nombre, idd,iddf);
       
        ListaFiguras.add( proyecto);
         
    }

    @Override
    public void Listar() {
        
        for (Figuras j:ListaFiguras){
            System.out.println("  Codigo: "+j.getIdentificador()+"  Nombre: "+j.getNombre()+"  Area "+j.getArea()+"  Perimetro "+j.getPerimetro()+"  Numero de lineas: "+j.getNumeroLineas()+"  ID Plano: "+j.getIDPlano());
            
        }
    
    
    }

    @Override
    public void Actualizar() {
        
     Scanner snkp = new Scanner(System.in);
      Scanner s = new Scanner(System.in);
      Scanner sy = new Scanner(System.in);
        System.out.println("Ingrese el Identificador: ");
        int Codigo = snkp.nextInt();
        
        Figuras jef= Buscar(Codigo);
        if(jef!=null){
            
            double area=jef.getArea();
            double perimetro=jef.getPerimetro();
            Eliminar2(Codigo);
            
            System.out.println("Ingrese el nombre: ");
                String Nombre = sy.nextLine();
                System.out.println("Ingrese el numero de lineas: ");
                int idd = s.nextInt();
                System.out.println("Ingrese el id del plano: ");
                int iddf = s.nextInt();
                Figuras proyecto=new Figuras( Codigo, Nombre,area,perimetro, idd,iddf);
            try {
                ListaFiguras.add(proyecto);
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
        System.out.println("Ingrese el identificador de la figura: ");
        int Codigol = snkl.nextInt();
        try {
            ListaFiguras.remove(Buscar(Codigol));
            System.out.println("Exito al eliminar");
            
        } catch (Exception e) {
            System.out.println("Error al eliminar");
        }
        
    
    
    
    }
    
     public void Eliminar2(int Codigol) {
        
        ListaFiguras.remove(Buscar(Codigol));
    
    
    
    }
    
    
    
    public Figuras Buscar(int id) {
        
     Figuras fin=null;
    for (Figuras j:ListaFiguras){
            if(j.getIdentificador()==id){
                fin=j;
            }
    
    }
    
    return (fin);
    
    
    }
    
   public void Buscar2(int id) {
        
    Figuras j=null;
    for (Figuras jj:ListaFiguras){
            if(jj.getIdentificador()==id){
               j=jj;
            }
    
    }
    
       System.out.println("Figura contrada:");
       System.out.println("  Codigo: "+j.getIdentificador()+"  Nombre: "+j.getNombre()+"  Area "+j.getArea()+"  Perimetro "+j.getPerimetro()+"  Numero de lineas: "+j.getNumeroLineas()+"  ID Plano: "+j.getIDPlano());
              
    
    
    }
   
   
   public void ActualizarMedidas(double perimetro,double area,Figuras figu) {
       Figuras jj=figu;
       jj.setPerimetro(perimetro);
            jj.setArea(area);
       ListaFiguras.remove(figu);
        ListaFiguras.add(jj);
       
       
   }
   
   
}
