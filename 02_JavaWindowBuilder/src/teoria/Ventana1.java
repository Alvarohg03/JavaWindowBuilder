package teoria;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana1 {

	private JFrame frame;
	private JTextField textFieldnombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana1 window = new Ventana1();
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
	public Ventana1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 255, 128));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("Diseño visual");
		lblTitulo.setBounds(39, 11, 81, 49);
		frame.getContentPane().add(lblTitulo);
		
		textFieldnombre = new JTextField();
		textFieldnombre.setBounds(23, 71, 86, 20);
		frame.getContentPane().add(textFieldnombre);
		textFieldnombre.setColumns(10);
		
		JLabel lblmensaje = new JLabel("New label");
		lblmensaje.setBounds(23, 114, 83, 14);
		frame.getContentPane().add(lblmensaje);
		
		JButton btnNewButton = new JButton("Pulsame");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblmensaje.setText(textFieldnombre.getText());
			}
		});
		btnNewButton.setBounds(172, 70, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
	}
}
