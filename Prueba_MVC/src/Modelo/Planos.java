/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Sebastian
 */
public class Planos {
    
    private int NumeroIdentificacion;
    private Date fecha;
    private int NumeroArquitectos;
    private int NumeroFiguras;

    public Planos() {
    }

    public Planos(int NumeroIdentificacion, Date fecha, int NumeroArquitectos, int NumeroFiguras) {
        this.NumeroIdentificacion = NumeroIdentificacion;
        this.fecha = fecha;
        this.NumeroArquitectos = NumeroArquitectos;
        this.NumeroFiguras = NumeroFiguras;
    }

    public int getNumeroIdentificacion() {
        return NumeroIdentificacion;
    }

    public void setNumeroIdentificacion(int NumeroIdentificacion) {
        this.NumeroIdentificacion = NumeroIdentificacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNumeroArquitectos() {
        return NumeroArquitectos;
    }

    public void setNumeroArquitectos(int NumeroArquitectos) {
        this.NumeroArquitectos = NumeroArquitectos;
    }

    public int getNumeroFiguras() {
        return NumeroFiguras;
    }

    public void setNumeroFiguras(int NumeroFiguras) {
        this.NumeroFiguras = NumeroFiguras;
    }
    
    
    
    
    
    
}
