package organizacion;

//Editor de la vetana:Luis Ernesto Sierra Alva 
//Fecha de edicion: 17 de mayo del 2012
/* Modificaciones realizadas:
 * 1: Fecha: 24 de mayo de 2012, Modificaciones hechas: agregar el metodo validar y llenado, retoces en la parte visual y empezar con la documentacion*/

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;

import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Pestaña13 extends JPanel {
    private JLabel jLabel1 = new JLabel();
    private JTextField jTextField1 = new JTextField();
    private JLabel jLabel2 = new JLabel();
    private JTextField jTextField2 = new JTextField();
    private JLabel jLabel3 = new JLabel();
    private JLabel jLabel4 = new JLabel();
    private JLabel jLabel5 = new JLabel();
    private JSeparator jSeparator1 = new JSeparator();
    private JLabel jLabel6 = new JLabel();
    private JSeparator jSeparator3 = new JSeparator();
    private JSeparator jSeparator5 = new JSeparator();
    private JLabel jLabel7 = new JLabel();
    private JLabel jLabel8 = new JLabel();
    private JLabel jLabel9 = new JLabel();
    private JTextField jTextField3 = new JTextField();
    private JTextField jTextField4 = new JTextField();
    private JTextField jTextField5 = new JTextField();
    private JLabel jLabel10 = new JLabel();
    private JLabel jLabel11 = new JLabel();
    private JLabel jLabel12 = new JLabel();
    private JSeparator jSeparator6 = new JSeparator();
    private JSeparator jSeparator2 = new JSeparator();
    private JScrollPane jScrollPane8 = new JScrollPane();
    private JScrollPane jScrollPane9 = new JScrollPane();
    private JScrollPane jScrollPane10 = new JScrollPane();
    private JScrollPane jScrollPane11 = new JScrollPane();
    private JScrollPane jScrollPane12 = new JScrollPane();
    private JScrollPane jScrollPane13 = new JScrollPane();
    private JTextArea jTextArea1 = new JTextArea();
    private JTextArea jTextArea2 = new JTextArea();
    private JTextArea jTextArea3 = new JTextArea();
    private JTextArea jTextArea4 = new JTextArea();
    private JTextArea jTextArea5 = new JTextArea();
    private JTextArea jTextArea6 = new JTextArea();
    private JButton jButton2 = new JButton();
    private JSeparator jSeparator4 = new JSeparator();
    private JLabel jLabel13 = new JLabel();
    private JSeparator jSeparator7 = new JSeparator();
    boolean ynd;
    String Path="Archivos";
    int numU=1;
    int NUM=0;
    int numU2=0;
    String []vl2= new String[10];
    String  num="1";
    int nu=0;
    int nuu=1;
    String linea="";
    private JButton jButton1 = new JButton();
    Pestaña1 Pest1;
    private JPanel jPanel1 = new JPanel();
    private JLabel jLabel14 = new JLabel();
    private JTextField jTextField6 = new JTextField();
    private JButton jButton3 = new JButton();
    private JLabel jLabel15 = new JLabel();
    public boolean Mod=false;


    public Pestaña13(Pestaña1 pest) {
        Pest1=pest;
        setOpaque(false);
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {

        quitar();
        this.setLayout( null );
        this.setBounds(new Rectangle(0, 0, 762, 420));

        this.setSize(new Dimension(756, 388));
        
        jPanel1.setLayout(null);
        jPanel1.setBackground(new Color(57, 99, 0));
        
        jLabel1.setText("Nombre de la unidad de competencia: ");
        jLabel1.setBounds(new Rectangle(5, 10, 220, 30));
        jLabel1.setFont(new Font("Arial", 0, 12));

        jLabel1.setForeground(Color.white);
        jTextField1.setBounds(new Rectangle(225, 10, 205, 25));
        
        
        jLabel2.setBounds(new Rectangle(440, 10, 220, 25));
        jLabel2.setText("Numero de la unidad de competencia:");
        jLabel2.setFont(new Font("Arial", 0, 12));

        jLabel2.setForeground(Color.white);
        jTextField2.setBounds(new Rectangle(660, 10, 55, 25));
        jTextField2.setText(num);
        jTextField2.setEnabled(false);
               
        jLabel3.setText("Conocimientos ");
        jLabel3.setBounds(new Rectangle(5, 65, 135, 25));

        jLabel3.setFont(new Font("Arial", 0, 12));
        jLabel3.setForeground(Color.white);
        jLabel4.setText("Habilidades");
        jLabel4.setBounds(new Rectangle(240, 60, 120, 30));

        jLabel4.setFont(new Font("Arial", 0, 12));
        jLabel4.setForeground(Color.white);
        jLabel5.setText("Actitudes y Valores ");
        jLabel5.setBounds(new Rectangle(490, 60, 135, 30));

        jLabel5.setFont(new Font("Arial", 0, 12));
        jLabel5.setForeground(Color.white);
        jSeparator1.setBounds(new Rectangle(0, 40, 762, 5));
        
        jLabel6.setText("ELEMENTOS DE COMPETENCIA ");
        
        jLabel6.setBounds(new Rectangle(255, 40, 220, 25));

        jLabel6.setFont(new Font("Arial", 0, 12));
        jLabel6.setForeground(Color.white);
        jSeparator3.setBounds(new Rectangle(0, 65, 762, 2));
        
        jSeparator5.setBounds(new Rectangle(0, 180, 762, 2));
                                                                 
        jLabel7.setText("Estrategias Didacticas: ");
        jLabel7.setBounds(new Rectangle(5, 180, 215, 25));

        jLabel7.setFont(new Font("Arial", 0, 12));
        jLabel7.setForeground(Color.white);
        jLabel8.setText("Recursos Requeridos:");
        jLabel8.setBounds(new Rectangle(240, 180, 240, 25));

        jLabel8.setFont(new Font("Arial", 0, 12));
        jLabel8.setForeground(Color.white);
        jLabel9.setText("Tiempo Destinado:");
        jLabel9.setBounds(new Rectangle(490, 180, 165, 25));

        jLabel9.setFont(new Font("Arial", 0, 12));
        jLabel9.setForeground(Color.white);
        jTextField3.setBounds(new Rectangle(490, 200, 240, 20));
        
        jTextField4.setBounds(new Rectangle(240, 200, 240, 20));
        
        jTextField5.setBounds(new Rectangle(5, 200, 225, 20));
        
        jLabel10.setText("Criterios de Desempeño:");
        jLabel10.setBounds(new Rectangle(5, 235, 230, 20));

        jLabel10.setFont(new Font("Arial", 0, 12));
        jLabel10.setForeground(Color.white);
        jLabel11.setText("Desempeño:");
        jLabel11.setBounds(new Rectangle(240, 240, 205, 20));

        jLabel11.setFont(new Font("Arial", 0, 12));
        jLabel11.setForeground(Color.white);
        jLabel12.setText("Productos:");
        jLabel12.setBounds(new Rectangle(490, 235, 120, 25));


        jLabel12.setFont(new Font("Arial", 0, 12));
        jLabel12.setForeground(Color.white);
        jSeparator6.setBounds(new Rectangle(0, 225, 770, 2));
        
        jSeparator2.setBounds(new Rectangle(170, 145, 0, 2));
        
        jScrollPane8.setBounds(new Rectangle(5, 90, 225, 80));
        
        jScrollPane9.setBounds(new Rectangle(240, 90, 240, 80));
        
        jScrollPane10.setBounds(new Rectangle(490, 90, 240, 80));
        
        jScrollPane11.setBounds(new Rectangle(5, 255, 225, 75));
        
        jScrollPane12.setBounds(new Rectangle(240, 260, 240, 70));
        
        jScrollPane13.setBounds(new Rectangle(490, 260, 240, 70));


        jButton2.setText("Siguiente");
        jButton2.setBounds(new Rectangle(585, 345, 120, 25));
        jButton2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    sig(e);
                }
            });
        
        jSeparator4.setBounds(new Rectangle(-10, 335, 765, 5));
        
        jLabel13.setText("Evidencias ");
        jLabel13.setBounds(new Rectangle(375, 225, 140, 15));
        jLabel13.setFont(new Font("Arial", 0, 12));
        jLabel13.setForeground(Color.white);
        
        jSeparator7.setBounds(new Rectangle(235, 240, 520, 2));
        
        jButton1.setText("Agregar Unidad");
        jButton1.setBounds(new Rectangle(50, 350, 90, 20));
        jButton1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    pr(e);
                }
            });

        jPanel1.setBounds(new Rectangle(0, 0, 770, 405));
        
        jLabel14.setText("Anote el numero en el siguiente espacio ");
        jLabel14.setBounds(new Rectangle(185, 135, 255, 25));

        jLabel14.setFont(new Font("Arial", 0, 12));
        jLabel14.setForeground(Color.white);
        jTextField6.setBounds(new Rectangle(425, 135, 30, 25));
        
        jButton3.setText("Llenado de datos ");
        jButton3.setBounds(new Rectangle(495, 200, 135, 25));
        jButton3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    llenado(e);
                }
            });

        jLabel15.setText("Antes de llenar los datos debe indicar el numero de Unidades de Aprendizaje ");
        jLabel15.setBounds(new Rectangle(145, 35, 475, 30));
        jLabel15.setFont(new Font("Arial", 0, 12));
        jLabel15.setForeground(Color.white);
        jTextArea1.setFont(new Font("Arial",0,12));
        jTextArea1.setLineWrap(true);
        
        jTextArea2.setFont(new Font("Arial",0,12));
        jTextArea2.setLineWrap(true);
        
        jTextArea3.setFont(new Font("Arial",0,12));
        jTextArea3.setLineWrap(true);
        
        jTextArea4.setFont(new Font("Arial",0,12));
        jTextArea4.setLineWrap(true);
        
        jTextArea5.setFont(new Font("Arial",0,12));
        jTextArea5.setLineWrap(true);
        
        jTextArea6.setFont(new Font("Arial",0,12));
        jTextArea6.setLineWrap(true);


        jPanel1.add(jLabel15, null);
        jPanel1.add(jButton3, null);
        jPanel1.add(jTextField6, null);
        jPanel1.add(jLabel14, null);
        this.add(jPanel1, null);
        this.add(jButton1, null);
        this.add(jSeparator7, null);
        this.add(jLabel13, null);
        this.add(jSeparator4, null);
        this.add(jButton2, null);
        jScrollPane13.getViewport().add(jTextArea6, null);
        this.add(jScrollPane13, null);
        jScrollPane12.getViewport().add(jTextArea5, null);
        this.add(jScrollPane12, null);
        jScrollPane11.getViewport().add(jTextArea4, null);
        this.add(jScrollPane11, null);
        jScrollPane10.getViewport().add(jTextArea3, null);
        this.add(jScrollPane10, null);
        jScrollPane9.getViewport().add(jTextArea2, null);
        this.add(jScrollPane9, null);
        jScrollPane8.getViewport().add(jTextArea1, null);
        this.add(jScrollPane8, null);
        this.add(jSeparator2, null);
        this.add(jSeparator6, null);
        this.add(jLabel12, null);
        this.add(jLabel11, null);
        this.add(jLabel10, null);
        this.add(jTextField5, null);
        this.add(jTextField4, null);
        this.add(jTextField3, null);
        this.add(jLabel9, null);
        this.add(jLabel8, null);
        this.add(jLabel7, null);
        this.add(jSeparator5, null);
        this.add(jSeparator3, null);
        this.add(jLabel6, null);
        this.add(jSeparator1, null);
        this.add(jLabel5, null);
        this.add(jLabel4, null);
        this.add(jLabel3, null);
        this.add(jTextField2, null);
        this.add(jLabel2, null);
        this.add(jTextField1, null);
        this.add(jLabel1, null);
        
        jButton2.setVisible(false);
    }
    
    public boolean verificarI(){
        boolean ind1,ind2,ind3,ind4,ind5,ind6,ind7,ind8,ind9,ind10,ind11;
        ind1=jTextField1.getText().equals("");
        ind2=jTextField2.getText().equals("");
        ind3=jTextField3.getText().equals("");
        ind4=jTextField4.getText().equals("");
        ind5=jTextField5.getText().equals("");
        ind6=jTextArea1.getText().equals("");
        ind7=jTextArea2.getText().equals("");
        ind8=jTextArea3.getText().equals("");
        ind9=jTextArea4.getText().equals("");
        ind10=jTextArea5.getText().equals("");
        ind11=jTextArea6.getText().equals("");
        if(ind1==true || ind2==true || ind3==true || ind4==true || ind5==true || ind6==true || ind8==true || ind9==true 
            ||ind10==true  || ind11==true ){
                        JOptionPane.showMessageDialog(this,"Error en Seccion XIII faltan campos por llenar", "Error",JOptionPane.ERROR_MESSAGE);
                        ynd=false;
            }else{
                ynd=true;
            }
            return ynd;
        }
    
    public void escUXIII(){
        if (nu<=numU){ 
                linea=linea+jTextField1.getText()+";";
                linea=linea+jTextField2.getText()+";";
                linea=linea+jTextField3.getText()+";";
                linea=linea+jTextField4.getText()+";";
                linea=linea+jTextField5.getText()+";";
                linea=linea+jTextArea1.getText()+";";
                linea=linea+jTextArea2.getText()+";";
                linea=linea+jTextArea3.getText()+";";
                linea=linea+jTextArea4.getText()+";";
                linea=linea+jTextArea5.getText()+";";
                linea=linea+jTextArea6.getText()+";";
                linea =linea +"#";
                JOptionPane.showMessageDialog(this,"Registro Agregado continue con las siguientes Unidades","Exito",JOptionPane.INFORMATION_MESSAGE);
                jButton2.setVisible(true);
            }   
    else{
            JOptionPane.showMessageDialog(this,"Se ingresaron todas las unidades de aprendizaje que selecciono, continue con las demas secciones", "Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void sig(ActionEvent e) {
        if (nu!=numU){
        nuu=nuu+1;
        jTextField1.setText(null);
        jTextField2.setEnabled(true);
        jTextField2.setText(Integer.toString(nuu));
        jTextField2.setEnabled(false);
        jTextField3.setText(null);
        jTextField4.setText(null);
        jTextField5.setText(null);
        jTextArea1.setText(null);
        jTextArea2.setText(null);
        jTextArea3.setText(null);
        jTextArea4.setText(null);
        jTextArea5.setText(null);
        jTextArea6.setText(null);
        jButton2.setVisible(false);
            if(Mod==true){
                numU2=numU2+1;
                establecer(vl2,NUM);
            }
        }
        else{
                JOptionPane.showMessageDialog(this,"Se ingresaron todas las unidades de aprendizaje que selecciono, continue con las demas secciones", "Pasar a las demas secciones",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void pr(ActionEvent e) {
        boolean b;
        b=verificarI();
        if(b==true){
                nu=nu+1;
                escUXIII();
            }
        else{
                JOptionPane.showMessageDialog(this,"No se llenaron todos los campos establecidos", "Error",JOptionPane.ERROR_MESSAGE);
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
    
    private void llenado(ActionEvent e) {
        jPanel1.setVisible(false);
        inici();
        numU=Integer.parseInt(jTextField6.getText());
    }
    
    void inici(){
        jTextField1.setVisible(true);
        jTextField3.setVisible(true);
        jTextField4.setVisible(true);
        jTextField5.setVisible(true);
        jTextArea1.setVisible(true);
        jTextArea2.setVisible(true);
        jTextArea3.setVisible(true);
        jTextArea4.setVisible(true);
        jTextArea5.setVisible(true);
        jTextArea6.setVisible(true);
        }
    
    void quitar(){
            jTextField1.setVisible(false);
            jTextField3.setVisible(false);
            jTextField4.setVisible(false);
            jTextField5.setVisible(false);
            jTextArea1.setVisible(false);
            jTextArea2.setVisible(false);
            jTextArea3.setVisible(false);
            jTextArea4.setVisible(false);
            jTextArea5.setVisible(false);
            jTextArea6.setVisible(false);
        }
    
    public boolean Validarpes13(){
        if(nu==numU){ 
        return true;
        }else{
            JOptionPane.showMessageDialog(this,"No se han llenado todos los campos", "Error: Seccion XII",JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    void Escribirf(){
        File arc = new File(Path,"Unidades.txt");
        BufferedWriter arcesc;
        try {
            arcesc = new BufferedWriter(new FileWriter(arc,true));
            PrintWriter esc = new PrintWriter(arcesc);
            esc.print(linea);
            esc.close();
            nu=0;
        } catch (IOException e) {
        }
    }
    
    void establecer(String []cadb,int n){
        String [] vl= new String[11];
        int ind,i;
        if(numU2==0){
            NUM=n;
            vl2=cadb;
        }
        if(numU2<n){
            for(ind=0;ind<11;ind++){
                i=cadb[numU2].indexOf(";");
                vl[ind]=cadb[numU2].substring(0, i);
                cadb[numU2]=cadb[numU2].substring(i+1);
            }
            jTextField1.setText(vl[0]);
            jTextField2.setText(vl[1]);
            jTextField3.setText(vl[2]);
            jTextField4.setText(vl[3]);
            jTextField5.setText(vl[4]);
            jTextArea1.setText(vl[5]);
            jTextArea2.setText(vl[6]);
            jTextArea3.setText(vl[7]);
            jTextArea4.setText(vl[8]);
            jTextArea5.setText(vl[9]);
            jTextArea6.setText(vl[10]);
            }
        else {
        }
    }
}
