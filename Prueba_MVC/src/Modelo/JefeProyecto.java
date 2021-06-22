/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Sebastian
 */
public class JefeProyecto {
    private int Codigo;
    private String Nombre;
    private String Direccion;
    private String Telefono;

    public JefeProyecto(int Codigo, String Nombre, String Direccion, String Telefono) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
    }

    public JefeProyecto() {
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
   
   
}
