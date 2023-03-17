package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import java.awt.Component;
import javax.swing.Box;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class Quantidade extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quantidade frame = new Quantidade();
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
	public Quantidade() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 495, 353);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 479, 22);
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
		
		table = new JTable();
		table.setBounds(33, 83, 425, 216);
		contentPane.add(table);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(79, 33, 369, 14);
		contentPane.add(progressBar);
		
		JLabel lblNewLabel = new JLabel("Estoque:");
		lblNewLabel.setBounds(10, 33, 43, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Produtos");
		lblNewLabel_1.setBounds(23, 58, 43, 14);
		contentPane.add(lblNewLabel_1);
	}
}
