package organizacion;

/*
 Esta ventana fue creada por Samuel Castro Soto el 24 de mayo del 2012
Agregandole 2 jTextArea´s dentro de 2 jScrollPanel´s respectivamente ademas de 3 jLabel´s
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

public class Pestaña6 extends JPanel {
    private JLabel jLabel1 = new JLabel();
    private JLabel jLabel3 = new JLabel();
    private JLabel jLabel4 = new JLabel();        
    private JLabel jLabel5 = new JLabel();
    private JScrollPane jScrollPane2 = new JScrollPane();
    private JScrollPane jScrollPane3 = new JScrollPane();
    private JTextArea jTextArea3 = new JTextArea();
    private JTextArea jTextArea2 = new JTextArea();
    private JScrollPane jScrollPane1 = new JScrollPane();
    private JTextArea jTextArea1 = new JTextArea();

    String Path ="Archivos";
    
    public Pestaña6() {
        setOpaque(false);
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.setLayout( null );
        this.setSize(new Dimension(762, 430));
        //this.setTitle( "Competencias" );
        jLabel1.setText("Objetivos del programa educativo:");
        jLabel1.setBounds(new Rectangle(40, 25, 235, 25));
        jLabel1.setFont(new Font("Arial",0,12));
        jLabel1.setForeground(Color.WHITE);
        
        jLabel3.setText("VI. OBJETIVOS DE LA FORMACION PROFESIONAL ESTABLECIDOS EN EL PLAN DE ESTUDIOS");
        jLabel3.setBounds(new Rectangle(30, 0, 560, 30));
        jLabel3.setFont(new Font("Arial",0,12));
        jLabel3.setForeground(Color.WHITE);
        
        jLabel4.setText("Objetivos del nucleo de formacion:");
        jLabel4.setBounds(new Rectangle(40,145,225,30));
        jLabel4.setFont(new Font("Arial",0,12));
        jLabel4.setForeground(Color.WHITE);
        
        jLabel5.setText("Objetivos del área académica:");
        jLabel5.setBounds(new Rectangle(40,270,190,30));
        jLabel5.setFont(new Font("Arial",0,12));
        jLabel5.setForeground(Color.WHITE);

        jScrollPane1.setBounds(new Rectangle(40,45,680,95));
        jScrollPane2.setBounds(new Rectangle(40,170,680,95));
        jScrollPane3.setBounds(new Rectangle(40, 295, 680, 95));
        
        jScrollPane2.getViewport().add(jTextArea2, null);
        jScrollPane1.getViewport().add(jTextArea1, null);

        jTextArea1.setLineWrap(true);
        jTextArea1.setFont(new Font("Arial",0,12));
        jTextArea2.setLineWrap(true);
        jTextArea2.setFont(new Font("Arial",0,12));
        jTextArea3.setLineWrap(true);
        jTextArea3.setFont(new Font("Arial",0,12));
        this.add(jScrollPane1, null);
        this.add(jScrollPane2, null);
        jScrollPane3.getViewport().add(jTextArea3, null);
        this.add(jScrollPane3, null);
        this.add(jLabel5, null);
        this.add(jLabel4, null);
        this.add(jLabel3, null);
        this.add(jLabel1, null);
    }
    
    public boolean Validarpes6(){
    boolean ind1,ind2, ind3;
    ind1 = jTextArea1.getText().equals("");
    ind2 = jTextArea2.getText().equals("");
    ind3 = jTextArea3.getText().equals("");
    if(ind1 == true || ind2 == true || ind3 == true){
        JOptionPane.showMessageDialog(this,"Existen Campos Vacios", "Error: Seccion VI",JOptionPane.WARNING_MESSAGE);
        return false;
    }else{
        return true;
    }
    }
    public void Escribirpes6(){
        File arc = new File(Path,"Unidades.txt");
        BufferedWriter acceseso;
        try {
            acceseso = new BufferedWriter(new FileWriter(arc,true));
            PrintWriter esc = new PrintWriter(acceseso);
            esc.print(jTextArea1.getText()); // Objetivos del programa educativo
            esc.print(";");
            esc.print(jTextArea2.getText());//Objetivos del nucleo de formacion
            esc.print(";");
            esc.print(jTextArea3.getText()); //Objetivos del área académica
            esc.print(";");
            esc.close();
        } catch (IOException e) {
        }
        
    }

    public void paintComponent(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    //g2.setPaint(new GradientPaint(new Point(0, 0), new Color(176, 207, 158), new Point(0, getHeight() / 2),new Color(57, 99, 0))); 
    g2.setPaint(new GradientPaint(new Point(0, 0), new Color(57, 99, 0), new Point(0, getHeight()),new Color(57, 99, 0)));
    g2.fillRect(0,0,getWidth(),getHeight());
    super.paintComponent(g);
    }

    void establecer(String []cadb){
        jTextArea2.setText(cadb[1]);
        jTextArea2.setEnabled(false);
        jTextArea1.setText(cadb[0]); 
        jTextArea1.setEnabled(false);
        jTextArea3.setText(cadb[2]); 
        jTextArea3.setEnabled(false);
        }
    
    void establecer2(String []cadb){
        jTextArea2.setText(cadb[1]);
        jTextArea1.setText(cadb[0]); 
        jTextArea3.setText(cadb[2]); 
        }
}


