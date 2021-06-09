/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DetalleFactura;
import Modelo.Factura;
import java.util.ArrayList;

/**
 *
 * @author Sebastian
 */
public interface FacturaInterface {
    ArrayList<DetalleFactura> carrito = new ArrayList();
    ArrayList<Factura> facturas= new ArrayList();
    
    public void crearProducto();
    public void obtenerProductos();
    public void ObtenerProducto(int codigo);
    public void actualizarProducto(Factura producto);
    public void eliminarProducto(int codigo);
    
}
