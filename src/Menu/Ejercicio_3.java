package Menu;

import java.awt.Color;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class Ejercicio_3 extends Ventana{
	
	public Ejercicio_3() {
        super(false);
        
        this.setSize(480, 340);
        this.setLocation(500, 100);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);
        
        JPanel panelNotas1 = new JPanel();
        panelNotas1.setBorder(new TitledBorder(new LineBorder(Color.BLACK)));     
        panelNotas1.setBounds(38, 20, 400, 30);        
        getContentPane().add(panelNotas1);
	}
}
