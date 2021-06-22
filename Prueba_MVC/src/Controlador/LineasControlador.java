/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.LineasInterface;
import Modelo.Figuras;
import Modelo.Lineas;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class LineasControlador implements LineasInterface {

    public void iniciar() {
        int count = 1;
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        while (!salir) {
            String cedula1;
            System.out.println("");
            System.out.println("--------------------------------");
            System.out.println("");
            System.out.println("***SUBMENU LINEAS***");
            System.out.println("1.CREAR LINEAS-----");
            System.out.println("2.ACTUALIZAR  LINEA-----");
            System.out.println("3.LISTAR  LINEAS");
            System.out.println("4.ELIMINAR  LINEA");
            System.out.println("5.BUSCAR  LINEA");
            System.out.println("6.SALIR------***");

            int opcioni = sn.nextInt();
            switch (opcioni) {

                case 1:
                    Crear();
                    break;
                case 2:
                    Actualizar();
                    break;
                case 3:
                    Listar();
                    break;
                case 4:
                    Eliminar();
                    break;
                case 5:
                    Buscar2();
                    break;

                case 6:
                    System.out.println("Su opccion fue salir.");
                    salir = true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 6");
            }
        }

    }

    @Override
    public void Crear() {
        int count = 1;
        double longg = 0;

        ArrayList<Double> valores = new ArrayList();

        Scanner pp = new Scanner(System.in);
        System.out.println("Ingrese el id de la figura: ");
        int idFig = pp.nextInt();
        FigurasControlador buscar = new FigurasControlador();
        Figuras figu = buscar.Buscar(idFig);
        
        
        
        
        
        
        if (figu != null) {
            while (count <= figu.getNumeroLineas()) {
                Scanner oo = new Scanner(System.in);
                Scanner oo1 = new Scanner(System.in);
                System.out.println("Ingrese el ID Linea: ");
                int idLinea = oo.nextInt();
                System.out.println("Ingrese X: ");
                double x = oo1.nextDouble();
                System.out.println("Ingrese Y: ");
                double y = oo1.nextDouble();
                System.out.println("Ingrese X1: ");
                double x1 = oo1.nextDouble();
                System.out.println("Ingrese Y1: ");
                double y1 = oo1.nextDouble();
                double longitud = Math.sqrt((Math.pow((x1 - x), 2)) + (Math.pow((y1 - y), 2)));
                longg = longg + longitud;

                if (count == 1) {
                    valores.add(x);
                    valores.add(y);
                    valores.add(x1);
                    valores.add(y1);

                }else{
                    valores.add(x1);
                    valores.add(y1);
                    
                }

                Lineas linea = new Lineas(idLinea, x, y, x1, y1, longitud, idFig);
                ListaLineas.add(linea);
                count++;

            }
            
            double suma1=0;
            double suma2=0;
            double area=0;
            int co=1;
            for(int k=1;k<valores.size();k=k+2){
                if(valores.size()>k+3){
                    suma1=suma1+(valores.get(k)*valores.get(k+3));
                }else{
                    suma1=suma1+valores.get(k);
                }
                
            }
            for(int k=2;k<valores.size();k=k+2){
                if(valores.size()>k+1){
                    suma2=suma2+(valores.get(k)*valores.get(k+1));
                }else{
                    suma2=suma2+valores.get(k);
                }
                
            }
            area=(suma2-suma1)/2;
            
            
            
            System.out.println("El perimetro es: "+longg);
            System.out.println("El area es: "+ area);
            
            FigurasControlador hh=new FigurasControlador();
            hh.ActualizarMedidas(longg, area,figu);
            

        } else {
            System.out.println("No se encontro la figura!!");
        }

    }

    @Override
    public void Listar() {

        for (Lineas l : ListaLineas) {
            System.out.println("ID: " + l.getIdFigura() + "X:" + l.getX() + "Y:" + l.getY() + "X1:" + l.getX1() + "Y1:" + l.getY1() + "Logitud:" + l.getLongitud() + "IdFigura" + l.getIdFigura());

        }

    }

    @Override
    public void Actualizar() {
        Scanner oo1 = new Scanner(System.in);
        Scanner oo = new Scanner(System.in);
        Scanner oo1p = new Scanner(System.in);
        System.out.println("Ingrese el ID Linea: ");
        int id = oo1p.nextInt();
        Lineas linn = Buscar(id);
        if (linn != null) {
            Eliminar2(id);
            System.out.println("Ingrese X: ");
            double x = oo1.nextDouble();
            System.out.println("Ingrese Y: ");
            double y = oo1.nextDouble();
            System.out.println("Ingrese X1: ");
            double x1 = oo1.nextDouble();
            System.out.println("Ingrese Y1: ");
            double y1 = oo1.nextDouble();
            System.out.println("Ingrese el ID de la figura: ");
            int idFigura = oo.nextInt();
            double longitud = Math.sqrt((Math.pow((x1 - x), 2)) + (Math.pow((y1 - y), 2)));

            Lineas linea = new Lineas(id, x, y, x1, y1, longitud, idFigura);
            ListaLineas.add(linea);

        } else {

        }

    }

    @Override
    public void Eliminar() {
        Scanner oo1p = new Scanner(System.in);
        System.out.println("Ingrese el ID Linea: ");
        int id = oo1p.nextInt();
        Lineas lino = new Lineas();

        for (Lineas l : ListaLineas) {
            if (l.getID() == id) {
                lino = l;
            }
        }
        ListaLineas.remove(lino);
    }

    public void Eliminar2(int id) {

        Lineas lino = new Lineas();

        for (Lineas l : ListaLineas) {
            if (l.getID() == id) {
                lino = l;
            }
        }
        ListaLineas.remove(lino);
    }

    public Lineas Buscar(int id) {
        Lineas lin = null;
        for (Lineas l : ListaLineas) {
            if (l.getID() == id) {
                lin = l;
            }
        }
        return lin;
    }

    public void Buscar2() {
        Scanner oo1p = new Scanner(System.in);
        System.out.println("Ingrese el ID Linea: ");
        int id = oo1p.nextInt();
        Lineas l = null;
        for (Lineas ll : ListaLineas) {
            if (ll.getID() == id) {
                l = ll;
            }
        }
        System.out.println("ID: " + l.getIdFigura() + "X:" + l.getX() + "Y:" + l.getY() + "X1:" + l.getX1() + "Y1:" + l.getY1() + "Logitud:" + l.getLongitud() + "IdFigura" + l.getIdFigura());

    }

}
