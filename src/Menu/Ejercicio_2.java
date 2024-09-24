package Menu;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class Ejercicio_2 extends Ventana{

	public Ejercicio_2() {
		super(false);
		
		this.setSize(400, 400);
        this.setLocation(500, 100);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);
        
        //Elemento panel 1
        JPanel panelNotas1 = new JPanel();
		panelNotas1.setBorder(new TitledBorder(new LineBorder(new Color(153, 180, 209)), "Notas del estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelNotas1.setBounds(39, 33, 246, 195);
		getContentPane().add(panelNotas1);
		
	}

}
