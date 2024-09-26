package Menu;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import Menu.EventoBoton;
import java.awt.Font;


public class Ventana extends JFrame {
    
		
    public Ventana(boolean incluirBoton) {
     
    	//JFrame frame = new JFrame();
    	// Aquí no necesitamos crear un nuevo JFrame, ya que Ventana hereda de JFrame
    	
    
		this.setSize(500,300);
		this.setLocation(350,350);
		this.setTitle("TP4_GRUPO_15");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
        

		if (incluirBoton) {
			JLabel label = new JLabel("GRUPO NRO: 15");
	        label.setBounds(80, 30, 140, 30);
	        label.setFont(new Font("Arial", Font.BOLD, 16));
	        
	        this.getContentPane().add(label);
	      // Crear un botón solo si se solicita, ya que sino trae los botones del menu inicial
			JButton button = new JButton();
			button.setText("Ejercicio 1");
			button.setBounds(180, 80, 140, 30);
			
			JButton button1 = new JButton();
			button1.setText("Ejercicio 2");
			button1.setBounds(180, 130, 140, 30);
			
			JButton button2 = new JButton();
			button2.setText("Ejercicio 3");
			button2.setBounds(180, 180, 140, 30);
			
			//Evento boton 0
			EventoBoton eventoA = new EventoBoton("CONTACTOS", 0);		
			button.addActionListener(eventoA);
			
			//Evento boton 1
			EventoBoton eventoB = new EventoBoton("PROMEDIO", 1);		
			button1.addActionListener(eventoB);
			
			//Evento boton 2
			EventoBoton eventoC = new EventoBoton("Seleccion multiple", 2);		
			button2.addActionListener(eventoC);
			
			
			
			
			this.setLayout(null);
			this.getContentPane().add(button);
			this.getContentPane().add(button1);
			this.getContentPane().add(button2);
		}	
		this.setVisible(true);    
	
    }
}
