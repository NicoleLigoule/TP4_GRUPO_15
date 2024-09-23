package Menu;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Ejercicio_1 extends Ventana{
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtTelefono;
	private JTextField txtFechaNac;

	public Ejercicio_1() {
		super(false);
		
        
        this.setSize(400, 400);
        this.setLocation(200, 100);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);
        
        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(21, 41, 92, 26);
        getContentPane().add(lblNombre);
        
        JLabel lblApellido = new JLabel("Apellido:");
        lblApellido.setBounds(21, 79, 92, 26);
        getContentPane().add(lblApellido);
        
        JLabel lblTelefono = new JLabel("Telefono:");
        lblTelefono.setBounds(21, 119, 92, 26);
        getContentPane().add(lblTelefono);
        
        JLabel lblFechaNac = new JLabel("Fecha Nac:");
        lblFechaNac.setBounds(21, 157, 125, 26);
        getContentPane().add(lblFechaNac);
        
        txtNombre = new JTextField();
        txtNombre.setBounds(176, 41, 177, 26);
        getContentPane().add(txtNombre);
        txtNombre.setColumns(10);
        
        txtApellido = new JTextField();
        txtApellido.setColumns(10);
        txtApellido.setBounds(176, 76, 177, 26);
        getContentPane().add(txtApellido);
        
        txtTelefono = new JTextField();
        txtTelefono.setColumns(10);
        txtTelefono.setBounds(176, 116, 177, 26);
        getContentPane().add(txtTelefono);
        
        txtFechaNac = new JTextField();
        txtFechaNac.setColumns(10);
        txtFechaNac.setBounds(176, 154, 177, 26);
        getContentPane().add(txtFechaNac);
        
        JButton btnMostar = new JButton("Mostar");
        btnMostar.setBounds(110, 204, 141, 35);
        getContentPane().add(btnMostar);
        
        JLabel lblResultado = new JLabel("Los datos ingresados fueron:");
        lblResultado.setBounds(21, 268, 350, 26);  
        getContentPane().add(lblResultado);
        
        
        btnMostar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                String nombre = txtNombre.getText();
                String apellido = txtApellido.getText();
                String telefono = txtTelefono.getText();
                String fechaNac = txtFechaNac.getText();
                
            }
        });
        
        
	}
	
	 private void validarCampos() {

	        if (txtNombre.getText().isEmpty()) {
	            txtNombre.setBackground(Color.RED);
	        } else {
	            txtNombre.setBackground(Color.WHITE);
	        }

	        if (txtApellido.getText().isEmpty()) {
	            txtApellido.setBackground(Color.RED);
	        } else {
	            txtApellido.setBackground(Color.WHITE);
	        }
	        
	        if (txtTelefono.getText().isEmpty()) {
	            txtTelefono.setBackground(Color.RED);
	        } else {
	            txtTelefono.setBackground(Color.WHITE);
	        }

	        if (txtFechaNac.getText().isEmpty()) {
	            txtFechaNac.setBackground(Color.RED);
	        } else {
	            txtFechaNac.setBackground(Color.WHITE);
	        }
	        
	    }
private void limpiarCampos() {
		  if (!txtNombre.getText().isEmpty() && 
		      !txtApellido.getText().isEmpty() && 
		      !txtTelefono.getText().isEmpty() && 
		      !txtFechaNac.getText().isEmpty()) {
			  	txtNombre.setText("");
		        txtApellido.setText("");
		        txtTelefono.setText("");
		        txtFechaNac.setText("");
		        }
		}

}
