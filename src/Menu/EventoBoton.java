package Menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import jdk.nashorn.internal.runtime.arrays.NumericElements;

public class EventoBoton implements ActionListener{

	private String title;
	private int numeroDeBoton;
	
	public EventoBoton(String title, int numeroDeBoton) {
		super();
		this.title = title;
		this.numeroDeBoton = numeroDeBoton;
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		if(numeroDeBoton == 0) //Con esto logramos que no traiga todos los botones juntos usando el mismo metodo
		{
			Ejercicio_1 ventEj1 = new Ejercicio_1();
		    ventEj1.setTitle(title);
		}
		if(numeroDeBoton == 1) 
		{
			Ejercicio_2 ventEj2 = new Ejercicio_2();
		    ventEj2.setTitle(title);
		}
	    
	   
		
	}

}
