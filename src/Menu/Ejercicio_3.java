package Menu;

import java.awt.Color;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JRadioButton;

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
        
        JPanel panelNotas2 = new JPanel();
        panelNotas2.setBorder(new TitledBorder(new LineBorder(Color.BLACK)));     
        panelNotas2.setBounds(38, 60, 400, 150);        
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
        

        
        
	}
}
