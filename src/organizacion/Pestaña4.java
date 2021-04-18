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
import java.awt.event.MouseAdapter;

import java.awt.event.MouseEvent;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Pestaña4 extends JPanel {
    private JLabel jLabel1 = new JLabel();
    private JScrollPane jScrollPane1 = new JScrollPane();
    private JTextArea jTextArea1 = new JTextArea();
    String Path="Archivos";

    public Pestaña4() {
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
        
        jLabel1.setText("IV. UBICACION DE LA UNIDAD DE APRENDIZAJE EN EL MAPA CURRICULAR.");
        jLabel1.setForeground(Color.WHITE);
        
        jTextArea1.setLineWrap(true);
        jTextArea1.setFont(new Font("Arial",0,12));
        
        jLabel1.setBounds(new Rectangle(15, 15, 405, 15));
        jScrollPane1.setBounds(new Rectangle(35, 40, 700, 140));
        jScrollPane1.getViewport().add(jTextArea1, null);
        
        this.add(jScrollPane1, null);
        this.add(jLabel1, null);
    }
    public boolean guardar4(){ // Valida que no exixta ningun campo vacio
        if (jTextArea1.getText().equals("")) {
            JOptionPane.showMessageDialog(this,"Faltan llenar ubicacion de la unidad de aprendizaje.","Error:Seccion IV",JOptionPane.WARNING_MESSAGE);
             return false;
        } 
        return true;
    }
    public void escribir4(){ // Escribe el contenido de los campos si no hubo ningun problema al momento de la validacion
        File arc=new File(Path,"Unidades.txt");
            BufferedWriter accseso;
        try {
            accseso = new   BufferedWriter(new FileWriter(arc,true));
            PrintWriter esc = new  PrintWriter(accseso);
                esc.print(jTextArea1.getText());
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
        jTextArea1.setText(cam);
        jTextArea1.setEnabled(false);
        }
    
    void establecer2 (String cam){
        jTextArea1.setText(cam);
        }

}

