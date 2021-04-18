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

public class venProf extends JPanel {
    private JPanel jPanel1 = new JPanel();
    private JPanel jPanel2 = new JPanel();
    
    /*En la parte siguiente se leen los icononos que aparecen el la ventana de administrador, dichas imagenes estan guardadas
     * en la carpeta Organizacion.*/
    private JLabel jLabel1 = new JLabel(new ImageIcon("Escudo.png"));
    private JLabel jLabel2 = new JLabel(new ImageIcon("escudo2.png"));
    private JLabel jLabel3 = new JLabel(new ImageIcon("FG.png"));
    private JLabel jLabel5 = new JLabel(new ImageIcon("geoinformatica.png"));
    
    private JLabel jLabel13 = new JLabel(new ImageIcon("editar1.png"));
    private JLabel jLabel14 = new JLabel(new ImageIcon("verua.png"));
    private JLabel jLabel15 = new JLabel(new ImageIcon("nueva.png"));
    private JLabel jLabel16 = new JLabel(new ImageIcon("editarperfil.png"));
    private JLabel jLabel18 = new JLabel(new ImageIcon("cerrar.png"));
    
    private JLabel jLabel4 = new JLabel(); // Guarda icono asociado a la etiqueta Ver UA
    private JLabel jLabel6 = new JLabel();// Guarda icono asociado a la etiqueta Editar perfil
    private JLabel jLabel7 = new JLabel();// etiqueta Editar UA 
    private JLabel jLabel8 = new JLabel(); //etiqueta ver UA
    private JLabel jLabel9 = new JLabel(); // nueva UA
    private JLabel jLabel10 = new JLabel(); // Editar perfil
    private JLabel jLabel12 = new JLabel();// cerrar cesion
    private JLabel jLabel19 = new JLabel();
    private JLabel jLabel20 = new JLabel();
    private JLabel jLabel21 = new JLabel();



    public venProf() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    JPanel jbInit(){
        
        this.setSize(new Dimension(727, 349));//720, 355
        this.setLayout( null );
        
        /* posicion del panel1 y el color este panel corresponde al panel que se encuentra en la parte superior de
        la ventana*/
        jPanel1.setBounds(0,0,720,85);
        jPanel1.setBackground(new Color(0,100,0));
        jPanel1.setLayout( null );
        /*posicion del panel2 y el color este panel corresponde al panel que se encuentra en la parte inferior de
        la ventana */
        jPanel2.setBounds(0,300,720,50);
        jPanel2.setBackground(new Color(0,100,0));
        jPanel2.setLayout( null );
        
        // los jLabel´s 1,2,3 contienen los escudos de la facultad
        jLabel1.setBounds(new Rectangle(0, 4, 100, 80));
        jLabel2.setBounds(new Rectangle(90, 4, 100, 80));
        jLabel3.setBounds(new Rectangle(625, 8, 90, 70));
        
        jLabel13.setBounds(new Rectangle(60, 100, 30, 30));
        jLabel14.setBounds(new Rectangle(215, 100, 30, 30));
        jLabel15.setBounds(new Rectangle(55, 175, 30, 30));

        jLabel16.setBounds(new Rectangle(210, 160, 30, 30));
        jLabel18.setBounds(new Rectangle(120, 210, 30, 30));
        jLabel4.setText("FACULTAD DE GEOGRAFIA CERRO DE COATEPEC S/N, CIUDAD UNIVERSITARIA, TOLUCA ESTADO DE MEXICO, CP. 50100");
        jLabel4.setBounds(10,03,700,30);
        jLabel4.setFont(new Font("Arial",0,12));
        jLabel4.setForeground(Color.white);
        
        jLabel19.setText("TEL: (722) 2 15 02 55 FAX: (722) 2 14 31 81");
        jLabel19.setBounds(240,20,700,30);
        jLabel19.setFont(new Font("Arial",0,12));
        jLabel19.setForeground(Color.white);


        jLabel20.setText("Universidad Autónoma del Estado de México");
        jLabel20.setBounds(new Rectangle(200, 15, 425, 35));
        jLabel20.setForeground(Color.white);
        jLabel20.setFont(new Font("Arial", 0, 16));

        jLabel21.setText("Facultad de Geografía");
        jLabel21.setBounds(new Rectangle(200, 42, 225, 15));        
        jLabel21.setForeground(Color.white);
        jLabel21.setFont(new Font("Arial", 0, 15));

        jLabel6.setText("BIENVENIDO");
        jLabel6.setBounds(315,85,150,30);
        jLabel6.setFont(new Font("Arial",0,18));
        jLabel6.setForeground(Color.black);

        jLabel7.setText("Editar UA ");
        jLabel7.setBounds(new Rectangle(35,130,75,25));
        jLabel7.setFont(new Font("Arial",0,12));
        jLabel7.setForeground(Color.black);
        jLabel13.setBounds(53,100,30,30);
        
        jLabel8.setText("Ver UA");
        jLabel8.setFont(new Font("Arial",0,12));
        jLabel8.setForeground(Color.black);
        jLabel8.setBounds(new Rectangle(205, 130, 75, 25));
        jLabel14.setBounds(new Rectangle(210,100,30,30));
        
        jLabel9.setText("Nueva UA");
        jLabel9.setBounds(35,200,100,25);
        jLabel9.setFont(new Font("Arial",0,12));
        jLabel9.setForeground(Color.black);
        jLabel9.setBounds(new Rectangle(30, 200, 100, 25));
        jLabel15.setBounds(new Rectangle(45,170,30,30));
        
        jLabel10.setText("Editar perfil");
        //jLabel10.setBounds(new Rectangle(190,200,100,25));
        jLabel10.setFont(new Font("Arial",0,12));
        jLabel10.setForeground(Color.black);
        jLabel10.setBounds(new Rectangle(190, 200, 100, 25));
        jLabel16.setBounds(new Rectangle(210,170,30,30));


        jLabel12.setText("Cerrar sesion");
        jLabel12.setBounds(200,270,100,25);
        jLabel12.setFont(new Font("Arial",0,12));
        jLabel12.setForeground(Color.black);

        jLabel12.setBounds(new Rectangle(95, 240, 100, 25));
        
        jLabel5.setBounds(372,125,350,150); // imagen
        // jLabel´s que estan dentro de jPanel2
        jPanel2.add(jLabel19, null);
        jPanel2.add(jLabel4, null);

        // Todos los elementos agregados a la ventana
        this.add(jLabel18, null);
        this.add(jLabel16, null);
        this.add(jLabel15, null);
        this.add(jLabel14, null);
        this.add(jLabel13, null);
        this.add(jLabel12, null);
        this.add(jLabel10, null);
        this.add(jLabel9, null);
        this.add(jLabel8, null);
        this.add(jLabel7, null);
        this.add(jLabel6, null);
        this.add(jLabel5, null);
        this.add(jPanel2, null);
        this.add(jPanel1, null);
        
        // Elementos agregados a al panel1
        jPanel1.add(jLabel21, null);
        jPanel1.add(jLabel20, null);
        jPanel1.add(jLabel3, null);
        jPanel1.add(jLabel2, null);
        jPanel1.add(jLabel1, null);
        return this;
    }
    
    /* los sigueintes getLabel's; 3,6,5,7 retornan el control a ControlAcceso y alla se regula el doble efecto
     * de los Label´s retornados; es decir alla se controla que al momento de pasar el cursor por el jLabel indicado este se
     * subraye, tambien alla ponemos los eventos de cada jLabel*/
    
    JLabel getLabel(){
        return jLabel7;
    }

    JLabel getLabel3(){
        return jLabel9;
    }

    JLabel getLabel5(){
        return jLabel8;
    }
    JLabel getLabel6(){
        return jLabel10;
    }
    
    JLabel getLabel7(){
        return jLabel12;
    }

}
