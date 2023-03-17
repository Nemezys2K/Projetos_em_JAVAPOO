package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.List;
import java.awt.Checkbox;

public class CLIENTES extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CLIENTES frame = new CLIENTES();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CLIENTES() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 441, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 22);
		contentPane.add(menuBar);
		
		JButton btnNewButton_2_1 = new JButton("INICIO");
		menuBar.add(btnNewButton_2_1);
		
		JButton btnNewButton_3 = new JButton("PRODUTOS");
		menuBar.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("QUANTIDADE");
		menuBar.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("CONTROLE");
		menuBar.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("CLIENTES");
		menuBar.add(btnNewButton_6);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setBounds(174, 59, 101, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Usuário/E-mail:");
		lblNewLabel_1.setBounds(49, 101, 128, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(144, 98, 131, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(144, 137, 131, 20);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("Password:");
		lblNewLabel_2.setBounds(49, 140, 70, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("ACESSAR");
		btnNewButton.setBounds(90, 217, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CANCELAR");
		btnNewButton_1.setBounds(208, 217, 89, 23);
		contentPane.add(btnNewButton_1);
		
		Checkbox checkbox = new Checkbox("Salvar Dados?");
		checkbox.setBounds(154, 163, 95, 22);
		contentPane.add(checkbox);
	}
}
