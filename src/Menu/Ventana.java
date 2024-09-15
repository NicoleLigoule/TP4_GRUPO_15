package Menu;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Ventana extends JFrame {
    
    public Ventana() {
     
    	JFrame frame = new JFrame();
		
		frame.setSize(500,500);
		frame.setLocation(350,350);
		frame.setTitle("TP4_GRUPO_15");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	

		
		JButton button = new JButton();
		button.setText("Ejercicio 1");
		button.setBounds(180, 80, 140, 30);
		
		frame.setLayout(null);
		frame.getContentPane().add(button);	
		frame.setVisible(true);
    
	
    }
}
