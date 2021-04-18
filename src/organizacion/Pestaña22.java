package organizacion;

import java.awt.Color;
import java.awt.Dimension;

import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;

import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;

import java.awt.event.MouseEvent;

import java.io.BufferedWriter;
import java.io.File;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;

public class Pestaña22 extends JPanel {
    private JLabel jLabel1 = new JLabel();
    private JScrollPane jScrollPane1 = new JScrollPane();
    private JTextArea jTextArea1 = new JTextArea();
    String Path="Archivos";

    public Pestaña22() {
        setOpaque(false);
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.setLayout(null);
        this.setSize(new Dimension(762, 420));
        jTextArea1.setLineWrap(true);
        jTextArea1.setFont(new Font("Arial",0,12));
        jLabel1.setText("II. PRESENTACION");
        jLabel1.setForeground(Color.WHITE);
        jLabel1.setBounds(new Rectangle(15, 10, 315, 20));
        jScrollPane1.setBounds(new Rectangle(35, 55, 695, 310));
        jTextArea1.setSize(new Dimension(690, 300));
        jScrollPane1.getViewport().add(jTextArea1, null);
        this.add(jScrollPane1, null);
        this.add(jLabel1, null);
    }

    public void paintComponent(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    //g2.setPaint(new GradientPaint(new Point(0, 0), new Color(176, 207, 158), new Point(0, getHeight() / 2),new Color(57, 99, 0))); 
    g2.setPaint(new GradientPaint(new Point(0, 0), new Color(57, 99, 0), new Point(0, getHeight()),new Color(57, 99, 0)));
    g2.fillRect(0,0,getWidth(),getHeight());
    super.paintComponent(g);
    }
    
    void establecer(String cam2){
        jTextArea1.setText(cam2);
        jTextArea1.setEnabled(false);
        }

}