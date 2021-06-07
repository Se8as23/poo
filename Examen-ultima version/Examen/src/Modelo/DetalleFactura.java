package Modelo;

public class DetalleFactura {

    private int codigoProducto;
    private int codigoCarrito;
    private int cantidadProducto;

    //contructor
    public DetalleFactura() {
    }

    public DetalleFactura(int codigoProducto, int codigoCarrito, int cantidadProducto) {
        this.codigoProducto = codigoProducto;
        this.codigoCarrito = codigoCarrito;
        this.cantidadProducto = cantidadProducto;
    }

    //getters and setters
    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public int getCodigoCarrito() {
        return codigoCarrito;
    }

    public void setCodigoCarrito(int codigoCarrito) {
        this.codigoCarrito = codigoCarrito;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

}
