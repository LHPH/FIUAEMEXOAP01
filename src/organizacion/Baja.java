package organizacion;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileReader;

import java.io.FileWriter;
import java.io.IOException;

import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.Frame;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Baja extends JDialog {
    
    String Cat;
    private JLabel jLabel2 = new JLabel();
        private JButton jButton1 = new JButton();
        private JButton jButton2 = new JButton();
       // static String Path = "C:\\Users\\HÉCTOR\\Documents\\JDeveloper\\mywork\\Organizacion\\Archivos";
       String Path="Archivos";
        String [] Reg;
        String [] Nomb;
    private JScrollPane jScrollPane1 = new JScrollPane();
    
    DefaultTableModel modelo;
    JTable tabla = new JTable();
    private JPanel jPanel1 = new JPanel();
    private JPanel jPanel2 = new JPanel();
    
    private JLabel jLabel1 = new JLabel(new ImageIcon("Escudo.png"));
    private JLabel jLabel3 = new JLabel(new ImageIcon("escudo2.png"));
    private JLabel jLabel4 = new JLabel(new ImageIcon("FG.png"));
    private JLabel jLabel5 = new JLabel();
    private JLabel jLabel6 = new JLabel();

    public Baja(){
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void jbInit() throws Exception {
        this.setSize(new Dimension(586, 378));
        this.setLayout(null);
        this.getContentPane().setLayout( null );
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setModal(true);
        this.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE); 
        this.setIconImage(new ImageIcon("Escudo.png").getImage());
        
        jPanel1.setBackground(new Color(0,100,0));
        jPanel2.setBackground(new Color(0,100,0));
        
        jPanel1.setBounds(new Rectangle(0, 0, 585, 80));
        jPanel2.setBounds(new Rectangle(0, 285, 585, 70));
        
        jPanel1.setLayout(null);
        jPanel2.setLayout(null);

        jLabel1.setBounds(new Rectangle(0, 0, 100, 80));
        
        jLabel3.setBounds(new Rectangle(90, 0, 100, 80));
        
        jLabel4.setBounds(new Rectangle(490, 5, 90, 70));
        
        jLabel5.setText("Facultad De Geografia");
        jLabel5.setForeground(Color.white);
        jLabel5.setFont(new Font("Arial", 0, 14));
        jLabel5.setBounds(new Rectangle(190, 30, 175, 30));


        jLabel6.setText("Universidad Autonoma Del Estado De Mexico");
        jLabel6.setBounds(new Rectangle(190, 10, 335, 25));
        jLabel6.setForeground(Color.white);
        jLabel6.setFont(new Font("Arial", 0, 15));
        
        
        modelo=new DefaultTableModel();
        tabla.setModel(modelo);
        modelo.addColumn("Usuario");
        modelo.addColumn("Tipo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Estado");

        jLabel2.setText("Usuarios registrados en el sistema");
        jLabel2.setBounds(new Rectangle(15, 75, 235, 40));
        jLabel2.setFont(new Font("Arial",0,12));
        
        jButton1.setText("Baja usuario");
        jButton1.setBounds(new Rectangle(430, 150, 125, 25));
        jButton1.addActionListener(new ActionListener() {
                       public void actionPerformed(ActionEvent e) {
                           jButton1_actionPerformed(e);
                       }
                   });
        jButton1.setIcon(new ImageIcon("baja.png"));
               
       jButton2.setText("Alta usuario");
       jButton2.setBounds(new Rectangle(430, 215, 125, 25));
        jButton2.addActionListener(new ActionListener() {
                       public void actionPerformed(ActionEvent e) {
                           jButton2_actionPerformed(e);
                       }
                   });
        jButton2.setIcon(new ImageIcon("alta.png"));
        
            this.setTitle("Alta o Baja Usuario");
            this.Visualizar();
        jScrollPane1.setBounds(new Rectangle(15, 110, 400, 165));
        jScrollPane1.getViewport().add(tabla,null);
        this.getContentPane().add(jPanel2, null);
        jPanel1.add(jLabel6, null);
        jPanel1.add(jLabel5, null);
        jPanel1.add(jLabel4, null);
        jPanel1.add(jLabel3, null);
        jPanel1.add(jLabel1, null);
        this.getContentPane().add(jPanel1, null);
        this.add(jScrollPane1, null);
        this.add(jButton2, null);
        this.add(jButton1, null);
        this.add(jLabel2, null);
    }

       
        public void Visualizar(){
            File arc = new File(Path,"Usuarios.txt");
            String linea="",c="";
            int tam=ContLineArch(Path);
            int cont=0;
            boolean ban=false;
            String [] nom = new String[2];
            Reg=new String[tam];
            Nomb=new String[tam];
            String [] fila = new String[4];
            try{
                FileReader a = new FileReader(arc);
                BufferedReader b= new BufferedReader(a);
                linea=b.readLine();
                while(linea!=null){
                    Reg[cont]=linea;
                    if(linea.indexOf("Administrador")==-1){
                        nom=ExtrCamp(linea);
                        fila[0]=nom[0]; //Usuario
                        nom=ExtrCamp(nom[1]);
                        nom=ExtrCamp(nom[1]);
                        fila[1]=nom[0];
                        nom=ExtrCamp(nom[1]);
                        fila[2]=nom[0]; //Nombre
                        nom=ExtrCamp(nom[1]);
                        nom=ExtrCamp(nom[1]);
                        nom=ExtrCamp(nom[1]);
                        nom=ExtrCamp(nom[1]);
                        fila[3]=nom[0];
                        modelo.addRow(fila);
                    }
                    cont++;
                    linea=b.readLine();
                }
                    b.close();
                }catch(IOException e){}
        }
        
        /*public void VisualizarC(){
            File arc = new File(Path,"Usuarios.txt");
            String linea="",c="";
            int tam=ContLineArch(Path);
            int cont=0;
            String [] nom = new String[2];
            Reg=new String[tam];
            Nomb=new String[tam];
            String [] fila = new String[3];
            try{
                FileReader a = new FileReader(arc);
                BufferedReader b= new BufferedReader(a);
                linea=b.readLine();
                while(linea!=null){
                    Reg[cont]=linea;
                    if(linea.indexOf("Coordinador")!=-1){
                        nom=ExtrCamp(linea);
                        fila[0]=nom[0]; //Usuario
                        nom=ExtrCamp(nom[1]);
                        nom=ExtrCamp(nom[1]);
                        nom=ExtrCamp(nom[1]);
                        fila[1]=nom[0]; //Nombre
                        nom=ExtrCamp(nom[1]);
                        nom=ExtrCamp(nom[1]);
                        nom=ExtrCamp(nom[1]);
                        nom=ExtrCamp(nom[1]);//Estatus
                        fila[2]=nom[0];
                        modelo.addRow(fila);
                        break;
                    }
                    cont++;
                    linea=b.readLine();
                }
                    b.close();
                }catch(IOException e){}
            
        }*/
      
      
        public static void main(String arg []){
            Baja b = new Baja();
            b.setVisible(true);
        }
            
            public void Escribir(){
                File arc = new File(Path,"Usuarios.txt");
                BufferedWriter b;
                try {
                    b = new BufferedWriter(new FileWriter(arc));
                    PrintWriter esc = new PrintWriter(b);
                    for(int cont=0;cont<Reg.length;cont++){
                        esc.print(Reg[cont]);
                        esc.println("");
                    }
                    esc.close();
                } catch (IOException e) {
                }
            }
            
            public static int ContLineArch(String Path) {  //Metodo Que Analizara Archivo Contando Las Lineas
                String linea;
                int conlin=0;
                File arc = new File(Path,"Usuarios.txt");
                if(arc!=null){
                    FileReader leearc;
                    try {
                        leearc = new FileReader(arc);
                        BufferedReader acclec = new BufferedReader(leearc);
                        linea=acclec.readLine();
                        while(linea!=null){
                               linea=acclec.readLine();
                               conlin=conlin+1;
                           }
                        acclec.close();
                        
                    } catch (FileNotFoundException e) {
                    } catch (IOException e) {
                    }
                }//ELSE
             return conlin;
            }
            private static String [] ExtrCamp(String cad) {
                 String [] cadReg= new String[2];
                 String camp="";
                 int cont,lon;
                 char car;
                 lon=cad.length();
                 for(cont=0;cont<lon;cont++){
                     car=cad.charAt(cont);
                     if(car!=';' && car!='#'){
                         camp=camp+car;
                     }
                     if(car==';'){
                         cadReg[0]=camp;
                         cadReg[1]=cad.substring(cont+1, lon);
                         break;
                     }
                     if(car=='#'){
                        cadReg[0]=camp;
                        cadReg[1]=cad.substring(cont+1,lon);
                        break;
                     }
                 }
                 return cadReg;
             }
            
            private boolean Accion(String text){
                String Usur=tabla.getValueAt(tabla.getSelectedRow(),0).toString();
                String Est=tabla.getValueAt(tabla.getSelectedRow(),3).toString();
                if(text.equals(Est)==true){
                    JOptionPane.showMessageDialog(this,"El usuario ya esta "+text,"Aviso",JOptionPane.INFORMATION_MESSAGE);
                    return false;
                }
                else{
                    int cont=0;
                    for(cont=0;cont<Reg.length;cont++){
                        if(Reg[cont].indexOf(Usur)!=-1){
                            break;
                        }
                    }
                    String [] nom1=new String[2];
                        String d="";
                        nom1=ExtrCamp(Reg[cont]);
                        d=d+nom1[0]+";";
                        nom1=ExtrCamp(nom1[1]);
                        d=d+nom1[0]+";";
                        nom1=ExtrCamp(nom1[1]);
                        d=d+nom1[0]+";";
                        nom1=ExtrCamp(nom1[1]);
                        d=d+nom1[0]+";";
                        nom1=ExtrCamp(nom1[1]);
                        d=d+nom1[0]+";";
                        nom1=ExtrCamp(nom1[1]);
                        d=d+nom1[0]+";";
                        nom1=ExtrCamp(nom1[1]);
                        d=d+nom1[0]+";";
                        d=d+text+";";
                    
                        nom1=ExtrCamp(nom1[1]);
                        nom1=ExtrCamp(nom1[1]);
                        d=d+nom1[0]+";";
                        nom1=ExtrCamp(nom1[1]);
                        d=d+nom1[0];
                        Reg[cont]=d;
                      Escribir();
                    return true;
                }
                
            }
            
            private void Actualizar(){
                int num=modelo.getRowCount();
                int cont;
                for(cont=0;cont<num;cont++){
                    modelo.removeRow(0);
                }
            }
            
            private void jButton1_actionPerformed(ActionEvent e) {
               if(modelo.getRowCount()==0){
                   JOptionPane.showMessageDialog(this,"No hay ningun usuario","Mensaje",JOptionPane.INFORMATION_MESSAGE);
               }
               else{
                   boolean ban= Accion("Inactivo");
                   if(ban==true){
                       JOptionPane.showMessageDialog(this,"El usuario ha sido dado de baja","Mensaje",JOptionPane.INFORMATION_MESSAGE);
                        this.Actualizar();
                        this.Visualizar();
                       }  
                   }
               }
            private void jButton2_actionPerformed(ActionEvent e) {
                if(modelo.getRowCount()==0){
                    JOptionPane.showMessageDialog(this,"No hay ningun usuario","Mensaje",JOptionPane.INFORMATION_MESSAGE);   
                }
                else{
                    boolean ban=Accion("Activo");
                    if(ban==true){
                        JOptionPane.showMessageDialog(this,"El usuario ha sido dado de alta","Mensaje",JOptionPane.INFORMATION_MESSAGE);
                        this.Actualizar();
                        this.Visualizar(); 
            }
                }
    }
}
