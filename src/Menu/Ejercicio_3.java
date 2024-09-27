package Menu;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Ejercicio_3 extends Ventana{
	
	public Ejercicio_3() {
        super(false);
        
        this.setSize(480, 340);
        this.setLocation(500, 100);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);
        
        JPanel panelNotas1 = new JPanel();
        panelNotas1.setBorder(new TitledBorder(new LineBorder(Color.BLACK)));     
        panelNotas1.setBounds(15, 20, 428, 48);        
        getContentPane().add(panelNotas1);
        panelNotas1.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
        
        JLabel lblElige = new JLabel("Elige un sistema operativo");
        lblElige.setHorizontalAlignment(SwingConstants.CENTER);
        lblElige.setFont(new Font("Tahoma", Font.BOLD, 13));
        panelNotas1.add(lblElige);
        
        JRadioButton rdbtnNewRadioButton = new JRadioButton("Windows");
        panelNotas1.add(rdbtnNewRadioButton);
        
        JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Mac");
        panelNotas1.add(rdbtnNewRadioButton_1);
        
        JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Linux");
        panelNotas1.add(rdbtnNewRadioButton_2);
        
        ButtonGroup group = new ButtonGroup();
        group.add(rdbtnNewRadioButton);
        group.add(rdbtnNewRadioButton_1);
        group.add(rdbtnNewRadioButton_2);
        
        JPanel panelNotas2 = new JPanel();
        panelNotas2.setBorder(new TitledBorder(new LineBorder(Color.BLACK)));     
        panelNotas2.setBounds(15, 78, 428, 132);        
        getContentPane().add(panelNotas2);
        panelNotas2.setLayout(null);
        
        JLabel lblEspecialidad = new JLabel("Elije una especialidad");
        lblEspecialidad.setBounds(32, 61, 151, 20);
        panelNotas2.add(lblEspecialidad);
        
        JCheckBox chkBProgra = new JCheckBox("Programacion");
        chkBProgra.setBounds(210, 22, 139, 29);
        panelNotas2.add(chkBProgra);
        
        JCheckBox checkBAdm = new JCheckBox("Administraci\u00F3n");
        checkBAdm.setBounds(210, 57, 139, 29);
        panelNotas2.add(checkBAdm);
        
        JCheckBox checkBoxDiseno = new JCheckBox("Dise\u00F1o Gr\u00E1fico");
        checkBoxDiseno.setBounds(210, 94, 139, 29);
        panelNotas2.add(checkBoxDiseno);
        
        JLabel lblCantHoras = new JLabel("Cantidad de horas en el computador:");
        lblCantHoras.setBounds(15, 226, 275, 20);
        getContentPane().add(lblCantHoras);
        
        JTextField txtHoras = new JTextField();
        txtHoras.setBounds(292, 226, 146, 26);
        getContentPane().add(txtHoras);
        txtHoras.setColumns(10);
        
        JButton btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(328, 255, 115, 29);
        getContentPane().add(btnAceptar);
        
        btnAceptar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
      			EventoBoton resultado = new EventoBoton("Mensaje", 3);		
      			btnAceptar.addActionListener(resultado);

                String sistemaOperativo = "";
                if (rdbtnNewRadioButton.isSelected()) {
                    sistemaOperativo = "Windows";
                } else if (rdbtnNewRadioButton_1.isSelected()) {
                    sistemaOperativo = "Mac";
                } else if (rdbtnNewRadioButton_2.isSelected()) {
                    sistemaOperativo = "Linux";
                }

                String especialidades = "";
                if (chkBProgra.isSelected()) {
                    especialidades += "Programación - ";
                }
                if (checkBAdm.isSelected()) {
                    especialidades += "Administración - ";
                }
                if (checkBoxDiseno.isSelected()) {
                    especialidades += "Diseño Gráfico - ";
                }

                String horas = txtHoras.getText();
                
                String mensaje = sistemaOperativo + " - " + especialidades + horas + " Hs";
                new Mensaje(mensaje);  
            }
        });
        
        
	}
}
