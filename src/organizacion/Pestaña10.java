package organizacion;

import java.awt.Color;
import java.awt.Dimension;

import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;

import java.awt.RenderingHints;

import java.io.BufferedWriter;
import java.io.File;

import java.io.FileWriter;

import java.io.IOException;

import java.io.PrintWriter;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Pestaña10 extends JPanel {
    private JLabel jLabel1 = new JLabel();
    private JScrollPane jScrollPane1 = new JScrollPane();
    private JScrollPane jScrollPane2 = new JScrollPane();
    private JScrollPane jScrollPane3 = new JScrollPane();
    private JLabel jLabel2 = new JLabel();
    private JLabel jLabel3 = new JLabel();
    private JLabel jLabel4 = new JLabel();
    private JTextArea jTextArea1 = new JTextArea();
    private JTextArea jTextArea2 = new JTextArea();
    private JTextArea jTextArea3 = new JTextArea();
    String Path="Archivos";
    public Pestaña10() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.setLayout( null );
        this.setSize(new Dimension(762, 420));
        this.setBackground(new Color(57, 99, 0));
        
        jLabel1.setText("X. OBJETIVOS DE LA UNIDAD DE APRENDIZAJE");
        jLabel1.setBounds(new Rectangle(30, 25, 360, 40));
        jLabel1.setFont(new Font("Arial",0,12));

        jLabel1.setForeground(Color.white);
        jTextArea1.setLineWrap(true);
        jTextArea1.setFont(new Font("Arial",0,12));
        
        jTextArea2.setLineWrap(true);
        jTextArea2.setFont(new Font("Arial",0,12));
        
        jTextArea3.setLineWrap(true);
        jTextArea3.setFont(new Font("Arial",0,12));

        jScrollPane1.setBounds(new Rectangle(25, 105, 300, 90));
        
        jScrollPane2.setBounds(new Rectangle(395, 105, 300, 90));
        
        jScrollPane3.setBounds(new Rectangle(20, 270, 675, 100));
        
        jLabel2.setText("Objetivos Generales");
        jLabel2.setBounds(new Rectangle(40, 70, 260, 30));
        jLabel2.setFont(new Font("Arial",0,12));

        jLabel2.setForeground(Color.white);
        jLabel3.setText("Objetivos de las unidades de Competencias");
        jLabel3.setBounds(new Rectangle(405, 75, 285, 25));
        jLabel3.setFont(new Font("Arial",0,12));

        jLabel3.setForeground(Color.white);
        jLabel4.setText("Objetivos del nivel de dominio del conocimiento");
        jLabel4.setBounds(new Rectangle(20, 230, 360, 25));
        jLabel4.setFont(new Font("Arial",0,12));

        jLabel4.setForeground(Color.white);
        this.add(jLabel4, null);
        this.add(jLabel3, null);
        this.add(jLabel2, null);
        jScrollPane3.getViewport().add(jTextArea3, null);
        this.add(jScrollPane3, null);
        jScrollPane2.getViewport().add(jTextArea2, null);
        this.add(jScrollPane2, null);
        jScrollPane1.getViewport().add(jTextArea1, null);
        this.add(jScrollPane1, null);
        this.add(jLabel1, null);
    }
    
    boolean Comprobar10(){
       boolean ind,ind2,ind3;
       ind=jTextArea1.getText().equals("");
       ind2=jTextArea2.getText().equals("");
       ind3=jTextArea3.getText().equals("");
       if(ind==true || ind2==true || ind3==true){
           JOptionPane.showMessageDialog(this,"Faltan Campos Por Llenar", "Error: Seccion X",JOptionPane.ERROR_MESSAGE);
           return false;
       }
       else{
           return true;
       }
    }
    
    void Escribir10(){
        File arc = new File(Path,"Unidades.txt");
        BufferedWriter arcesc;
        try {
            arcesc = new BufferedWriter(new FileWriter(arc,true));
            PrintWriter esc = new PrintWriter(arcesc);
            esc.print(jTextArea1.getText());
            esc.print(";");
            esc.print(jTextArea2.getText());
            esc.print(";");
            esc.print(jTextArea3.getText());
            esc.print(";");
            esc.close();
        } catch (IOException e) {
        }
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
