package Modelo;

import java.util.Date;

public class Factura {
   private double total;
   private Date fecha;
   private int codigo;
   private String Cedula;

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public Factura(double total, Date fecha, int codigo, String Cedula) {
        this.total = total;
        this.fecha = fecha;
        this.codigo = codigo;
        this.Cedula = Cedula;
    }

  
    
    
}
