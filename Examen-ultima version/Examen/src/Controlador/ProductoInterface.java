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
public interface ProductoInterface {
    ArrayList<Producto> Productos = new ArrayList();
    
    public void crearProducto(Producto codigo);
    public void obtenerProductos();
    public void ObtenerProducto(int codigo);
    public void actualizarProducto(Producto producto);
    public void eliminarProducto(int codigo);
    
}
