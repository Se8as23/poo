/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panel;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ActionMap;
import javax.swing.JPanel;

/**
 *
 * @author gh286
 */
public class Panel extends JPanel {
    public Panel(){
        setBounds(0, 0, 500, 500);
        setBackground(Color.red);
        
    }
    
    
    @Override
    public void paint(Graphics lienzo){
        lienzo.setColor(Color.red);
        lienzo.drawLine(200, 300, 100, 100);
        
    }
}
    



    

