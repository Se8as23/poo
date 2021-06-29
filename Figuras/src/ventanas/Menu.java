/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import Panel.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author gh286
 */
public class Menu extends JFrame implements ActionListener {

    private JButton btnlinea, btncuadrado, btnrectangulo, btncirculo;
    private Panel panelPrincipal;
    Panel pan = new Panel();
    

    public Menu() {

        componentes();
        // Al cerrar la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// se detiene prog
        setSize(800, 500); // Tamaño de la Ventana Ancho y Largo
        setLocationRelativeTo(null); // Centra la ventana en el monitor
        setLayout(null); // elimina toda plantilla.
        setResizable(false); // evita se pueda modificar el tamaño de ventana
        setVisible(true); // hace visible la ventana
        setTitle("Figuras"); // Le pone un titulo a la ventana

    }

    public void componentes() {
        btnlinea = new JButton();
        btnlinea.setBounds(40, 25, 180, 20);
        btnlinea.setText("Linea");
        add(btnlinea);
        btnlinea.addActionListener(this);
                
        btncuadrado = new JButton();
        btncuadrado.setBounds(210, 25, 180, 20);
        btncuadrado.setText("cuadrado");
        add(btncuadrado);
        

        btnrectangulo = new JButton();
        btnrectangulo.setBounds(380, 25, 180, 20);
        btnrectangulo.setText("rectangulo");
        add(btnrectangulo);

        btncirculo = new JButton();
        btncirculo.setBounds(550, 25, 180, 20);
        btncirculo.setText("circulo");
        add(btncirculo);

    }
    @Override public void actionPerformed(ActionEvent e){
        if(e.getSource().equals(btnlinea)){
            
            panelPrincipal = new Panel();
            setContentPane(panelPrincipal);
            
        }if(e.getSource().equals(btncuadrado)){
            
        }
    }

    
    
}
