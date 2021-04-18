package organizacion;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;

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

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Alumnos extends JDialog {
    String Path="Archivos";
    private JLabel jLabel1 = new JLabel();//Etiqueta de NOmbre
    private JLabel jLabel2 = new JLabel();//Etiqueta Periodo
    private JLabel jLabel3 = new JLabel();//Etiqueta Clave
    private JTextField jTextField1 = new JTextField();//Campo donde se ingresa nombre
    private JTextField jTextField2 = new JTextField();//Campo donde se ingresa Perido
    private JTextField jTextField3 = new JTextField();//Campo donde se ingresa Clave
    private JButton jButton1 = new JButton();//Boton con la funcion de visualizar
    String lista[]= new String[1000];
    private JButton jButton2 = new JButton();//Boton con la funcion de guardado
    private JPanel jPanel1 = new JPanel();
    private JPanel jPanel2 = new JPanel();

    public Alumnos() {
        this(null, "", false);
    }

    public Alumnos(Frame parent, String title, boolean modal) {
        super(parent, title, modal);
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

 


    private void jbInit() throws Exception {
        this.setSize(new Dimension(450, 277));
        this.getContentPane().setLayout( null );
        jLabel1.setText("Nombre:");
        jLabel1.setBounds(new Rectangle(45, 60, 80, 25));
        jLabel2.setText("Periodo:");
        jLabel2.setBounds(new Rectangle(45, 95, 80, 25));
        jLabel3.setText("Clave:");
        jLabel3.setBounds(new Rectangle(54, 130, 50, 25));
        
        jTextField1.setBounds(new Rectangle(100, 60, 140, 25));
        jTextField2.setBounds(new Rectangle(100, 95, 40, 25));
        jTextField3.setBounds(new Rectangle(100, 130, 60, 25));

        jButton1.setText("Guardar");
        jButton1.setBounds(new Rectangle(295, 170, 120, 25));
        jButton1.setIcon(new ImageIcon("guardar.png"));
        jButton1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    guardar(e);
                }
            });
        
        jButton2.setText("Visualizar");
        jButton2.setBounds(new Rectangle(155, 170, 120, 25));
        jButton2.setIcon(new ImageIcon("visualizar.png"));
        jButton2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    visualizar(e);
                }
            });

        jPanel1.setBounds(new Rectangle(0,0,450,50));
        jPanel1.setBackground(new Color(0,100,0));
        jPanel2.setBounds(new Rectangle(0,205,450,50));
        jPanel2.setBackground(new Color(0,100,0));
        this.getContentPane().add(jPanel2, null);
        this.getContentPane().add(jPanel1, null);
        this.getContentPane().add(jButton2, null);
        this.getContentPane().add(jButton1, null);
        this.getContentPane().add(jTextField3, null);
        this.getContentPane().add(jTextField2, null);
        this.getContentPane().add(jTextField1, null);
        this.getContentPane().add(jLabel3, null);
        this.getContentPane().add(jLabel2, null);
        this.getContentPane().add(jLabel1, null);
    }

    private void guardar(ActionEvent e) {//Modulo que guarda el registro en el archivo de alumnos 
        int i,cont;
        boolean ind1,ind2,ind3,b=false;
        Hash hs = new Hash();
        ind1=jTextField1.getText().equals("");
        ind2=jTextField2.getText().equals("");
        ind3=jTextField3.getText().equals("");
        //Confirmar Si Los Campos Obligados Estan Llenos
        
        if(ind1==true || ind2==true || ind3==true ){
                    JOptionPane.showMessageDialog(this,"Error, No se han llenado todos los campos", "Error",JOptionPane.ERROR_MESSAGE);
                                            
        }else{
            if(((jTextField3.getText()).length()>4) || ((jTextField3.getText()).length()<4)){
                    JOptionPane.showMessageDialog(this,"Su numero de clave no puede ser mayor o menor a 4 digitos","Error",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                //En caso de estar llenos todos los campos se dispone a guardar la informacion mediante el accesdo hash
                i=hs.formula(jTextField3.getText());
                File arc = new File(Path,"Alumno.txt");
                if(arc.exists()==false){
                inicializar();
                }
                lista=cargar();
                    try {
                        BufferedWriter clec = new BufferedWriter(new FileWriter(arc));
                        PrintWriter esc = new PrintWriter(clec);
                        cont=0;
                        cont=0;
                        while(cont<1000){                        
                            //Condicion de Colisiones
                            if((cont==i)&&(lista[i].equals("")==true)){
                                esc.print(jTextField1.getText());
                                esc.print(";");
                                esc.print(jTextField2.getText());
                                esc.print(";");
                                esc.print(jTextField3.getText());
                                esc.print(";");
                                esc.println("");
                                }
                          else
                            {
                                esc.println(lista[cont]);
                           }
                          if((cont==i)&&(lista[i].equals("")==false)){
                                b=true;   
                          }

                            cont=cont+1;
                        }
                        esc.close();
                        if(b==true){
                            colisiones();
                            }
                    JOptionPane.showMessageDialog(this,"Registro Satisfactorio","Exito al Guardar",JOptionPane.INFORMATION_MESSAGE);
                } catch (IOException t) {
                }
            }
        }
    }
    
    public static void main (String arg[]){
        Alumnos alu= new Alumnos();
        alu.setVisible(true);
        }

    private void visualizar(ActionEvent e) {//Modulo que busca el alumno por clave tanto en el principal como en el de colisiones
        Hash ha = new Hash();
        String lin="";
        String clave;
        String linr;
        int con=0;
        int cont;
        clave=JOptionPane.showInputDialog(this,"Clave del Alumno");
        int i=ha.formula(clave);
        File arc= new File(Path,"Alumno.txt");
        FileReader acclec;
        try {
        acclec = new FileReader(arc);
        BufferedReader leer = new BufferedReader(acclec);
         while(con<1000){
            lista[con]=leer.readLine();
            con=con+1;
         }
            leer.close();
            if(lista[i].indexOf(clave)!=-1){
                lin=lista[i];
                cont=lin.indexOf(";");
                linr=lin.substring(0,cont);
                jTextField1.setText(linr);
                lin=lin.substring(cont+1);
                cont=lin.indexOf(";");
                linr=lin.substring(0,cont);
                jTextField2.setText(linr);
                lin=lin.substring(cont+1);
                System.out.println(lin);
                cont=lin.indexOf(";");
                linr=lin.substring(0,cont);
                jTextField3.setText(linr);
                }
            else{
                try{
                File arce = new File(Path,"Colisiones.txt");
                FileReader cle = new FileReader(arce);
                BufferedReader le = new BufferedReader(cle);
                String linea= le.readLine();
                    while(linea!=null){
                        if(linea.indexOf(clave)!=-1){
                            lin=linea;
                            break;
                            }
                        linea=le.readLine();
                        }
                        le.close();
                        System.out.println(lin);
                        lin=lista[i];
                        lin=lista[i];
                        cont=lin.indexOf(";");
                        linr=lin.substring(0,cont);
                        jTextField1.setText(linr);
                        lin=lin.substring(cont+1);
                        cont=lin.indexOf(";");
                        linr=lin.substring(0,cont);
                        jTextField2.setText(linr);
                        lin=lin.substring(cont+1);
                        System.out.println(lin);
                        cont=lin.indexOf(";");
                        linr=lin.substring(0,cont);
                        jTextField3.setText(linr);
                    }
                catch(FileNotFoundException l){
                         }
                }
        } catch (FileNotFoundException f) {
        } catch (IOException f) {
        }
        
    }
    
    public String[] cargar(){
        //String [] lista = new String[1000];
        int con=0;
        // Para obetneter el indice del archivo  *int i=ha.formula(clave);*
        File arc= new File(Path,"Alumno.txt");
        FileReader acclec;
        try {
            acclec = new FileReader(arc);
            BufferedReader leer = new BufferedReader(acclec);
            while(con<1000){
                lista[con]=leer.readLine();
                con=con+1;
            }
               //El elemento buscado sera *lista[i+1]*
            } catch (FileNotFoundException f) {
            } catch (IOException f) {
            }
        return lista;
    }
    
    public void colisiones(){//De haber una colision en hash se procede a guardar el registro en el archivo Colisiones.txt
            try{
            File arc= new File(Path,"Colisiones.txt");
            BufferedWriter esc = new BufferedWriter(new FileWriter(arc,true));
            PrintWriter escArc = new PrintWriter(esc);        
            escArc.print(jTextField1.getText());
            escArc.print(";");
            escArc.print(jTextField2.getText());
            escArc.print(";");
            escArc.print(jTextField3.getText());
            escArc.print(";");
            escArc.println("");
            escArc.close();
            } catch (IOException f) { 
            }
        }
    
    public void inicializar(){
        int cont=0;
        try{
            File arc = new File(Path,"Alumno.txt");
            BufferedWriter clec = new BufferedWriter(new FileWriter(arc));
            PrintWriter esc = new PrintWriter(clec);
            while(cont<1000){                        
                    esc.println("");
                cont=cont+1;
            }
            esc.close();
            } catch (IOException t) {
            }
        
        }
    private String [] ExtrCamp(String cad) {//Modulo que separa los campos de un registro
             String [] cadReg= new String[3];
             String camp="",res;
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
                     camp="";
                     //res=cad.substring(cont+1, lon);
                     for(cont=cont+1;cont<lon;cont++){
                         car=cad.charAt(cont);
                         if(car!=';'){
                             camp=camp+car;
                         }
                         if(car==';'){
                             cadReg[1]=camp;
                             cadReg[2]=cad.substring(cont+1, lon-1);
                             break;
                         }
                     }
                 }         
             }
             return cadReg;    
        }
}



