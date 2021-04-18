package organizacion;

import java.awt.Color;

import java.awt.Dimension;
import java.awt.Font;

import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class venCoord extends JPanel { 
    /* paneles 1 y dos que sirven para contener los escudos en el panel 1 y la direccion y telefonos en el panel 2 ademas
    de dar color verde.*/
    private JPanel jPanel1 = new JPanel();
    private JPanel jPanel2 = new JPanel();
    
    private JLabel jLabel1 = new JLabel(new ImageIcon("Escudo.png"));
    private JLabel jLabel2 = new JLabel(new ImageIcon("escudo2.png"));
    private JLabel jLabel3 = new JLabel(new ImageIcon("FG.png"));
    private JLabel jLabel5 = new JLabel(new ImageIcon("geoinformatica.png"));
    private JLabel jLabel13 = new JLabel(new ImageIcon("verua.png"));
    private JLabel jLabel14 = new JLabel(new ImageIcon("reporte.png"));
    private JLabel jLabel15 = new JLabel(new ImageIcon("vistarapida.png"));
    private JLabel jLabel16 = new JLabel(new ImageIcon("editarperfil.png"));
    private JLabel jLabel17 = new JLabel(new ImageIcon("usuariocoo.png"));
    private JLabel jLabel18 = new JLabel(new ImageIcon("salir.png"));
    private JLabel jLabel24 = new JLabel();
    
    
    private JLabel jLabel4 = new JLabel();
    private JLabel jLabel6 = new JLabel();
    private JLabel jLabel7 = new JLabel();
    private JLabel jLabel8 = new JLabel();
    private JLabel jLabel9 = new JLabel();
    private JLabel jLabel11 = new JLabel();
    private JLabel jLabel12 = new JLabel();
    private JLabel jLabel19 = new JLabel();
    private JLabel jLabel20 = new JLabel();
    private JLabel jLabel21 = new JLabel();
    private JLabel jLabel22 = new JLabel();
   


    public venCoord() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    JPanel jbInit(){
        
        this.setSize(new Dimension(727, 349));//720, 355
        this.setLayout( null );
        // posicion del panel superior
        jPanel1.setBounds(0,0,720,85);
        jPanel1.setBackground(new Color(0,100,0));
        jPanel1.setLayout( null );
        // posicion del panel inferior
        jPanel2.setBounds(0,300,720,50);
        jPanel2.setBackground(new Color(0,100,0));
        jPanel2.setLayout( null );
        
        // posicion de los escudos universitarios
        jLabel1.setBounds(new Rectangle(0, 4, 100, 80));
        jLabel2.setBounds(new Rectangle(90, 4, 100, 80));
        jLabel3.setBounds(new Rectangle(625, 8, 90, 70));

        jLabel5.setBounds(new Rectangle(375, 135, 350, 150));
        jLabel14.setBounds(new Rectangle(185, 100, 30, 30));
        jLabel16.setBounds(new Rectangle(195, 170, 30, 30));
        jLabel18.setBounds(new Rectangle(195, 225, 30, 30));
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

        jLabel7.setText("Ver UA ");
        jLabel7.setBounds(50,130,100,25);
        jLabel7.setFont(new Font("Arial",0,12));
        jLabel7.setForeground(Color.black);
        jLabel13.setBounds(20,105,100,25);
        
        
        jLabel8.setText("Reporte");
        jLabel8.setBounds(280,130,100,25);
        jLabel8.setFont(new Font("Arial",0,12));
        jLabel8.setForeground(Color.black);
        jLabel8.setBounds(new Rectangle(190, 130, 160, 30));
        jLabel14.setBounds(200,105,30,30);
        
        jLabel9.setText("Vista rapida");
        jLabel9.setBounds(43,200,100,25);
        jLabel9.setFont(new Font("Arial",0,12));
        jLabel9.setForeground(Color.black);
        jLabel9.setBounds(new Rectangle(30, 200, 100, 30));
        jLabel15.setBounds(53,170,30,30);
        // posicion de la imagen asociada a Editar perfil
        jLabel16.setBounds(200,170,30,30);
        
        jLabel11.setText("Editar perfil");
        jLabel11.setBounds(35,270,100,25);
        jLabel11.setFont(new Font("Arial",0,12));
        jLabel11.setForeground(Color.black);
        jLabel11.setBounds(new Rectangle(180, 200, 100, 25));
        jLabel17.setBounds(50,230,30,30);
        
        jLabel12.setText("Cerrar sesion");
        jLabel12.setBounds(195,270,100,25);
        jLabel12.setFont(new Font("Arial",0,12));
        jLabel12.setForeground(Color.black);
        jLabel12.setBounds(new Rectangle(170, 255, 100, 25));
        jLabel5.setBounds(372,125,350,150); // imagen
        
        jLabel22.setText("Alumnos");
        jLabel22.setBounds(195,270,100,25);
        jLabel22.setFont(new Font("Arial",0,12));
        jLabel22.setForeground(Color.black);
        jLabel22.setBounds(new Rectangle(40, 255, 100, 25));
        jLabel24.setBounds(372,125,350,150);
        
        // elementos que contienen el panel2 que es el que esta situado en la parte inferior 
        jPanel2.add(jLabel19, null);
        jPanel2.add(jLabel4, null);
// elementos que guarda la ventana de venCoord
        this.add(jLabel24, null);
        this.add(jLabel22, null);
        this.add(jLabel17, null);
        this.add(jLabel18, null);
        this.add(jLabel16, null);
        this.add(jLabel15, null);
        this.add(jLabel14, null);
        this.add(jLabel13, null);
        this.add(jLabel12, null);
        this.add(jLabel11, null);
        this.add(jLabel9, null);
        this.add(jLabel8, null);
        this.add(jLabel7, null);
        this.add(jLabel6, null);
        this.add(jLabel5, null);
        this.add(jPanel2, null);
        this.add(jPanel1, null);

        jPanel1.add(jLabel21, null);
        jPanel1.add(jLabel20, null);
        jPanel1.add(jLabel3, null);
        jPanel1.add(jLabel2, null);
        jPanel1.add(jLabel1, null);  
        return this;
        
     
    }
    /* los sigueintes getLabel's; 7,8,9,10,11 y 12 retornan el control a ControlAcceso y alla se regula el doble efecto
     * de los Label´s retornados; es decir alla se controla que al momento de pasar el cursor por el jLabel indicado este se
     * subraye, tambien alla ponemos los eventos de cada jLabel. */
    
    JLabel getLabel(){
        return jLabel7;
    }

    
    JLabel getLabe3(){
        return jLabel9;
    }

    JLabel getLabel5(){
        return jLabel11;
    }
    
    JLabel getLabel6(){
        return jLabel8;
    }

    
    JLabel getLabel8(){
        return jLabel12;
    }
    
    JLabel getLabel9(){ 
        return jLabel22;
    }

   
}
