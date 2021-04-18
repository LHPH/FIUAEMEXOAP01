package organizacion;
//Pestaña by Emmanuel Cárdenas Salinas
import java.awt.Color;
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
import javax.swing.JTable;
import javax.swing.JTextArea;

public class Pestaña11y12 extends JPanel {
    String Path="Archivos";
    private JLabel jLabel1 = new JLabel();
    private JScrollPane jScrollPane1 = new JScrollPane();
    private JScrollPane jScrollPane2 = new JScrollPane();
    private JLabel jLabel2 = new JLabel();
    private JLabel jLabel3 = new JLabel();
    private JLabel jLabel4 = new JLabel();
    private JScrollPane jScrollPane3 = new JScrollPane();
    private JTextArea jTextArea1 = new JTextArea();
    private JTextArea jTextArea2 = new JTextArea();
    private JTextArea jTextArea3 = new JTextArea();

    public Pestaña11y12() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    JPanel jbInit(){
        this.setLayout( null );
        this.setBackground(new Color(57, 99, 0));
              
        jLabel1.setText("XI. ESTRUCTURA DE LA UNDAD DE APRENDIZAJE Y SU ORGANIZACION(SECUENCIA DIDACTICA)");
        jLabel1.setFont(new Font("Arial",0,12));
        jLabel1.setBounds(new Rectangle(30, 10, 630, 35));
        jLabel1.setForeground(Color.white);
        jScrollPane1.setBounds(new Rectangle(45, 85, 315, 130));
        jScrollPane2.setBounds(new Rectangle(385, 85, 325, 130));
        jTextArea1.setFont(new Font("Arial",0,12));
        jTextArea1.setLineWrap(true);
        
        jTextArea2.setFont(new Font("Arial",0,12));
        jTextArea2.setLineWrap(true);
        
        jTextArea3.setFont(new Font("Arial",0,12));
        jTextArea3.setLineWrap(true);
        
        jLabel2.setText("Unidades de competencia(tematicas)");
        jLabel2.setFont(new Font("Arial",0,12));
        jLabel2.setBounds(new Rectangle(45, 55, 295, 25));
        jLabel2.setForeground(Color.white);
        jLabel3.setText("Contenidos(Temas)");
        jLabel3.setFont(new Font("Arial",0,12));
        jLabel3.setBounds(new Rectangle(395, 50, 300, 40));
        jLabel3.setForeground(Color.white);
        jLabel4.setText("XII. SECUENCIA DIDACTICA DEL DESEMPEÑO PARA EL DESARROLLO DE COMPETENCIAS EN LA SOLUCION DE PROBLEMAS Y ESTUDIOS DE CASO");
        jLabel4.setFont(new Font("Arial",0,9));
        jLabel4.setBounds(new Rectangle(10, 230, 740, 30));
        jLabel4.setForeground(Color.white);
        jScrollPane3.setBounds(new Rectangle(45, 265, 665, 105));
        jScrollPane3.getViewport().add(jTextArea3, null);
        this.add(jScrollPane3, null);
        this.add(jLabel4, null);
        this.add(jLabel3, null);
        this.add(jLabel2, null);
        jScrollPane2.getViewport().add(jTextArea2, null);
        this.add(jScrollPane2, null);
        jScrollPane1.getViewport().add(jTextArea1, null);
        this.add(jScrollPane1, null);
        this.add(jLabel1, null);
        this.setSize(762, 420);
        return this;
    }
    
  
   public boolean Validarpes12(){
   boolean ind1,ind2, ind3;
   ind1 = jTextArea1.getText().equals("");
   ind2 = jTextArea2.getText().equals("");
   ind3 = jTextArea3.getText().equals("");
   if(ind1 == true || ind2 == true || ind3 == true){
       JOptionPane.showMessageDialog(this,"Existen Campos Vacios", "Error: Seccion XI / Seccion XII",JOptionPane.WARNING_MESSAGE);
       return false;
   }else{
       return true;
   }
   }
   
   public void Escribirpes12(){
       File arc = new File(Path,"Unidades.txt");
       BufferedWriter acceseso;
       try {
           acceseso = new BufferedWriter(new FileWriter(arc,true));
           PrintWriter esc = new PrintWriter(acceseso);
           esc.print(jTextArea1.getText()); // Unidad de Competencia Tematica
           esc.print(";");
           esc.print(jTextArea2.getText());// Contenidos Temas
           esc.print(";");
           esc.print(jTextArea3.getText()); //Secuencia Didactica 
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
