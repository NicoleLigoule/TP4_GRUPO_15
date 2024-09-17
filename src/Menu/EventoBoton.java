package Menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventoBoton implements ActionListener{

	private String title;
	
	
	public EventoBoton(String title) {
		super();
		this.title = title;
		
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	    Ejercicio_1 ventEj1 = new Ejercicio_1();
	    ventEj1.setTitle(title);
	    
	   
		
	}

}
