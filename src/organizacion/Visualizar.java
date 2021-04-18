package organizacion;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.MouseAdapter;

import java.awt.event.MouseEvent;

import java.awt.event.WindowAdapter;

import java.awt.event.WindowEvent;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Visualizar extends JDialog{
    private Pestañas1 Pest = new Pestañas1();
    int Contlin;
    static String Path = "Archivos";
    Bitacora Bit1;
    Pestaña11 p1;
    Pestaña22 p2;
    Pestaña3 p3;
    Pestaña4 p4;
    Pestaña5 p5;
    Pestaña6 p6;
    Pestaña7 p7;
    Pestaña8 p8;
    Pestaña9 p9;
    Pestaña10 p10;
    Pestaña11y12 p12;
    Pestaña14 p14;
    Pestaña15 p15;
    Pestaña16 p16;
    PestañaF1 pf;
    
    private JButton jButton1 = new JButton();
    private JLabel jLabel1 = new JLabel();
    private JTextField jTextField1 = new JTextField();

    public Visualizar(Bitacora Bit) {
        Bit1=Bit;
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout( null );
        this.getContentPane().setBackground(new Color(0,59,59));
        this.setTitle("Visualizar");
        this.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon("Escudo.png").getImage());
        this.setModal(true);
        this.setSize(new Dimension(820, 566));
        this.setForeground(Color.white);
        this.setLocation(200,100);
        this.setSize(820, 530);
        Pest.setBounds(20,20,762 ,420 );
        p1=Pest.getPestaña11();
        p2=Pest.getPestaña2();
        p3=Pest.getPestaña3();
        p4=Pest.getPestaña4();
        p5=Pest.getPestaña5();
        p6=Pest.getPestaña6();
        p7=Pest.getPestaña7();
        p8=Pest.getPestaña8();
        p9=Pest.getPestaña9();
        p10=Pest.getPestaña10();
        
        //p11=Pest.getPestaña11();
        p12=Pest.getPestaña12();
        
        p14=Pest.getPestaña14();
        p15=Pest.getPestaña15();
        p16=Pest.getPestaña16();
        pf=Pest.getPestañaf1();

        // this.repaint();
        this.add(Pest.jbInit(),null);
        
       // contenedor.add(jTextArea1); no va por que si no no funciona el scrollpane
        this.getContentPane().add(jTextField1, null);
        this.getContentPane().add(jLabel1, null);
        this.getContentPane().add(jButton1, null);
        this.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                   // CerrIntr(e);
                }
            });
        jButton1.setText("Cargar");
        jButton1.setBounds(new Rectangle(640, 460, 125, 25));
        jButton1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    cargar(e);
                }
            });
        jLabel1.setText("Ingrese la clave de la materia que quiere visualizar");
        jLabel1.setBounds(new Rectangle(10, 460, 360, 30));
        jLabel1.setFont(new Font("Arial", 0, 12));
        jLabel1.setForeground(Color.white);
        jTextField1.setBounds(new Rectangle(305, 465, 95, 20));
    }
    
    public static void main(String arg []){
        Visualizar a =new Visualizar (new Bitacora());
        a.setVisible(true);
    }
//Metodo Que Comprobara Que Todo Ya Este Validado Para Guardarlo en el Archivo Hecho Por Luis Humberto Ponce Hermosillo
    //25 de Mayo del 2012
    private void cargar(ActionEvent e) {
        String linea,cadb="";
        String clv;
        Boolean ind,b=false;
        int tam,t,inc=1;
        ind=jTextField1.getText().equals("");
        if(ind==true){
                JOptionPane.showMessageDialog(this,"Ingrese la clave de la Unidad de Aprendizaje que quiere visulizar","Error",JOptionPane.INFORMATION_MESSAGE);
            }
        else{
                clv=jTextField1.getText();
                File arc = new File(Path,"Unidades.txt");
                if(arc!=null){
                    try {
                        FileReader leearc = new FileReader(arc);
                        BufferedReader acclec = new BufferedReader(leearc);
                        linea=acclec.readLine();
                        tam=ContLineArch(arc); 
                        while((linea!=null)&&(b==false)){
                            t=linea.indexOf(clv);
                            if(t!=-1){
                                cadb=linea;
                                b=true;
                                }
                            inc=inc+1;
                            linea=acclec.readLine();
                           }
                        acclec.close();
                        if(b==true){
                            llenar(cadb);
                            }
                        else{
                            JOptionPane.showMessageDialog(this,"No se encontro un registro que concuerde con la clave dada","Error",JOptionPane.ERROR_MESSAGE);
                            }
                    }catch (IOException f){
                             }
                }
        }
    }
    
    public int ContLineArch(File arc) {  //Metodo Que Analizara Archivo Contando Las Lineas
        String linea;
        int conlin=0;
        FileReader leearc;
        try {
            leearc = new FileReader(arc);
            BufferedReader acclec = new BufferedReader(leearc);
            linea=acclec.readLine();
            while(linea!=null){
                   linea=acclec.readLine();
                   conlin=conlin+1;
               }
            Contlin=conlin;
            acclec.close();
            
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        
        
    }
        return Contlin;
    }

    void llenar(String cadb){
            String cam1[]= new String[19];
            String cam2,cam4,cam8,cam9;
            String cam3[]= new String[2];
            String cam5[]=new String[2];
            String cam6[]=new String[3];
            String cam7[]=new String[2];
            String cam10[]=new String[3];
            String cam1112[]=new String[3];
            String cam13[]=new String[10];
            String cam14[]=new String[2];
            String cam15[]=new String[2];
            String cam16[]=new String[3];
            int i=0;
            int ind,n;
            for(ind=0;ind<19;ind++){
                i=cadb.indexOf(";");
                cam1[ind]=cadb.substring(0, i);
                cadb=cadb.substring(i+1);
                }
            i=cadb.indexOf(";");
            cam2=cadb.substring(0,i);
            cadb=cadb.substring(i+1);
            for(ind=0;ind<2;ind++){
                i=cadb.indexOf(";");
                cam3[ind]=cadb.substring(0, i);
                cadb=cadb.substring(i+1);
                }
            i=cadb.indexOf(";");
            cam4=cadb.substring(0, i);
            cadb=cadb.substring(i+1);
            for(ind=0;ind<2;ind++){
                i=cadb.indexOf(";");
                cam5[ind]=cadb.substring(0, i);
                cadb=cadb.substring(i+1);
                }
            for(ind=0;ind<3;ind++){
                i=cadb.indexOf(";");
                cam6[ind]=cadb.substring(0, i);
                cadb=cadb.substring(i+1);
                }
            for(ind=0;ind<2;ind++){
                i=cadb.indexOf(";");
                cam7[ind]=cadb.substring(0, i);
                cadb=cadb.substring(i+1);
                }        
            i=cadb.indexOf(";");
            cam8=cadb.substring(0, i);
            cadb=cadb.substring(i+1);
            i=cadb.indexOf(";");
            cam9=cadb.substring(0, i);
            cadb=cadb.substring(i+1);
            for(ind=0;ind<3;ind++){
                i=cadb.indexOf(";");
                cam10[ind]=cadb.substring(0, i);
                cadb=cadb.substring(i+1);
                } 
           for(ind=0;ind<3;ind++){
                i=cadb.indexOf(";");
                cam1112[ind]=cadb.substring(0, i);
                cadb=cadb.substring(i+1);
                } 
           n=0;
           for(ind=0;ind<3;ind++){
                i=cadb.indexOf("#");
                if(i!=-1){
                    cam13[ind]=cadb.substring(0, i);
                    cadb=cadb.substring(i+1);
                    n=n+1;
                 }
                else{
                    i=cadb.indexOf("#");
                    cadb=cadb.substring(i+1);
                    break;
                    }
           }
            for(ind=0;ind<2;ind++){
                 i=cadb.indexOf(";");
                 cam14[ind]=cadb.substring(0, i);
                 cadb=cadb.substring(i+1);
                 } 
            for(ind=0;ind<2;ind++){
                 i=cadb.indexOf(";");
                 cam15[ind]=cadb.substring(0, i);
                 cadb=cadb.substring(i+1);
                 } 
          for(ind=0;ind<3;ind++){
                 i=cadb.indexOf(";");
                 cam16[ind]=cadb.substring(0, i);
                 cadb=cadb.substring(i+1);
                 } 
            p1.establecer(cam1);
            p2.establecer(cam2);
            p3.establecer(cam3);
            p4.establecer(cam4);
            p5.establecer(cam5);
            p6.establecer(cam6);
            p7.establecer(cam7);
            p8.establecer(cam8);
            p9.establecer(cam9);
            p10.establecer(cam10);
            p12.establecer(cam1112);
            pf.establecer(cam13,n);
            p14.establecer(cam14);
            p15.establecer(cam15);
            p16.establecer(cam16);
        }
}

