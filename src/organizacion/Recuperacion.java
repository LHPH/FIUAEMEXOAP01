package organizacion;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;

import java.awt.Rectangle;

import java.awt.event.KeyAdapter;

import java.awt.event.KeyEvent;

import java.awt.event.KeyListener;

import java.awt.event.MouseAdapter;

import java.awt.event.MouseEvent;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileReader;

import java.io.FileWriter;
import java.io.IOException;

import java.io.PrintWriter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Recuperacion extends JDialog{
   
    private JLabel jLabel1 = new JLabel();
    private JLabel jLabel2 = new JLabel();
    private JLabel jLabel3 = new JLabel();
    private JLabel jLabel4 = new JLabel();
    
    private JLabel jLabel7 = new JLabel(new ImageIcon("llaves3.png"));
    private JLabel jLabel8 = new JLabel(new ImageIcon("usuario.png"));
    
   // String Path = "C:\\Users\\HÉCTOR\\Documents\\JDeveloper\\mywork\\Organizacion\\Archivos";
   String Path="Archivos";
    //String Path = "C:\\Users\\usuario\\Documents\\OrganizacionV2\\Organizacion\\Archivos";
    private JTextField jTextField1 = new JTextField();

    private JPasswordField jPasswordField1 = new JPasswordField();
    private JPasswordField jPasswordField2 = new JPasswordField();
    
    private JButton jButton1 = new JButton();
    int ContLin=0;
    int Index=0;
    String Preg="";
    String Resp="";
    String [] ContReg;
    String [] PregRec = {"¿Mejor amigo de la infancia?","Pelicula preferida"};
    private JTextField jTextField2 = new JTextField();
    private JLabel jLabel5 = new JLabel();
    private JLabel jLabel6 = new JLabel();
    private JLabel jLabel9 = new JLabel(new ImageIcon("escudo2.png"));
    private JLabel jLabel10 = new JLabel(new ImageIcon("FG.png"));

    public Recuperacion() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        JPanel panel = new JPanel();
        this.setSize(new Dimension(575, 367));
        //this.getContentPane().setLayout( null );
        this.setIconImage(new ImageIcon("Escudo.png").getImage());
        this.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
        this.setTitle("Recuperación de contraseña");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setModal(true);
        this.setIconImage(new ImageIcon("Escudo.png").getImage());

        jLabel1.setText("Usuario:");
        jLabel1.setBounds(new Rectangle(150, 40, 180, 30));
        jLabel1.setFont(new Font("Arial", 0, 12));
        jLabel1.setForeground(Color.WHITE);
        
        jLabel2.setText("Pregunta secreta:");
        jLabel2.setBounds(new Rectangle(100, 85, 135, 35));
        
        jLabel2.setFont(new Font("Arial", 0, 12));
        jLabel2.setForeground(Color.WHITE);
        jLabel2.setVisible(false);
        
        jLabel3.setText("Nueva contraseña:");
        jLabel3.setBounds(new Rectangle(95, 195, 165, 35));
        jLabel3.setFont(new Font("Arial", 0, 12));
        jLabel3.setForeground(Color.WHITE);
        jLabel3.setVisible(false);
        
        jLabel4.setText("Confirme nueva contraseña:");
        jLabel4.setBounds(new Rectangle(43, 245, 170, 35));
        jLabel4.setFont(new Font("Arial", 0, 12));
        jLabel4.setForeground(Color.WHITE);
        jLabel4.setVisible(false);
        
        jLabel5.setText("Respuesta:");
        jLabel5.setBounds(new Rectangle(135, 145, 125, 35));
        jLabel5.setForeground(Color.WHITE);
        jLabel5.setVisible(false);
        jLabel5.setFont(new Font("Arial", 0, 12));
        
        
        jLabel6.setBounds(new Rectangle(215, 90, 240, 30));
        jLabel6.setForeground(Color.WHITE);
        jLabel6.setFont(new Font("Arial", 0, 12));
        
        
        jLabel7.setBounds(new Rectangle(375, 80, 210, 200));      
        jLabel8.setBounds(new Rectangle(115, 30, 40, 50));   
        
        
//        jLabel9.setBounds(new Rectangle(1, 80, 40, 50));
        //jLabel1.setBounds(new Rectangle(150, 40, 180, 30));
//        jLabel7.setBounds(new Rectangle(400, 100, 210, 90));
        
        
        jTextField1.setBounds(new Rectangle(215, 45, 160, 25));
        jTextField1.addKeyListener(new KeyAdapter() {
                public void keyPressed(KeyEvent e) {
                    CampUsuar(e);
                }
            });
        
        jTextField2.setBounds(new Rectangle(215, 145, 160, 25));
        jTextField2.setVisible(false);

        jTextField2.addKeyListener(new KeyAdapter() {
                public void keyPressed(KeyEvent e) {
                    CampResp(e);
                }
            });
        jPasswordField1.setBounds(new Rectangle(215, 200, 160, 25));
       jPasswordField1.setVisible(false);
        
        jPasswordField2.setBounds(new Rectangle(215, 250, 160, 25));
        jPasswordField2.setVisible(false);
        
        jButton1.setText("Aceptar");
        jButton1.setIcon(new ImageIcon("Ok.png"));
        jButton1.setBounds(new Rectangle(375, 290, 90, 20));
        jButton1.setVisible(false);
        
    
        jLabel9.setBounds(new Rectangle(5, 10, 100, 80));

        jLabel10.setBounds(new Rectangle(445, 10, 90, 75));
      

        jButton1.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    Acept(e);
                }
            });

        this.getContentPane().add(jLabel10, null);
        this.getContentPane().add(jLabel9, null);
        this.getContentPane().add(jLabel6, null);
        this.getContentPane().add(jLabel5, null);
        this.getContentPane().add(jTextField2, null);
        this.getContentPane().add(jButton1, null);
        this.getContentPane().add(jPasswordField2, null);
        this.getContentPane().add(jPasswordField1, null);
        this.getContentPane().add(jTextField1, null);
        this.getContentPane().add(jLabel4, null);
        this.getContentPane().add(jLabel3, null);
        this.getContentPane().add(jLabel2, null);
        this.getContentPane().add(jLabel1, null);
        this.getContentPane().add(jLabel7, null);
        this.getContentPane().add(jLabel8, null);
        
        panel.add(jLabel10,null);
        panel.add(jLabel9,null);
        panel.add(jLabel8,null);
        panel.add(jLabel7,null);
        panel.add(jLabel6,null);
        panel.add(jLabel5,null);
        panel.add(jLabel4,null);
        panel.add(jLabel3,null);
        panel.add(jLabel2,null);
        panel.add(jLabel1,null);
        panel.add(jTextField1,null);
        panel.add(jTextField2,null);
        panel.add(jPasswordField1,null);
        panel.add(jPasswordField2,null);
        panel.add(jButton1,null);
        panel.setLayout(null);
        panel.setBackground(new Color(0,100,0));

       
        this.setContentPane(panel);
        
        //this.getContentPane().add(jLabel10, null);
    }


    private void CampUsuar(KeyEvent e) {
        boolean ind,ind2=false;
        String linea="";
        String [] usu;
        String [] reg;
        int cont=0,tam;
        tam=ContLineArch();
        usu = new String[tam];
        reg= new String[2];
        ContReg= new String[tam];
        ind=jTextField1.getText().equals("");
        if(e.getKeyCode()==KeyEvent.VK_ENTER && (ind==false)){
           File arc = new File(Path,"Usuarios.txt");
           FileReader leearc;
        try {
                leearc = new FileReader(arc);
             
            BufferedReader acclec = new BufferedReader(leearc);
                linea=acclec.readLine();
            while(linea!=null){
               ContReg[cont]=linea; 
               reg=ExtrCamp(linea);
               usu[cont]=reg[0];
               linea=acclec.readLine();
                cont++;
            }
            acclec.close();
        }catch (FileNotFoundException f) {
        }catch (IOException f) { }
        for(cont=0;cont<ContLin;cont++){
            if(usu[cont].equals(jTextField1.getText())==true){
                ind2=true;
                break;
            }
        }
        if(ind2==true){
            Index=cont;
            linea=ContReg[cont];
        for(cont=0;cont<8;cont++){ //19
            reg=ExtrCamp(linea);
            linea=reg[1];
        }
        reg=ExtrCamp(linea);
        Preg=reg[0];
            System.out.println(reg[0]);
        reg=ExtrCamp(reg[1]);
        Resp=reg[0];
        jLabel2.setVisible(true);
        jLabel5.setVisible(true);
        jLabel6.setText(PregRec[Integer.parseInt(Preg)]);
        jTextField2.setVisible(true);
        
        }else {
            JOptionPane.showMessageDialog(this,"El usuario no existe","Error",JOptionPane.ERROR_MESSAGE);
        }
        }
        else{
            //JOptionPane.showMessageDialog(this,"Llene Los Campos","Error",JOptionPane.ERROR_MESSAGE);
                
            }
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

    private void CampResp(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ENTER){
            if(jTextField2.getText().equals(Resp)==true){
                jLabel3.setVisible(true);
                jLabel4.setVisible(true);
                jPasswordField1.setVisible(true);
                jPasswordField2.setVisible(true);
                jButton1.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(this,"La respuesta no es correcta","Error",JOptionPane.ERROR_MESSAGE);
            }
            
        }
    }

    private void Acept(MouseEvent e) {
        boolean ind,ind2;
        String cont="",cont2="",cont3="",cad="";
        String [] camp= new String[2];
        int conta=0;
        cont=cont3.valueOf(jPasswordField1.getPassword());
        cont2=cont3.valueOf(jPasswordField2.getPassword());
        ind=cont.equals("");
        ind2=cont2.equals("");
        if(ind==true || ind2==true){
            JOptionPane.showMessageDialog(this,"Error los campos de las contraseñas estan vacios","Error",JOptionPane.ERROR_MESSAGE);
            jPasswordField1.setText("");
            jPasswordField2.setText("");
        }
        else {
            
            if(CompPass(cont,cont2)==false){
                jPasswordField1.setText("");
                jPasswordField2.setText("");
            }
            else{
                cont=CodePass(cont);
                //Modificacion Del Registro
                camp=ExtrCamp(ContReg[Index]);
                cad=camp[0];
                camp=ExtrCamp(camp[1]);
                cad=cad+";"+cont+";"+camp[1];
                ContReg[Index]=cad;
                File arc = new File(Path,"Usuarios.txt");
                FileWriter escarc;
                try {
                    escarc = new FileWriter(arc);
                    PrintWriter accesc = new PrintWriter(escarc);
                    for(conta=0;conta<ContLin;conta++){
                        accesc.print(ContReg[conta]);
                        accesc.println("");
                    }
                    accesc.close();
                    JOptionPane.showMessageDialog(this,"Contraseña actualizada", "Contraseña",JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                } catch (IOException f) {
                }
            }   
        }
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
                JOptionPane.showMessageDialog(null,"Error. La contraseña debe ser de máximo 8 caracteres ","Error",JOptionPane.ERROR_MESSAGE);
            }
            else{
                if(ban2==false){
                    JOptionPane.showMessageDialog(null,"Error. Las contraseñas no coinciden","Error",JOptionPane.ERROR_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Error. La contraseña no debe tener espacios","Error",JOptionPane.ERROR_MESSAGE);
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

}
