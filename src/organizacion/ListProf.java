package organizacion;

import java.awt.Color;
import java.awt.Dimension;

import java.awt.Font;
import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;

import java.awt.event.KeyEvent;

import java.awt.event.MouseAdapter;

import java.awt.event.MouseEvent;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;

import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ListProf extends JDialog {
    private JLabel jLabel1 = new JLabel();
    private JScrollPane jScrollPane1 = new JScrollPane();
    private JLabel jLabel2 = new JLabel();
    String Reg;
   
   String Path="Archivos";
    private JTextArea jTextArea1 = new JTextArea();
    int ind2=0;
    private JPanel jPanel1 = new JPanel();
    private JPanel jPanel2 = new JPanel();
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
    private JLabel jLabel3 = new JLabel(new ImageIcon("Escudo.png"));
    private JLabel jLabel4 = new JLabel(new ImageIcon("escudo2.png"));
    private JLabel jLabel5 = new JLabel(new ImageIcon("FG.png"));
    private JLabel jLabel6 = new JLabel();
    private JComboBox jComboBox1 = new JComboBox(Materi);
    private JButton jButton1 = new JButton();

    public ListProf() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//metodo que contendra los componentes graficos de la ventana
    void  jbInit() {
        this.setLayout( null );
        this.setSize(new Dimension(519, 362));
        this.setLayout(null);
        this.getContentPane().setLayout( null );
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
        this.setModal(true);
        this.setIconImage(new ImageIcon("Escudo.png").getImage());
        
        jLabel1.setText("Nombre de la unidad de aprendizaje:");
        jLabel1.setBounds(new Rectangle(15, 85, 280, 35));
        jLabel1.setFont(new Font("Arial",0,12));
        jTextArea1.setLineWrap(true);
        jTextArea1.setEditable(false);
        jTextArea1.setFont(new Font("Arial",0,12));


        jPanel1.setBounds(new Rectangle(0, 0, 520, 80));
        jPanel2.setBounds(new Rectangle(0, 280, 520, 60));
        
        jPanel1.setBackground(new Color(0,100,0));
        jPanel2.setBackground(new Color(0,100,0));
        
        jPanel1.setLayout(null);
        jPanel2.setLayout(null);


        jLabel3.setBounds(new Rectangle(0, 0, 100, 80));

        jLabel4.setBounds(new Rectangle(100, 0, 100, 80));
    
        jLabel5.setBounds(new Rectangle(415, 5, 90, 70));
        
        
        jLabel6.setText("Facultad de Geografia");
        jLabel6.setForeground(Color.white);
        jLabel6.setFont(new Font("Arial", 0, 14));
        jLabel6.setBounds(new Rectangle(215, 25, 195, 30));

        jComboBox1.setBounds(new Rectangle(220, 90, 275, 30));
        jButton1.setText("Buscar");
        jButton1.setBounds(new Rectangle(375, 155, 115, 25));
        jButton1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jButton1_actionPerformed(e);
                }
            });
        jScrollPane1.setBounds(new Rectangle(55, 160, 275, 110));
        jLabel2.setText("Profesores que participaron en esta unidad de aprendizaje:");
        jLabel2.setBounds(new Rectangle(15, 120, 395, 35));
        jLabel2.setFont(new Font("Arial",0,12));


        this.getContentPane().add(jButton1, null);
        this.getContentPane().add(jComboBox1, null);
        this.getContentPane().add(jLabel4, null);
        this.getContentPane().add(jPanel2, null);
        jPanel1.add(jLabel5, null);
        jPanel1.add(jLabel3, null);
        jPanel1.add(jLabel6, null);
        this.getContentPane().add(jPanel1, null);
        this.add(jLabel2, null);
        jScrollPane1.getViewport().add(jTextArea1, null);
        this.add(jScrollPane1, null);
        this.add(jLabel1, null);
    }


   /* private void jTextField1_keyPressed(KeyEvent e) {
        boolean ind;
        ind=jTextField1.getText().equals("");
        if(e.getKeyCode()==e.VK_ENTER ){//&& ind2%2==0){
                Buscar();
                ind2=0;
            }
        ind2++;
    }*/
    /*Metodo que buscara la unidad y por lo consecuente a los profesores
     * hecho por luis humberto ponce hermosillo*/
    private void Buscar(){
        jTextArea1.setText("");
        File arc = new File(Path,"ProfUnid.txt");
        String linea="",prof="";
        String [] cadena=new String[2];
        if(arc.exists()==false){
            JOptionPane.showMessageDialog(this,"No hay ninguna unidad registrada","Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
            try{
                FileReader lec = new FileReader(arc);
                BufferedReader acclec = new BufferedReader(lec);
                linea=acclec.readLine();
                if(linea==null){
                    JOptionPane.showMessageDialog(this,"No hay ninguna unidad registrada","Error",JOptionPane.ERROR_MESSAGE);
                }
                while(linea!=null){
                    cadena=ExtrCamp(linea);
                    if(cadena[0].equals(jComboBox1.getSelectedItem().toString())==true){
                        prof=EliminarSep(cadena[1]);
                        break;
                    }
                    linea=acclec.readLine();
                }
                jTextArea1.append(prof);
                acclec.readLine();
            }catch(IOException e){}
        }
    }
    
    //Metodo Que Extraera Los Campos Del Registro Hecho Por Luis Humberto Ponce Hermosillo 14 Abril del 2012
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
    
    /*Metodo Que Elimina El Separador Que Tienen Los Subcampos del archivo maestros Hecho Por Luis Humberto Ponce 31 de Mayo*/
    private static String EliminarSep(String Text){
        String Are=Text,Are2="";
        int cont;
        char carac;
        for(cont=0;cont<Text.length()-1;cont++){
            carac=Are.charAt(cont);
            if(carac=='#'){
                Are2=Are2+"\n";
            }
            else{
                Are2=Are2+carac;
            }
        }
        return Are2;
    }
    
    public static void main(String arg []){
        ListProf b = new ListProf();
        b.setVisible(true);
    }

    private void jButton1_actionPerformed(ActionEvent e) {
        if(jComboBox1.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(this,"Escoga Una Unidad De La Lista","Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
            Buscar();
        }
        
    }
}
