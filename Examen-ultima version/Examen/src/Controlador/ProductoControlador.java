/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Producto;
import java.util.ArrayList;

/**
 *
 * @author Sebastian
 */


public class ProductoControlador implements ProductoInterface{
    
    
 
    @Override
    public void crearProducto(Producto pr) {
        
        Productos.add(pr);
        System.out.println("ingreso correcto! :"+pr.getNombre()+" lista:"+Productos.get(0).getNombre());
    }

    @Override
    public void obtenerProductos() {
        
        for (Producto dc : Productos) {
                        System.out.println("");
                        System.out.print("Codigo: " + dc.getCodigo() );
                        System.out.print(" Nombre: " + dc.getNombre() );
                        System.out.print(" Descripcion: " + dc.getDescripcion());
                        System.out.print(" Precio: " + dc.getPrecio());  
                        System.out.print(" Stok: " + dc.getStok());  
                        System.out.print(" IVA: " + dc.getIva());  
                        System.out.println("");
        }
    }
    
public static ArrayList<Producto> obtenerProductos2() {
       return Productos;
}
    
    
    

    @Override
    public void ObtenerProducto(int codigo) {
        boolean falsolin=false;
                    for (Producto mv : Productos) {
                        
                        if(mv.getCodigo()==codigo){
                            System.out.println("Producto encontrado");
                            System.out.println("");
                            
                            System.out.print("ID: " + mv.getCodigo());
                            System.out.print("Nombre: " + mv.getNombre());
                            System.out.print("Descripcion :" + mv.getDescripcion());
                            System.out.print("Precio: " + mv.getPrecio());
                            System.out.print("Stock: " + mv.getStok());
                             System.out.print("IVA: " + mv.getIva());
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
    public void actualizarProducto(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarProducto(int codigo) {
        int jo=0;
        boolean ff=false;
        Producto cli=null;
        for(int i=0;i<=Productos.size()-1;i++){
            System.out.println("ingreso :"+i);
            System.out.println("id :"+Productos.get(i).getCodigo());
            System.out.println("parametro id :"+codigo);
            
             if(Productos.get(i).getCodigo()==(codigo)){
                           jo=i; 
                           System.out.println("jo: "+jo);
                           ff=true;
                           cli=Productos.get(i);
             }
            
        }
         
        if(!ff){
           System.out.println("Prodcuto no encontrado"); 
            
        }else{
            Productos.remove(jo);
            System.out.println("Producto eliminado"); 
        }
    }
    
}
