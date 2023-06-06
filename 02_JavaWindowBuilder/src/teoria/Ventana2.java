package teoria;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;

public class Ventana2 {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana2 window = new Ventana2();
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
	public Ventana2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(29, 22, 83, 31);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(26, 64, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Madrid", "Sevilla", "Valencia"}));
		comboBox.setBounds(29, 95, 76, 22);
		frame.getContentPane().add(comboBox);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Acepto");
		chckbxNewCheckBox.setBounds(29, 131, 59, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JSlider slider = new JSlider();
		slider.setBounds(48, 171, 200, 26);
		frame.getContentPane().add(slider);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 255, 128));
		panel.setBounds(269, 11, 155, 173);
		frame.getContentPane().add(panel);
		
		JComboBox comboBox_1 = new JComboBox();
		panel.add(comboBox_1);
		
		JButton btnNewButton = new JButton("New button");
		panel.add(btnNewButton);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("New check box");
		panel.add(chckbxNewCheckBox_1);
	}
}
