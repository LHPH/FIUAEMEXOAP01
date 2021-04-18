package organizacion;


/*
 **********************************
 Agregar lo que se hizo antes
 **********************************
 
 **********************************
 5 de mayo del 2012
se cambio la posicion de todos los jLabel´s y jButton´s de esta pagina
Cambios hechos por Samuel Castro Soto
 **********************************
 
 **********************************
  24 de mayo del 2012
se cambio la posicion de todos los jLabel´s y jButton´s de esta pagina para darle un mejor diseño 
a la ventana, tambien se cambio el tamaño de 860 x 675 a 
tambien se agregaron separadores para una mejor distincion 
Es visible tambien que se agregaron 3 nuevas jLabel´s para identificar dichas separaciones
Cambios hechos por Samuel Castro Soto
***********************************
 */

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

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Alta extends JDialog {

   //String Path = "C:\\Users\\HÉCTOR\\Documents\\JDeveloper\\mywork\\Organizacion\\Archivos";
   String Path="Archivos";
   //static String Path = "C:\\Users\\usuario\\Documents\\OrganizacionV2\\Organizacion\\Archivos";
    private JLabel jLabel1 = new JLabel();
    private JLabel jLabel2 = new JLabel();
    private JTextField jTextField1 = new JTextField();
    private JLabel jLabel3 = new JLabel();
    private JTextField jTextField2 = new JTextField();
    private JLabel jLabel4 = new JLabel();
    private JTextField jTextField3 = new JTextField();
    private JLabel jLabel5 = new JLabel();
    private JTextField jTextField4 = new JTextField();
    private JLabel jLabel7 = new JLabel();
    private JRadioButton jRadioButton1 = new JRadioButton();
    private JRadioButton jRadioButton2 = new JRadioButton();
    private JButton jButton1 = new JButton();
    private JLabel jLabel8 = new JLabel();
    private JLabel jLabel14 = new JLabel();
    private JPasswordField jPasswordField1 = new JPasswordField();
    private JLabel jLabel15 = new JLabel();
    private JPasswordField jPasswordField2 = new JPasswordField();
    String [] EstaCivl ={"Soltero","Casado","Divorciado","Viudo"};
    private JButton jButton2 = new JButton();
    private JLabel jLabel22 = new JLabel();
    String [] PregSec ={"¿Mejor amigo de la infancia?","Pelicula preferida"};
    private JComboBox jComboBox2 = new JComboBox(PregSec);
    private JLabel jLabel23 = new JLabel();
    private JLabel jLabel25 = new JLabel();
    private JTextField jTextField14 = new JTextField();
    int Index=0;
    String Title;
    String Usur;
    String [] ContReg = new String[2];
    String Tipo;
    String Estado;
    String [] ListReg;
    String [] Camp= new String[2];
    private JButton jButton3 = new JButton();
    private JSeparator jSeparator1 = new JSeparator();
    private JLabel jLabel26 = new JLabel();
    private JSeparator jSeparator3 = new JSeparator();
    private JLabel jLabel113 = new JLabel();
    private JSeparator jSeparator4 = new JSeparator();
    private JLabel jLabel114 = new JLabel();
    private JLabel jLabel16 = new JLabel();
    private JTextField jTextField5 = new JTextField();
    private JLabel jLabel20 = new JLabel(new ImageIcon("escribir.png"));
    private JLabel jLabel21 = new JLabel(new ImageIcon("candado.png"));
    private JLabel jLabel24 = new JLabel(new ImageIcon("recordar.png"));

    public Alta(String tit,String usu) {
        Title=tit;
        Usur=usu;
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        JPanel pane = new JPanel();
       // this.getContentPane().setLayout( null );
        this.setSize(new Dimension(550, 600));//652
        this.setTitle(Title);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setModal(true);
        this.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
        //Etiqueta De Informacion
        jLabel1.setText("Campos marcados con * son obligatorios.");
        jLabel1.setBounds(new Rectangle(20, 8, 555, 30));
        jLabel1.setFont(new Font("Arial",0,14));
        jLabel1.setForeground(Color.WHITE);
        //Etiqueta De Usuario
        jLabel2.setText("Su usuario es:");
        jLabel2.setBounds(new Rectangle(20, 33, 100, 25));
        jLabel2.setFont(new Font("Arial",0,14));
        jLabel2.setForeground(Color.WHITE);
        //Etiqueta De Nombre
        jLabel3.setText("* Nombre (s):");
        jLabel3.setBounds(new Rectangle(60, 100, 100, 25));
        jLabel3.setFont(new Font("Arial",0,14));
        jLabel3.setForeground(Color.WHITE);
        //Etiqueta De Apellido Materno
        jLabel4.setText("* Apellido paterno:");
        jLabel4.setBounds(new Rectangle(23, 140, 135, 30));
        jLabel4.setFont(new Font("Arial",0,14));
        jLabel4.setForeground(Color.WHITE);
        //Etiqueta De Apellido Paterno
        jLabel5.setText("* Apellido materno:");
        jLabel5.setBounds(new Rectangle(23, 185, 135, 25));
        jLabel5.setFont(new Font("Arial",0,14));
        jLabel5.setForeground(Color.WHITE);
        
        //Etiqueta De Sexo
        jLabel7.setText("* Sexo:");
        jLabel7.setBounds(new Rectangle(100, 235, 45, 25));
        jLabel7.setFont(new Font("Arial",0,14));
        jLabel7.setForeground(Color.WHITE);
    
        //Etiqueta De Contraseña
        jLabel14.setText("* Contraseña:");
        jLabel14.setBounds(new Rectangle(55, 305, 90, 25));
        jLabel14.setFont(new Font("Arial",0,14));
        jLabel14.setForeground(Color.WHITE);
        //Etiqueta De Confirme Contraseña
        jLabel15.setText("Contraseña:");
        jLabel15.setBounds(new Rectangle(63, 355, 170, 25));
        jLabel15.setFont(new Font("Arial",0,14));
        jLabel15.setForeground(Color.WHITE);
        
        jLabel16.setText("* Confirme");
        jLabel16.setBounds(new Rectangle(75,343,90,25));
        jLabel16.setFont(new Font("Arial",0,14));
        jLabel16.setForeground(Color.WHITE);
        this.setContentPane(pane);
        
        //Etiqueta De Pregunta Secreta
        jLabel22.setText("* Pregunta secreta:");
        jLabel22.setBounds(new Rectangle(18, 420, 150, 25));
        jLabel22.setFont(new Font("Arial",0,14));
        jLabel22.setForeground(Color.WHITE);
        
        // jLabel23.setForeground(Color.WHITE);
        //Campo De Texto De Usuario
        jLabel26.setText("DATOS PERSONALES");
        jLabel26.setBounds(new Rectangle(20, 60, 200, 30));
        jLabel26.setFont(new Font("Arial", 1, 16));
        jLabel26.setForeground(Color.WHITE);
        jSeparator1.setBounds(new Rectangle(20, 85, 507, 8));


        jLabel23.setText("* Tu respuesta:");
        jLabel23.setBounds(new Rectangle(43, 470, 100, 25));
        jLabel23.setFont(new Font("Arial",0,14));
        jLabel23.setForeground(Color.WHITE);


        jLabel113.setText("SELECIONA TU CONTRASEÑA:");
        jLabel113.setBounds(new Rectangle(18,265,270,30));
        jLabel113.setFont(new Font("Arial", 1, 16));
        jLabel113.setForeground(Color.WHITE);
        
        jLabel114.setText("SI OLVIDAS TU CONTRASEÑA...");
        jLabel114.setBounds(new Rectangle(18,385,280,30));
        jLabel114.setFont(new Font("Arial", 1, 16));
        jLabel114.setForeground(Color.WHITE);
        
        jLabel20.setBounds(new Rectangle(400, 100, 100, 135)); 
        jLabel21.setBounds(new Rectangle(400, 280, 100, 135)); 
        jLabel24.setBounds(new Rectangle(400, 400, 100, 135)); 
        


        jSeparator3.setBounds(new Rectangle(20, 290, 507, 8));
        
        jSeparator4.setBounds(new Rectangle(20,410,507,8));

        jTextField1.setBounds(new Rectangle(125, 35, 55, 20));
        if(Title.equals("Editar")==false){
            jTextField1.setText(VerUsu(Path));
        }
        else{
          jTextField1.setText(Usur);  
            ContReg=Mostr(Usur,Path);  //Usuario
            Camp=ExtrCamp(ContReg[0]);
            Index=Integer.parseInt(ContReg[1]);
            Camp=ExtrCamp(Camp[1]);
            jPasswordField1.setText(DecoPass(Camp[0]));  //Contraseña
            Camp=ExtrCamp(Camp[1]); //Categoria
            Tipo=Camp[0];
            Camp=ExtrCamp(Camp[1]);
            jTextField2.setText(Camp[0]);   //Nombre
            Camp=ExtrCamp(Camp[1]);
            jTextField3.setText(Camp[0]); //Apellido Paterno
            Camp=ExtrCamp(Camp[1]);
            jTextField4.setText(Camp[0]); //Apellido Materno
            Camp=ExtrCamp(Camp[1]);
            if(Camp[0].equals("Masculino")==true){  //Sexo
                jRadioButton1.setSelected(true);
                jRadioButton2.setSelected(false);
            }
            else{
                jRadioButton1.setSelected(false);
                jRadioButton2.setSelected(true);
            }
            Camp=ExtrCamp(Camp[1]);//Activo
            
            Camp=ExtrCamp(Camp[1]);
            jComboBox2.setSelectedIndex(Integer.parseInt(Camp[0])); //Pregunta Secreta
            Camp=ExtrCamp(Camp[1]);
            jTextField5.setText(Camp[0]); //Respuesta*/
        }
        jTextField1.setEnabled(false);
        //Campo De Texto De Nombre
        jTextField1.setDisabledTextColor(new Color(198, 198, 198));
        jTextField2.setBounds(new Rectangle(150, 100, 200, 25));
        //Campo De Texto De Apellido Paterno
        jTextField3.setBounds(new Rectangle(150, 145, 200, 25));
        //Campo De Texto De Apellido Materno
        jTextField4.setBounds(new Rectangle(150, 190, 200, 25));
        jTextField14.setDisabledTextColor(new Color(231, 231, 231));

        //Opcion Masculino
        jRadioButton1.setText("Masculino");
        jRadioButton1.setBounds(new Rectangle(150, 235, 100, 25));
        jRadioButton1.setContentAreaFilled(false);
        jRadioButton1.setFont(new Font("Arial",0,14));
        jRadioButton1.setForeground(Color.WHITE);
        jRadioButton1.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    EscSexMasc(e);
                }
            });
         //Opcion Femenino
        jRadioButton2.setText("Femenino");
        jRadioButton2.setBounds(new Rectangle(270, 235, 100, 25));
        jRadioButton2.setFont(new Font("Arial",0,14));
        jRadioButton2.setForeground(Color.WHITE);
        jRadioButton2.setContentAreaFilled(false);
        jRadioButton2.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    EscSexFem(e);
                }
            });
        //Boton Registrarse
        if(Title.equals("Editar")==false){
            jButton1.setText("Guardar");
            
        }
        else{
            jButton1.setVisible(false);
        }
        //jButton1.setText("Registrarse");
        jButton1.setBounds(new Rectangle(260, 510, 110, 20));//270
        jButton1.setFont(new Font("Arial",0,12));
        jButton1.setIcon(new ImageIcon("guardar.png"));
        jButton1.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    RegiUsua(e);
                }
            });
        
        //Boton Registrar
        jButton2.setText("Regresar");
        jButton2.setBounds(new Rectangle(130, 510, 115, 20));//150
        jButton2.setFont(new Font("Arial",0,12));
        jButton2.setIcon(new ImageIcon("regresar1.png"));
        jButton2.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    ClicRegr(e);
                }
            });
        
        if(Title.equals("Editar")==true){
            jButton3.setText("Actualizar");
        }
        else{
            jButton3.setVisible(false);
        }
        jButton3.setBounds(new Rectangle(260, 510, 110, 20));//270
        //Contraseña
        jButton3.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    Actual(e);
                }
            });
        jPasswordField1.setBounds(new Rectangle(150, 305, 200, 25));
        //Confirme Contraseña
        jPasswordField2.setBounds(new Rectangle(150, 350, 200, 25));
        //Lista De Estado Civil
        //Lista De Preguntas Secretas
        jComboBox2.setBounds(new Rectangle(150, 425, 200, 25));
        jComboBox2.setBackground(Color.white);
        //Lo Que Tiene El Frame
        this.getContentPane().add(jTextField5, null);
        this.getContentPane().add(jLabel16, null);
        this.getContentPane().add(jLabel114, null);
        this.getContentPane().add(jSeparator4, null);
        this.getContentPane().add(jLabel113, null);
        this.getContentPane().add(jSeparator3, null);
        this.getContentPane().add(jLabel26, null);
        this.getContentPane().add(jSeparator1, null);
        this.getContentPane().add(jButton3, null);
        this.getContentPane().add(jTextField14, null);
        this.getContentPane().add(jLabel23, null);
        this.getContentPane().add(jComboBox2, null);
        this.getContentPane().add(jLabel22, null);
        this.getContentPane().add(jButton2, null);
        this.getContentPane().add(jPasswordField2, null);
        this.getContentPane().add(jLabel15, null);
        this.getContentPane().add(jPasswordField1, null);
        this.getContentPane().add(jLabel14, null);
        this.getContentPane().add(jButton1, null);
        this.getContentPane().add(jRadioButton2, null);
        this.getContentPane().add(jRadioButton1, null);
        this.getContentPane().add(jLabel7, null);
        this.getContentPane().add(jTextField4, null);
        this.getContentPane().add(jLabel5, null);
        this.getContentPane().add(jTextField3, null);
        this.getContentPane().add(jLabel4, null);
        this.getContentPane().add(jTextField2, null);
        this.getContentPane().add(jLabel3, null);
        this.getContentPane().add(jTextField1, null);
        this.getContentPane().add(jLabel2, null);
        this.getContentPane().add(jLabel1, null);
        this.getContentPane().add(jLabel20, null);
        this.getContentPane().add(jLabel21, null);
        this.getContentPane().add(jLabel24, null);
        
        //this.getContentPane().add(jScrollBar1);
        //Lo Que Se Agrega Al Contenedor
        pane.add(jLabel22);
        pane.add(jLabel21);
        pane.add(jLabel20);
        pane.add(jLabel114);
        pane.add(jLabel113);
        pane.add(jLabel14);
        pane.add(jLabel26);
        pane.add(jSeparator4);
        pane.add(jSeparator3);
        pane.add(jSeparator1);
        pane.add(jLabel1);
        pane.add(jLabel2);
        pane.add(jLabel3);
        pane.add(jLabel4);
        pane.add(jLabel5);
        pane.add(jLabel7);
        pane.add(jLabel14);
        pane.add(jLabel15);
        pane.add(jLabel22);
        //pane.add(jLabel23);
        pane.add(jTextField1);
        pane.add(jTextField2);
        pane.add(jTextField3);
        pane.add(jTextField4);
        pane.add(jRadioButton1);
        pane.add(jRadioButton2);
        pane.add(jButton1);
        pane.add(jButton2);
        pane.add(jButton3);
        pane.add(jPasswordField1);
        pane.add(jPasswordField2);
        pane.add(jComboBox2);
        pane.add(jLabel23);
        pane.add(jTextField14);
        //pane.add(jLabel23);
        //Manejar Libremente El Panel
        pane.setLayout(null);
        pane.setBackground(new Color(0,100,0));
        jTextField5.setBounds(new Rectangle(150, 470, 200, 25));


        //this.setBackground(Color.white);
    }

   /*Metodo que se llama al llenar los campos y presionar el boton Registrar*/
    private void RegiUsua(MouseEvent e) {
         String numFin="",nomUsr=""; 
        int conf,numLong;
        String cont="",cont2="",cont3="";
        boolean ind1,ind2,ind3,ind12,ind13,ind14;
       ind1=jTextField2.getText().equals("");
       ind2=jTextField3.getText().equals("");
       ind3=jTextField4.getText().equals("");
       ind12=jPasswordField1.getPassword().equals("");
       ind13=jPasswordField2.getPassword().equals("");
       ind14=jTextField5.getText().equals("");
        
        //Confirmar Si Los Campos Obligados Estan Llenos
        if(ind1==true || ind2==true || ind3==true  ||  ind12==true || ind13==true || ind14==true ||
           (jRadioButton1.isSelected()==false && jRadioButton2.isSelected()==false)){
                    JOptionPane.showMessageDialog(this,"Error, los campos marcados con * se deben llenar", "Error",JOptionPane.ERROR_MESSAGE);
                                            
        }else{
            cont=cont3.valueOf(jPasswordField1.getPassword());
            cont2=cont3.valueOf(jPasswordField2.getPassword());
            if(CompPass(cont,cont2)==false){
                jPasswordField1.setText("");
                jPasswordField2.setText("");
            }else{
                    conf=JOptionPane.showConfirmDialog(this,"Al hacer clic en 'aceptar' confirma que los datos proporcionados son veridicos." +
                        " Ah quedado Registrado en el sistema 'Gracias'", "Confirmacion De Registro",JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
                if(conf==JOptionPane.OK_OPTION){
                    try{
                        //Escribir En El Archivo Usuarios
                        File arc= new File(Path,"Usuarios.txt");
                        BufferedWriter esc = new BufferedWriter(new FileWriter(arc,true));
                        PrintWriter escArc = new PrintWriter(esc);
                        escArc.print(jTextField1.getText()); //Usuario
                        escArc.print(";");
                        cont=CodePass(cont);
                        escArc.print(cont); //Contraseña
                        escArc.print(";");
                        if(Title.equals("Alta Usuario")==true){
                            escArc.print("Profesor"); //Categoria
                        }
                        else{
                            if(Title.equals("Alta Coordinador")==true){
                                escArc.print("Coordinador"); //Categoria
                            }
                            else{
                                escArc.print("Administrador");
                            }
                        }
                        escArc.print(";");
                        escArc.print(jTextField2.getText()); //Nombre
                        escArc.print("#");
                        escArc.print(jTextField3.getText());  //Apellido Paterno
                        escArc.print("#");
                        escArc.print(jTextField4.getText()); //Apellido Materno
                        escArc.print(";");
                        if(jRadioButton1.isSelected()==true){ //Sexo
                            escArc.print("Masculino");
                            escArc.print(";");
                        }else{
                            escArc.print("Femenino");
                            escArc.print(";");
                        }
                        escArc.print("Activo"); //Estado
                        escArc.print(";");
                        escArc.print(jComboBox2.getSelectedIndex()); //Pregunta Secreta
                        escArc.print("#");
                        escArc.print(jTextField5.getText());//Respuesta
                        escArc.print(";");
                        escArc.println("");
                        escArc.close();
                        File arc2 = new File(Path,"config.ini");
                        BufferedWriter accEsc = new BufferedWriter(new FileWriter(arc2,true));
                        PrintWriter escArc2 = new PrintWriter(accEsc);
                        nomUsr=jTextField1.getText();
                        numLong=jTextField1.getText().length();
                        numFin=nomUsr.substring(numLong-1, numLong);
                        escArc2.println(Integer.parseInt(numFin));
                        escArc2.close();
                        JOptionPane.showMessageDialog(this,"Registro satisfactorio","Registro",JOptionPane.INFORMATION_MESSAGE); 
                        this.dispose();
                    } catch (IOException f) { System.out.println("ee");
                    }
                  
                } 
              }    
            }
        }
        

    private void ClicRegr(MouseEvent e) {
        this.dispose();
        
    }
    private void EscSexFem(MouseEvent e) {
        jRadioButton1.setSelected(false);
    }

    private void EscSexMasc(MouseEvent e) {
          jRadioButton2.setSelected(false);
    }
    
    //Metodo Que Verifica El Numero De Usuarios
    public static String VerUsu(String Path){
        String line="";
        int numArc=0;
        File arc = new File(Path,"config.ini");
        if(arc!=null){
            try{
                FileReader leearc = new FileReader(arc);
                BufferedReader acclec = new BufferedReader(leearc);
                line=acclec.readLine();
                while(line!=null){
                    numArc++;
                    line=acclec.readLine();
                }
                acclec.close();
            } catch (FileNotFoundException e) {
            } catch (IOException e) {
            }
        }
        else{
                FileWriter escarc;
            try {
                escarc = new FileWriter(arc);
            } catch (IOException e) {
            }
        }
             
        return "Usr0"+numArc;
        }
    //Metodo Que Comprueba Si La Contraseña es valida en longitud, igualdad y sin espacios en blanco
  public static boolean CompPass(String pass,String pass2){
        int cont;
        boolean ban,ban2,ban3;
        char carac;
        ban=false;
        ban2=false;
        ban3=true;
        if(pass.length()<=8){
            ban=true;
        }
        else{
            ban=false;
        }
        
        if(pass.equals(pass2)==true && ban==true){
            ban2=true;
        }
        else{
            ban2=false;
        }
        if(ban==true && ban==true){
            for(cont=0;cont<pass.length();cont++){
                carac=pass.charAt(cont);
                if(carac==' '){
                    ban3=false;
                    break;
                }
            }
            
        }
        if(ban==true && ban2==true && ban3==true){
            return true;
        }
        else{
            if(ban==false){
                JOptionPane.showMessageDialog(null,"Error, la contraseña sebe ser de máximo 8 caracteres","Error",JOptionPane.ERROR_MESSAGE);
            }
            else{
                if(ban2==false){
                    JOptionPane.showMessageDialog(null,"Error, las Contraseñas no coinsiden","Error",JOptionPane.ERROR_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Error, la contraseña no debe tener espacios","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        return false;
    }
  
  //Metodo Que Codifica La Contraseña
  public static String CodePass(String pass){
        int lon,cont,car;
        String cad="",cad2="";
        char carac;
        lon=pass.length();
        for(cont=0;cont<lon;cont++){
            car=pass.codePointAt(cont);
            cad=cad+car+"*";
        }
        cad=cad+lon;
        lon=cad.length();
        for(cont=lon-1;cont>=0;cont--){
            carac=cad.charAt(cont);
            cad2=cad2+carac;
        }
        return cad2;
    }


    private void Actual(MouseEvent e) {
        String cont="",cont2="",cont3="",reg="",linea="";
        String camp="",camp2="",camp3="",camp4="",camp5="",camp6="",camp7="",camp8="",camp9="",camp10="",camp11="",camp12=""
            ,camp13="",camp14="",camp15="",camp16="",camp17="",camp18="",camp19="",camp20="",camp21="";
        boolean ind1,ind2,ind3,ind12,ind13,ind14;
        int conta=0,tam;
        ind1=jTextField2.getText().equals("");
        ind2=jTextField3.getText().equals("");
        ind3=jTextField4.getText().equals("");
        ind12=jPasswordField1.getPassword().equals("");
        ind13=jPasswordField2.getPassword().equals("");
        ind14=jTextField5.getText().equals("");
        
        //Confirmar Si Los Campos Obligados Estan Llenos
        if(ind1==true || ind2==true || ind3==true ||ind14==true  || ind14==true  || ind12==true || ind13==true ||(jRadioButton1.isSelected()==false && jRadioButton2.isSelected()==false)){
                    JOptionPane.showMessageDialog(this,"Falta campos marcados con * por llenar", "Error",JOptionPane.ERROR_MESSAGE);
                                            
        }else{
            cont=cont3.valueOf(jPasswordField1.getPassword());
            cont2=cont3.valueOf(jPasswordField2.getPassword());
            if(CompPass(cont,cont2)==false){
                jPasswordField1.setText("");
                jPasswordField2.setText("");
            }else{
                   tam=ContLineArch(Path);
                    ListReg=new String[tam];
                    camp=jTextField1.getText()+";";
                    camp2=CodePass(cont)+";";
                    camp3=Tipo+";";
                    camp4=jTextField2.getText()+"#";
                    camp5=jTextField3.getText()+"#";
                    camp6=jTextField4.getText()+";";
                    if(jRadioButton1.isSelected()==true){ //Sexo
                        camp8="Masculino"+";";                                
                    }
                    else{
                       camp8="Femenino"+";";
                    }
                   camp19="Activo;";
                   camp20=jComboBox2.getSelectedIndex()+"#";
                   camp21=jTextField5.getText()+";";
                reg=camp+camp2+camp3+camp4+camp5+camp6+camp7+camp8+camp9+camp10
                    +camp11+camp12+camp13+camp14+camp15+camp16+camp17+camp18+camp19+camp20+camp21;
                    File arc= new File(Path,"Usuarios.txt");
                    FileReader acclec;
                try {
                    acclec = new FileReader(arc);
                    BufferedReader leer = new BufferedReader(acclec);
                    linea=leer.readLine();
                    while(linea!=null){
                        ListReg[conta]=linea;
                        linea=leer.readLine();
                        conta++; 
                    }
                    ListReg[Index]=reg;
                } catch (FileNotFoundException f) {
                } catch (IOException f) {
                }


                try{
                    //Escribir En El Archivo Usuarios
                    File arc2= new File(Path,"Usuarios.txt");
                    BufferedWriter esc =new BufferedWriter(new FileWriter(arc2)); 
                    PrintWriter escArc = new PrintWriter(esc);
                    for(conta=0;conta<tam;conta++){
                        escArc.print(ListReg[conta]);
                        escArc.println("");
                    }
                    escArc.close();
                    
                } catch (IOException f) {
                }
                JOptionPane.showMessageDialog(this,"Actualizacion satisfactoria","Actualizacion",JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                }
            }
                    
    }    
    
    public static String [] Mostr(String usur,String Path){
        String line="";
        String [] contReg;
        String [] camp = new String[2];
        String [] reg=new String[2];
        int numArc=0,tam;
        tam=ContLineArch(Path);
        contReg=new String[tam];
        File arc = new File(Path,"Usuarios.txt");
        if(arc!=null){
            try{
                FileReader leearc = new FileReader(arc);
                BufferedReader acclec = new BufferedReader(leearc);
                line=acclec.readLine();
                while(line!=null){
                    camp=ExtrCamp(line);
                    if(usur.equals(camp[0])==true){
                        reg[0]=line;
                        break;
                    }
                    numArc++;
                    line=acclec.readLine();
                }
                reg[1]=String.valueOf(numArc);
                acclec.close();
            } catch (FileNotFoundException e) {
            } catch (IOException e) {
            }
        }
        return reg;
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
    public static String DecoPass(String pass){
        int cont,lon,nume;
        char carac,carac2;
        String cad="",cad2="",contr="";
        lon=pass.length();
        for(cont=lon-1;cont>0;cont--){
            carac=pass.charAt(cont);
            cad=cad+carac;
        }
        lon=cad.length();
        for(cont=0;cont<lon;cont++){
            carac=cad.charAt(cont);
            if(carac!='*'){
                cad2=cad2+carac;
            }else{
                nume=Integer.parseInt(cad2);
                carac2=(char)nume;
                contr=contr+carac2;
                cad2="";
            }
        }
        return contr;
    }

   
}

