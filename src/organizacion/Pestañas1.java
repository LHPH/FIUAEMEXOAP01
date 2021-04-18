package organizacion;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

public class Pestañas1 extends JTabbedPane {
    Pestaña11 pest1 = new Pestaña11();
    Pestaña22 pest2 = new Pestaña22();
    Pestaña3 pest3 = new Pestaña3();
    Pestaña4 pest4 = new Pestaña4();
    Pestaña5 pest5 = new Pestaña5();
    Pestaña6 pest6 = new Pestaña6();
    Pestaña7 pest7 = new Pestaña7();
    Pestaña8 pest8 = new Pestaña8();
    Pestaña9 pest9 = new Pestaña9();
    Pestaña10 pest10 = new Pestaña10();
    Pestaña11y12 pest12 = new Pestaña11y12();
    Pestaña14 pest14 = new Pestaña14();
    Pestaña15 pest15 = new Pestaña15();
    Pestaña16 pest16 = new Pestaña16();
    PestañaF1 pestf = new PestañaF1(pest1);

    
   JTabbedPane jbInit() {
       
        JScrollPane scroll = new JScrollPane(pest1);
        this.addTab("Seccion I",scroll);
        this.addTab("Seccion II",pest2);
        this.addTab("Seccion III",pest3);
        this.addTab("Seccion IV",pest4);
        this.addTab("Seccion V",pest5);
        this.addTab("Seccion VI",pest6);
        this.addTab("Seccion VII",pest7);
        this.addTab("Seccion VIII",pest8);
        this.addTab("Seccion IX",pest9);
        this.addTab("Seccion X",pest10);
        this.addTab("Secciones XI y XII",pest12);
        this.addTab("Seccion XIII",pestf);
        this.addTab("Seccion XIV",pest14);
        this.addTab("Seccion XV",pest15);
        this.addTab("Seccion XVI",pest16);
       
        this.setSize(new Dimension(765, 430));
        return this;
    }
   
   public Pestaña11 getPestaña11(){
       return pest1;
   }
   
    public Pestaña22 getPestaña2(){
        return pest2;
    }
    
    public Pestaña3 getPestaña3(){
        return pest3;
    }
    
    public Pestaña4 getPestaña4(){
        return pest4;
    }
    
    public Pestaña5 getPestaña5(){
        return pest5;
    }
    
    public Pestaña6 getPestaña6(){
        return pest6;
    }
    
    public Pestaña7 getPestaña7(){
        return pest7;
    }
    
    public Pestaña8 getPestaña8(){
        return pest8;
    }
    
    public Pestaña9 getPestaña9(){
        return pest9;
    }
    
    public Pestaña10 getPestaña10(){
        return pest10;
    }
    
   
   public Pestaña11y12 getPestaña12(){
       return pest12;
   }
   
   public Pestaña14 getPestaña14(){
        return pest14;
    }
    public Pestaña15 getPestaña15(){
        return pest15;
    }
    public Pestaña16 getPestaña16(){
        return pest16;
    }
   
    public PestañaF1 getPestañaf1(){
        return pestf;
    }
   
}
