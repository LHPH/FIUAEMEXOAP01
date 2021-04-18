package organizacion;

//Editor de la vetana:Luis Ernesto Sierra Alva 
//Fecha de edicion: 17 de mayo del 2012
/* Modificaciones realizadas:
 * 1: Fecha: 24 de mayo de 2012, Modificaciones hechas: agregar el metodo validar y llenado, retoces en la parte visual y empezar con la documentacion*/

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;

import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class PestañaF1 extends JPanel {
    private JLabel jLabel1 = new JLabel();
    private JTextField jTextField1 = new JTextField();
    private JLabel jLabel2 = new JLabel();
    private JTextField jTextField2 = new JTextField();
    private JLabel jLabel3 = new JLabel();
    private JLabel jLabel4 = new JLabel();
    private JLabel jLabel5 = new JLabel();
    private JSeparator jSeparator1 = new JSeparator();
    private JLabel jLabel6 = new JLabel();
    private JSeparator jSeparator3 = new JSeparator();
    private JSeparator jSeparator5 = new JSeparator();
    private JLabel jLabel7 = new JLabel();
    private JLabel jLabel8 = new JLabel();
    private JLabel jLabel9 = new JLabel();
    private JTextField jTextField3 = new JTextField();
    private JTextField jTextField4 = new JTextField();
    private JTextField jTextField5 = new JTextField();
    private JLabel jLabel10 = new JLabel();
    private JLabel jLabel11 = new JLabel();
    private JLabel jLabel12 = new JLabel();
    private JSeparator jSeparator6 = new JSeparator();
    private JSeparator jSeparator2 = new JSeparator();
    private JScrollPane jScrollPane8 = new JScrollPane();
    private JScrollPane jScrollPane9 = new JScrollPane();
    private JScrollPane jScrollPane10 = new JScrollPane();
    private JScrollPane jScrollPane11 = new JScrollPane();
    private JScrollPane jScrollPane12 = new JScrollPane();
    private JScrollPane jScrollPane13 = new JScrollPane();
    private JTextArea jTextArea1 = new JTextArea();
    private JTextArea jTextArea2 = new JTextArea();
    private JTextArea jTextArea3 = new JTextArea();
    private JTextArea jTextArea4 = new JTextArea();
    private JTextArea jTextArea5 = new JTextArea();
    private JTextArea jTextArea6 = new JTextArea();
    private JButton jButton2 = new JButton();
    private JSeparator jSeparator4 = new JSeparator();
    private JLabel jLabel13 = new JLabel();
    private JSeparator jSeparator7 = new JSeparator();
    boolean ynd;
    String Path="Archivos";
    int numU=0;
    int NUM=0;
    String []vl2= new String[10];
    Pestaña11 Pest2;
    Pestaña1  Pest1;
    private JButton jButton1 = new JButton();


    public PestañaF1(Pestaña11 pest) {
        Pest2=pest;
        setOpaque(false);
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {

        this.setLayout( null );
        this.setBounds(new Rectangle(0, 0, 762, 420));

        this.setSize(new Dimension(756, 388));


        jLabel1.setText("Nombre de la unidad de competencia: ");
        jLabel1.setBounds(new Rectangle(5, 10, 220, 30));
        jLabel1.setFont(new Font("Arial", 0, 12));

        jLabel1.setForeground(Color.white);
        jTextField1.setBounds(new Rectangle(225, 10, 205, 25));
        
        
        jLabel2.setBounds(new Rectangle(440, 10, 220, 25));
        jLabel2.setText("Numero de la unidad de competencia:");
        jLabel2.setFont(new Font("Arial", 0, 12));

        jLabel2.setForeground(Color.white);
        jTextField2.setBounds(new Rectangle(660, 10, 55, 25));

               
        jLabel3.setText("Conocimientos ");
        jLabel3.setBounds(new Rectangle(5, 65, 135, 25));

        jLabel3.setFont(new Font("Arial", 0, 12));
        jLabel3.setForeground(Color.white);
        jLabel4.setText("Habilidades");
        jLabel4.setBounds(new Rectangle(240, 60, 120, 30));

        jLabel4.setFont(new Font("Arial", 0, 12));
        jLabel4.setForeground(Color.white);
        jLabel5.setText("Actitudes y Valores ");
        jLabel5.setBounds(new Rectangle(490, 60, 135, 30));

        jLabel5.setFont(new Font("Arial", 0, 12));
        jLabel5.setForeground(Color.white);
        jSeparator1.setBounds(new Rectangle(0, 40, 762, 5));
        
        jLabel6.setText("ELEMENTOS DE COMPETENCIA ");
        
        jLabel6.setBounds(new Rectangle(255, 40, 220, 25));

        jLabel6.setFont(new Font("Arial", 0, 12));
        jLabel6.setForeground(Color.white);
        jSeparator3.setBounds(new Rectangle(0, 65, 762, 2));
        
        jSeparator5.setBounds(new Rectangle(0, 180, 762, 2));
                                                                 
        jLabel7.setText("Estrategias Didacticas: ");
        jLabel7.setBounds(new Rectangle(5, 180, 215, 25));

        jLabel7.setFont(new Font("Arial", 0, 12));
        jLabel7.setForeground(Color.white);
        jLabel8.setText("Recursos Requeridos:");
        jLabel8.setBounds(new Rectangle(240, 180, 240, 25));

        jLabel8.setFont(new Font("Arial", 0, 12));
        jLabel8.setForeground(Color.white);
        jLabel9.setText("Tiempo Destinado:");
        jLabel9.setBounds(new Rectangle(490, 180, 165, 25));

        jLabel9.setFont(new Font("Arial", 0, 12));
        jLabel9.setForeground(Color.white);
        jTextField3.setBounds(new Rectangle(490, 200, 240, 20));
        
        jTextField4.setBounds(new Rectangle(240, 200, 240, 20));
        
        jTextField5.setBounds(new Rectangle(5, 200, 225, 20));
        
        jLabel10.setText("Criterios de Desempeño:");
        jLabel10.setBounds(new Rectangle(5, 235, 230, 20));

        jLabel10.setFont(new Font("Arial", 0, 12));
        jLabel10.setForeground(Color.white);
        jLabel11.setText("Desempeño:");
        jLabel11.setBounds(new Rectangle(240, 240, 205, 20));

        jLabel11.setFont(new Font("Arial", 0, 12));
        jLabel11.setForeground(Color.white);
        jLabel12.setText("Productos:");
        jLabel12.setBounds(new Rectangle(490, 235, 120, 25));


        jLabel12.setFont(new Font("Arial", 0, 12));
        jLabel12.setForeground(Color.white);
        jSeparator6.setBounds(new Rectangle(0, 225, 770, 2));
        
        jSeparator2.setBounds(new Rectangle(170, 145, 0, 2));
        
        jScrollPane8.setBounds(new Rectangle(5, 90, 225, 80));
        
        jScrollPane9.setBounds(new Rectangle(240, 90, 240, 80));
        
        jScrollPane10.setBounds(new Rectangle(490, 90, 240, 80));
        
        jScrollPane11.setBounds(new Rectangle(5, 255, 225, 75));
        
        jScrollPane12.setBounds(new Rectangle(240, 260, 240, 70));
        
        jScrollPane13.setBounds(new Rectangle(490, 260, 240, 70));


        jButton2.setText("Siguiente");
        jButton2.setBounds(new Rectangle(585, 345, 120, 25));
        jButton2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    sig(e);
                }
            });
        
        jSeparator4.setBounds(new Rectangle(-10, 335, 765, 5));
        
        jLabel13.setText("Evidencias ");
        jLabel13.setBounds(new Rectangle(375, 225, 140, 15));
        jLabel13.setFont(new Font("Arial", 0, 12));
        jLabel13.setForeground(Color.white);
        
        jSeparator7.setBounds(new Rectangle(235, 240, 520, 2));


        jTextArea1.setFont(new Font("Arial",0,12));
        jTextArea1.setLineWrap(true);
        
        jTextArea2.setFont(new Font("Arial",0,12));
        jTextArea2.setLineWrap(true);
        
        jTextArea3.setFont(new Font("Arial",0,12));
        jTextArea3.setLineWrap(true);
        
        jTextArea4.setFont(new Font("Arial",0,12));
        jTextArea4.setLineWrap(true);
        
        jTextArea5.setFont(new Font("Arial",0,12));
        jTextArea5.setLineWrap(true);
        
        jTextArea6.setFont(new Font("Arial",0,12));
        jTextArea6.setLineWrap(true);


        this.add(jButton1, null);
        this.add(jSeparator7, null);
        this.add(jLabel13, null);
        this.add(jSeparator4, null);
        this.add(jButton2, null);
        jScrollPane13.getViewport().add(jTextArea6, null);
        this.add(jScrollPane13, null);
        jScrollPane12.getViewport().add(jTextArea5, null);
        this.add(jScrollPane12, null);
        jScrollPane11.getViewport().add(jTextArea4, null);
        this.add(jScrollPane11, null);
        jScrollPane10.getViewport().add(jTextArea3, null);
        this.add(jScrollPane10, null);
        jScrollPane9.getViewport().add(jTextArea2, null);
        this.add(jScrollPane9, null);
        jScrollPane8.getViewport().add(jTextArea1, null);
        this.add(jScrollPane8, null);
        this.add(jSeparator2, null);
        this.add(jSeparator6, null);
        this.add(jLabel12, null);
        this.add(jLabel11, null);
        this.add(jLabel10, null);
        this.add(jTextField5, null);
        this.add(jTextField4, null);
        this.add(jTextField3, null);
        this.add(jLabel9, null);
        this.add(jLabel8, null);
        this.add(jLabel7, null);
        this.add(jSeparator5, null);
        this.add(jSeparator3, null);
        this.add(jLabel6, null);
        this.add(jSeparator1, null);
        this.add(jLabel5, null);
        this.add(jLabel4, null);
        this.add(jLabel3, null);
        this.add(jTextField2, null);
        this.add(jLabel2, null);
        this.add(jTextField1, null);
        this.add(jLabel1, null);
        
    }
    

    private void sig(ActionEvent e) {
        numU=numU+1;
        establecer(vl2,NUM);
    }

    public void paintComponent(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    //g2.setPaint(new GradientPaint(new Point(0, 0), new Color(176, 207, 158), new Point(0, getHeight() / 2),new Color(57, 99, 0))); 
    g2.setPaint(new GradientPaint(new Point(0, 0), new Color(57, 99, 0), new Point(0, getHeight()),new Color(57, 99, 0)));
    g2.fillRect(0,0,getWidth(),getHeight());
    super.paintComponent(g);
    }
    
    void establecer(String []cadb,int n){
        String [] vl= new String[11];
        int ind,i;
        if(numU==0){
            NUM=n;
            vl2=cadb;
        }
        if(numU<n){
            for(ind=0;ind<11;ind++){
                i=cadb[numU].indexOf(";");
                vl[ind]=cadb[numU].substring(0, i);
                cadb[numU]=cadb[numU].substring(i+1);
            }
            jTextField1.setText(vl[0]);
            jTextField1.setEnabled(false);
            jTextField2.setText(vl[1]);
            jTextField2.setEnabled(false);
            jTextField3.setText(vl[2]);
            jTextField3.setEnabled(false);
            jTextField4.setText(vl[3]);
            jTextField4.setEnabled(false);
            jTextField5.setText(vl[4]);
            jTextField5.setEnabled(false);
            jTextArea1.setText(vl[5]);
            jTextArea1.setEnabled(false);
            jTextArea2.setText(vl[6]);
            jTextArea2.setEnabled(false);
            jTextArea3.setText(vl[7]);
            jTextArea3.setEnabled(false);
            jTextArea4.setText(vl[8]);
            jTextArea4.setEnabled(false);
            jTextArea5.setText(vl[9]);
            jTextArea5.setEnabled(false);
            jTextArea6.setText(vl[10]);
            jTextArea6.setEnabled(false);
            }
        else {
            JOptionPane.showMessageDialog(this,"Ya no hay mas informacion que mostrar","Error",JOptionPane.ERROR_MESSAGE);
        }
}


}
