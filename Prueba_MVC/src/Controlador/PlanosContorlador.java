/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.PlanosInterface;
import Modelo.Planos;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sebastian
 */
public class PlanosContorlador implements PlanosInterface{

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
            System.out.println("***SUBMENU PLANOS***");
            System.out.println("1.CREAR PLANOS-----");
            System.out.println("2.ACTUALIZAR  PLANOS-----");
            System.out.println("3.LISTAR  PLANOS");
            System.out.println("4.ELIMINAR  PLANOS");
            System.out.println("5.BUSCAR  PLANOS");
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
                    System.out.println("Ingrese el codigo del Plano a buscar: ");
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
        System.out.println("Ingrese el NumeroIdentificacion: ");
        int NumeroIdentificacion = snk.nextInt();
         Scanner snnk = new Scanner(System.in);
         System.out.println("Ingrese la fecha: ");
         String fecha = snnk.nextLine();
         System.out.println("Ingrese el numero de arquitectos: ");
         int numA = snnk.nextInt();
         System.out.println("Ingrese el numero de figuras: ");
         int numF = snnk.nextInt();
         
         
         SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy");
         Date fecha2 = null;
          try {
              fecha2 = formato.parse(fecha);
          } catch (ParseException ex) {
              Logger.getLogger(PlanosContorlador.class.getName()).log(Level.SEVERE, null, ex);
          }
         
        Planos proyecto=new Planos( NumeroIdentificacion, fecha2, numA ,numF);
       
        ListaPlanos.add( proyecto);
         
    }

    @Override
    public void Listar() {
        
        for (Planos j:ListaPlanos){
            System.out.println("  Numero Identificacion: "+j.getNumeroIdentificacion()+"  Fecha: "+j.getFecha()+" Numero Arquitectos: "+j.getNumeroArquitectos()+" Numero Figuras: "+j.getNumeroFiguras());
            
        }
    
    
    }

    @Override
    public void Actualizar() {
        
     Scanner snk = new Scanner(System.in);
      Scanner snki = new Scanner(System.in);
        System.out.println("Ingrese el codigo: ");
        int Codigo = snk.nextInt();
        
        Planos jef= Buscar(Codigo);
        if(jef!=null){
            
            
            Eliminar2(Codigo);
            
           System.out.println("Ingrese la fecha: ");
         String fecha = snki.nextLine();
         System.out.println("Ingrese el numero de arquitectos: ");
         int numA = snk.nextInt();
         System.out.println("Ingrese el numero de figuras: ");
         int numF = snk.nextInt();
         
         
         SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy");
         Date fecha2 = null;
          try {
              fecha2 = formato.parse(fecha);
          } catch (ParseException ex) {
              Logger.getLogger(PlanosContorlador.class.getName()).log(Level.SEVERE, null, ex);
          }
            Planos jefee=new Planos( Codigo, fecha2,numA,numF);
            try {
                ListaPlanos.add(jefee);
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
        System.out.println("Ingrese el codigo del Plano a eliminar: ");
        int Codigol = snkl.nextInt();
        try {
            ListaPlanos.remove(Buscar(Codigol));
            System.out.println("Exito al eliminar");
            
        } catch (Exception e) {
            System.out.println("Error al eliminar");
        }
        
    
    
    
    }
    
     public void Eliminar2(int Codigol) {
        
        ListaPlanos.remove(Buscar(Codigol));
    
    
    
    }
    
    
    
    public Planos Buscar(int id) {
        
     Planos fin=null;
    for (Planos j:ListaPlanos){
            if(j.getNumeroIdentificacion()==id){
                fin=j;
            }
    
    }
    
    return (fin);
    
    
    }
    
   public void Buscar2(int id) {
        
    Planos j=null;
    for (Planos jj:ListaPlanos){
            if(jj.getNumeroIdentificacion()==id){
               j=jj;
            }
    
    }
    
       System.out.println("Plano econtrado:");
       System.out.println("  Numero Identificacion: "+j.getNumeroIdentificacion()+"  Fecha: "+j.getFecha()+" Numero Arquitectos: "+j.getNumeroArquitectos()+" Numero Figuras: "+j.getNumeroFiguras());
            
            
        
    
    
    }
    
}
