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

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Pestaña16 extends JPanel {
    private JLabel jLabel1 = new JLabel();
    private JLabel jLabel2 = new JLabel();
    private JLabel jLabel3 = new JLabel();
    private JLabel jLabel4 = new JLabel();
    private JScrollPane jScrollPane1 = new JScrollPane();
    private JScrollPane jScrollPane2 = new JScrollPane();
    private JScrollPane jScrollPane3 = new JScrollPane();
    private JTextArea jTextArea1 = new JTextArea();
    private JTextArea jTextArea2 = new JTextArea();
    private JTextArea jTextArea3 = new JTextArea();
    String Path ="Archivos";

    public Pestaña16() {
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
        jLabel1.setText("XVI. BIBLIOGRAFIA Y MESOGRAFIA BASICA Y COMPLEMENTARIA (según sistema Harvard, o APA)");
        jLabel1.setBounds(new Rectangle(20, 5, 670, 35));
        jLabel1.setFont(new Font("Arial", 0, 12));
        jLabel1.setForeground(Color.white);

        jLabel2.setText("BASICA");
        jLabel2.setBounds(new Rectangle(45, 55, 65, 10));
        jLabel2.setFont(new Font("Arial", 0, 12));
        jLabel2.setForeground(Color.white);
        
        jScrollPane1.setBounds(new Rectangle(25, 80, 700, 70));
        jScrollPane1.getViewport().add(jTextArea1, null);

        jLabel3.setText("COMPLEMENTARIA");
        jLabel3.setBounds(new Rectangle(45, 160, 145, 15));
        jLabel3.setFont(new Font("Arial", 0, 12));
        jLabel3.setForeground(Color.white);
        
        jScrollPane2.setBounds(new Rectangle(25, 280, 700, 70));
        jScrollPane2.getViewport().add(jTextArea3, null);

        jLabel4.setText("UNIDAD QUE APOYA");
        jLabel4.setBounds(new Rectangle(45, 260, 175, 15));
        jLabel4.setFont(new Font("Arial", 0, 12));
        jLabel4.setForeground(Color.white);
        
        jScrollPane3.setBounds(new Rectangle(25, 180, 700, 65));
        jScrollPane3.getViewport().add(jTextArea2, null);
        
        jTextArea1.setFont(new Font("Arial",0,12));
        jTextArea1.setLineWrap(true);
        
        jTextArea2.setFont(new Font("Arial",0,12));
        jTextArea2.setLineWrap(true);
        
        jTextArea3.setFont(new Font("Arial",0,12));
        jTextArea3.setLineWrap(true);
        
        
        this.add(jScrollPane3, null);        
        this.add(jScrollPane2, null);        
        this.add(jScrollPane1, null);
        this.add(jLabel4, null);
        this.add(jLabel3, null);
        this.add(jLabel2, null);
        this.add(jLabel1, null);
    }
    public void paintComponent(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    //g2.setPaint(new GradientPaint(new Point(0, 0), new Color(176, 207, 158), new Point(0, getHeight() / 2),new Color(57, 99, 0))); 
    g2.setPaint(new GradientPaint(new Point(0, 0), new Color(57, 99, 0), new Point(0, getHeight()),new Color(57, 99, 0)));
    g2.fillRect(0,0,getWidth(),getHeight());
    super.paintComponent(g);
    }
    public boolean Guardar16()//Modulo que valida si los campos estan vacios by Emmanuel
       {
           boolean ind1,ind2,ind3;
           ind1=jTextArea1.getText().equals("");
           ind2=jTextArea2.getText().equals("");
           ind3=jTextArea3.getText().equals("");
           if(!(ind1==true||ind2==true||ind3==true)){
               return true;
           }
           else{
               JOptionPane.showMessageDialog(this,"Faltan Campos Por llenar", "Error: Seccion XVI",JOptionPane.ERROR_MESSAGE);
               return false;
           }
       }
       public void Escribir16(){
           String [] reg1, reg2,reg3;//Contenedor de las cadenas del area de texto 1
           String regi1,regi2,regi3;
           int tam;
           try{
               File arc= new File(Path,"Unidades.txt");
               BufferedWriter accEsc =new BufferedWriter(new FileWriter(arc,true)); 
               PrintWriter escArc = new PrintWriter(accEsc);
               regi1=jTextArea1.getText();
               escArc.print(regi1); // aaaa
               escArc.print(";");
               regi2=jTextArea2.getText();
               escArc.print(regi2); //aaaaaaa
               escArc.print(";");
               regi3=jTextArea3.getText(); //aaa
               escArc.print(regi3);
               escArc.print(";");
               escArc.println("");
               escArc.close();
           } catch (IOException f) {
        
        }
    }
       public static String [] SepSubCamp(String regProf){
           //Para Separar El Texto Metido En Un Text Area
           String [] nomProf;
           String listProf; 
           String contCara="";
           char car;
           int contSaltLine=0,cont,contNomb=0;
           listProf=regProf;
           listProf=listProf+"\n";
           for(cont=0;cont<listProf.length();cont++) {
                 car=listProf.charAt(cont);
               if(car=='\n')
                 contSaltLine=contSaltLine+1;  
           }
           nomProf=new String[contSaltLine];
           for(cont=0;cont<listProf.length();cont++){
               car=listProf.charAt(cont);
               if(car!='\n'){
                    contCara=contCara+car;
               }
               if(car=='\n' || cont==(listProf.length()-1)){
                   nomProf[contNomb]=contCara;
                   contNomb=contNomb+1;
                   contCara="";
                   car=' ';
               }
               
           }
           return nomProf;
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
