package organizacion;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Unidades extends JFrame {
    public Unidades() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout( null );
        this.setSize( new Dimension(400, 300) );
    }
}
