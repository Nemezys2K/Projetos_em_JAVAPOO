package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JMenu;
import javax.swing.JProgressBar;
import javax.swing.JMenuItem;
import java.awt.List;
import javax.swing.JTextPane;

public class Produtos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Produtos frame = new Produtos();
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
	public Produtos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 476, 357);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 460, 22);
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
		
		JMenu mnNewMenu = new JMenu("SORVETES");
		mnNewMenu.setBounds(28, 51, 115, 26);
		contentPane.add(mnNewMenu);
		
		JTextPane txtpnPotes = new JTextPane();
		txtpnPotes.setText("Potes");
		mnNewMenu.add(txtpnPotes);
		
		List list_2 = new List();
		mnNewMenu.add(list_2);
		
		JMenu mnNewMenu_1 = new JMenu("AÇAI");
		mnNewMenu_1.setBounds(28, 92, 115, 26);
		contentPane.add(mnNewMenu_1);
		
		JTextPane txtpnCopos_1 = new JTextPane();
		txtpnCopos_1.setText("Copos");
		mnNewMenu_1.add(txtpnCopos_1);
		
		List list_1 = new List();
		mnNewMenu_1.add(list_1);
		
		JMenu mnNewMenu_2 = new JMenu("MILKSHAKE");
		mnNewMenu_2.setBounds(28, 129, 115, 26);
		contentPane.add(mnNewMenu_2);
		
		JTextPane txtpnCopos = new JTextPane();
		txtpnCopos.setText("Copos");
		mnNewMenu_2.add(txtpnCopos);
		
		List list = new List();
		mnNewMenu_2.add(list);
		
		JMenu mnNewMenu_3 = new JMenu("BEBIDAS");
		mnNewMenu_3.setBounds(28, 166, 115, 26);
		contentPane.add(mnNewMenu_3);
		
		JTextPane txtpnRefrigerante = new JTextPane();
		txtpnRefrigerante.setText("Refrigerante");
		mnNewMenu_3.add(txtpnRefrigerante);
		
		List list_3 = new List();
		mnNewMenu_3.add(list_3);
		
		JMenu mnNewMenu_4 = new JMenu("DOCES");
		mnNewMenu_4.setBounds(28, 204, 115, 26);
		contentPane.add(mnNewMenu_4);
		
		JTextPane txtpnChocolates = new JTextPane();
		txtpnChocolates.setText("Chocolates");
		mnNewMenu_4.add(txtpnChocolates);
		
		List list_4 = new List();
		mnNewMenu_4.add(list_4);
		
		JButton btnNewButton = new JButton("SALVAR");
		btnNewButton.setBounds(54, 284, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("APAGAR");
		btnNewButton_1.setBounds(188, 284, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("CANCELAR");
		btnNewButton_2.setBounds(320, 284, 101, 23);
		contentPane.add(btnNewButton_2);
	}
}
