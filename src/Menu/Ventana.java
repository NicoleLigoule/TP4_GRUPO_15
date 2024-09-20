package Menu;

import javax.swing.JButton;
import javax.swing.JFrame;

import Menu.EventoBoton;


public class Ventana extends JFrame {
    
    public Ventana(boolean incluirBoton) {
     
    	//JFrame frame = new JFrame();
    	// Aquí no necesitamos crear un nuevo JFrame, ya que Ventana hereda de JFrame
		
		this.setSize(500,500);
		this.setLocation(350,350);
		this.setTitle("TP4_GRUPO_15");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	

		if (incluirBoton) {
	      // Crear un botón solo si se solicita, ya que sino trae los botones del menu inicial
			JButton button = new JButton();
			button.setText("Ejercicio 1");
			button.setBounds(180, 80, 140, 30);
			
			JButton button1 = new JButton();
			button1.setText("Ejercicio 2");
			button1.setBounds(180, 130, 140, 30);
			
			//Evento boton 0
			EventoBoton eventoA = new EventoBoton("CONTACTOS", 0);		
			button.addActionListener(eventoA);
			
			//Evento boton 1
			EventoBoton eventoB = new EventoBoton("PROMEDIO", 1);		
			button1.addActionListener(eventoB);
			
			
			
			
			this.setLayout(null);
			this.getContentPane().add(button);
			this.getContentPane().add(button1);
		}	
		this.setVisible(true);
    
	
    }
}
