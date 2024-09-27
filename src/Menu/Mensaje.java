package Menu;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mensaje extends JFrame {

	   // Constructor modificado para aceptar un título
    public Mensaje(String titulo, String mensaje) {

        this.setSize(450, 200);
        this.setLocation(150, 100);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle(titulo);  // Establecemos el título de la ventana
        getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(10, 10, 420, 120);
        getContentPane().add(panel);
        panel.setLayout(null);

        JLabel lblMensaje = new JLabel(mensaje);
        lblMensaje.setBounds(10, 40, 400, 30);
        lblMensaje.setHorizontalAlignment(SwingConstants.CENTER);
        lblMensaje.setFont(new Font("Tahoma", Font.PLAIN, 14));
        panel.add(lblMensaje);

        // Agregar botón "Aceptar" para cerrar la ventana
        JButton btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(165, 80, 100, 30);
        panel.add(btnAceptar);

        // Acción para cerrar la ventana al pulsar el botón "Aceptar"
        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();  // Cierra solo la ventana actual
            }
        });

        this.setVisible(true);
    }
}
