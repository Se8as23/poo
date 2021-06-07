/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente;
import Modelo.DetalleFactura;
import Modelo.Factura;
import Modelo.Producto;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class FacturaControlador implements FacturaInterface {

    String cedula1;
    Scanner rt = new Scanner(System.in);
    int count = 1;
    boolean sal = false;
    ArrayList<Cliente> Clientes = ClienteControlador.obtenerProductos2();
    ArrayList<Producto> Productos = ProductoControlador.obtenerProductos2();

    Scanner sn = new Scanner(System.in);
    Scanner snn = new Scanner(System.in);
    Scanner xd = new Scanner(System.in);
    Scanner xdd = new Scanner(System.in);
    Scanner snnx = new Scanner(System.in);
    Scanner pd = new Scanner(System.in);
    Scanner pdx = new Scanner(System.in);
    Scanner sd = new Scanner(System.in);
    boolean salir = false;
    int opcion;

    @Override
    public void crearProducto() {
        System.out.println("MENU FACTURACION");
        do {
            System.out.println("Ingrese la Cedula del cliente: ");
            cedula1 = rt.nextLine();

            for (Cliente clie : Clientes) {
                if (clie.getCedula().toString().equals(cedula1)) {
                    System.out.println("Cliente encontrado: " + clie.getNombre());
                    sal = true;
                }
            }
            if (sal == false) {
                System.out.println("Usuario no encontrado.");
            }

        } while (!sal);
        //Busqueda de usuario

        sal = false;
        double total = 0;
        boolean Salir1 = false;
        int opcion1;
        while (!Salir1) {

            System.out.println("");
            System.out.println("MANEJO DE PRODUCTOS");
            System.out.println("1.Ingreso del producto por el codigo");
            System.out.println("2.Eliminar producto del carrito con el codigo");
            System.out.println("3.Lista de productos añadidos al carrito");
            System.out.println("4.Visualizar, Guardar factura ");
            System.out.println("5.salir");

            opcion1 = sn.nextInt();
            switch (opcion1) {
                case 1:
                    System.out.println("Ingrese el codigo de un producto");
                    int codi = sd.nextInt();
                    for (Producto pro : Productos) {
                        if (pro.getCodigo() == codi) {
                            System.out.println("Producto encontrado: " + pro.getNombre());
                            System.out.println("Ingrese la cantida producto");
                            int cant = snnx.nextInt();
                            DetalleFactura prca = new DetalleFactura(codi, count, cant);
                            
                            carrito.add(prca);
                            System.out.println("Producto añadido con exito!!! ");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Eliminar producto");
                    System.out.println("Ingrese el codigo de un producto");
                    int cod = sn.nextInt();
                    DetalleFactura hh=null;
                    boolean encontrado=false;
                    for (DetalleFactura pro : carrito) {
                        if (pro.getCodigoProducto() == cod) {
                            
                            //carrito.remove(pro);
                            hh=pro;
                            encontrado=true;
                        }
                    }
                    
                    if(encontrado){
                        carrito.remove(hh);
                        System.out.println("Prodcto eliminado ");
                    }else{
                        System.out.println("No se pudo eliminar el producto");
                    }
                    encontrado=false;
                    break;
                case 3:

                    System.out.println("--------Lista de productos en el carrito--------");
                    System.out.print("Factura codigo: " + count);
                    for (DetalleFactura prdt : carrito) {
                        for (Producto pro : Productos) {
                            if ((pro.getCodigo() == prdt.getCodigoProducto()) && prdt.getCodigoCarrito() == count) {
                                System.out.println("");
                                System.out.print("|codigo: " + pro.getCodigo());
                                System.out.print("    |Nombre: " + pro.getNombre());
                                System.out.print("    |Descripcion: " + pro.getDescripcion());
                                System.out.print("    |Precio: " + pro.getPrecio());
                                System.out.print("    |Cantidad del procuto: " + prdt.getCantidadProducto());
                                double ivita = pro.getIva() / 100;
                                double iva2 = (pro.getPrecio() * prdt.getCantidadProducto()) * ivita;
                                double totalidad = (pro.getPrecio() * prdt.getCantidadProducto()) + iva2;

                                iva2 = Math.round(iva2 * 100) / 100d;

                                System.out.print("    |IVA: " + iva2);
                                totalidad = Math.round(totalidad * 100) / 100d;
                                System.out.print("    |Sub Total: " + totalidad);

                            }
                        }
                    }
                    System.out.println("");
                    System.out.println("");
                    break;

                case 4:
                    for (DetalleFactura prdt : carrito) {
                        for (Producto prod : Productos) {
                            if (prod.getCodigo() == prdt.getCodigoProducto() && prdt.getCodigoCarrito() == count) {
                                double ivita = prod.getIva() / 100;

                                double iva2 = (prod.getPrecio() * prdt.getCantidadProducto()) * ivita;
                                iva2 = Math.round(iva2 * 100) / 100d;
                                total = total + ((prod.getPrecio() * prdt.getCantidadProducto()) + iva2);
                                total = Math.round(total * 100) / 100d;
                            }
                        }
                    }
                    java.util.Date fecha = new Date();
                    
                    Factura factura = new Factura(total, fecha, count, cedula1);
                    
                    
                    
                    facturas.add(factura);
                    
                    
                    
                    
                    
                    
                    
                    
                    System.out.println("");
                    System.out.println("");
                    System.out.println("--------------------------------FACTURA---------------------------------");
                    System.out.println("");
                    System.out.println("Factura #: " + count);
                    System.out.println("Fecha: " + fecha);
                    System.out.println("Datos del cliente: ");
                    Cliente clien = null;
                    for (Cliente clie : Clientes) {
                        if (clie.getCedula().toString().equals(cedula1)) {
                            clien = clie;
                            sal = true;
                        }
                    }
                    //double total3 =0;                                   
                    System.out.println("Cedula: " + clien.getCedula());
                    System.out.println("Nombre: " + clien.getNombre());
                    System.out.println("Apellido: " + clien.getApellido());
                    System.out.println("Correo: " + clien.getCorreo());
                    System.out.println("");
                    System.out.println("DETALLE DE LA FACTURA");
                    System.out.println("__________________________________________________________________________");
                    for (DetalleFactura prdt : carrito) {
                        for (Producto pro : Productos) {
                            if (pro.getCodigo() == prdt.getCodigoProducto() && prdt.getCodigoCarrito() == count) {

                                System.out.println("");
                                System.out.print("|codigo: " + pro.getCodigo());
                                System.out.print("  |Nombre: " + pro.getNombre());
                                System.out.print("  |Descripcion: " + pro.getDescripcion());
                                System.out.print("  |Precio: " + pro.getPrecio());
                                System.out.print("  |Cantidad: " + prdt.getCantidadProducto());

                                double ivita3 = pro.getIva() / 100;
                                double iva23 = (pro.getPrecio() * prdt.getCantidadProducto()) * ivita3;
                                iva23 = Math.round(iva23 * 100) / 100d;
                                System.out.print("  |IVA: " + iva23);
                                double total3 = ((pro.getPrecio() * prdt.getCantidadProducto()) + iva23);

                                total3 = Math.round(total3 * 100) / 100d;

                                System.out.print("  |Subtotal: " + total3);

                            }
                        }
                    }
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("TOTAL: " + total);
                    System.out.println("");
                    System.out.println("---------------------------------------------------------------------");
                    System.out.println("");
                    count++;
                    break;

                case 5:
                    System.out.println("Su opccion fue salir.");
                    Salir1 = true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 6");

            }

        }
    }

    @Override
    public void obtenerProductos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ObtenerProducto(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizarProducto(Factura producto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarProducto(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
