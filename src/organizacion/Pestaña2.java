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

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;

public class Pestaña2 extends JPanel {
    private JLabel jLabel1 = new JLabel();
    private JScrollPane jScrollPane1 = new JScrollPane();
    private JTextArea jTextArea1 = new JTextArea();
    String Path="Archivos";
    String Usu,res;

    public Pestaña2(String Usu) {
        this.Usu=Usu;
        setOpaque(false);
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.setLayout(null);
        this.setSize(new Dimension(762, 420));
        
        jTextArea1.setLineWrap(true);
        jTextArea1.setFont(new Font("Arial",0,12));
        
        jLabel1.setText("II. PRESENTACION");
        jLabel1.setForeground(Color.WHITE);
        jLabel1.setBounds(new Rectangle(15, 10, 315, 20));
        
        jScrollPane1.setBounds(new Rectangle(35, 55, 695, 310));
        jTextArea1.setSize(new Dimension(690, 300));
        jScrollPane1.getViewport().add(jTextArea1, null);
        
        this.add(jScrollPane1, null);
        this.add(jLabel1, null);
    }
    public void Obtiene_Us(String Usu){//Modulo que obtiene el usurio con el que se ingreso para agregar unidad de aprendizaje
           this.Usu=Usu;
       }
    
    public boolean guardar2(){//Modulo que valida los campos a llenar
        if (jTextArea1.getText().equals("")) {
            JOptionPane.showMessageDialog(this,"Faltan llenar presentacion","Error:Seccion II",JOptionPane.WARNING_MESSAGE);
             return false;
        } 
        return true;
    }
    public void escribir2(){//Modulo que escribe los campos en el resgistro de unidades de aprendizaje de la pestaña
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


    public void Escr_Cerrado(String Usu){//Modulo que guarda los campos de la pestaña 2 por si cierra secion desde cerrado de ventana
           File arc=new File(Path,"UnidadesResCes.txt");
           BufferedWriter acceso;
           try{
               acceso=new BufferedWriter(new FileWriter(arc,true));
               PrintWriter esc = new PrintWriter(acceso);
               esc.print(Usu);
               esc.print(";");
               esc.print(jTextArea1.getText());
               esc.println("");
               esc.close();
           } catch (IOException e) {
           }
           System.exit(0);
       }


    public void paintComponent(Graphics g) { // color de la ventana
    Graphics2D g2 = (Graphics2D) g;
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    g2.setPaint(new GradientPaint(new Point(0, 0), new Color(57, 99, 0), new Point(0, getHeight()),new Color(57, 99, 0)));
    g2.fillRect(0,0,getWidth(),getHeight());
    super.paintComponent(g);
    }
    
    private String [] ExtrCamp(String cad) {//Modulo que extrae los campos de un registro
             String [] cadReg= new String[2];
             String camp="";
             int cont,lon;
             char car;
             lon=cad.length();
             for(cont=0;cont<lon;cont++){
                 car=cad.charAt(cont);
                 if(car!=';'){
                     camp=camp+car;
                 }
                 if(car==';'){
                     cadReg[0]=camp;
                     res=cad.substring(cont+1, lon);
                    
                     break;
                 }         
             }
             return cadReg;    
        }
        public void Restaurar(String Usu){//Modulo que detecta si hay una secion interrumpida y pregunta si desea restaurar secion by Emmanuel Cardenas Salinas
            String UsuLin,linea;
            String Usu1[]=new String[2];
            Vector Lineas=new Vector();//Vector de respaldo sobre lineas a copiar
            int op;
            boolean b=Ver_Restauracion(Usu);
            if(b){     
                op=JOptionPane.showConfirmDialog(null, "Desea Restaurar Sección ", "Restaurar Sección", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                if(op==JOptionPane.YES_OPTION){
                        try{
                            File ar1 = new File(Path,"UnidadesResCes.txt");
                            FileReader leearc;
                            try {
                                leearc = new FileReader(ar1);
                                BufferedReader acclec = new BufferedReader(leearc);
                                linea=acclec.readLine();
                                while(linea!=null){                
                                    Usu1[0]=linea.substring(0,5);
                                    Usu1[1]=linea.substring(6, linea.length());
                                    if(Usu1[0].equals(Usu)){
                                        break;
                                    }
                                    linea=acclec.readLine();
                                }
                                acclec.close();
                                
                                
                            } catch (FileNotFoundException e) {
                            } catch (IOException e) {
                            }
                        File arch= new File(Path,"UnidadesResCes.txt");
                        FileReader leer = new FileReader(arch);
                        BufferedReader acclec = new BufferedReader(leer);
                        linea=acclec.readLine();
                        while(linea!=null){
                            UsuLin=linea.substring(0, 5);
                            if((UsuLin.equals(Usu))==false){
                                Lineas.add(linea);
                            }
                            linea=acclec.readLine();
                        }
                            acclec.close();
                            File ar=new File(Path,"UnidadesResCes.txt");
                            FileWriter lee = new FileWriter(ar);
                            BufferedWriter acc = new BufferedWriter(lee);
                            for(int i=0;i<Lineas.size();i++){
                                linea=(String)Lineas.elementAt(i);
                                acc.write(linea);
                                acc.newLine();
                            }
                            acc.close();
                        }catch(Exception e){
                    }
                        jTextArea1.setText(Usu1[1]);
                    }
                    else{
                    try{ 
                        File ar = new File(Path,"UnidadesResCes.txt");
                        FileReader leer = new FileReader(ar);
                        BufferedReader acclec = new BufferedReader(leer);
                        linea=acclec.readLine();
                        while(linea!=null){
                            UsuLin=linea.substring(0, 5);
                            if((UsuLin.equals(Usu))==false){
                                Lineas.add(linea);
                            }
                            linea=acclec.readLine();
                        }
                            acclec.close();
                        File arc = new File(Path,"UnidadesResCes.txt");
                            FileWriter lee = new FileWriter(arc);
                            BufferedWriter acc = new BufferedWriter(lee);
                            for(int i=0;i<Lineas.size();i++){
                                linea=(String)Lineas.elementAt(i);
                                acc.write(linea);
                                acc.newLine();
                            }
                            acc.close();
                        }catch(Exception e){
                    }
                    
                }
        }
        }
        public boolean Ver_Restauracion(String Usu){
            String linea;
            boolean b=false;     //Bandera que preguntara si requiere o no restauracion de sesión
            String Usu1;
            this.setLayout(null);
            this.setSize(new Dimension(762, 420));
            FileReader leearc;
            try {
                File arc = new File(Path,"UnidadesResCes.txt");
                leearc = new FileReader(arc);
                BufferedReader acclec = new BufferedReader(leearc);
                linea=acclec.readLine();
                while(linea!=null){                
                    Usu1=linea.substring(0,5);
                    if(Usu1.equals(Usu)){
                        b=true;
                        break;
                    }
                    else{
                        b=false;
                    }
                    linea=acclec.readLine();
                }
                acclec.close();
                
                
            } catch (FileNotFoundException e) {
            } catch (IOException e) {
            }
            return b;
        }
        
    void establecer(String cam2){
        jTextArea1.setText(cam2);
        jTextArea1.setEnabled(false);
        }
    void establecer2(String cam2){
        jTextArea1.setText(cam2);
        }
        
}





