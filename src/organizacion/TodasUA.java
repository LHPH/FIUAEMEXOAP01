package organizacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Frame;

import java.awt.Graphics;
import java.awt.Rectangle;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.TableColumn;

public class TodasUA extends JDialog {
    
    String [][] UnidApre;
    String [] NomCol = {"Nombre","Clave","Area De Docencia","Nucleo","Creditos","Periodo"};
    private JScrollPane jScrollPane1;
    private JTable Tabla;
    private JPanel Pane;
    Container Cont;
    TableColumn Colum;
   // String Path="C:\\Users\\HÉCTOR\\Documents\\JDeveloper\\mywork\\Organizacion\\Archivos";
   String Path="Archivos";

    public TodasUA() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
            UnidApre=CargMatr(Path);
            this.setSize(new Dimension(779, 482));
            //this.getContentPane().setLayout( null );
            this.setTitle("Unidades De Aprendizaje");
            this.setIconImage(new ImageIcon("Escudo.png").getImage());
            this.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
            this.setResizable(false);
            this.setLocationRelativeTo(null);
            this.setModal(true);
            this.setBackground(new Color(255, 247, 214));
            // Cont = getContentPane();
            //Pane=new JPanel();
            Tabla = new JTable(UnidApre,NomCol);
            //jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF );
            Colum=Tabla.getColumnModel().getColumn(0);
            Colum.setPreferredWidth(150);
            
            Colum=Tabla.getColumnModel().getColumn(1);
            Colum.setPreferredWidth(30);
            
            Colum=Tabla.getColumnModel().getColumn(2);
            Colum.setPreferredWidth(80);
            
            Colum=Tabla.getColumnModel().getColumn(3);
            Colum.setPreferredWidth(40);
            
            Colum=Tabla.getColumnModel().getColumn(4);
            Colum.setPreferredWidth(30);
            
            Colum=Tabla.getColumnModel().getColumn(5);
            Colum.setPreferredWidth(150);
            
            
            Tabla.setPreferredScrollableViewportSize(new Dimension(700,470));
            //tabla.setEnabled(false);
            jScrollPane1 = new JScrollPane(Tabla);
            jScrollPane1.setViewportView(Tabla);
            jScrollPane1.setBounds(new Rectangle(30, 50, 600, 270));
            //Pane.add(jScrollPane1);
            this.add(jScrollPane1,null);
            //this.getContentPane().add(jScrollPane1, null);   
}

    public static int ContLineArch(String Path) {  //Metodo Que Analizara Archivo Contando Las Lineas
        String linea;
        int conlin=0;
        //File arc = new File("C:\\Users\\HÉCTOR\\Documents\\JDeveloper\\mywork\\Organizacion\\Archivos","Unidades.txt");
        File arc = new File(Path,"Unidades.txt");
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
   
   /*Luis Humberto Ponce Hermosillo 23 de Abril del 2012*/
    public static String  [][] CargMatr(String Path){
        String[][] mat;
        String [] cad = new String[2];
        String linea="",nom="",clav="",are="",per="",nucl="",cred="";
        int tam,cont=0,cont2=0,cont3;
        tam=ContLineArch(Path);
        mat=new String[tam][6];
        try{
          //  File arc = new File("C:\\Users\\HÉCTOR\\Documents\\JDeveloper\\mywork\\Organizacion\\Archivos","Unidades.txt"); 
                File arc = new File(Path,"Unidades.txt");
            if(arc.exists()==false){
                JOptionPane.showMessageDialog(null,"No Hay Unidades De Aprendizaje Registradas","Mensaje",JOptionPane.WARNING_MESSAGE);
            }
            //Abrir Archivo Para su Lectura
            FileReader leearc = new FileReader(arc);
            BufferedReader acclec = new BufferedReader(leearc);
            linea=acclec.readLine();
            while(linea!=null){  //asignar a contenedor de registros los registros del archivo
                  cad=ExtrCamp(linea);
                  nom=cad[0]; //Dar Nombre
                  cad=ExtrCamp(cad[1]);
                  are=cad[0];  //Dar Area
                  cad=ExtrCamp(cad[1]);
                  cad=ExtrCamp(cad[1]);
                  clav=cad[0]; //Dar Clave
                  //cont2=ContSubCamp(cad[1],2);
                /*for(cont3=0;cont3<cont2;cont3++){
                    cad=ExtrCamp(cad[1]);
                    prof=prof+cad[0];//Dar Profesor
                    prof=prof+",";
                }*/
                cad=ExtrCamp(cad[1]);
                per=cad[0];  //Dar Periodo
                cad=ExtrCamp(cad[1]);
                nucl=cad[0];    //Dar Nucleo
                cad=ExtrCamp(cad[1]);
                cad=ExtrCamp(cad[1]);
                cad=ExtrCamp(cad[1]);
                cad=ExtrCamp(cad[1]);
                cad=ExtrCamp(cad[1]);
                cred=cad[0];  //Dar Creditos
                //Asignarle Los Valores A La Matriz De Cadenas
                mat[cont][0]=nom;
                mat[cont][1]=clav;
                mat[cont][2]=are;
                mat[cont][3]=nucl;
                mat[cont][4]=cred;
                mat[cont][5]=per;
                //prof="";
                linea=acclec.readLine();
                cont++;
             }
           acclec.close();     //Cerrar Archivo
            } catch (FileNotFoundException exe) {
            } catch (IOException exe) {
            }
        return mat;
    }
    public static String [] ExtrCamp(String cad) {
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
    public static int ContSubCamp(String cad,int num){
        int cont,cont2=0; //Contador del ciclo y contador de subcampos
        char car;
        switch(num){
        case 1:  //Cuenta Todos Los Subcampos Que Hay En El Registro
            for(cont=0;cont<cad.length();cont++){
                car=cad.charAt(cont);
                if(car=='#'){
                    cont2++;
                }
            }
            break;
        case 2: //Cuenta Los Subcampos De Un Determinado Campo
            for(cont=0;cont<cad.length();cont++){
                car=cad.charAt(cont);
                if(car=='#'){
                    cont2++;
                }
                if(car==';'){
                    break;
                }
            }
            break;
        }    
        return cont2+1;
    }
    public static void main(String [] arg){
        try{
             UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
             
             } catch (Exception ex){
              JOptionPane.showMessageDialog(null, "Error en Look And Feel","Error:" + ex.getMessage(),JOptionPane.ERROR_MESSAGE);
             }  
        TodasUA ss = new TodasUA();
        ss.setVisible(true);
    }
}
