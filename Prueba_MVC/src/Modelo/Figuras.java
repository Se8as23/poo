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
public class Figuras {
    private int Identificador;
    private String Nombre;
    private double Area;
    private double Perimetro;
    private int NumeroLineas;
    private int IDPlano;

    public Figuras() {
    }

    public Figuras(int Identificador, String Nombre, double Area, double Perimetro, int NumeroLineas, int IDPlano) {
        this.Identificador = Identificador;
        this.Nombre = Nombre;
        this.Area = Area;
        this.Perimetro = Perimetro;
        this.NumeroLineas = NumeroLineas;
        this.IDPlano = IDPlano;
    }

    public Figuras(int Identificador, String Nombre, int NumeroLineas, int IDPlano) {
        this.Identificador = Identificador;
        this.Nombre = Nombre;
        this.NumeroLineas = NumeroLineas;
        this.IDPlano = IDPlano;
    }
    
    
    
    
    
    
    

    public int getIdentificador() {
        return Identificador;
    }

    public void setIdentificador(int Identificador) {
        this.Identificador = Identificador;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getArea() {
        return Area;
    }

    public void setArea(double Area) {
        this.Area = Area;
    }

    public double getPerimetro() {
        return Perimetro;
    }

    public void setPerimetro(double Perimetro) {
        this.Perimetro = Perimetro;
    }

    public int getNumeroLineas() {
        return NumeroLineas;
    }

    public void setNumeroLineas(int NumeroLineas) {
        this.NumeroLineas = NumeroLineas;
    }

    public int getIDPlano() {
        return IDPlano;
    }

    public void setIDPlano(int IDPlano) {
        this.IDPlano = IDPlano;
    }

    
    
    
   
}
