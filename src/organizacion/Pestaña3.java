package organizacion;

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

public class Pestaña3 extends JPanel {
    private JLabel jLabel1 = new JLabel();
    private JScrollPane jScrollPane1 = new JScrollPane();
    private JScrollPane jScrollPane2 = new JScrollPane();
    private JTextArea jTextArea1 = new JTextArea();
    private JTextArea jTextArea2 = new JTextArea();
    String Path="Archivos";
    private JLabel jLabel2 = new JLabel();
    private JLabel jLabel3 = new JLabel();

    public Pestaña3() {
        setOpaque(false);
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.setLayout( null );
        this.setSize(new Dimension(762, 420));
        
        jLabel1.setText("III NORMAS DE LA UNIDAD DE APRENDIZAJE");
        jLabel1.setBounds(new Rectangle(10, 10, 260, 20));
        jLabel1.setForeground(Color.WHITE);
        
        jScrollPane1.setBounds(new Rectangle(40, 120, 310, 190));
        jScrollPane2.setBounds(new Rectangle(415, 120, 310, 190));
        
        jLabel2.setText("DOCENTE");
        jLabel2.setForeground(Color.WHITE);
        jLabel2.setBounds(new Rectangle(125, 70, 120, 30));
        jLabel3.setText("DICENTE");
        jLabel3.setForeground(Color.WHITE);
        jLabel3.setBounds(new Rectangle(520, 70, 100, 25));
        
        jScrollPane1.getViewport().add(jTextArea2, null);
        
        jTextArea1.setLineWrap(true);
        jTextArea1.setFont(new Font("Arial",0,12));
        jTextArea2.setLineWrap(true);
        jTextArea2.setFont(new Font("Arial",0,12));
        
        this.add(jLabel3, null);
        this.add(jLabel2, null);
        this.add(jScrollPane1, null);
        this.add(jLabel1, null);
        jScrollPane2.getViewport().add(jTextArea1, null);
        this.add(jScrollPane2, null);
    }
    public boolean guardar3(){ // funcion que verifica que no exista ningun campo vacio
        if(jTextArea1.getText().equals("")||jTextArea2.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Faltan llenar normas de la unidad ","Error:Seccion II",JOptionPane.WARNING_MESSAGE);
             return false;
        }
        else{
            return true;
        }     
    }
    public void escribir3(){// funcion que verifica que no exista ningun campo vacio
        File arc=new File(Path,"Unidades.txt");
            BufferedWriter accseso;
        try {
            accseso = new   BufferedWriter(new FileWriter(arc,true));
            PrintWriter esc = new  PrintWriter(accseso);
                esc.print(jTextArea1.getText());
                esc.print(";");
                esc.print(jTextArea2.getText());
                esc.print(";");
                esc.close();
        } catch (IOException e) {
        }
       
    }
    public void paintComponent(Graphics g) {//color de la ventana
    Graphics2D g2 = (Graphics2D) g;
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    g2.setPaint(new GradientPaint(new Point(0, 0), new Color(57, 99, 0), new Point(0, getHeight()),new Color(57, 99, 0)));
    g2.fillRect(0,0,getWidth(),getHeight());
    super.paintComponent(g);
    }
    
    void establecer(String []cadb){
        jTextArea2.setText(cadb[1]);
        jTextArea2.setEnabled(false);
        jTextArea1.setText(cadb[0]); 
        jTextArea1.setEnabled(false);
        }
    void establecer2(String []cadb){
        jTextArea2.setText(cadb[1]);
        jTextArea1.setText(cadb[0]); 
        }

}

