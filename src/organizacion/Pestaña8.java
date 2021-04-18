package organizacion;

/* 
 Esta ventana fue creada por Samuel Castro Soto el 24 de mayo del 2012 
agregandole un jLanel y un jTextArea dentro de un jScrollPanel
 */

import java.awt.Color;
import java.awt.Dimension;

import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Label;
import java.awt.Point;
import java.awt.Rectangle;

import java.awt.RenderingHints;
import java.awt.ScrollPane;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Pestaña8 extends JPanel {
    
    private JLabel jLabel1 = new JLabel();
    private JScrollPane jScrollPane1 = new JScrollPane(); //asociado a textArea1
    private JTextArea jTextArea1 = new JTextArea(); 

    String Path ="Archivos";
    
    public Pestaña8() {
        try {
            setOpaque(false);
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.setLayout( null );
        this.setSize( new Dimension(762, 420) );
        
        jLabel1.setText("VII. ÁMBITOS DE DESEMPEÑO PROFESIONAL:");
        jLabel1.setBounds(new Rectangle(40, 20, 260, 25)); 
        jLabel1.setFont(new Font("Arial",0,12));
        jLabel1.setForeground(Color.WHITE);

        jScrollPane1.setBounds(new Rectangle(40,50,680,200)); // Asociado a textArea1
        jScrollPane1.getViewport().add(jTextArea1, null);
        
        jTextArea1.setLineWrap(true); // textArea asociado a AMBITOS DE DESEMPEÑO PROFESIONAL
        jTextArea1.setFont(new Font("Arial",0,12));
        
        this.add(jScrollPane1, null);
        this.add(jLabel1, null);
    
        
    }
    
    public boolean Validarpes8(){ // valida los campos de esta ventana 
        boolean ind1;
        ind1=jTextArea1.getText().equals(""); // obtiene los elementos del textArea
        if(ind1 == true ){
            JOptionPane.showMessageDialog(this,"El campo 'Ámbitos de desempeño profesional' esta vacio", "Error: Seccion VIII",JOptionPane.ERROR_MESSAGE);
            return false;
        }else{
            return true;
        }
    }
    
        
    public void Escribirpes8(){ // en caso de que esten todos ya validados escribe en el archivo
        File arc = new File(Path,"Unidades.txt"); // hace la conexion con la carpeta Archivos y abre el archivo Unidades.txt
        BufferedWriter acceseso;
        try {
            acceseso = new BufferedWriter(new FileWriter(arc,true));
            PrintWriter esc = new PrintWriter(acceseso);
            esc.print(jTextArea1.getText()); // ÁMBITOS DE DESEMPEÑO PROFESIONAL:
            esc.print(";");  // escribe un ';' al final del parrafo para separarlo de otros campos
            esc.close();
        } catch (IOException e) {
        }    
    
    }

    public void paintComponent(Graphics g) { // color en degradado de la ventana
    Graphics2D g2 = (Graphics2D) g;
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    g2.setPaint(new GradientPaint(new Point(0, 0), new Color(57, 99, 0), new Point(0, getHeight()),new Color(57, 99, 0)));
    g2.fillRect(0,0,getWidth(),getHeight());
    super.paintComponent(g);
    }
    
    void establecer (String cam){
        jTextArea1.setText(cam);
        jTextArea1.setEnabled(false);
        }
    void establecer2 (String cam){
        jTextArea1.setText(cam);
        }
}

