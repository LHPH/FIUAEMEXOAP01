package organizacion;

import java.awt.Color;

import java.awt.Dimension;
import java.awt.Font;

import java.awt.Rectangle;

import java.awt.event.MouseAdapter;

import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ventAdmon extends JPanel {
    private JPanel jPanel1 = new JPanel();
    private JPanel jPanel2 = new JPanel();
    /*En la parte siguiente se leen los icononos que aparecen el la ventana de administrador, dichas imagenes estan guardadas
     * en la carpeta Organizacion.*/
    private JLabel jLabel1 = new JLabel(new ImageIcon("Escudo.png")); 
    private JLabel jLabel2 = new JLabel(new ImageIcon("escudo2.png"));
    private JLabel jLabel3 = new JLabel(new ImageIcon("FG.png"));
    private JLabel jLabel5 = new JLabel(new ImageIcon("geoinformatica.png"));
    
    private JLabel jLabel13 = new JLabel(new ImageIcon("agregarusuario.png"));
    private JLabel jLabel14 = new JLabel(new ImageIcon("bajausuario.png"));
    private JLabel jLabel15 = new JLabel(new ImageIcon("agregarusuario.png"));
    private JLabel jLabel16 = new JLabel(new ImageIcon("editarperfil.png"));
    private JLabel jLabel17 = new JLabel(new ImageIcon("respaldar.png"));
    private JLabel jLabel18 = new JLabel(new ImageIcon("salir.png"));
    
    private JLabel jLabel4 = new JLabel();// etiqueta de la direccion de la facultad
    private JLabel jLabel6 = new JLabel(); // etiqueta de Bienvenido
    private JLabel jLabel7 = new JLabel(); // etiqueta de registrar coordinador
    private JLabel jLabel8 = new JLabel();// etiqueta de alta o baja usuario
    private JLabel jLabel9 = new JLabel();// etiqueta de registrar profesor
    private JLabel jLabel10 = new JLabel();// etiqueta de editar perfil
    private JLabel jLabel11 = new JLabel();// etiqueta de respaldar
    private JLabel jLabel12 = new JLabel();// etiqueta de cerrar sesion
    private JLabel jLabel19 = new JLabel();// etiqueta de los telefonos de la facultad de ingenieria
    private JLabel jLabel20 = new JLabel(); // descripcion de Universidada Autonoma del Estado de Mexico
    private JLabel jLabel21 = new JLabel();// etiqueta de Facultad de Geografia


    public ventAdmon() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    JPanel jbInit() {
        this.setSize(new Dimension(720, 355));//1062 400
        this.setLayout( null );
        /* Panel superior que contiene los escudos de Escudo, escudo1, y FG que son los escudos representativos dee la 
         * universidad propiamente de la Facultad de Geografia*/
        jPanel1.setBounds(0,0,720,85);
        jPanel1.setBackground(new Color(0,100,0));
        jPanel1.setLayout( null );
        jPanel1.setBounds(new Rectangle(0, 0, 720, 75));
        /* El jPanel2 guarda la direccion que aparece en la parte de abajo de la ventana, y es el siguiente:
         * FACULTAD DE GEOGRAFIA CERRO DE COATEPEC S/N, CIUDAD UNIVERSITARIA, TOLUCA ESTADO DE MEXICO, CP. 50100 
         * TEL: (722) 2 15 02 55 FAX: (722) 2 14 31 81*/
        jPanel2.setBounds(0,300,720,50);
        jPanel2.setBackground(new Color(0,100,0));
        jPanel2.setLayout( null );
        
        
        jLabel1.setBounds(new Rectangle(0, 4, 100, 80));
        jLabel2.setBounds(new Rectangle(90, 4, 100, 80));
        jLabel3.setBounds(new Rectangle(625, 8, 90, 70));

        jLabel5.setBounds(new Rectangle(365, 115, 350, 150));
        
        /* los jLabel´s 13, 14, 15, 16, 17 y 18 Contiene un Icono descrito en la parte de definicion del Label*/
        jLabel13.setBounds(new Rectangle(65, 90, 30, 30)); 
        jLabel14.setBounds(new Rectangle(215, 90, 30, 30));
        jLabel15.setBounds(new Rectangle(65, 150, 30, 30)); 
        jLabel16.setBounds(new Rectangle(215, 155, 30, 30));
        jLabel17.setBounds(new Rectangle(65, 223, 30, 30));
        jLabel18.setBounds(new Rectangle(215, 220, 30, 30));
        
        // Etiqueta de direccion de la facultad
        jLabel4.setText("FACULTAD DE GEOGRAFIA CERRO DE COATEPEC S/N, CIUDAD UNIVERSITARIA, TOLUCA ESTADO DE MEXICO, CP. 50100");
        jLabel4.setBounds(10,03,700,30);
        jLabel4.setFont(new Font("Arial",0,12));
        jLabel4.setForeground(Color.white);
        
        
        // Etiqueta de Telefonos de la facultad
        jLabel19.setText("TEL: (722) 2 15 02 55 FAX: (722) 2 14 31 81");
        jLabel19.setBounds(240,20,700,30);
        jLabel19.setFont(new Font("Arial",0,12));
        jLabel19.setForeground(Color.white);

        //Etiqueta de nombre de la universidad
        jLabel20.setText("Universidad Autónoma del Estado de México");
        jLabel20.setBounds(new Rectangle(200, 15, 425, 35));
        jLabel20.setForeground(Color.white);
        jLabel20.setFont(new Font("Arial", 0, 16));
        // etiqueta de nombre de la facultad
        jLabel21.setText("Facultad de Geografía");
        jLabel21.setBounds(new Rectangle(200, 42, 225, 15));        
        jLabel21.setForeground(Color.white);
        jLabel21.setFont(new Font("Arial", 0, 15));
        
        // etiqueta de mensaje de Bienvenida
        jLabel6.setText("BIENVENIDO");
        jLabel6.setBounds(315,90,150,30);
        jLabel6.setFont(new Font("Arial",0,18));
        jLabel6.setForeground(Color.black);

        //Etiqueta activa de Registrar coordinador
        jLabel7.setText("Registrar coordinador");
        jLabel7.setBounds(35,130,100,25);
        jLabel7.setFont(new Font("Arial",0,12));
        jLabel7.setForeground(Color.black);
        jLabel7.setBounds(new Rectangle(15, 120, 140, 25));
        
        //Etiqueta activa de Alta o baja usuario
        jLabel8.setText("Alta o baja usuario");
        jLabel8.setBounds(200,130,100,25);
        jLabel8.setFont(new Font("Arial",0,12));
        jLabel8.setForeground(Color.black);
        jLabel8.setBounds(new Rectangle(180, 120, 145, 25));
        
        //etiqueta de Registrar profesor
        jLabel9.setText("Registrar profesor");
        jLabel9.setBounds(45,200,100,25);
        jLabel9.setFont(new Font("Arial",0,12));
        jLabel9.setForeground(Color.black);
        jLabel9.setBounds(new Rectangle(30, 185, 100, 25));
        //etiqueta de Editar perfil
        jLabel10.setText("Editar perfil");
        jLabel10.setBounds(205,200,100,25);
        jLabel10.setFont(new Font("Arial",0,12));
        jLabel10.setForeground(Color.black);
        jLabel10.setBounds(new Rectangle(195, 185, 90, 25));
        //etiqueta de Respaldar
        jLabel11.setText("Respaldar");
        jLabel11.setBounds(60,265,100,25);
        jLabel11.setFont(new Font("Arial",0,12));
        jLabel11.setForeground(Color.black);
        jLabel11.setBounds(new Rectangle(50, 255, 100, 25));
        //Etiqueta de Cerrar sesion
        jLabel12.setText("Cerrar sesion");
        jLabel12.setBounds(205,265,100,25);
        jLabel12.setFont(new Font("Arial",0,12));
        jLabel12.setForeground(Color.black);
        //posicion de la etiqueta de cerrar secion
        jLabel12.setBounds(new Rectangle(190, 255, 100, 25));
        // posicion del icono asociado a registrar profesor        
        jLabel5.setBounds(372,125,350,150); // imagen
        
        // agrega las etiquetas descritas al panel 2
        jPanel2.add(jLabel19, null);
        jPanel2.add(jLabel4, null);

        // agrega las etiquetas y paneles a Dialog
        this.add(jLabel18, null);
        this.add(jLabel17, null);
        this.add(jLabel16, null);
        this.add(jLabel15, null);
        this.add(jLabel14, null);
        this.add(jLabel13, null);
        this.add(jLabel12, null);
        this.add(jLabel11, null);
        this.add(jLabel10, null);
        this.add(jLabel9, null);
        this.add(jLabel8, null);
        this.add(jLabel7, null);
        this.add(jLabel6, null);
        this.add(jLabel5, null);
        this.add(jPanel2, null);
        this.add(jPanel1, null);
        // agrega las etiquetas descritas al panel1
        jPanel1.add(jLabel21, null);
        jPanel1.add(jLabel20, null);
        jPanel1.add(jLabel3, null);
        jPanel1.add(jLabel2, null);
        jPanel1.add(jLabel1, null);
        return this;
    }
    
    
    /* los sigueintes getLabel's; 7,8,9,10,11 y 12 retornan el control a ControlAcceso y alla se regula el doble efecto
     * de los Label´s retornados; es decir alla se controla que al momento de pasar el cursor por el jLabel indicado este se
     * subraye, tambien alla ponemos los eventos de cada jLabel, los nombres con los que se citan son C1,C2,C3 etc*/
    JLabel getLabel7(){
        return jLabel7;
    }
    
    JLabel getLabel8(){
        return jLabel8;
    }
    
    JLabel getLabel9(){
        return jLabel9;
    }
    
    JLabel getLabel10(){
        return jLabel10;
    }
    
    JLabel getLabel11(){
        return jLabel11;
    }
    
    JLabel getLabel12(){
        return jLabel12;
    }

}
