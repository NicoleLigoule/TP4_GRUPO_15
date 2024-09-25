package Menu;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import java.awt.GridLayout;

public class Ejercicio_2 extends Ventana{
	private JTextField txtNota1, txtNota2, txtNota3, txtPromedio, txtCondicion;

	public Ejercicio_2() {
		super(false);
		
		this.setSize(400, 400);
        this.setLocation(500, 100);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        
        JPanel panelNotas1 = new JPanel();
        panelNotas1.setBorder(new TitledBorder(new LineBorder(new Color(153, 180, 209)), "Notas del estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
        panelNotas1.setBounds(39, 33, 246, 195);
        panelNotas1.setLayout(new GridBagLayout()); 
        getContentPane().add(panelNotas1);

 
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); 
        gbc.fill = GridBagConstraints.HORIZONTAL;

       
        gbc.gridx = 0;
        gbc.gridy = 0;
        panelNotas1.add(new JLabel("Nota 1:"), gbc);
        gbc.gridx = 1;
        txtNota1 = new JTextField(10);
        panelNotas1.add(txtNota1, gbc);
        

        gbc.gridx = 0;
        gbc.gridy = 1;
        panelNotas1.add(new JLabel("Nota 2:"), gbc);
        gbc.gridx = 1;
        txtNota2 = new JTextField(10);
        panelNotas1.add(txtNota2, gbc);


        gbc.gridx = 0;
        gbc.gridy = 2;
        panelNotas1.add(new JLabel("Nota 3:"), gbc);
        gbc.gridx = 1;
        txtNota3 = new JTextField(10);
        panelNotas1.add(txtNota3, gbc);




        JButton btnCalcular = new JButton("CALCULAR");
        btnCalcular.setBounds(300, 40, 130, 30);
        getContentPane().add(btnCalcular);

        JButton btnNuevo = new JButton("NUEVO");
        btnNuevo.setBounds(300, 80, 130, 30);
        getContentPane().add(btnNuevo);

        JButton btnSalir = new JButton("SALIR");
        btnSalir.setBounds(300, 120, 130, 30);
        getContentPane().add(btnSalir);


        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Ejercicio_2();
	}

}
