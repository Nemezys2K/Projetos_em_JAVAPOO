package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JFormattedTextField;
import javax.swing.JToggleButton;
import javax.swing.JTable;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JList;

public class Controle extends JFrame {

	private JPanel contentPane;
	private JTextField txtQuantidade1;
	private JTextField txtPreco1;
	private JTextField txtQuantidade2;
	private JTextField txtPreco2;
	private JTextField txtQuantidade3;
	private JTextField txtPreco3;
	private JTextField txtQuantidade4;
	private JTextField txtPreco4;
	private JTextField txtTotal;
	private JButton btnNewButton;
	private JList list;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Controle frame = new Controle();
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
	public Controle() {
		setTitle("Sistema de Sorveteria");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 563, 419);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(0, 0, 128));
		setJMenuBar(menuBar);
		
		JButton btnNewButton_2 = new JButton("INICIO");
		menuBar.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("PRODUTOS");
		btnNewButton_3.setBackground(new Color(255, 255, 255));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		menuBar.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("QUANTIDADE");
		menuBar.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("CONTROLE");
		menuBar.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("CLIENTES");
		menuBar.add(btnNewButton_6);
		
		btnNewButton = new JButton("SAIR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		menuBar.add(btnNewButton);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(UIManager.getBorder("Table.scrollPaneBorder"));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tipo de Sorvete");
		lblNewLabel.setBounds(10, 11, 76, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Quantidade");
		lblNewLabel_1.setBounds(182, 11, 56, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Preço Unitário");
		lblNewLabel_2.setBounds(413, 11, 67, 14);
		contentPane.add(lblNewLabel_2);
		
		txtQuantidade1 = new JTextField();
		txtQuantidade1.setText("10");
		txtQuantidade1.setBounds(166, 36, 86, 20);
		contentPane.add(txtQuantidade1);
		txtQuantidade1.setColumns(10);
		
		txtPreco1 = new JTextField();
		txtPreco1.setText("1.50");
		txtPreco1.setBounds(410, 36, 86, 20);
		contentPane.add(txtPreco1);
		txtPreco1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Sorvete de Frutas");
		lblNewLabel_3.setBounds(20, 39, 87, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Chocolate Crocante");
		lblNewLabel_4.setBounds(20, 81, 95, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Bola de Sorvete");
		lblNewLabel_5.setBounds(20, 117, 76, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Pote de Sorvte 2 - LITROS");
		lblNewLabel_6.setBounds(20, 152, 127, 14);
		contentPane.add(lblNewLabel_6);
		
		txtQuantidade2 = new JTextField();
		txtQuantidade2.setText("1");
		txtQuantidade2.setBounds(166, 78, 86, 20);
		contentPane.add(txtQuantidade2);
		txtQuantidade2.setColumns(10);
		
		txtPreco2 = new JTextField();
		txtPreco2.setText("2.0");
		txtPreco2.setBounds(410, 78, 86, 20);
		contentPane.add(txtPreco2);
		txtPreco2.setColumns(10);
		
		txtQuantidade3 = new JTextField();
		txtQuantidade3.setText("0");
		txtQuantidade3.setBounds(166, 114, 86, 20);
		contentPane.add(txtQuantidade3);
		txtQuantidade3.setColumns(10);
		
		txtPreco3 = new JTextField();
		txtPreco3.setText("0");
		txtPreco3.setBounds(410, 114, 86, 20);
		contentPane.add(txtPreco3);
		txtPreco3.setColumns(10);
		
		txtQuantidade4 = new JTextField();
		txtQuantidade4.setText("0");
		txtQuantidade4.setBounds(166, 149, 86, 20);
		contentPane.add(txtQuantidade4);
		txtQuantidade4.setColumns(10);
		
		txtPreco4 = new JTextField();
		txtPreco4.setText("0");
		txtPreco4.setBounds(410, 149, 86, 20);
		contentPane.add(txtPreco4);
		txtPreco4.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("TOTAL:");
		lblNewLabel_7.setBounds(244, 211, 36, 14);
		contentPane.add(lblNewLabel_7);
		
		txtTotal = new JTextField();
		txtTotal.setText("17.00");
		txtTotal.setBounds(413, 208, 86, 20);
		contentPane.add(txtTotal);
		txtTotal.setColumns(10);
		
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int quantidade1 = Integer.parseInt(txtQuantidade1.getText());
			int quantidade2 = Integer.parseInt(txtQuantidade1.getText());
			int quantidade3 = Integer.parseInt(txtQuantidade1.getText());
			int quantidade4 = Integer.parseInt(txtQuantidade1.getText());
			
			double preco1 = Double.parseDouble(txtPreco1.getText());
			double preco2 = Double.parseDouble(txtPreco1.getText());
			double preco3 = Double.parseDouble(txtPreco1.getText());
			double preco4 = Double.parseDouble(txtPreco1.getText());
			
			
			double total = ((quantidade1 * preco1) + (quantidade2 + preco2) + (quantidade3 + preco3) + (quantidade4 + preco4));
			
			txtTotal.setText(String.valueOf(total));
			
			JFrame resultado= new JFrame();
			resultado.setVisible(true);
			resultado.setTitle("Resultado");
			
			}
			
		});
		btnCalcular.setBounds(151, 307, 101, 23);
		contentPane.add(btnCalcular);
		
		JButton btnLimpar = new JButton("LIMPAR");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtQuantidade1.setText(null);
				txtQuantidade2.setText(null);
				txtQuantidade3.setText(null);
				txtQuantidade4.setText(null);

				txtPreco1.setText(null);
				txtPreco2.setText(null);
				txtPreco3.setText(null);
				txtPreco4.setText(null);
				
				txtTotal.setText(null);

			}
		});
		btnLimpar.setBounds(312, 307, 89, 23);
		contentPane.add(btnLimpar);
		
		list = new JList();
		list.setBounds(45, 210, 127, 60);
		contentPane.add(list);
	}
}
