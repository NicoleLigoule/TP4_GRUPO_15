package Menu;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Mensaje extends JFrame {

    public Mensaje(String mensaje) {

        this.setSize(450, 200);
        this.setLocation(150, 100);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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

        this.setVisible(true);
    }
}