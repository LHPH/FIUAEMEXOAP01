package organizacion;

import java.awt.Color;
import java.awt.Dimension;

import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Point;
import java.awt.Rectangle;

import java.awt.RenderingHints;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.geom.RoundRectangle2D;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import java.io.BufferedWriter;
import java.io.File;

import java.io.FileWriter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class Pestaña11 extends JPanel {
    private JLabel jLabel1 = new JLabel();
    private JLabel jLabel2 = new JLabel();
    private JLabel jLabel3 = new JLabel();
    private JLabel jLabel4 = new JLabel();
    private JLabel jLabel5 = new JLabel();
    private JLabel jLabel6 = new JLabel();
    private JLabel jLabel7 = new JLabel();
    private JLabel jLabel8 = new JLabel();
    private JLabel jLabel9 = new JLabel();
    private JLabel jLabel10 = new JLabel();
    private JLabel jLabel11 = new JLabel();
    private JLabel jLabel12 = new JLabel();
    private JLabel jLabel13 = new JLabel();
    private JScrollPane jScrollPane1 = new JScrollPane();
    private JLabel jLabel14 = new JLabel();
    
    private JLabel jLabel15 = new JLabel();
    private JLabel jLabel16 = new JLabel();
    private JLabel jLabel17 = new JLabel();
    private JLabel jLabel18 = new JLabel();
    private JLabel jLabel19 = new JLabel();
    private JLabel jLabel20 = new JLabel();
    private JLabel jLabel21 = new JLabel();

    private JTextField jTextField4 = new JTextField();
    private JTextField jTextField5 = new JTextField();
    private JTextField jTextField6 = new JTextField();
    private JTextField jTextField7 = new JTextField();
    private JTextField jTextField8 = new JTextField();
    private JTextField jTextField9 = new JTextField();
    private JTextField jTextField10 = new JTextField();
    private JTextField jTextField11 = new JTextField();
    private JTextField jTextField12 = new JTextField();
    private JTextField jTextField13 = new JTextField();
    private JTextArea jTextArea1 = new JTextArea();
    private JScrollPane jScrollPane2 = new JScrollPane();
    private JScrollPane jScrollPane3 = new JScrollPane();
    private JScrollPane jScrollPane4 = new JScrollPane();
    private JScrollPane jScrollPane5 = new JScrollPane();
    private JTextArea jTextArea2 = new JTextArea();
    private JTextArea jTextArea3 = new JTextArea();
    private JTextArea jTextArea4 = new JTextArea();
    private JTextArea jTextArea5 = new JTextArea();
    private JLabel jLabel23 = new JLabel();

    public int CantUnid=1;
    String Path ="Archivos";
    private JTextField jTextField1 = new JTextField();
    private JTextField jTextField2 = new JTextField();
    private JTextField jTextField3 = new JTextField();
    private JTextField jTextField14 = new JTextField();
    private JTextField jTextField15 = new JTextField();
    private JTextField jTextField16 = new JTextField();
    private JTextField jTextField18 = new JTextField();
    private JTextField jTextField19 = new JTextField();
    private JTextField jTextField20 = new JTextField();

    public Pestaña11() {
        super();
        setOpaque(false);
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.setLayout( null );
        this.setSize(new Dimension(762, 732));
        this.setPreferredSize(new Dimension(762,705));
        this.setBackground(Color.black);
       
        jLabel1.setText("*Unidad de aprendizaje:");
        jLabel1.setBounds(new Rectangle(30, 55, 140, 30));
        jLabel1.setFont(new Font("Arial",0,12));
        jLabel1.setForeground(Color.WHITE);
        
        jLabel2.setText("Área de docencia: Geoinformatica");
        jLabel2.setBounds(new Rectangle(30, 125, 205, 25));
        jLabel2.setFont(new Font("Arial",0,12));
        jLabel2.setForeground(Color.WHITE);
        
        jLabel3.setText("*Área de conocimiento");
        jLabel3.setBounds(new Rectangle(30, 90, 135, 30));
        jLabel3.setFont(new Font("Arial",0,12));
        jLabel3.setForeground(Color.WHITE);
        
        jLabel4.setText("*Fecha de elaboración:");
        jLabel4.setBounds(new Rectangle(30, 155, 155, 25));
        jLabel4.setFont(new Font("Arial",0,12));
        jLabel4.setForeground(Color.WHITE);
        
        jLabel5.setText("*Fecha de actualizacion");
        jLabel5.setBounds(new Rectangle(30, 185, 165, 25));
        jLabel5.setFont(new Font("Arial",0,12));
        jLabel5.setForeground(Color.WHITE);
        
        jLabel6.setText("Unidades de aprendizaje simultaneas:");
        jLabel6.setBounds(new Rectangle(30, 230, 270, 25));
        jLabel6.setFont(new Font("Arial",0,12));
        jLabel6.setForeground(Color.WHITE);
        
        jLabel7.setText("*Clave:");
        jLabel7.setBounds(new Rectangle(405, 60, 100, 20));
        jLabel7.setFont(new Font("Arial",0,12));
        jLabel7.setForeground(Color.WHITE);
        
        jLabel8.setText("*Núcleo de formación:");
        jLabel8.setBounds(new Rectangle(375, 90, 130, 25));
        jLabel8.setFont(new Font("Arial",0,12));
        jLabel8.setForeground(Color.WHITE);
        
        jLabel9.setText("*Caracter de la unidad de aprendizaje:");
        jLabel9.setBounds(new Rectangle(375, 125, 230, 25));
        jLabel9.setFont(new Font("Arial",0,12));
        jLabel9.setForeground(Color.WHITE);
        
        jLabel10.setText("*Modalidad:");
        jLabel10.setBounds(new Rectangle(375, 160, 90, 25));
        jLabel10.setFont(new Font("Arial",0,12));
        jLabel10.setForeground(Color.WHITE);
        
        jLabel11.setText("*Horas teóricas:");
        jLabel11.setBounds(new Rectangle(375, 195, 115, 20));
        jLabel11.setFont(new Font("Arial",0,12));
        jLabel11.setForeground(Color.WHITE);
        
        jLabel12.setText("*Horas práctica:");
        jLabel12.setBounds(new Rectangle(550, 195, 125, 20));
        jLabel12.setFont(new Font("Arial",0,12));
        jLabel12.setForeground(Color.WHITE);
        
        jLabel13.setText("*Créditos:");
        jLabel13.setBounds(new Rectangle(380, 235, 95, 25));
        jLabel13.setFont(new Font("Arial",0,12));
        jLabel13.setForeground(Color.WHITE);
        
        jLabel14.setText("*Periodo:");
        jLabel14.setBounds(new Rectangle(535, 60, 105, 25));
        jLabel14.setFont(new Font("Arial",0,12));
        jLabel14.setForeground(Color.WHITE);
        
        jLabel15.setText("Línea o área de acentuación:");
        jLabel15.setBounds(new Rectangle(375, 275, 165, 25));
        jLabel15.setFont(new Font("Arial",0,12));
        jLabel15.setForeground(Color.WHITE);
        
        jLabel16.setText("Unidad de aprendizaje antecedente");
        jLabel16.setBounds(new Rectangle(375, 305, 215, 25));
        jLabel16.setFont(new Font("Arial",0,12));
        jLabel16.setForeground(Color.WHITE);
        
        jLabel17.setText("Unidad de aprendizaje consecuente");
        jLabel17.setBounds(new Rectangle(375, 335, 220, 25));
        jLabel17.setFont(new Font("Arial",0,12));
        jLabel17.setForeground(Color.WHITE);
        
        jLabel18.setText("Elaborado por:");
        jLabel18.setBounds(new Rectangle(365, 495, 150, 30));
        jLabel18.setFont(new Font("Arial",0,12));
        jLabel18.setForeground(Color.WHITE);
        
        jLabel19.setText("Conocimientos:");
        jLabel19.setBounds(new Rectangle(30, 375, 100, 30));
        jLabel19.setFont(new Font("Arial",0,12));
        jLabel19.setForeground(Color.WHITE);
        
        jLabel20.setText("Habilidades:");
        jLabel20.setBounds(new Rectangle(365, 380, 80, 25));
        jLabel20.setFont(new Font("Arial",0,12));
        jLabel20.setForeground(Color.WHITE);
        
        jLabel21.setText("Actualizado por:");
        jLabel21.setBounds(new Rectangle(30, 495, 200, 30));
        jLabel21.setFont(new Font("Arial",0,12));
        jLabel21.setForeground(Color.WHITE);


        jTextField4.setBounds(new Rectangle(215, 160, 45, 25));


        jTextField5.setBounds(new Rectangle(260, 160, 45, 25));

        
        jTextField6.setBounds(new Rectangle(305, 160, 45, 25));


        
        jTextField7.setBounds(new Rectangle(215, 190, 45, 25));

        
        jTextField8.setBounds(new Rectangle(260, 190, 45, 25));

        jTextField9.setBounds(new Rectangle(305, 190, 45, 25));

        jTextField10.setBounds(new Rectangle(450, 60, 75, 25));
        
        jTextField11.setBounds(new Rectangle(475, 195, 50, 25));
        
        jTextField12.setBounds(new Rectangle(647, 195, 50, 25));
        
        jTextField13.setBounds(new Rectangle(445, 235, 50, 25));


        jTextArea1.setFont(new Font("Arial",0,12));
        jTextArea2.setFont(new Font("Arial",0,12));
        jTextArea3.setFont(new Font("Arial",0,12));
        jTextArea4.setFont(new Font("Arial",0,12));
        jTextArea5.setFont(new Font("Arial",0,12));


        jLabel23.setText("I. IDENTIFICACION DEL CURSO");
        jLabel23.setBounds(new Rectangle(40, 20, 275, 30));
        jLabel23.setForeground(Color.white);


        jTextField1.setBounds(new Rectangle(600, 55, 120, 30));
        jTextField2.setBounds(new Rectangle(505, 90, 120, 25));
        jTextField3.setBounds(new Rectangle(590, 120, 130, 30));
        jTextField14.setBounds(new Rectangle(450, 155, 130, 25));
        jTextField15.setBounds(new Rectangle(170, 55, 230, 25));
        jTextField16.setBounds(new Rectangle(170, 95, 180, 25));
        jTextField18.setBounds(new Rectangle(540, 275, 210, 25));
        jTextField19.setBounds(new Rectangle(580, 305, 170, 25));
        jTextField20.setBounds(new Rectangle(580, 340, 170, 20));
        jScrollPane2.setBounds(new Rectangle(25, 405, 295, 80));
        jScrollPane3.setBounds(new Rectangle(365, 405, 285, 85));
        jScrollPane4.setBounds(new Rectangle(20, 525, 320, 130));
        jScrollPane5.setBounds(new Rectangle(365, 525, 370, 130));
        jScrollPane1.setBounds(new Rectangle(30, 260, 320, 95));


        jScrollPane5.getViewport().add(jTextArea5, null);
        this.add(jTextField20, null);
        this.add(jTextField19, null);
        this.add(jTextField18, null);
        this.add(jTextField16, null);
        this.add(jTextField15, null);
        this.add(jTextField14, null);
        this.add(jTextField3, null);
        this.add(jTextField2, null);
        this.add(jTextField1, null);
        this.add(jLabel23, null);
        this.add(jScrollPane5, null);
        jScrollPane4.getViewport().add(jTextArea4, null);
        this.add(jScrollPane4, null);
        jScrollPane3.getViewport().add(jTextArea3, null);
        this.add(jScrollPane3, null);
        jScrollPane2.getViewport().add(jTextArea2, null);
        this.add(jScrollPane2, null);
        this.add(jTextField13, null);
        this.add(jTextField12, null);
        this.add(jTextField11, null);
        this.add(jTextField10, null);
        this.add(jTextField9, null);
        this.add(jTextField8, null);
        this.add(jTextField7, null);
        this.add(jTextField6, null);
        this.add(jTextField5, null);
        this.add(jTextField4, null);
        this.add(jLabel14, null);
        jScrollPane1.getViewport().add(jTextArea1, null);
        this.add(jScrollPane1, null);
        this.add(jLabel13, null);
        this.add(jLabel12, null);
        this.add(jLabel11, null);
        this.add(jLabel10, null);
        this.add(jLabel9, null);
        this.add(jLabel8, null);
        this.add(jLabel7, null);
        this.add(jLabel6, null);
        this.add(jLabel5, null);
        this.add(jLabel4, null);
        this.add(jLabel3, null);
        this.add(jLabel2, null);
        this.add(jLabel1, null);
        this.add(jLabel15, null);
        this.add(jLabel16, null);
        this.add(jLabel17, null);
        this.add(jLabel18, null);
        this.add(jLabel19, null);
        this.add(jLabel20, null);
        this.add(jLabel21, null);
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
        int pos=0;
        int ind=0;
        String fecha[]= new String[3];
        String hora[]=new String[3];
        jTextField15.setText(cadb[0]);
        jTextField15.setEnabled(false);
        jTextField16.setText(cadb[1]);
        jTextField16.setEnabled(false);
        jTextField10.setText(cadb[3]);
        jTextField10.setEnabled(false);
        jTextField1.setText(cadb[4]);
        jTextField1.setEnabled(false);
        jTextField2.setText(cadb[5]);
        jTextField2.setEnabled(false);
        jTextField3.setText(cadb[6]);
        jTextField3.setEnabled(false);
        jTextField14.setText(cadb[7]);
        jTextField14.setEnabled(false);
        for(ind=0;ind<3;ind++){
            pos=cadb[8].indexOf("#");
            if(pos!=-1){
                hora[ind]=cadb[8].substring(0, pos);
                cadb[8]=cadb[8].substring(pos+1);
            }
            else{
                hora[ind]=cadb[8];
                break;
                }
        }        
        jTextField11.setText(hora[0]);
        jTextField11.setEnabled(false);
        jTextField12.setText(hora[1]);
        jTextField12.setEnabled(false);
        jTextField13.setText(hora[2]);
        jTextField13.setEnabled(false);
        jTextField18.setText(cadb[9]);
        jTextField18.setEnabled(false);
        jTextField19.setText(cadb[10]);
        jTextField19.setEnabled(false);
        jTextField20.setText(cadb[11]);
        jTextField20.setEnabled(false);
        for(ind=0;ind<3;ind++){
            pos=cadb[12].indexOf("#");
            if(pos!=-1){
                fecha[ind]=cadb[12].substring(0, pos);
                cadb[12]=cadb[12].substring(pos+1);
            }
            else{
                fecha[ind]=cadb[12];
                break;
                }
            }        
        jTextField4.setText(fecha[0]);
        jTextField4.setEnabled(false);
        jTextField5.setText(fecha[1]);
        jTextField5.setEnabled(false);
        jTextField6.setText(fecha[2]);
        jTextField6.setEnabled(false);
        for(ind=0;ind<3;ind++){
            pos=cadb[13].indexOf("#");
            if(pos!=-1){
                fecha[ind]=cadb[13].substring(0, pos);
                cadb[13]=cadb[13].substring(pos+1);
            }
            else{
                fecha[ind]=cadb[13];
                break;
                }
            }        
        jTextField7.setText(fecha[0]);
        jTextField7.setEnabled(false);
        jTextField8.setText(fecha[1]);
        jTextField8.setEnabled(false);
        jTextField9.setText(fecha[2]);
        jTextField9.setEnabled(false);
        jTextArea1.setText(cadb[14]);
        jTextArea1.setEnabled(false);
        jTextArea2.setText(cadb[15]);
        jTextArea2.setEnabled(false);
        jTextArea3.setText(cadb[16]);
        jTextArea3.setEnabled(false);
        jTextArea4.setText(cadb[17]);
        jTextArea4.setEnabled(false);
        jTextArea5.setText(cadb[18]);
        jTextArea5.setEnabled(false);
        }

}