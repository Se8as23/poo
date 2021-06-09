/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ClienteControlador;
import Controlador.FacturaControlador;
import Controlador.ProductoControlador;
import Modelo.Factura;
import Modelo.Cliente;
import Modelo.Producto;
import Modelo.DetalleFactura;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class SebastianPrograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int count = 1;
         boolean sal=false;
        ArrayList<Cliente> Clientes = new ArrayList();
        ArrayList<Producto> Productos = new ArrayList();
        ArrayList<DetalleFactura> carrito = new ArrayList();
        ArrayList<Factura> facturas= new ArrayList();
        Scanner sn = new Scanner(System.in);
        Scanner snn = new Scanner(System.in);
        Scanner xd = new Scanner(System.in);
        Scanner xdd = new Scanner(System.in);
        Scanner snnx = new Scanner(System.in);
        Scanner pd = new Scanner(System.in);
        Scanner pdx = new Scanner(System.in);
        Scanner rt = new Scanner(System.in);
        Scanner sd = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        while (!salir) {
            String cedula1;
            System.out.println("");
            System.out.println("--------------------------------");
            System.out.println("");
            System.out.println("***MENU PRINCIPAL***");
            System.out.println("1.Ingreso del cliente");
            System.out.println("2.Ingreso productos");
            System.out.println("3.Crear factura");
            System.out.println("4.Listar todos los productos");
            System.out.println("5.Listar todos los clientes");
            System.out.println("6.Buscar cliente por su cedula");
            System.out.println("7.Eliminar cliente por su cedula");
            System.out.println("8.Buscar Factura por el ID");
            System.out.println("9.Eliminar factura por el ID");
            System.out.println("10.Buscar producto por ID");
            System.out.println("11.Eliminar producto por ID");
            
            
            
            System.out.println("10.Salir");

            opcion = sn.nextInt();
            switch (opcion) {

                case 1:

                    System.out.println("INGRESE DATOS DEL CLIENTE");
                    System.out.println("Ingrese su cedula: ");
                    String cedula = pd.nextLine();
                    System.out.println("Ingrese su nombre : ");
                    String nombre = pd.nextLine();
                    System.out.println("Ingrese su apellido: ");
                    String apellido = rt.nextLine();
                    System.out.println("Ingrese su correo: ");
                    String correo = rt.nextLine();
                    System.out.println("Ingrese su fiablidad: ");
                    int fiabilidad = pdx.nextInt();
                    
                    Cliente cl = new Cliente(cedula, nombre, apellido, correo, fiabilidad);
                    
                    
                    
                    ClienteControlador clicontrolador=new ClienteControlador();
                    
                    clicontrolador.crearProducto(cl);
                    
                    
                    
                    Clientes.add(cl);
                    break;

                case 2:
                    System.out.println("INGRESE DATOS DEL PRODUCTO");
                    System.out.println("Ingrese su codigo: ");
                    int codigo = snn.nextInt();

                    System.out.println("Ingrese nombre del producto: ");
                    String nombre1 = rt.nextLine();
                    System.out.println("Ingrese su descripcion: ");
                    String descripcion = pd.nextLine();
                    System.out.println("Ingrese su precio: ");
                    double precio = snn.nextDouble();
                    
                    System.out.println("Ingrese el stok: ");
                    double stok = xd.nextDouble();
                    
                    System.out.println("Ingrese el IVA: ");
                    double IVA = xdd.nextDouble();
                    
                    
                    Producto pr = new Producto(nombre1, codigo, descripcion, precio,stok,IVA);
                    ProductoControlador proControlador=new ProductoControlador();
                    
                    
                    proControlador.crearProducto(pr);
                    
                    Productos.add(pr);
                    break;

                case 3:
                    
                    FacturaControlador fc=new FacturaControlador();
                    fc.crearProducto();
                    
                    
                    
                    break;
                case 4:
                    
                    
                    
                    System.out.println("Lista de productos");
                    ProductoControlador prof=new ProductoControlador();
                    prof.obtenerProductos();
                    break;
                    
                    
                    
                    
                    
                case 5:
                    ClienteControlador oo= new ClienteControlador();
                    oo.obtenerProductos();
                    break;
                    
                    
                 case 6:
                    System.out.println("Buscar cliente por cedula");
                    Scanner err = new Scanner(System.in);
                    System.out.println("Ingrese su cedula: ");
                    String cedulabr = err.nextLine();
                   
                    ClienteControlador jjj=new ClienteControlador();
                    jjj.ObtenerProducto(cedulabr);
                   
                    break;
                    
                    
                 case 7:
                   System.out.println("Eliminar cliente por cedula");
                    Scanner errr = new Scanner(System.in);
                    System.out.println("Ingrese su cedula: ");
                    String cedulabrr = errr.nextLine();
                    
                    ClienteControlador ki= new ClienteControlador();
                    ki.eliminarProducto(cedulabrr);
                    break;    
                    
                    
                    
                 case 8:
                     boolean falsolin;
                    System.out.println("Buscar factura por ID");
                    Scanner errnyu = new Scanner(System.in);
                    System.out.println("Ingrese el ID: ");
                    int cedulabrnyu = errnyu.nextInt();
                    boolean falsolinnnyu=false;
                    double totali=0;
                    for (Factura mv : facturas) {
                        if(mv.getCodigo()==(cedulabrnyu)){
                            System.out.println("Factura #"+mv.getCodigo());
                            System.out.println("Fecha: "+mv.getFecha());
                            System.out.println("Cedula: "+mv.getCedula());
                            totali=mv.getTotal();
                            falsolinnnyu=true;
                        }
                    }
                    if(falsolinnnyu){
                        for (DetalleFactura mv : carrito) {
                        if(mv.getCodigoCarrito()==(cedulabrnyu)){
                                            
                                            
                                            System.out.println("" );
                                            System.out.print("|codigo: " + mv.getCodigoProducto() );
                                            Producto mm=null;
                                            for(Producto pf:Productos){
                                                if(mv.getCodigoProducto()==pf.getCodigo()){
                                                    mm=pf;
                                                        System.out.print("    |Nombre: " + mm.getNombre());
                                                        System.out.print("    |Descripcion: " + mm.getDescripcion());
                                                        System.out.print("    |Precio: " + mm.getPrecio());
                                                        System.out.print("    |Cantidad del procuto: " + mv.getCantidadProducto());
                                                        double ivita=mm.getIva()/100;
                                                        double iva2=(mm.getPrecio() * mv.getCantidadProducto())*ivita;
                                                        double totalidad=(mm.getPrecio() * mv.getCantidadProducto())+iva2;

                                                         iva2=Math.round(iva2 * 100) / 100d;

                                                        System.out.print("    |IVA: " + iva2);
                                                         totalidad=Math.round(totalidad * 100) / 100d;
                                                        System.out.print("    |Sub Total: " + totalidad);
                                                       
                                                }
                                                
                                            }
                                            
                                                
                        }
                       
                    }
                         
                         
                         System.out.println("");
                         System.out.println("Total: "+ totali);
                        
                    }else{
                        System.out.println("Factura no encontrada");
                    }
                    falsolin=false;
                    break;
                    
                 case 9:
                   
                    System.out.println("Eliminar factura por ID");
                    Scanner errny = new Scanner(System.in);
                    System.out.println("Ingrese el ID: ");
                    int cedulabrny = errny.nextInt();
                    boolean falsolinnny=false;
                    Factura excel=null;
                    for (Factura mv : facturas) {
                        if(mv.getCodigo()==(cedulabrny)){
                            excel=mv;
                            falsolinnny=true;
                        }
                    }
                    if(falsolinnny){
                        facturas.remove(excel);
                        ArrayList<DetalleFactura> delta = new ArrayList();
                        for (DetalleFactura mvi : carrito) {
                            if(mvi.getCodigoCarrito()==(cedulabrny)){
                            delta.add(mvi);
                            
                        }
                        for(DetalleFactura cura : delta){
                            carrito.remove(cura);
                        }
                       
                    }
                         
                    System.out.println("Factura eliminada con exito");
                    }else{
                        System.out.println("Factura no encontrada");
                    }
                    falsolin=false;
                    break;
                    
                  case 10:
                    System.out.println("Buscar producto por ID");
                    Scanner errO = new Scanner(System.in);
                    System.out.println("Ingrese el ID: ");
                    int proid = errO.nextInt();
                   
                    ProductoControlador jjjk=new ProductoControlador();
                    jjjk.ObtenerProducto(proid);
                   
                    break;
                 case 11:
                    System.out.println("Eliminar producto por ID");
                    Scanner errOp = new Scanner(System.in);
                    System.out.println("Ingrese el ID del producto: ");
                    int proidd = errOp.nextInt();
                   
                    ProductoControlador jjjkk=new ProductoControlador();
                    jjjkk.eliminarProducto(proidd);
                   
                    
                    break;    
                    
                case 12:
                    System.out.println("Su opccion fue salir.");
                    salir = true;
                    break;
                    default:
                    System.out.println("Solo números entre 1 y 12");
            }
        }
    }
    
    
}
