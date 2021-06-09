
package Controlador;


import Modelo.Cliente;
import java.util.ArrayList;
import java.util.List;

public interface IProductoDao {
    ArrayList<Cliente> Clientes = new ArrayList();
    public void crearProducto(Cliente codigo);
    public void obtenerProductos();
    public void ObtenerProducto(String codigo);
    public void actualizarProducto(Cliente producto);
    public void eliminarProducto(String codigo);
  
}
