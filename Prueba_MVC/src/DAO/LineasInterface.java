/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Lineas;
import java.util.ArrayList;

/**
 *
 * @author Sebastian
 */
public interface LineasInterface {
    ArrayList<Lineas> ListaLineas=new ArrayList();
    public void Crear();
    public void Listar();
    public void Actualizar();
    public void Eliminar();
    
}
