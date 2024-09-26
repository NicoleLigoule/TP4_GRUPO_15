package Menu;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Ejercicio_2 extends Ventana {
    private JTextField txtNota1, txtNota2, txtNota3, txtPromedio, txtCondicion;

    public Ejercicio_2() {
        super(false);

        this.setSize(500, 500);
        this.setLocation(500, 100);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        JPanel panelNotas1 = new JPanel();
        panelNotas1.setBorder(new TitledBorder(new LineBorder(new Color(153, 180, 209)), "Notas del estudiante",
                TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
        panelNotas1.setBounds(39, 33, 270, 230);
        GridBagLayout gbl_panelNotas1 = new GridBagLayout();
        gbl_panelNotas1.columnWeights = new double[]{0.0, 1.0};
        panelNotas1.setLayout(gbl_panelNotas1);
        getContentPane().add(panelNotas1);


        // Nota 1
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        panelNotas1.add(new JLabel("Nota 1:"), gbc);
        gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 0);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 0;
        txtNota1 = new JTextField(10);
        panelNotas1.add(txtNota1, gbc);

        // Nota 2
        gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 1;
        panelNotas1.add(new JLabel("Nota 2:"), gbc);
        gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 0);
        gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridy = 1;
        gbc.gridx = 1;
        txtNota2 = new JTextField(10);
        panelNotas1.add(txtNota2, gbc);

        // Nota 3
        gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 2;
        panelNotas1.add(new JLabel("Nota 3:"), gbc);
        gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 0);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 2;
        txtNota3 = new JTextField(10);
        panelNotas1.add(txtNota3, gbc);
        
    	// ComboBox
        gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 3;
        panelNotas1.add(new JLabel("TPS:"), gbc);
        gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 3;
        JComboBox comboBox = new JComboBox();
        comboBox.setModel(new DefaultComboBoxModel(new String[] {"Aprobado", "Desaprobado"}));
        panelNotas1.add(comboBox, gbc);

        JPanel panelResultados = new JPanel();
        panelResultados.setBorder(new TitledBorder(new LineBorder(new Color(153, 180, 209)), "Resultados",
                TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
        panelResultados.setBounds(39, 300, 270, 100);
        panelResultados.setLayout(new GridBagLayout());
        getContentPane().add(panelResultados);

        // Promedio
        gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        panelResultados.add(new JLabel("Promedio:"), gbc);
        gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 0;
        txtPromedio = new JTextField(10);
        panelResultados.add(txtPromedio, gbc);

        // Condición
        gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 1;
        panelResultados.add(new JLabel("Condición:"), gbc);
        gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 1;
        txtCondicion = new JTextField(10);
        panelResultados.add(txtCondicion, gbc);

        JButton btnCalcular = new JButton("CALCULAR");
        btnCalcular.setBounds(320, 130, 130, 30);
        getContentPane().add(btnCalcular);
        
                
        
        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	if (validarCampos()) {
                try {
                   
                    double nota1 = Double.parseDouble(txtNota1.getText());
                    double nota2 = Double.parseDouble(txtNota2.getText());
                    double nota3 = Double.parseDouble(txtNota3.getText());

                    
                    String estadoTP = (String) comboBox.getSelectedItem(); 
                    
                    double promedio = (nota1 + nota2 + nota3) / 3;
                    txtPromedio.setText(String.format("%.2f", promedio));

                    
                    String condicion = "Promocion"; 
                    if (estadoTP.equals("Desaprobado")) {
                        condicion = "Libre";
                    }
                    
                    else if (nota1 < 6 || nota2 < 6 || nota3 < 6) {
                        condicion = "Libre";
                    }
                    
                    else if (nota1 >= 8 && nota2 >= 8 && nota3 >= 8 && estadoTP.equals("Aprobado")) {
						condicion = "promocionado";
					}
                    
                    else if (nota1 >= 6 && nota1 < 8 || nota2 >= 6 && nota2 < 8  || nota3 >= 6 && nota3 < 8  && estadoTP.equals("Aprobado")) {
						condicion = "regular";
					}
                                       
                    
                    txtCondicion.setText(condicion);

                } catch (NumberFormatException ex) {
                    
                    txtPromedio.setText("Error");
                    txtCondicion.setText("Error");
                }
              }
            }
        });

        JButton btnNuevo = new JButton("NUEVO");
        btnNuevo.setBounds(320, 170, 130, 30);
        getContentPane().add(btnNuevo);
        
        btnNuevo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                txtNota1.setText("");
                txtNota2.setText("");
                txtNota3.setText("");
                txtPromedio.setText("");
                txtCondicion.setText("");


                txtNota1.setBackground(Color.WHITE);
                txtNota2.setBackground(Color.WHITE);
                txtNota3.setBackground(Color.WHITE);

 
                comboBox.setSelectedIndex(0);
            }
        });
        

        JButton btnSalir = new JButton("SALIR");
        btnSalir.setBounds(320, 210, 130, 30);
        getContentPane().add(btnSalir);

        this.setVisible(true);
    
    
    
    btnSalir.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
            dispose();
        }
    });
}


    private boolean validarCampos() {
        boolean todosValidos = true;
        

        String nota1 = txtNota1.getText().trim();
        try {
            double valorNota1 = Double.parseDouble(nota1);
            if (valorNota1 < 1 || valorNota1 > 10) {
                throw new NumberFormatException();
            }
            txtNota1.setBackground(Color.WHITE);
        } catch (NumberFormatException | NullPointerException e) {
            txtNota1.setBackground(Color.RED);
            todosValidos = false;
        }

        String nota2 = txtNota2.getText().trim();
        try {
            double valorNota2 = Double.parseDouble(nota2);
            if (valorNota2 < 1 || valorNota2 > 10) {
                throw new NumberFormatException();
            }
            txtNota2.setBackground(Color.WHITE);
        } catch (NumberFormatException | NullPointerException e) {
            txtNota2.setBackground(Color.RED);
            todosValidos = false;
        }


        String nota3 = txtNota3.getText().trim();
        try {
            double valorNota3 = Double.parseDouble(nota3);
            if (valorNota3 < 1 || valorNota3 > 10) {
                throw new NumberFormatException();
            }
            txtNota3.setBackground(Color.WHITE);
        } catch (NumberFormatException | NullPointerException e) {
            txtNota3.setBackground(Color.RED);
            todosValidos = false;
        }     

        return todosValidos;
    }
        
}
