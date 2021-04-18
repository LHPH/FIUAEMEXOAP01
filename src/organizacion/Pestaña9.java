package organizacion;


/*
 Esta ventana fue creada por Samuel Castro Soto el 24 de mayo del 2012
agregandole un jLabel y un jTextArea dentro de un jScrollPanel
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

public class Pestaña9 extends JPanel {
    private JLabel jLabel1 = new JLabel();
    private JScrollPane jScrollPane = new JScrollPane();
    private JTextArea jTextArea = new JTextArea();
    
    String Path ="Archivos"; 
    public Pestaña9() {
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
        jLabel1.setText("IX. ESCENARIOS DE APRENDIZAJE:");
        jLabel1.setBounds(new Rectangle(40, 20, 220, 25));
        jLabel1.setFont(new Font("Arial",0,12));
        jLabel1.setForeground(Color.WHITE);

        jScrollPane.setBounds(new Rectangle(40,50,680,200));
        jScrollPane.getViewport().add(jTextArea, null);
        
        jTextArea.setLineWrap(true);
        jTextArea.setFont(new Font("Arial",0,12));
        // agrega los elementos a la ventana
        this.add(jScrollPane, null);
        this.add(jLabel1, null);

    }

    public boolean Validarpes9(){
        boolean ind1;
        ind1 = jTextArea.getText().equals(""); // Obtiene lo que esta contenido en al jTextArea
        if(ind1 == true){
                JOptionPane.showMessageDialog(this,"El campo 'Ecenarios de aprendizaje' esta vacio", "Error: Seccion IX",JOptionPane.ERROR_MESSAGE);
        return false;
        }else{
            return true;
        }
    }
    public void Escribirpes9(){ //escribe las unidades si no hubo un error en la validacion
        File arc = new File(Path,"Unidades.txt"); // abre el archivo  Unidades.txt de la carpeta Archivos 
        BufferedWriter acceseso;
        try {
            acceseso = new BufferedWriter(new FileWriter(arc,true));
            PrintWriter esc = new PrintWriter(acceseso);
            esc.print(jTextArea.getText()); // ESENARIOS DE APRENDIZAJE:
            esc.print(";");
            esc.close();
        } catch (IOException e) {
        }
    }

    public void paintComponent(Graphics g) {// color de la ventana
    Graphics2D g2 = (Graphics2D) g;
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    g2.setPaint(new GradientPaint(new Point(0, 0), new Color(57, 99, 0), new Point(0, getHeight()),new Color(57, 99, 0)));
    g2.fillRect(0,0,getWidth(),getHeight());
    super.paintComponent(g);
    }
    
    void establecer (String cam){
        jTextArea.setText(cam);
        jTextArea.setEnabled(false);
        }
    void establecer2 (String cam){
        jTextArea.setText(cam);
        }
}

