/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DetalleFactura;

/**
 *
 * @author Sebastian
 */
public interface DetalleFacturaInterface {
    public void crearProducto(DetalleFactura codigo);
    public void obtenerProductos();
    public void ObtenerProducto(int codigo);
    public void actualizarProducto(DetalleFactura producto);
    public void eliminarProducto(int codigo);
    
}
