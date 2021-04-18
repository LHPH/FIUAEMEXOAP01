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

public class Pestaña1 extends JPanel {
    private String [] Materi ={"","Introduccion a la geoinformatica","Matematica Espacial Basica","Introduccion a la Cartografia","Geosistema natural","Algoritmos y Estructuras de Datos",
                               "Matematica Espacial Intermedia","Topografia Basica","Metodos de Representacion Cartografica","Geosistema Social","Programacion Orientada a Objetos",
                               "Matematica Espacial Avanzada","Geodesia","Cartografia automatizada","Analisis del geosistema natural","Diseño e Implementacion de Bases De Datos","Probabilidad y Estadistica",
                               "Fotogrametria","Sistemas de Informacion Geografica","Analisis de Geosistema social","Modelos Avanzados de bases de datos","Geodestadistica","Ingles C1","Fundamentos De Percepcion Remota",
                               "Operaciones de Analisis Espacial","Metodos y Tecnicas de Planeacion","Ingenieria de Software","Ingles C2","Tratamiento Digital De Imagenes","Diseño e Instrumentacion de los sistemas de informacion geografica",
                               "Orientacion del Territorio","Fundamentos De Sistemas Distribuidos","Desarrollo regional","Servicios de Informacion Geografica Distribuidos","Formulacion De Proyectos De Investigacion",
                               "Evaluacion de Riesgos e Impacto Territorial"," Administracion de Proyectos De Software","Desarrollo De Proyectos De Investigacion","Modelacion de procesos ambientales en ambiente de sistemas de informacion geografica","Edicion Cartografica Digital",
        "Modelacion de procesos socioeconomicos en ambiente de sistemas de informacion geografica.","Edicion de Atlas Digital","Organizacion de Procesos en sistemas de informacion.","Programacion En Ambiente de sistemas de informacion geografica",
                               "Sistemas De Apoyo a las Decisiones Espaciales","Estructuracion de Sistemas De Consulta","Metodos De estandarizacion de sistemas de consulta","Geomarketing", 
        "Modelacion geodestadistica en ambiente de sistemas.","Geoestadistica aplicada","Ingles Cientifico-Tecnico 1","Ingles Cientifico-Tecnico 2","Analisis De Algoritmos","Sistemas Para El Soporte de decisiones",
                               "Desarrollo de Proyectos Geotecnologicos","Mineria de datos geoespaciales","Infraestructura de datos espaciales","seminario de innovaciones geotecnologicas","Seminario de administracion estrategica",
                               "Topografia digital con metodos indirectos","Fotogrametria digital","Sistemas Avanzados de georeferenciacion","Hiperclasificacion multiespectral","Clasificacion de imagenes meteorologicas y de radar",
                               "Redes Neuronales y series de tiempo.","Edicion de atlas digital","Sistemas de catastro"};
    private String [] LinAcen ={"","Sistemas De Informacion Geografica","Desarrollo De Sistemas Geotecnologicos",
        "Percepcion Remota y Cartografia"};
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
    private JRadioButton jRadioButton1 = new JRadioButton();
    private JRadioButton jRadioButton2 = new JRadioButton();
    private JRadioButton jRadioButton3 = new JRadioButton();
    private JRadioButton jRadioButton4 = new JRadioButton();
    private JRadioButton jRadioButton5 = new JRadioButton();
    private JTextField jTextField11 = new JTextField();
    private JTextField jTextField12 = new JTextField();
    private JTextField jTextField13 = new JTextField();
    private JComboBox jComboBox1 = new JComboBox();
    private JTextArea jTextArea1 = new JTextArea();
    private JComboBox jComboBox2 = new JComboBox();
    private JComboBox jComboBox3 = new JComboBox(LinAcen);
    private JComboBox jComboBox4 = new JComboBox(Materi);
    private JComboBox jComboBox5 = new JComboBox(Materi);
    private JScrollPane jScrollPane2 = new JScrollPane();
    private JScrollPane jScrollPane3 = new JScrollPane();
    private JScrollPane jScrollPane4 = new JScrollPane();
    private JScrollPane jScrollPane5 = new JScrollPane();
    private JTextArea jTextArea2 = new JTextArea();
    private JTextArea jTextArea3 = new JTextArea();
    private JTextArea jTextArea4 = new JTextArea();
    private JTextArea jTextArea5 = new JTextArea();
    private JLabel jLabel23 = new JLabel();
    private String [] AreCon = {"","Basica-Metodologica","Geotecnologias","Analisis Espacial",
        "Computacion e Informatica"};
    private JComboBox jComboBox7 = new JComboBox(Materi);
    private JComboBox jComboBox8 = new JComboBox(AreCon);
    public int CantUnid=1;
    String Path ="Archivos";
    

    public Pestaña1() {
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
        this.setSize(new Dimension(789, 732));
        this.setPreferredSize(new Dimension(762,732));
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
        jLabel7.setBounds(new Rectangle(375, 60, 100, 20));
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
        jLabel14.setBounds(new Rectangle(505, 60, 105, 25));
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

        jTextField4.setText("Dia");
        jTextField4.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    jTextField4_mouseClicked(e);
                }
            });
        jTextField5.setBounds(new Rectangle(260, 160, 45, 25));
        jTextField5.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    jTextField5_mouseClicked(e);
                }
            });
        jTextField5.setText("Mes");
        
        jTextField6.setBounds(new Rectangle(305, 160, 45, 25));
        jTextField6.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    jTextField6_mouseClicked(e);
                }
            });

        jTextField6.setText("Año");
        
        jTextField7.setBounds(new Rectangle(215, 190, 45, 25));
        jTextField7.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    jTextField7_mouseClicked(e);
                }
            });

        jTextField7.setText("Dia");
        
        jTextField8.setBounds(new Rectangle(260, 190, 45, 25));
        jTextField8.setText("Mes");
        jTextField8.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    jTextField8_mouseClicked(e);
                }
            });
        jTextField9.setBounds(new Rectangle(305, 190, 45, 25));
        jTextField9.setText("Año");
        jTextField9.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    jTextField9_mouseClicked(e);
                }
            });
        jTextField10.setBounds(new Rectangle(425, 60, 75, 25));
        
        jTextField11.setBounds(new Rectangle(475, 195, 50, 25));
        
        jTextField12.setBounds(new Rectangle(647, 195, 50, 25));
        
        jTextField13.setBounds(new Rectangle(445, 235, 50, 25));

        jRadioButton1.setBounds(new Rectangle(515, 90, 65, 25));
        jRadioButton1.setText("Basico");
        jRadioButton1.setContentAreaFilled(false);
        jRadioButton1.setForeground(Color.WHITE);

        jRadioButton1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jRadioButton1_actionPerformed(e);
                }
            });
        jRadioButton2.setText("Sustantivo");
        jRadioButton2.setBounds(new Rectangle(575, 90, 80, 25));
        jRadioButton2.setContentAreaFilled(false);
        jRadioButton2.setForeground(Color.WHITE);

        jRadioButton2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jRadioButton2_actionPerformed(e);
                }
            });
        jRadioButton3.setText("Integral");
        jRadioButton3.setBounds(new Rectangle(660, 90, 90, 25));
        jRadioButton3.setContentAreaFilled(false);
        jRadioButton3.setForeground(Color.WHITE);

        jRadioButton3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jRadioButton3_actionPerformed(e);
                }
            });
        jRadioButton4.setText("Presencial");
        jRadioButton4.setBounds(new Rectangle(455, 160, 95, 25));
        jRadioButton4.setContentAreaFilled(false);
        jRadioButton4.setForeground(Color.WHITE);

        jRadioButton4.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jRadioButton4_actionPerformed(e);
                }
            });
        jRadioButton5.setText("Distancia");
        jRadioButton5.setBounds(new Rectangle(560, 160, 95, 25));
        jRadioButton5.setContentAreaFilled(false);
        jRadioButton5.setForeground(Color.WHITE);

        jRadioButton5.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jRadioButton5_actionPerformed(e);
                }
            });
        jComboBox1.setBounds(new Rectangle(565, 60, 105, 25));
        jComboBox1.addItem("Primero");
        jComboBox1.addItem("Segundo");
        jComboBox1.addItem("Tercero");
        jComboBox1.addItem("Cuarto");
        jComboBox1.addItem("Quinto");
        jComboBox1.addItem("Sexto");
        jComboBox1.addItem("Septimo");
        jComboBox1.addItem("Octavo");
        jComboBox1.addItem("Noveno");
        jComboBox1.addItem("Decimo");
        
        jTextArea1.setFont(new Font("Arial",0,12));
        jTextArea2.setFont(new Font("Arial",0,12));
        jTextArea3.setFont(new Font("Arial",0,12));
        jTextArea4.setFont(new Font("Arial",0,12));
        jTextArea5.setFont(new Font("Arial",0,12));

        jComboBox2.setBounds(new Rectangle(595, 125, 110, 25));
        jComboBox2.addItem("Obligatoria");
        jComboBox2.addItem("Optativa");
        
        jComboBox3.setBounds(new Rectangle(580, 275, 170, 25));
        jComboBox3.addMouseListener(new ToolTips(jComboBox3)); 
        
        jComboBox4.setBounds(new Rectangle(580, 305, 170, 25));
        jComboBox4.setFont(new Font("Arial",0,10));
        jComboBox4.addMouseListener(new ToolTips(jComboBox4)); 
        
        jComboBox5.setBounds(new Rectangle(580, 335, 170, 25));
        jComboBox5.setFont(new Font("Arial",0,10));
        jComboBox5.addMouseListener(new ToolTips(jComboBox5));

        jLabel23.setText("I. IDENTIFICACION DEL CURSO");
        jLabel23.setBounds(new Rectangle(40, 20, 275, 30));
        jLabel23.setForeground(Color.white);
        jComboBox7.setBounds(new Rectangle(170, 60, 195, 25));
        jComboBox7.setFont(new Font("Arial",0,11));
        jComboBox7.addMouseListener(new ToolTips(jComboBox7));
    
        jComboBox8.setBounds(new Rectangle(170, 95, 195, 25));

        jScrollPane2.setBounds(new Rectangle(25, 405, 295, 80));
        jScrollPane3.setBounds(new Rectangle(365, 405, 285, 85));
        jScrollPane4.setBounds(new Rectangle(20, 525, 320, 130));
        jScrollPane5.setBounds(new Rectangle(365, 525, 370, 130));
        jScrollPane1.setBounds(new Rectangle(30, 260, 320, 95));


        jScrollPane5.getViewport().add(jTextArea5, null);
        this.add(jComboBox8, null);
        this.add(jComboBox7, null);
        this.add(jLabel23, null);
        this.add(jScrollPane5, null);
        jScrollPane4.getViewport().add(jTextArea4, null);
        this.add(jScrollPane4, null);
        jScrollPane3.getViewport().add(jTextArea3, null);
        this.add(jScrollPane3, null);
        jScrollPane2.getViewport().add(jTextArea2, null);
        this.add(jScrollPane2, null);
        this.add(jComboBox2, null);
        this.add(jComboBox1, null);
        this.add(jComboBox3, null);
        this.add(jComboBox4, null);
        this.add(jComboBox5, null);
        this.add(jTextField13, null);
        this.add(jTextField12, null);
        this.add(jTextField11, null);
        this.add(jRadioButton5, null);
        this.add(jRadioButton4, null);
        this.add(jRadioButton3, null);
        this.add(jRadioButton2, null);
        this.add(jRadioButton1, null);
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
    
/*Metodo Que Comprobara si todos los campos estan llenos
 * Hecho Por Luis Humberto Ponce Hermosillo 24 de Mayo del 2012*/
    public boolean Guardar(){   
        if(CompTextField()==true){
            if(CompRadioButton()==true){
                if(CompAreaText()==true){
                    if(CompMat()==true){
                        return true;
                    }
                }
            }
            
        }
        return false;
    }
    
    /*Metodo Que Comprobara si los jTextField estan llenos
     * Hecho Por Luis Humberto Ponce Hermosillo 24 de Mayo del 2012*/
    public boolean CompTextField(){
        boolean ind,ind0,ind1,ind2,ind3,ind4,ind5,ind6,ind7,ind8,ind9,ind10,ind11,ind12,ind13,ind14;
        ind=jTextField4.getText().equals("");
        ind0=jTextField5.getText().equals("");
        ind1=jTextField6.getText().equals("");
        ind2=jTextField7.getText().equals("");
        ind3=jTextField8.getText().equals("");
        ind14=jTextField9.getText().equals("");
        
        ind4=jTextField4.getText().equals("Dia");
        ind5=jTextField5.getText().equals("Mes");
        ind6=jTextField6.getText().equals("Año");
        ind7=jTextField7.getText().equals("Dia");
        ind8=jTextField8.getText().equals("Mes");
        ind9=jTextField9.getText().equals("Año");
        ind10=jTextField10.getText().equals("");
        ind11=jTextField11.getText().equals("");
        ind12=jTextField12.getText().equals("");
        ind13=jTextField13.getText().equals("");
        if((ind4==true && ind5==true && ind6==true&& ind7==true && ind8==true && ind9==true || ind==true && ind0==true && ind1==true && ind2==true && ind3==true && ind14==true)
           && ind10==true && ind11==true && ind12==true && ind13==true){
               JOptionPane.showMessageDialog(this,"Faltan Campos Por Llenar","Error: Seccion I",JOptionPane.WARNING_MESSAGE);
               return false;
           }
        else{
               if(ind4  || ind){
                            JOptionPane.showMessageDialog(this,"Falta Llenar Dia De Elaboracion","Error: Seccion I",JOptionPane.WARNING_MESSAGE);
                        }
                        else{
                            if(ind5 || ind0){
                                JOptionPane.showMessageDialog(this,"Falta Llenar Mes De Elaboracion","Error: Seccion I",JOptionPane.WARNING_MESSAGE);
                            }
                            else{
                                if(ind6 || ind1){
                                    JOptionPane.showMessageDialog(this,"Falta Llenar Año De Elaboracion","Error: Seccion I",JOptionPane.WARNING_MESSAGE);
                                }
                                else{
                                    if(ind7 || ind2){
                                        JOptionPane.showMessageDialog(this,"Falta Llenar Dia De Ultima Actualizacion","Error: Seccion I",JOptionPane.WARNING_MESSAGE);
                                    }
                                    else{
                                        if(ind8 || ind3){
                                            JOptionPane.showMessageDialog(this,"Falta Llenar Mes De Ultima Actualizacion","Error: Seccion I",JOptionPane.WARNING_MESSAGE);
                                        }
                                        else{
                                            if(ind9 || ind14){
                                                JOptionPane.showMessageDialog(this,"Falta Llenar Año De Ultima Actualizacion","Error: Seccion I",JOptionPane.WARNING_MESSAGE);
                                            }
                                            else{
                                                if(ind10){
                                                    JOptionPane.showMessageDialog(this,"Falta Llenar Clave De Unidad De Aprendizaje","Error: Seccion I",JOptionPane.WARNING_MESSAGE);
                                                }
                                                else{
                                                    if(ind11){
                                                        JOptionPane.showMessageDialog(this,"Falta Llenar Horas Teoricas","Error: Seccion I",JOptionPane.WARNING_MESSAGE);
                                                    }
                                                    else{
                                                        if(ind12){
                                                            JOptionPane.showMessageDialog(this,"Falta Llenar Horas Practicas","Error: Seccion I",JOptionPane.WARNING_MESSAGE);
                                                        }
                                                        else{
                                                            if(ind13){
                                                                JOptionPane.showMessageDialog(this,"Falta Creditos De Unidad","Error: Seccion I",JOptionPane.WARNING_MESSAGE);
                                                            }
                                                            else{
                                                                //
                                                                return true;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
        return false;
    }
    
    /*Metodo Que Comprobara si los jRadioButton estan llenos
     * Hecho Por Luis Humberto Ponce Hermosillo 24 de Mayo del 2012*/   
    public boolean CompRadioButton(){
        boolean ind,ind2,ind3,ind4,ind5;
        ind=jRadioButton1.isSelected();
        ind2=jRadioButton2.isSelected();
        ind3=jRadioButton3.isSelected();
        ind4=jRadioButton4.isSelected();
        ind5=jRadioButton5.isSelected();
            if(ind==false && ind2==false && ind3==false){
                JOptionPane.showMessageDialog(this,"Falta Escoger Nucleo Formativo","Error: Seccion I",JOptionPane.WARNING_MESSAGE); ;
            }
            else{
                if(ind4==false && ind5==false){
                    JOptionPane.showMessageDialog(this,"Falta Escoger Modalidad","Error: Seccion I",JOptionPane.WARNING_MESSAGE); ;
                    }
                else{
                    return true;
                }
                }
            
        return false;
    }
    /*Metodo Que Comprobara si los jTextArea estan llenos
     * Hecho Por Luis Humberto Ponce Hermosillo 24 de Mayo del 2012*/
    public boolean CompAreaText(){
        boolean ind,ind2,ind3,ind4,ind5;
        ind=jTextArea1.getText().equals(""); 
        ind2=jTextArea2.getText().equals(""); 
        ind3=jTextArea3.getText().equals(""); 
        ind4=jTextArea4.getText().equals(""); 
        ind5=jTextArea5.getText().equals(""); 
            if(ind){
                JOptionPane.showMessageDialog(this,"Falta Llenar Unidades De Aprendizaje Simultaneas","Error: Seccion I",JOptionPane.WARNING_MESSAGE);
            }
            else{
                if(ind2){
                    JOptionPane.showMessageDialog(this,"Falta Llenar Conocimientos","Error: Seccion I",JOptionPane.WARNING_MESSAGE);
                }
                else{
                    if(ind3){
                        JOptionPane.showMessageDialog(this,"Falta Llenar Habilidades","Error: Seccion I",JOptionPane.WARNING_MESSAGE);
                    }
                    else{
                        if(ind4){
                            JOptionPane.showMessageDialog(this,"Falta Llenar Programa Elaborado Por:","Error: Seccion I",JOptionPane.WARNING_MESSAGE);
                        }
                        else{
                            if(ind5){
                                JOptionPane.showMessageDialog(this,"Falta Llenar Programa Actualizado Por:","Error: Seccion I",JOptionPane.WARNING_MESSAGE);
                            }
                            else{
                                return true;
                            }
                        }
                    }
                }  
        }
        return false; 
    }
    
    /*Metodo Que Comprobara si los jComboBox estan llenos y no se repiten
     * Hecho Por Luis Humberto Ponce Hermosillo 24 de Mayo del 2012*/
    public boolean CompMat(){
        int ind,ind2,ind3,ind4;
        ind=jComboBox4.getSelectedIndex();
        ind2=jComboBox5.getSelectedIndex();
        ind3=jComboBox7.getSelectedIndex();
        ind4=jComboBox8.getSelectedIndex();
        if(ind3==0){
            JOptionPane.showMessageDialog(this,"Faltan Escoger Unidad De Aprendizaje","Error:Seccion I",JOptionPane.WARNING_MESSAGE);
           return false;
        }
        else{
            if(ind4==0){
                JOptionPane.showMessageDialog(this,"Faltan Escoger Area De Conocimiento","Error:Seccion I",JOptionPane.WARNING_MESSAGE);
            }
            else{
                if(ind==ind2 && ind>0){
                    JOptionPane.showMessageDialog(this,"La Unidad Consecuente no puede ser la misma que la antecedente","Error:Seccion I",JOptionPane.WARNING_MESSAGE);
                    return false;
                }
                else{
                    return true;
                }      
            }             
        }
        return false;
    }
    
    private void jTextField4_mouseClicked(MouseEvent e) {
        jTextField4.setText("");
    }
    
    private void jTextField5_mouseClicked(MouseEvent e) {
        jTextField5.setText("");
    }
    
    private void jTextField6_mouseClicked(MouseEvent e) {
        jTextField6.setText("");
    }
    
    private void jTextField7_mouseClicked(MouseEvent e) {
        jTextField7.setText("");
    }
    
    private void jTextField8_mouseClicked(MouseEvent e) {
        jTextField8.setText("");
    }
    
    private void jTextField9_mouseClicked(MouseEvent e) {
        jTextField9.setText("");
    }

    private void jRadioButton1_actionPerformed(ActionEvent e) {
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
    }

    private void jRadioButton2_actionPerformed(ActionEvent e) {
        jRadioButton1.setSelected(false);
        jRadioButton3.setSelected(false);
    }

    private void jRadioButton3_actionPerformed(ActionEvent e) {
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
    }

    private void jRadioButton4_actionPerformed(ActionEvent e) {
        jRadioButton5.setSelected(false);
        
    }

    private void jRadioButton5_actionPerformed(ActionEvent e) {
        jRadioButton4.setSelected(false);
        
    }
    
    public void paintComponent(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    //g2.setPaint(new GradientPaint(new Point(0, 0), new Color(176, 207, 158), new Point(0, getHeight() / 2),new Color(57, 99, 0))); 
    g2.setPaint(new GradientPaint(new Point(0, 0), new Color(57, 99, 0), new Point(0, getHeight()),new Color(57, 99, 0)));
    g2.fillRect(0,0,getWidth(),getHeight());
    super.paintComponent(g);
    }
    
    /*Metodo Que Escribira la informacion en el archivo
     * Hecho Por Luis Humberto Ponce Hermosillo 24 de Mayo del 2012*/
    public void Escribir(){
        File arc = new File(Path,"Unidades.txt");
        BufferedWriter accesc;
        try {
            accesc = new BufferedWriter(new FileWriter(arc,true));
            PrintWriter esc = new PrintWriter(accesc);
            esc.print(jComboBox7.getSelectedItem().toString()); //Unidad De Aprendizaje
            esc.print(";");
            esc.print(jComboBox8.getSelectedItem().toString());  //Area Del Conocimiento
            esc.print(";");
            esc.print("Geoinformatica");
            esc.print(";");
            esc.print(jTextField10.getText()); //Clave
            esc.print(";");
            esc.print(jComboBox1.getSelectedItem().toString()); //Periodo
            esc.print(";");
            if(jRadioButton1.isSelected()==true){ //nucleo de formacion
                esc.print("Basico");
            }
            if(jRadioButton2.isSelected()==true){
                esc.print("Sustantivo");
            }
            if(jRadioButton3.isSelected()==true){
                esc.print("Integral");
            }
            esc.print(";");
            esc.print(jComboBox2.getSelectedItem().toString()); //caracterr de la unidad
            esc.print(";");
            if(jRadioButton4.isSelected()==true){
                esc.print("Presencial");
            }
            if(jRadioButton5.isSelected()==true){
                esc.print("Distancia");
            }
            esc.print(";");
            esc.print(jTextField11.getText()); //Horas Toricas
            esc.print("#");
            esc.print(jTextField12.getText()); //Horas Practicas
            esc.print("#");
            esc.print(jTextField13.getText());  //Creditos
            esc.print(";");
            if(jComboBox3.getSelectedIndex()!=0){  //Linea
                esc.print(jComboBox3.getSelectedItem().toString());
                esc.print(";");
            }
            else{
                esc.print("Sin Linea");
                esc.print(";");
            }
            if(jComboBox4.getSelectedIndex()!=0){
                esc.print(jComboBox4.getSelectedItem().toString());  //antecedente
                esc.print(";");
            }
            else{
                esc.print("Ninguna");
                esc.print(";");
            }
            if(jComboBox5.getSelectedIndex()!=0){
                esc.print(jComboBox5.getSelectedItem().toString());  //Consecuente
                esc.print(";");
            }
            else{
                esc.print("Ninguna");
                esc.print(";");
            }
            //Fecha De Elaboracion
            esc.print(jTextField4.getText());
            esc.print("#");
            esc.print(jTextField5.getText());
            esc.print("#");
            esc.print(jTextField6.getText());
            esc.print(";");
            //Fecha De Actualizacion
            esc.print(jTextField7.getText());
            esc.print("#");
            esc.print(jTextField8.getText());
            esc.print("#");
            esc.print(jTextField9.getText());
            esc.print(";");
            //Unidades Simultaneas
            esc.print(jTextArea1.getText());
            esc.print(";");
            //Conocimientos
            esc.print(jTextArea2.getText());
            esc.print(";");
            esc.print(jTextArea3.getText());
            esc.print(";");
            //Elaborado por
            esc.print(jTextArea4.getText());
            esc.print(";");
            //Actualizado por
            esc.print(jTextArea5.getText());
            esc.print(";");
            esc.close();
        } catch (IOException e) {
        }
        
    }


    void Profesores(){
        File arc = new File(Path,"ProfUnid.txt");
        BufferedWriter accesc;
        try {
            accesc = new BufferedWriter(new FileWriter(arc,true));
            PrintWriter esc = new PrintWriter(accesc);
            esc.print(jComboBox7.getSelectedItem().toString()); //Unidad De Aprendizaje
            esc.print(";");
            esc.print(EliminarSalto(jTextArea4.getText()));
            esc.print("|");
            esc.println("");
            esc.close();
        }catch(IOException e){}
    }

    /*Metodo Que Elimina El Salto De Linea Que Tienen Los TextAreas Hecho Por Luis Humberto Ponce 31 de Mayo*/
    public static String EliminarSalto(String text){
        String Are =text,Are2="";
        int cont;
        char carac;
        for(cont=0;cont<text.length();cont++){
            carac=text.charAt(cont);
            if(carac!='\n'){
                Are2=Are2+carac;
            }
            else{
                Are2=Are2+"#";
            }
        }
        return Are2;
    }
    
    
    public void establecer2(String cadb [] ){
        int pos=0;
        int ind=0;
        String fecha[]= new String[3];
        String hora[]=new String[3];
        jComboBox7.setSelectedItem(cadb[0]);
        
        jComboBox8.setSelectedItem(cadb[1]);
         
        jTextField10.setText(cadb[3]);
       
        jComboBox1.setSelectedItem(cadb[4]);
        
        if(cadb[5].equals("Basico")==true){
            jRadioButton1.setSelected(true);
        }
        if(cadb[5].equals("Sustantivo")==true){
            jRadioButton2.setSelected(true);
            
        }
        if(cadb[5].equals("Integral")==true){
            jRadioButton1.setSelected(true);    
        }
        jComboBox2.setSelectedItem(cadb[6]);
        if(cadb[7].equals("Presencial")==true){
            jRadioButton4.setSelected(true);
        }
        else{
            jRadioButton5.setSelected(true);
        }
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
        
        jTextField12.setText(hora[1]);
        
        jTextField13.setText(hora[2]);
       
        jComboBox3.setSelectedItem(cadb[9]);
       
        jComboBox4.setSelectedItem(cadb[10]);
       
        jComboBox5.setSelectedItem(cadb[11]);
       
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
       
        jTextField5.setText(fecha[1]);
       
        jTextField6.setText(fecha[2]);
       
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
       
        jTextField8.setText(fecha[1]);
      
        jTextField9.setText(fecha[2]);
       
        jTextArea1.setText(cadb[14]);
       
        jTextArea2.setText(cadb[15]);
       
        jTextArea3.setText(cadb[16]);
       
        jTextArea4.setText(cadb[17]);
       
        jTextArea5.setText(cadb[18]);
    }

    //Clase que implementa los tooltips en los comboBox
    class ToolTips implements MouseListener{
        JComboBox Com;
        public ToolTips (JComboBox combo){
            Com=combo;
        }

        public void mouseClicked(MouseEvent e) {
        }

        public void mousePressed(MouseEvent e) {
        }

        public void mouseReleased(MouseEvent e) {
        }

        public void mouseEntered(MouseEvent e) {
                Com.setToolTipText(Com.getSelectedItem().toString());
        }
        public void mouseExited(MouseEvent e) {
        }
    }
}
