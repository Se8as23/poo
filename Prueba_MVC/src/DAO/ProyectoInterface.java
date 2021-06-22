/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Proyecto;
import java.util.ArrayList;

/**
 *
 * @author Sebastian
 */
public interface ProyectoInterface {
    ArrayList<Proyecto> ListaProyectos=new ArrayList();
    public void Crear();
    public void Listar();
    public void Actualizar();
    public void Eliminar();
    
}
