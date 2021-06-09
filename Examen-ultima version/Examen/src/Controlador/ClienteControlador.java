/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import static Controlador.IProductoDao.Clientes;
import Modelo.Cliente;
import Modelo.Producto;
import java.util.ArrayList;


/**
 *
 * @author Sebastian
 */
public class ClienteControlador implements IProductoDao {
   
    
    
    
    @Override
    public void crearProducto(Cliente cliente) {
         
        Clientes.add(cliente);
    }

    @Override
    public void obtenerProductos() {
        System.out.println("Lista de Clientes");
                    for (Cliente mv : Clientes){
                        System.out.println("");
                        System.out.print("Cedula: " + mv.getCedula());
                        System.out.print(" Nombre: " + mv.getNombre());
                        System.out.print(" Apellido: " + mv.getApellido());
                        System.out.print(" Correo: " + mv.getCorreo());
                        System.out.print(" fiabilidad: " + mv.getFiabilidad());
                        System.out.println("");
                    }
        
    }
    
    public static ArrayList<Cliente>  obtenerProductos2() {
        
        return Clientes;
                    
        
    }
    
    
    

    @Override
    public void ObtenerProducto(String cedulabr) {
         boolean falsolin=false;
                    for (Cliente mv : Clientes) {
                        if(mv.getCedula().equals(cedulabr)){
                            System.out.println("Usuario encontrado");
                            System.out.println("");
                            System.out.print("Cedula: " + mv.getCedula());
                            System.out.print("Nombre: " + mv.getNombre());
                            System.out.print("Apellido :" + mv.getApellido());
                            System.out.print("Correo: " + mv.getCorreo());
                            System.out.print("fiabilidad: " + mv.getFiabilidad());
                            System.out.println("");
                            falsolin=true;
                            
                        }
                       
                    }
                    if(!falsolin){
                        System.out.println("Usuario no encontrado");
                    }
                    falsolin=false;
        
    }

    @Override
    public void actualizarProducto(Cliente producto) {
       
    }

    @Override
    public void eliminarProducto(String cedula) {
        int jo=0;
        boolean ff=false;
        Cliente cli=null;
        for(int i=0;i<=Clientes.size()-1;i++){
            System.out.println("ingreso :"+i);
            System.out.println("cedula :"+Clientes.get(i).getCedula());
            System.out.println("parametro cedula :"+cedula);
            
             if(Clientes.get(i).getCedula().equals(cedula)){
                           jo=i; 
                           System.out.println("jo: "+jo);
                           ff=true;
                           cli=Clientes.get(i);
             }
            
        }
         
        if(!ff){
           System.out.println("Usuario no encontrado"); 
            
        }else{
            Clientes.remove(jo);
            System.out.println("Usuario eliminado"); 
        }
        
        
        
        /*boolean falsolinnt=false;
                    Cliente clickk=null;
                    for (Cliente mvt : Clientes) {
                        if(mvt.getCedula().equals(cedula)){
                            System.out.println("");
                            clickk=mvt;
                            System.out.println("Cliente eliminado");
                            falsolinnt=true;
                        }
                    }
                    if(!falsolinnt){
                        System.out.println("Usuario no encontrado");
                    }else if(falsolinnt){
                        try {
                             Clientes.remove(clickk);
                             System.out.println("eliminado");
                        } catch (Exception e) {
                            System.out.println("No se pudo eliminar");
                        }
                      
                       
                    }*/
                    
        
    }

   
}
