package organizacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;

import java.awt.Font;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Cursor;

import java.awt.event.MouseAdapter;

import java.awt.event.MouseEvent;

import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;

import java.awt.event.WindowEvent;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.io.InputStream;

import java.io.OutputStream;

import java.io.PrintWriter;

import java.util.Calendar;

import java.util.GregorianCalendar;
import javax.swing.Timer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.UIManager;

public class ControldeAcceso extends JFrame {
    
    ventAdmon VA = new ventAdmon();
    venCoord VC = new venCoord();
    venProf VP = new venProf();
    
    int ino=0;  //Numero De Intentos
    String [] Usu;  //Array De Usuarios
    String [] Passw;  //Array de Passwords
    String [] ContRegUsua; //Contenedor De Registros De Usuarios
    String Nomb;  //Nombre Del Usuario
    String Usu2=null;
    int ContLin;
    boolean Conn=false;
   // String Path = "C:\\Users\\HÉCTOR\\Documents\\JDeveloper\\mywork\\Organizacion\\Archivos";
   //String Path = "C:\\Users\\usuario\\Documents\\OrganizacionV2\\Organizacion\\Archivos";
   String Path="Archivos"; 
   
    private JLabel jLabel1 = new JLabel();
    private JLabel jLabel2 = new JLabel();
    private JButton jButton1 = new JButton();
    private JButton jButton2 = new JButton();
    private JPasswordField jPasswordField1 = new JPasswordField();
    private JFormattedTextField jFormattedTextField1 = new JFormattedTextField();
    private JLabel jLabel3 = new JLabel();
    private JLabel jLabel4 = new JLabel();
    private JLabel jLabel5 = new JLabel();
    // Escudos universitarios
    private JLabel jLabel6 = new JLabel(new ImageIcon("Escudo.png"));
    private JLabel jLabel10 = new JLabel(new ImageIcon("escudo2.png")); 
    private JLabel jLabel8 = new JLabel(new ImageIcon("FG.png"));
    private JLabel jLabel18 = new JLabel(new ImageIcon("usuario.png"));
    private JLabel jLabel19 = new JLabel(new ImageIcon("contraseña.png"));
     
  
    Bitacora bit = new Bitacora();
    private JLabel jLabel9 = new JLabel();
    private JPanel jPanel1 = new JPanel();
    private JLabel jLabel7 = new JLabel();
    
    private JPanel jPanel2 = new JPanel();
    private JLabel jLabel12 = new JLabel();
    private JLabel jLabel11 = new JLabel();
    private JLabel jLabel13 = new JLabel();
    private JLabel jLabel14 = new JLabel();
    
    JLabel  A1;
    JLabel  A2;
    JLabel  A3;
    JLabel  A4;
    JLabel  A5;
    JLabel  A6;
    JLabel  A7;
    
    JLabel B1;
    JLabel B2;
    JLabel B3;
    JLabel B4;
    JLabel B5;
    JLabel B6;
    JLabel B7;
    JLabel B8;
    
    JLabel C1;
    JLabel C2;
    JLabel C3;
    JLabel C4;
    JLabel C5;
    JLabel C6;
    JLabel C7;
    JLabel C8; ///agregue
    
    int ltm=900;
    int sdeo=0;
    Timer timer = new Timer (100, new ActionListener() {
           public void actionPerformed (ActionEvent e){
               if(sdeo==ltm){
                   timer.stop();
                   cerrar();
               }
               sdeo=sdeo+1;
               }
           });
    private JLabel jLabel15 = new JLabel();


    public ControldeAcceso() {
        try {
            timer.start();
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.setTitle("Acceso");
        this.setLayout( null );
        this.setResizable(false);
        this.setSize(new Dimension(720, 355));//1062 400

        this.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    this_windowClosing(e);
                }
            });
        this.setIconImage(new ImageIcon("Escudo.png").getImage());
        this.addMouseMotionListener(new MouseMotionAdapter() {
                       public void mouseMoved(MouseEvent e) {
                           movimiento(e);
                       }
        });
        RA();
        
        jLabel1.setText("Usuario:");
        jLabel1.setBounds(new Rectangle(250, 124, 80, 25));
        jLabel1.setForeground(Color.black);
        jLabel1.setBackground(new Color(0, 132, 0));
        jLabel1.setFont(new Font("Arial", 0, 12));
        
        jLabel2.setText("Password:");
        //jLabel2.setBounds(new Rectangle(335, 235, 80, 25));
        jLabel2.setBounds(new Rectangle(238, 159, 80, 25));
        jLabel2.setForeground(Color.black);
        jLabel2.setFont(new Font("Arial", 0, 12));
        
        jLabel5.setBounds(new Rectangle(0, 10, 200, 128));
 
        jLabel18.setBounds(new Rectangle(220, 131, 40, 20));
        jLabel19.setBounds(new Rectangle(205, 165, 40, 20));
       
        jPasswordField1.setBounds(new Rectangle(313, 160, 165, 25));
        
        jFormattedTextField1.setBounds(new Rectangle(313,124,165,25 ));
        jFormattedTextField1.setFont(new Font("Arial", 0, 12));
        
        jButton1.setText("Iniciar sesión");
       
        jButton1.setBounds(new Rectangle(408,219,130,25 ));
        jButton1.setFont(new Font("Arial", 0, 12));
        jButton1.setIcon(new ImageIcon("Ok.png"));
        jButton1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    Action(e);
                }
            });
        
        jButton2.setText("Registrate");
        
        jButton2.setBounds(new Rectangle(262,219,130,25));
        jButton2.setIcon(new ImageIcon("registrate.png"));
        jButton2.setFont(new Font("Arial", 0, 12));
        jButton2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    Registrar(e);
                }
            });

        jPanel1.add(jLabel11, null);
        jPanel1.add(jLabel7, null);
        
        jPanel2.add(jLabel14, null);
        jPanel2.add(jLabel13, null);
        jPanel2.add(jLabel8, null);
        jPanel2.add(jLabel12, null);
        jPanel2.add(jLabel10, null);
        jPanel2.add(jLabel6, null);
        
        this.getContentPane().add(jLabel15, null);
        this.getContentPane().add(jPanel2, null);
        this.getContentPane().add(jPanel1, null);
        this.getContentPane().add(jLabel9, null);
        
        this.add(jLabel18, null);
        this.add(jLabel19, null);
        this.add(jButton2, null);
    
        this.add(jLabel5, null);
        this.add(jLabel4, null);
        this.add(jLabel3, null);
        this.add(jFormattedTextField1, null);
        this.add(jPasswordField1, null);
        this.add(jButton1, null);
        this.add(jLabel2, null);
        this.add(jLabel1, null);

        jLabel9.setText("Olvido de contraseña");
        jLabel9.setForeground(Color.blue);
        jLabel9.setBounds(new Rectangle(335, 189, 245, 25));
        jLabel9.setFont(new Font("Arial", 0, 12));
        jLabel9.addMouseListener(new MouseAdapter() {
                public void mouseEntered(MouseEvent e) {
                    EntrLinkRecCont(e);
                }

                public void mouseExited(MouseEvent e) {
                    ExitLinkRecCont(e);
                }

                public void mouseClicked(MouseEvent e) {
                    ClickLinkRecCont(e);
                }
            });
    
        /* posicion del panel superior en el que se guardan lo relacionado a escudos, el nombre de la universidad y el 
        nombre de la facultad*/
        jPanel1.setBounds(0,275,720,50);
        jPanel1.setBackground(new Color(0,100,0));
        jPanel1.setLayout( null ); 

        jPanel1.setBounds(new Rectangle(0, 280, 720, 50));
        jLabel7.setText("FACULTAD DE GEOGRAFIA CERRO DE COATEPEC S/N, CIUDAD UNIVERSITARIA, TOLUCA ESTADO DE MEXICO, CP. 50100");
        jLabel7.setBounds(10,03,700,30);
        jLabel7.setFont(new Font("Arial",0,12));
        jLabel7.setForeground(Color.white);

        jLabel11.setText("TEL: (722) 2 15 02 55 FAX: (722) 2 14 31 81");
        jLabel11.setBounds(240,20,700,30);
        jLabel11.setFont(new Font("Arial",0,12));
        jLabel11.setForeground(Color.white);

        jLabel13.setText("Universidad Autónoma del Estado de México");
        jLabel13.setBounds(new Rectangle(200, 15, 425, 35));
        jLabel13.setForeground(Color.white);
        jLabel13.setFont(new Font("Arial", 0, 16));

        jLabel14.setText("Facultad de Geografía");
        jLabel14.setBounds(new Rectangle(200, 42, 225, 15));        
        jLabel14.setForeground(Color.white);
        jLabel14.setFont(new Font("Arial", 0, 15));
        
        /* Posiscion del panel y el color del mismo en el que se guardan la direccion y telefonos de la facultad*/
        jPanel2.setBounds(0,0,720,85);
        jPanel2.setBackground(new Color(0,100,0));
        jPanel2.setLayout( null );
        
        jLabel6.setBounds(new Rectangle(0, 4, 100, 80));
        jLabel10.setBounds(new Rectangle(90, 4, 100, 80));
        jLabel12.setBounds(new Rectangle(625, 8, 90, 70));
        
        jLabel8.setBounds(new Rectangle(625, 8, 90, 70));
        
         A1=VA.getLabel7();
         A1.addMouseListener(new MouseAdapter() {
                        public void mouseClicked(MouseEvent e) {
                              timer.stop();
                               Alta ac = new Alta("Alta Coordinador",null);
                               ac.setVisible(true);
                        }
                        
                        public void mouseEntered(MouseEvent k){
                            setCursor(getCursor().getPredefinedCursor(Cursor.HAND_CURSOR));
                            A1.setText("<html><u>Registrar coordinador</u><html>");
                        }
                        public void mouseExited(MouseEvent l){
                            setCursor(getCursor().getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                            A1.setText("Registrar coordinador");
                        }
                    });
         
         A2=VA.getLabel8();
         A2.addMouseListener(new MouseAdapter() {
                        public void mouseClicked(MouseEvent e) {
                            timer.stop();
                            Baja bp = new Baja();
                            bp.setVisible(true);
                        }
                        
                        public void mouseEntered(MouseEvent k){
                            setCursor(getCursor().getPredefinedCursor(Cursor.HAND_CURSOR));
                            A2.setText("<html><u>Alta o baja usuario</u><html>");
                        }
                        public void mouseExited(MouseEvent l){
                            setCursor(getCursor().getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                            A2.setText("Alta o baja usuario");
                        }
                    });
         
         A3=VA.getLabel9();
         A3.addMouseListener(new MouseAdapter() {
                        public void mouseClicked(MouseEvent e) {
                               timer.stop();
                               Alta ac = new Alta("Alta Usuario",null);
                               ac.setVisible(true);
                        }
                        
                        public void mouseEntered(MouseEvent k){
                            setCursor(getCursor().getPredefinedCursor(Cursor.HAND_CURSOR));
                            A3.setText("<html><u>Registar profesor</u><html>");
                        }
                        public void mouseExited(MouseEvent l){
                            setCursor(getCursor().getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                            A3.setText("Registar profesor");
                        }
                    });
         
         A4=VA.getLabel10();
         A4.addMouseListener(new MouseAdapter() {
                        public void mouseClicked(MouseEvent e) {
                                  timer.stop();
                                 Alta ed = new Alta("Editar",Usu2);
                                ed.setVisible(true);
                        }
                        
                        public void mouseEntered(MouseEvent k){
                            setCursor(getCursor().getPredefinedCursor(Cursor.HAND_CURSOR));
                            A4.setText("<html><u>Editar perfil</u><html>");
                        }
                        public void mouseExited(MouseEvent l){
                            setCursor(getCursor().getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                            A4.setText("Editar perfil");
                        }
                    });
         
         A5=VA.getLabel11();
        A5.addMouseListener(new MouseAdapter() {
                                public void mouseClicked(MouseEvent e) {
                                    timer.stop();
                                      Respaldar res = new Respaldar();
                                      res.setVisible(true);
                                }
                                public void mouseEntered(MouseEvent k){
                                    setCursor(getCursor().getPredefinedCursor(Cursor.HAND_CURSOR));
                                    A5.setText("<html><u>Respaldar</u><html>");
                                }
                                public void mouseExited(MouseEvent l){
                                    setCursor(getCursor().getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                                    A5.setText("Respaldar");
                                }
                            });
        
         A6=VA.getLabel12();
         A6.addMouseListener(new MouseAdapter() {
                        public void mouseClicked(MouseEvent e) {
                               CerrarSesion(e);
                        }
                        
                        public void mouseEntered(MouseEvent k){
                            setCursor(getCursor().getPredefinedCursor(Cursor.HAND_CURSOR));
                            A6.setText("<html><u>Cerrar sesion</u><html>");
                        }
                        public void mouseExited(MouseEvent l){
                            setCursor(getCursor().getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                            A6.setText("Cerrar sesion");
                        }
                    });
         
         B1=VC.getLabel();
        // B2=VC.getLabel2();
         B1.addMouseListener(new MouseAdapter() {
                        public void mouseClicked(MouseEvent e) {
                              timer.stop();
                            Visualizar vis = new Visualizar(bit);
                            vis.setVisible(true);
                        }
                        
                        public void mouseEntered(MouseEvent k){
                            setCursor(getCursor().getPredefinedCursor(Cursor.HAND_CURSOR));
                            B1.setText("<html><u>Ver UA</u><html>");
                        }
                        
                        public void mouseExited(MouseEvent l){
                            setCursor(getCursor().getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                            B1.setText("Ver UA");
                        }
                    });
         
         
         
         B3=VC.getLabe3();
         B3.addMouseListener(new MouseAdapter() {
                        public void mouseClicked(MouseEvent e) {
                              timer.stop();
                              TodasUA todas = new TodasUA();
                              todas.setVisible(true);
                        }
                        public void mouseEntered(MouseEvent k){
                            setCursor(getCursor().getPredefinedCursor(Cursor.HAND_CURSOR));
                            B3.setText("<html><u>Vista rapida</u><html>");
                           
                        }
                        public void mouseExited(MouseEvent l){
                            setCursor(getCursor().getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                            B3.setText("Vista rapida");
                        
                        }
                    });
         
         
         B5=VC.getLabel5();
         B5.addMouseListener(new MouseAdapter() {
                        public void mouseClicked(MouseEvent e) {
                              timer.stop();
                              Alta ed = new Alta("Editar",Usu2);
                              ed.setVisible(true);
                            
                        }
                        public void mouseEntered(MouseEvent k){
                            setCursor(getCursor().getPredefinedCursor(Cursor.HAND_CURSOR));
                            B5.setText("<html><u>Editar perfil</u><html>");
                           
                        }
                        public void mouseExited(MouseEvent l){
                            setCursor(getCursor().getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                            B5.setText("Editar perfil");
                            
                        }
                    });
         
         B6=VC.getLabel6();
       
         B6.addMouseListener(new MouseAdapter() {
                        public void mouseClicked(MouseEvent e) {
                              timer.stop();
                              ListProf list = new ListProf();
                              list.setVisible(true);
                        }
                        
                        public void mouseEntered(MouseEvent k){
                            setCursor(getCursor().getPredefinedCursor(Cursor.HAND_CURSOR));
                            B6.setText("<html><u>Reporte</u><html>");
                           
                        }
                        
                        public void mouseExited(MouseEvent l){
                            setCursor(getCursor().getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                            B6.setText("Reporte");
                          
                        }
                    });
         
         B8=VC.getLabel8();
         B8.addMouseListener(new MouseAdapter() {
                        public void mouseClicked(MouseEvent e) {
                              timer.stop();
                              CerrarSesion2(e);
                            
                        }
                        
                        public void mouseEntered(MouseEvent k){
                            setCursor(getCursor().getPredefinedCursor(Cursor.HAND_CURSOR));
                            B8.setText("<html><u>Cerrar sesion</u><html>");
                           
                        }
                        
                        public void mouseExited(MouseEvent l){
                            setCursor(getCursor().getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                            B8.setText("Cerrar sesion");
                        }
                    });
         
         
         C1=VP.getLabel();
        
         C1.addMouseListener(new MouseAdapter() {
                        public void mouseClicked(MouseEvent e) {
                              timer.stop();
                            Introducir in = new Introducir(bit,Usu2,true);
                            in.setVisible(true);
                        }
                        
                        public void mouseEntered(MouseEvent k){
                            setCursor(getCursor().getPredefinedCursor(Cursor.HAND_CURSOR));
                            C1.setText("<html><u>Editar UA</u><html>");
                          
                        }
                        
                        public void mouseExited(MouseEvent l){
                            setCursor(getCursor().getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                            C1.setText("Editar UA");
                         
                        }
                    });
         
         C3=VP.getLabel3();
       
         C3.addMouseListener(new MouseAdapter() {
                        public void mouseClicked(MouseEvent e) {
                            timer.stop();
                            Introducir intr = new Introducir(bit,Usu2,false);
                            intr.setVisible(true);
                              
                        }
                        
                        public void mouseEntered(MouseEvent k){
                            setCursor(getCursor().getPredefinedCursor(Cursor.HAND_CURSOR));
                            C3.setText("<html><u>Nueva UA</u><html>");
                        
                        }
                        
                        public void mouseExited(MouseEvent l){
                            setCursor(getCursor().getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                            C3.setText("Nueva UA");
                          
                        }
                    });
         
         C5=VP.getLabel5();
         C5.addMouseListener(new MouseAdapter() {
                        public void mouseClicked(MouseEvent e) {
                            timer.stop();
                            Visualizar vis = new Visualizar(bit);
                            vis.setVisible(true);
                        }
                        
                        public void mouseEntered(MouseEvent k){
                            setCursor(getCursor().getPredefinedCursor(Cursor.HAND_CURSOR));
                            C5.setText("<html><u>Ver UA</u><html>");
                        }
                        
                        public void mouseExited(MouseEvent l){
                            setCursor(getCursor().getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                            C5.setText("Ver UA");
                        }
                    });
         
         
         C6=VP.getLabel6();
        C6.addMouseListener(new MouseAdapter() {
                                public void mouseClicked(MouseEvent e) {
                                      timer.stop();
                                    Alta al = new Alta("Editar",Usu2);
                                    al.setVisible(true);
                                }
                                
                                public void mouseEntered(MouseEvent k){
                                    setCursor(getCursor().getPredefinedCursor(Cursor.HAND_CURSOR));
                                    C6.setText("<html><u>Editar perfil</u><html>");
                                }
                                
                                public void mouseExited(MouseEvent l){
                                    setCursor(getCursor().getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                                    C6.setText("Editar perfil");
                                }
                            });
         
         C7=VP.getLabel7();
         C7.addMouseListener(new MouseAdapter() {
                        public void mouseClicked(MouseEvent e) {
                              timer.stop();
                              CerrarSesion3(e);
                        }
                        
                        public void mouseEntered(MouseEvent k){
                            setCursor(getCursor().getPredefinedCursor(Cursor.HAND_CURSOR));
                            C7.setText("<html><u>Cerrar sesion</u><html>");
                        }
                        
                        public void mouseExited(MouseEvent l){
                            setCursor(getCursor().getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                            C7.setText("Cerrar sesion");
                        }
                    });
         
         C8=VC.getLabel9();
         C8.addMouseListener(new MouseAdapter() {
                       public void mouseClicked(MouseEvent e) {
                           timer.stop();
            
                          Alumnos vis = new Alumnos();
                          vis.setVisible(true);
                       }
                       
                       public void mouseEntered(MouseEvent k){
                           setCursor(getCursor().getPredefinedCursor(Cursor.HAND_CURSOR));
                           C8.setText("<html><u>Alumnos</u><html>");
                       }
                       
                       public void mouseExited(MouseEvent l){
                           setCursor(getCursor().getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                           C8.setText("Alumnos");
                       }
                   });
         
         

        jLabel15.setText("Acerca De...");
        jLabel15.setBounds(new Rectangle(10, 250, 125, 30));
        jLabel15.setFont(new Font("Arial",0,12));
        jLabel15.setForeground(Color.BLUE);
        jLabel15.addMouseListener(new MouseAdapter(){
                public void mouseEntered(MouseEvent k){
                    setCursor(getCursor().getPredefinedCursor(Cursor.HAND_CURSOR));
                    jLabel15.setText("<html><u>Acerca De...</u><html>");
                }
                
                public void mouseExited(MouseEvent l){
                    setCursor(getCursor().getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                    jLabel15.setText("Acerca De...");
                }
            public void mouseClicked(MouseEvent e) {
                Acerca a = new Acerca();
                a.setVisible(true);
            }
        });
        
        File arc = new File(Path,"Usuarios.txt");
        if(arc.exists()==false){
        UsrAdm(Path);
        }
    }
    
    private void Action(ActionEvent e) {
                String cad;
                int b,tam;
                b=0;
                tam=ContLineArch();
                Usu=new String[tam];
                Passw=new String[tam];
                ContRegUsua=new String[tam];
                UsuPass();
                String password = new String(jPasswordField1.getPassword());
                cad=jFormattedTextField1.getText();
                
                if(CompUsur(cad,password)==true && CompTip(cad).equals("Administrador")==true && CompDispUsur(cad)==true){
                    quitar();
                    bit.abrarc();
                    bit.usuario(cad+" Administrador "+Nomb+" ");
                   Conn=bit.conexion(true);
                    bit.Hora();
                    this.setTitle("Administrador: "+Nomb);
                    jLabel9.setVisible(false);
            
                    jLabel15.setVisible(false);
                    jLabel18.setVisible(false);//Logo de Usuario
                    jLabel19.setVisible(false); //Logo de contraseña
                    Usu2=cad;
                    b=1;
                 this.getContentPane().add(VA.jbInit(),null);
        }
                if(CompUsur(cad,password)==true && CompTip(cad).equals("Profesor")==true && CompDispUsur(cad)==true){
                    quitar();
                    bit.abrarc();
                    bit.usuario(cad+" Profesor "+Nomb+" ");
                    Conn=bit.conexion(true);
                    bit.Hora();
                    this.setTitle("Profesor: "+Nomb);
                   
                    jLabel15.setVisible(false);
                    jLabel9.setVisible(false);
                    
                    jLabel18.setVisible(false);//Logo de Usuario
                    jLabel19.setVisible(false); //Logo de contraseña
    
                
                    Usu2=cad;
                    b=1;
                    this.getContentPane().add(VP.jbInit(),null);
                }   
                
                if(CompUsur(cad,password)==true && CompTip(cad).equals("Coordinador")==true && CompDispUsur(cad)==true){
                    quitar();
                    bit.abrarc();
                    bit.usuario(cad+" Coordinador"+Nomb+" ");
                   Conn= bit.conexion(true);
                    bit.Hora();
                    this.setTitle("Coordinador: "+Nomb);
                    jLabel9.setVisible(false);
                    jLabel18.setVisible(false);//Logo de Usuario
                    jLabel19.setVisible(false); //Logo de contraseña
                    jLabel15.setVisible(false);
                    Usu2=cad;
                    b=1;
                    this.getContentPane().add(VC.jbInit(),null);
                }
                if(b==0){
                    JOptionPane.showMessageDialog(this,"Verifique Usuario y/o Contraseña", "Error", JOptionPane.ERROR_MESSAGE);
                    jFormattedTextField1.setText(null);
                    jPasswordField1.setText(null);
                    ino=ino+1;
                }
                if(ino==3){
                    JOptionPane.showMessageDialog(this,"Supero el numero de Intentos permitidos", "Advertencia", JOptionPane.ERROR_MESSAGE);
                    System.exit(0);
                }
    }

    private void Registrar(ActionEvent e) {
        Alta au= new Alta("Alta Usuario",null);
        au.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        au.setLocationRelativeTo(null);
        au.setModal(true);
        au.setVisible(true);
        
    }
    void CerrarSesion(MouseEvent e){
        this.remove(VA.jbInit());
        this.repaint();
        jLabel1.setVisible(true);
        jLabel2.setVisible(true);
        jFormattedTextField1.setText("");
        jPasswordField1.setText("");
        jFormattedTextField1.setVisible(true);
        jPasswordField1.setVisible(true);
        jLabel18.setVisible(true);//Logo de Usuario
        jLabel19.setVisible(true);
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jLabel9.setVisible(true);
        jLabel15.setVisible(true);
        bit.Hora();
        bit.cerr();
        ino=0;
        this.setTitle("Acceso");
    }
    
    void CerrarSesion2(MouseEvent e){
        this.remove(VC.jbInit());
        this.repaint();
        jLabel1.setVisible(true);
        jLabel2.setVisible(true);
        jFormattedTextField1.setText("");
        jPasswordField1.setText("");
        jFormattedTextField1.setVisible(true);
        jPasswordField1.setVisible(true);
        jLabel15.setVisible(true);
        jLabel18.setVisible(true);//Logo de Usuario
        jLabel19.setVisible(true);
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jLabel9.setVisible(true);
        bit.Hora();
        bit.cerr();
        ino=0;
        this.setTitle("Acceso");
    }
    
    void CerrarSesion3(MouseEvent e){
        this.remove(VP.jbInit());
        this.repaint();
        jLabel1.setVisible(true);
        jLabel2.setVisible(true);
        jFormattedTextField1.setText("");
        jPasswordField1.setText("");
        jFormattedTextField1.setVisible(true);
        jPasswordField1.setVisible(true);
        jLabel18.setVisible(true);//Logo de Usuario
        jLabel19.setVisible(true);
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jLabel9.setVisible(true);
        jLabel15.setVisible(true);
        bit.Hora();
        bit.cerr();
        ino=0;
        this.setTitle("Acceso");
    }
    
   
    public static void main(String[] args) {
        try{
             UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
             
             } catch (Exception ex){
              JOptionPane.showMessageDialog(null, "Error en Look And Feel","Error:" + ex.getMessage(),JOptionPane.ERROR_MESSAGE);
             }  
        ControldeAcceso frame=new ControldeAcceso();
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(720,350)); //1000 550 700
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);   
    }
    
    private void quitar(){
        jButton2.setVisible(false);
        
        jLabel4.setVisible(false);
        jLabel3.setVisible(false);
        jFormattedTextField1.setVisible(false);
        jPasswordField1.setVisible(false);
        jButton1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel1.setVisible(false); 
    }
    
    private void agregar(){
        jButton2.setVisible(true);
        jLabel4.setVisible(true);
        jLabel3.setVisible(true);
        jFormattedTextField1.setVisible(true);
        jPasswordField1.setVisible(true);
        jButton1.setVisible(true);
        jLabel2.setVisible(true);
        jLabel1.setVisible(true);
    }
    
    public boolean CompUsur(String usu,String pass){
        int cont;
        boolean enc=false;
        for(cont=0;cont<ContLin;cont++){
            if(usu.equals(Usu[cont]) && pass.equals(Passw[cont])){
                enc=true;
                break;
            }
        }
        return enc;
    }
    
    public boolean CompDispUsur(String usu){
        int cont=0;
        boolean ban=false;
        for(cont=0;cont<ContRegUsua.length;cont++){
            if(ContRegUsua[cont].indexOf(usu)!=-1){
                if(ContRegUsua[cont].indexOf("Activo")!=-1){
                    ban=true;
                    break;
                }
                else{
                    ban=false;
                    break;
                }
                
            }
        }
        return ban;
    }
    private String [] ExtrCamp(String cad) {
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
    
    public void UsuPass(){
        String linea;
        String [] cad = new String[2];
        int cont=0;
        File arc = new File(Path,"Usuarios.txt");
        if(arc!=null){
            FileReader leearc;
            try {
                leearc = new FileReader(arc);
                BufferedReader acclec = new BufferedReader(leearc);
                linea=acclec.readLine();
                ContRegUsua[cont]=linea;
                while(linea!=null){
                    ContRegUsua[cont]=linea;
                       linea=acclec.readLine();
                       cont++;
                   }
                acclec.close();
                
            } catch (FileNotFoundException e) {
            } catch (IOException e) {
            }
            for(cont=0;cont<ContLin;cont++){
                cad=ExtrCamp(ContRegUsua[cont]);
                Usu[cont]=cad[0];
                cad=ExtrCamp(cad[1]);
                Passw[cont]=cad[0];
            }
            for(cont=0;cont<ContLin;cont++){
                Passw[cont]=DecoPass(Passw[cont]);
            }
            
        }
        else{
            JOptionPane.showMessageDialog(this,"No hay ningun usuario registrado","Aviso",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public String CompTip(String cad){
        int cont;
        String nomUsu,tipo="";
        String [] conReg = new String[2];
        for(cont=0;cont<ContLin;cont++){
            conReg=ExtrCamp(ContRegUsua[cont]);
            nomUsu=conReg[0];
            conReg=ExtrCamp(conReg[1]);
            conReg=ExtrCamp(conReg[1]);
            if(nomUsu.equals(cad)==true){
                tipo=conReg[0];
                conReg=ExtrCamp(conReg[1]);
                Nomb=conReg[0];
                break;
            }
        }
        if(tipo.equals("")==true){
            return "";
        }
        else {
            return tipo;
        }
        
    }
    
    public int ContLineArch() {  //Metodo Que Analizara Archivo Contando Las Lineas
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
                ContLin=conlin;
                acclec.close();
                
            } catch (FileNotFoundException e) {
            } catch (IOException e) {
            }
        }//ELSE
     return ContLin;
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

    private void EntrLinkRecCont(MouseEvent e) {
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); //Cambiar El Cursor A Mano
        jLabel9.setForeground(Color.ORANGE);
    }

    private void ExitLinkRecCont(MouseEvent e) {
        jLabel9.setForeground(Color.BLUE);
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR )); //Cambiar El Cursor A Mano
    }

    private void ClickLinkRecCont(MouseEvent e) {
        Recuperacion Rec = new Recuperacion();
        Rec.setLayout(new BorderLayout());
       
        Rec.setModal(true);
        
        Rec.setVisible(true);
        
    }

    private void this_windowClosing(WindowEvent e) {
        if(Conn==true){
             bit.eventos("Salida Inesperada");
             bit.Hora();
             bit.cerr();
        }
    }
    private void Resp(ActionEvent ae){
        File arc = new File(Path);
        int dia;
        JFileChooser dial = new JFileChooser();
        dial.setDialogType(dial.SAVE_DIALOG);
        dial.setFileSelectionMode(dial.DIRECTORIES_ONLY);
        dia=dial.showSaveDialog(this);
        if(dia==dial.CANCEL_OPTION){
            return;
        }
        else{
            String destino =dial.getSelectedFile().getAbsolutePath();
            String [] Lista =arc.list();
            File dest = new File(destino);
            dest.mkdirs();
            for(int i=0;i<Lista.length;i++){
                copiarFicheros(new File(arc,Lista[i]),new File(destino,Lista[i]));
            }
        }
    }
    public static void copiarFicheros(File f1, File f2){
      try {
        InputStream in = new FileInputStream(f1);
        OutputStream out = new FileOutputStream(f2);
        byte[] buf = new byte[1024];
        int len;
        while ((len = in.read(buf)) > 0) {
          out.write(buf, 0, len);
        }
        in.close();
        out.close();
     
      } catch (IOException ioe){
        ioe.printStackTrace();
      }
    }
    
    public static void UsrAdm(String Path){
            Alta a = new Alta("Alta Administrador",null);
            a.setLayout(new BorderLayout());
          
            a.setModal(true);
            a.setLocation(85,85);
            a.setVisible(true);
    }
    
    public void RA(){
            Calendar fec = new GregorianCalendar();
            Integer di;
            di=fec.get(Calendar.DATE);
            if(di==9){
                File arc = new File(Path);
                String destino ="C:\\Respaldos";
                String [] Lista =arc.list();
                File dest = new File(destino);
                dest.mkdirs();
                copiarFicheros(new File(arc,Lista[1]),new File(destino,Lista[1]));
                }     
            }
    
    private void movimiento(MouseEvent e) {
           sdeo=0;
       }
    
    public void cerrar(){
        if(Usu2==null){
            bit.abrarc();
            bit.Hora();
            bit.eventos("Sesion Expirada");
            bit.cerr();
        }else{
            bit.usuario(Usu2);
            bit.Hora();
            bit.eventos("Sesion Expirada");
            bit.cerr();
        }
            JOptionPane.showMessageDialog(this,"Sesión Expirada","Aviso",JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
            }
    
}
