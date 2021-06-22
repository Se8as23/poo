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
public class Proyecto {
    private int Codigo;
    private String Nombre;
    private int jefe;

    public Proyecto() {
    }

    public Proyecto(int Codigo, String Nombre, int jefe) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.jefe = jefe;
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

    public int getJefe() {
        return jefe;
    }

    public void setJefe(int jefe) {
        this.jefe = jefe;
    }
    
    
    
    
}
