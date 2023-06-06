package teoria;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Actividad2 {

	private JFrame frame;
	private JTextField textFieldCorreo;
	private JTextField textFieldContraseña;
	private JTextField textFieldRepiteContraseña;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Actividad2 window = new Actividad2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Actividad2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(400, 400, 850, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 128));
		panel.setBounds(112, 50, 607, 445);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabelCorreo = new JLabel("Introduce tu correo:");
		lblNewLabelCorreo.setFont(new Font("Stencil", Font.PLAIN, 11));
		lblNewLabelCorreo.setBounds(46, 74, 163, 25);
		panel.add(lblNewLabelCorreo);
		
		textFieldCorreo = new JTextField();
		textFieldCorreo.setBounds(205, 76, 230, 20);
		panel.add(textFieldCorreo);
		textFieldCorreo.setColumns(10);
		
		JLabel lblNewLabelContraseña1 = new JLabel("Contraseña:");
		lblNewLabelContraseña1.setFont(new Font("Stencil", Font.PLAIN, 11));
		lblNewLabelContraseña1.setBounds(46, 110, 163, 20);
		panel.add(lblNewLabelContraseña1);
		
		textFieldContraseña = new JTextField();
		textFieldContraseña.setBounds(205, 110, 230, 20);
		panel.add(textFieldContraseña);
		textFieldContraseña.setColumns(10);
		
		JLabel lblNewLabelRepiteContraseña = new JLabel("Repite tu contraseña:");
		lblNewLabelRepiteContraseña.setFont(new Font("Stencil", Font.PLAIN, 11));
		lblNewLabelRepiteContraseña.setBounds(46, 138, 203, 41);
		panel.add(lblNewLabelRepiteContraseña);
		
		textFieldRepiteContraseña = new JTextField();
		textFieldRepiteContraseña.setBounds(205, 148, 230, 20);
		panel.add(textFieldRepiteContraseña);
		textFieldRepiteContraseña.setColumns(10);
		
		JCheckBox Aceptolosterminos = new JCheckBox("Acepto la politica de privacidad");
		Aceptolosterminos.setBackground(new Color(255, 255, 128));
		Aceptolosterminos.setBounds(200, 186, 203, 41);
		panel.add(Aceptolosterminos);
		
		JLabel lblNewLabelFormulario = new JLabel("Formulario");
		lblNewLabelFormulario.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabelFormulario.setBounds(240, 11, 195, 54);
		panel.add(lblNewLabelFormulario);
		
		JLabel lblNewLabelmensaje = new JLabel("");
		lblNewLabelmensaje.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabelmensaje.setBounds(23, 282, 504, 41);
		panel.add(lblNewLabelmensaje);
		
		
		JButton btnNewButtonRegistro = new JButton("Registrarse");
		btnNewButtonRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String correo= textFieldCorreo.getText();
                String contraseña = new String(textFieldContraseña.getText());
                String repetircontraseña = new String(textFieldRepiteContraseña.getText());
                
                if(Aceptolosterminos.isSelected()) {
                	if(contraseña.equals(repetircontraseña)) {
                		lblNewLabelmensaje.setText("Registro hecho correctamente");
                	}
                	else {
                		lblNewLabelmensaje.setText("Las contraseñas no coinciden");

                	}
                }
                else {
                	lblNewLabelmensaje.setText("Primero acepta los terminos");

                }
			}
		});
		btnNewButtonRegistro.setBounds(210, 231, 144, 38);
		panel.add(btnNewButtonRegistro);
		
		

		
	}

}
