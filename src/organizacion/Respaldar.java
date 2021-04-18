package organizacion;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;

import java.awt.Rectangle;

import java.awt.event.MouseAdapter;

import java.awt.event.MouseEvent;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Respaldar extends JDialog {
    private JLabel jLabel1 = new JLabel();
    private JCheckBox jCheckBox1 = new JCheckBox();
    private JCheckBox jCheckBox2 = new JCheckBox();
    private JCheckBox jCheckBox3 = new JCheckBox();
    private JButton jButton1 = new JButton();
   // private String Path ="C:\\Users\\HÉCTOR\\Documents\\JDeveloper\\mywork\\Organizacion\\Archivos";
   String Path="Archivos";
    private JCheckBox jCheckBox4 = new JCheckBox();
    private JPanel jPanel1 = new JPanel();
    private JPanel jPanel2 = new JPanel();
    private JLabel jLabel2 = new JLabel(new ImageIcon("res.png"));

    public Respaldar() {
        this(null, "", false);
    }

    public Respaldar(Frame parent, String title, boolean modal) {
        super(parent, title, modal);
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.setSize(new Dimension(434, 375));
        this.getContentPane().setLayout( null );
        this.setTitle("Respaldo de Informacion");
        this.setIconImage(new ImageIcon("Escudo.png").getImage());
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setModal(true);
        this.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
        jLabel1.setText("Respaldar archivos: Elija los archivos a respaldar");
        jLabel1.setBounds(new Rectangle(65, 35, 325, 40));
        jLabel1.setFont(new Font("Arial",0,12));
        
        jCheckBox1.setText("Archivo Bitacora");
        jCheckBox1.setBounds(new Rectangle(145, 75, 135, 35));
        jCheckBox1.setContentAreaFilled(false);
        
        jCheckBox2.setText("Archivo Unidades");
        jCheckBox2.setBounds(new Rectangle(145, 120, 125, 35));
        jCheckBox2.setContentAreaFilled(false);
        
        jCheckBox3.setText("Archivo Usuarios");
        jCheckBox3.setBounds(new Rectangle(145, 160, 125, 35));
        jCheckBox3.setContentAreaFilled(false);

        jButton1.setText("Aceptar");
        jButton1.setBounds(new Rectangle(150, 265, 95, 25));
        jButton1.setIcon(new ImageIcon("Ok.png"));

        jButton1.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    jButton1_mouseClicked(e);
                }
            });
        jCheckBox4.setText("Archivo de inicio");
        jCheckBox4.setBounds(new Rectangle(145, 210, 130, 30));
        jCheckBox4.setContentAreaFilled(false);


        jPanel1.setBounds(new Rectangle(0, 0, 435, 40));
        jPanel2.setBounds(new Rectangle(0, 300, 435, 50));
        
        
        jPanel1.setBackground(new Color(0,100,0));
        jPanel2.setBackground(new Color(0,100,0));
        
        jPanel1.setLayout(null);
        jPanel2.setLayout(null);

        jLabel2.setBounds(new Rectangle(290, 115, 100, 100));
        this.getContentPane().add(jLabel2, null);
        this.getContentPane().add(jPanel2, null);
        this.getContentPane().add(jPanel1, null);
        this.getContentPane().add(jCheckBox4, null);
        this.getContentPane().add(jButton1, null);
        this.getContentPane().add(jCheckBox3, null);
        this.getContentPane().add(jCheckBox2, null);
        this.getContentPane().add(jCheckBox1, null);
        this.getContentPane().add(jLabel1, null);
    }

/*Metodo Que Va A seleccionar los archivos a guardar
 * Hecho Por Luis Humberto Ponce Hermosillo 27 de Mayo del 2012*/
    private void jButton1_mouseClicked(MouseEvent e) {
        String [] list=new String[4];
        if(jCheckBox1.isSelected()==true){
            list[0]="Bitacora.log";
        }
        else{
            list[0]="";
        }
        if(jCheckBox2.isSelected()==true){
            list[1]="Unidades.txt";
        }
        else{
            list[1]="";
        }
        if(jCheckBox3.isSelected()==true){
            list[2]="Usuarios.txt";
        }
        else{
            list[2]="";
        }
        if(jCheckBox4.isSelected()==true){
            list[3]="config.ini";
        }
        else{
            list[3]="";
        }
        if(jCheckBox1.isSelected()==false && jCheckBox2.isSelected()==false && jCheckBox3.isSelected()==false && jCheckBox4.isSelected()==false ){
            JOptionPane.showMessageDialog(this,"No hay archivos seleccionados","Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
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
                for(int i=0;i<list.length;i++){
                    if(list[i].equals("")==false){
                        //copiarFicheros(new File(arc,Lista[i]),new File(destino,Lista[i]));
                        copiarFicheros(new File(arc,list[i]),new File(destino,list[i]));
                    }
                }
                JOptionPane.showMessageDialog(this,"Respaldo exitoso","Respaldo",JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            }
        }
    }
    public void copiarFicheros(File f1, File f2){
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
}
