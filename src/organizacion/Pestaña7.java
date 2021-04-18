package organizacion;

/*
 Esta ventana fue creada por Samuel Castro Soto el 24 de mayo del 2012
Agregandole 2 jTextArea´s dentro de 2 jScrollPanel´s respectivamente ademas de 3 jLabel´s
 *//*
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

public class Pestaña7 extends JPanel {
    private JLabel jLabel1 = new JLabel(); // Label del titulo GENERICAS
    private JLabel jLabel3 = new JLabel();// Etiqueta del titulo COMPETENCIAs
    private JLabel jLabel4 = new JLabel();// Etiqueta del titulo ESPECIFICAS
    
    private JScrollPane jScrollPane2 = new JScrollPane();// asociado al textArea2
    private JScrollPane jScrollPane1 = new JScrollPane();// Asociado al textArea1
    
    private JTextArea jTextArea2 = new JTextArea();// Asociado a etiqueta ESPECIFICAS ie. jLabel4
    private JTextArea jTextArea1 = new JTextArea();// Asociado a etiqueta GENERICAS ie. jLabel1

    String Path="Archivos";
    
    public Pestaña7() {
        setOpaque(false);
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        
        this.setLayout( null );
        this.setSize( new Dimension(762, 420) );
        
        jLabel1.setText("GENÉRICAS (establecidas en el plan de estudios):");
        jLabel1.setBounds(new Rectangle(40, 25, 280, 25));
        jLabel1.setFont(new Font("Arial",0,12));
        jLabel1.setForeground(Color.WHITE);
        
        jLabel3.setText("VII. COMPETENCIAS");
        jLabel3.setBounds(new Rectangle(30, 0, 140, 30));
        jLabel3.setFont(new Font("Arial",0,12));
        jLabel3.setForeground(Color.WHITE);
        
        jLabel4.setText("ESPECÍFICAS:");
        jLabel4.setBounds(new Rectangle(40,210,85,30));
        jLabel4.setFont(new Font("Arial",0,12));
        jLabel4.setForeground(Color.WHITE);
        
        jTextArea1.setLineWrap(true); // setLineWrap sirva para partir la linea es decir una ves que llegue al mimite de la ventana pase al sig renglon
        jTextArea1.setFont(new Font("Arial",0,12));
        jTextArea2.setLineWrap(true);
        jTextArea2.setFont(new Font("Arial",0,12));

        jScrollPane1.setBounds(new Rectangle(40,45,680,150));
        jScrollPane2.setBounds(new Rectangle(40,233,680,150));
        
        jScrollPane2.getViewport().add(jTextArea2, null);
        jScrollPane1.getViewport().add(jTextArea1, null);
        
        this.add(jScrollPane1, null);
        this.add(jScrollPane2, null);
        this.add(jLabel4, null);
        this.add(jLabel3, null);
        this.add(jLabel1, null);
    }
    
    public boolean Validarpes7(){ // Valida los campos existentes en la ventana y manda el error "Existen campos vacios" si lo estan
    boolean ind1,ind2;
    ind1 = jTextArea1.getText().equals("");
    ind2 = jTextArea2.getText().equals("");
    if(ind1 == true || ind2 == true){
        JOptionPane.showMessageDialog(this,"Existen campos vacios", "Error:Seccion VII",JOptionPane.WARNING_MESSAGE);
        return false;
    }else{
        return true;
    }
    }
    public void Escribirpes7(){ // Si no huvo ningun campo vacio, escribe en el archivo unidades lo que fue ingresado en los campos
        File arc = new File(Path,"Unidades.txt");
        BufferedWriter acceseso;
        try {
            acceseso = new BufferedWriter(new FileWriter(arc,true));
            PrintWriter esc = new PrintWriter(acceseso);
            esc.print(jTextArea1.getText()); // GENÉRICAS (establecidas en el plan de estudios
            esc.print(";");
            esc.print(jTextArea2.getText());// ESPECÍFICAS:
            esc.print(";");
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


