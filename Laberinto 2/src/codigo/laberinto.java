/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author gh286
 */
public class laberinto extends JFrame {
    Graphics g;
    
    public laberinto() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// se detiene prog
        setSize(800, 500); // Tamaño de la Ventana Ancho y Largo
        setLocationRelativeTo(null); // Centra la ventana en el monitor
        setLayout(null); // elimina toda plantilla.
        setResizable(false); // evita se pueda modificar el tamaño de ventana
        setVisible(true); // hace visible la ventana
        setTitle("laberinto"); // Le pone un titulo a la ventana
        
    } 
    
    public void paint(){
        g.setColor(Color.red);
        g.drawLine(100, 100, 100, 100);
        
        }
    
    }

