package Menu;

import javax.swing.JFrame;

public class Mensaje extends Ventana {

	public Mensaje() {
        super(false);
        
        this.setSize(450, 200);
        this.setLocation(150, 100);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);
}
}