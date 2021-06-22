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
public class Lineas {
    private int ID;
    private double x;
    private double x1;
    private double y;
    private double y1;
    private double longitud;
    private int IdFigura;

    public Lineas() {
    }

    public Lineas(int ID, double x, double x1, double y, double y1, double longitud, int IdFigura) {
        this.ID = ID;
        this.x = x;
        this.x1 = x1;
        this.y = y;
        this.y1 = y1;
        this.longitud = longitud;
        this.IdFigura = IdFigura;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public int getIdFigura() {
        return IdFigura;
    }

    public void setIdFigura(int IdFigura) {
        this.IdFigura = IdFigura;
    }
    
    
}
