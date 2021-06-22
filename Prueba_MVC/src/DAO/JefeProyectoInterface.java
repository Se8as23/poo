/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.JefeProyecto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sebastian
 */
public interface JefeProyectoInterface {
    ArrayList<JefeProyecto> ListaJefes=new ArrayList();
    
    public void Crear();
    public void Listar();
    public void Actualizar();
    public void Eliminar();
    
    
    
}
