package organizacion;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

public class Pesta�as extends JTabbedPane {
    String Usu;
    Pesta�a1 pest1 = new Pesta�a1();
    Pesta�a2 pest2 = new Pesta�a2(Usu);
    Pesta�a3 pest3 = new Pesta�a3();
    Pesta�a4 pest4 = new Pesta�a4();
    Pesta�a5 pest5 = new Pesta�a5();
    Pesta�a6 pest6 = new Pesta�a6();
    Pesta�a7 pest7 = new Pesta�a7();
    Pesta�a8 pest8 = new Pesta�a8();
    Pesta�a9 pest9 = new Pesta�a9();
    Pesta�a10 pest10 = new Pesta�a10();
    Pesta�a11y12 pest12 = new Pesta�a11y12();
    Pesta�a14 pest14 = new Pesta�a14();
    Pesta�a15 pest15 = new Pesta�a15();
    Pesta�a16 pest16 = new Pesta�a16();
    Pesta�a13 pestf = new Pesta�a13(pest1);
    
    public Pesta�as(String Usu){
          this.Usu=Usu;
        }

    
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
        this.setSize(new Dimension(765, 450));
        return this;
    }
   
   public Pesta�a1 getPesta�a1(){
       return pest1;
   }
   
    public Pesta�a2 getPesta�a2(){
        return pest2;
    }
    
    public Pesta�a3 getPesta�a3(){
        return pest3;
    }
    
    public Pesta�a4 getPesta�a4(){
        return pest4;
    }
    
    public Pesta�a5 getPesta�a5(){
        return pest5;
    }
    
    public Pesta�a6 getPesta�a6(){
        return pest6;
    }
    
    public Pesta�a7 getPesta�a7(){
        return pest7;
    }
    
    public Pesta�a8 getPesta�a8(){
        return pest8;
    }
    
    public Pesta�a9 getPesta�a9(){
        return pest9;
    }
    
    public Pesta�a10 getPesta�a10(){
        return pest10;
    }
    
   
   public Pesta�a11y12 getPesta�a12(){
       return pest12;
   }
   
   public Pesta�a14 getPesta�a14(){
        return pest14;
    }
    public Pesta�a15 getPesta�a15(){
        return pest15;
    }
    public Pesta�a16 getPesta�a16(){
        return pest16;
    }
   
    public Pesta�a13 getPesta�af(){
        return pestf;
    }
   
}

