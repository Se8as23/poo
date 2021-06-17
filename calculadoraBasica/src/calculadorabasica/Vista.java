/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorabasica;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;




/**
 *
 * @author Sebastian
 */
public class Vista extends JFrame{
    JPanel panel_principal;
    JPanel panel_botones;
    JTextField caja;
    
    public Vista(){
        //Titulo
        setTitle("Calculadora Basica");
        //Tamanio
        setSize(500,600);
        //Dimensionable?
        setResizable(false);
        //Locacion
        setLocationRelativeTo(null);
        //salir al clikar cruz
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Crear interfaz y botones
        init();
        //Visibilidad de la app
        setVisible(true);
        
    }
    
    private void init(){
        
        //INTERFAZ Y FUNCIONALIDAD
        //CREAMOS PANEL PRINCIPAL CON LAYOUT BORDERLAYOUT
        panel_principal = new JPanel();
        panel_principal.setLayout(new BorderLayout());
        //EN EL NORTE IRA LA CAJA DE TEXTO
        caja = new JTextField();
        panel_principal.add("North",caja);
        //EN EL CENTRO IRA EL PANEL DE BOTONES
        panel_botones = new JPanel();
        //El GRIDLAYOUT RECIBE COMO PARAMETROS:
        //FILAS,COLUMNAS ESPACIADO ENTRE FILAS,
        //ESPACIADO ENTRE COLUMNAS
        panel_botones.setLayout(new GridLayout(5,4,8,8));
        agregarBotones();
        panel_principal.add("Center",panel_botones);
        //AGREGAMOS TODO EL CONTENIDO QUE ACABAMOS DE HACER EN
        //PANEL_PRINCIPAL A EL PANEL DEL FORMULARIO
        getContentPane().add(panel_principal);

    }
    JButton boton[];
    double op1=0,op2=0;
    String operacion="";
    boolean nueva=true; 
    private void agregarBotones() {
        //INICIALIZAMOS EL ARREGLO DE BOTONES
        boton = new JButton[20];
        //INICIALIZAMOS LOS BOTONES
        boton[0]=new JButton("CE");
        boton[1]=new JButton("");
        boton[2]=new JButton("");
        boton[3]=new JButton("");
        boton[4]=new JButton("7");
        boton[5]=new JButton("8");
        boton[6]=new JButton("9");
        boton[7]=new JButton("/");
        boton[8]=new JButton("4");
        boton[9]=new JButton("5");
        boton[10]=new JButton("6");
        boton[11]=new JButton("*");
        boton[12]=new JButton("1");
        boton[13]=new JButton("2");
        boton[14]=new JButton("3");
        boton[15]=new JButton("-");
        boton[16]=new JButton("0");
        boton[17]=new JButton(".");
        boton[18]=new JButton("=");
        boton[19]=new JButton("+");
        //AGREAMOS LOS BOTONES AL PANEL BOTONES
        for(int i=0;i<20;i++){
            panel_botones.add(boton[i]);
        }
        //EVENTOS DE LOS BOTONES
        //OPERACIONES
        boton[19].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                try{
                    if(op1!=0)
                        op1=op1+Double.parseDouble(caja.getText());
                    else
                        op1=Double.parseDouble(caja.getText());
                    operacion="suma";
                    caja.setText("");
                }catch(Exception err){}
                
            }
        });
        boton [15].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                try{
                    if(op1!=0)
                        op1=op1-Double.parseDouble(caja.getText());
                    else
                        op1=Double.parseDouble(caja.getText());
                    operacion="resta";
                    caja.setText("");
                }catch(Exception err){}
            }
        });
        boton[11].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                try{
                    if(op1!=0)
                        op1=op1*Double.parseDouble(caja.getText());
                    else
                        op1=Double.parseDouble(caja.getText());
                    operacion="multiplicacion";
                    caja.setText("");
                }catch(Exception err){}
            }
        });
        boton[7].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                try{
                    if(op1!=0)
                        op1=op1/Double.parseDouble(caja.getText());
                    else
                        op1=Double.parseDouble(caja.getText());
                    operacion="division";
                    caja.setText("");
                }catch(Exception err){}
            }
        });
        //NUMEROS Y PUNTO DECIMAL
        boton[4].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){caja.setText("");nueva=false;}
                caja.setText(caja.getText()+"7");
            }
        });
        boton[5].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){caja.setText("");nueva=false;}
                caja.setText(caja.getText()+"8");
            }
        });
        boton[6].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){caja.setText("");nueva=false;}
                caja.setText(caja.getText()+"9");
            }
        });
        boton[8].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){caja.setText("");nueva=false;}
                caja.setText(caja.getText()+"4");
            }
        });
        boton[9].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){caja.setText("");nueva=false;}
                caja.setText(caja.getText()+"5");
            }
        });
        boton[10].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){caja.setText("");nueva=false;}
                caja.setText(caja.getText()+"6");
            }
        });
        boton[12].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){caja.setText("");nueva=false;}
                caja.setText(caja.getText()+"1");
            }
        });
        boton[13].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){caja.setText("");nueva=false;}
                caja.setText(caja.getText()+"2");
            }
        });
        boton[14].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){caja.setText("");nueva=false;}
                caja.setText(caja.getText()+"3");
            }
        });
        boton[16].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){caja.setText("");nueva=false;}
                caja.setText(caja.getText()+"0");
            }
        });
        boton[17].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){caja.setText("");nueva=false;}
                caja.setText(caja.getText()+".");
            }
        });
        //IGUAL
        boton[18].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                try{
                    op2=Double.parseDouble(caja.getText());
                }catch(Exception err){}
                if(operacion.equals("suma")){
                    double res=op1+op2;
                    caja.setText(String.valueOf(res));
                    op1=op2=0;
                    operacion="";
                }else if(operacion.equals("resta")){
                    double res=op1-op2;
                    caja.setText(String.valueOf(res));
                    op1=op2=0;
                    operacion="";
                }else if(operacion.equals("multiplicacion")){
                    double res=op1*op2;
                    caja.setText(String.valueOf(res));
                    op1=op2=0;
                    operacion="";
                }else if(operacion.equals("division")){
                    double res=op1/op2;
                    caja.setText(String.valueOf(res));
                    op1=op2=0;
                    operacion="";
                }
                nueva=true;
            }
        });
        //CE
        boton[0].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                caja.setText("");
                op1=op2=0;
                operacion="";
            }
        });
            
    }
}   
            
        


       
    

