package organizacion;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JDialog;

public class Acerca extends JDialog {
    public Acerca() {
        this(null, "", false);
    }

    public Acerca(Frame parent, String title, boolean modal) {
        super(parent, title, modal);
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.setSize( new Dimension( 400, 300 ) );
        this.getContentPane().setLayout( null );
        this.setTitle("Acerca De...");
        this.setIconImage(new ImageIcon("Escudo.png").getImage());
        this.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setModal(true);
    }
    
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(new Color(0,100,0));
        g.fillRect(0, 0, 400, 300);
        g.setFont(new Font("Arial",1,12));
        g.setColor(Color.WHITE);
        g.drawString("EMPRESA: SEHEL", 30, 60);
        g.drawString("Proyecto:MACFE", 30, 80);
        g.drawString("Equipo De Desarrolladores:", 30, 100);
        g.drawString("Luis Humberto Ponce Hermosillo:luislyly@hotmail.com", 30, 120);
        g.drawString("Luis Ernesto Sierra Alva:darkdraco2008@hotmail.com", 30, 140);
        g.drawString("Samuel Castro Soto:samuel_9205@hotmail.com", 30, 160);
        g.drawString("Emmanuel Cardenas Salinas:huil_o@yahoo.com.mx", 30, 180);
        g.drawString("Edwing Christian:bastian-schweinsteiger@live.com", 30, 200);
    }
    
    public static void main(String arg []){
        Acerca a = new Acerca();
        a.setVisible(true);
    }
}
