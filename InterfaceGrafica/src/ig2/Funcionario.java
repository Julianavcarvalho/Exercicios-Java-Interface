package ig2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Funcionario extends JFrame {

	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfCargo;
	private JTextField tfSalario;
	private JTextField tfResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Funcionario frame = new Funcionario();
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
	public Funcionario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 571, 438);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 28));
		lblNewLabel.setBounds(28, 49, 123, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cargo:");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 28));
		lblNewLabel_1.setBounds(28, 93, 99, 33);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Salar\u00EDo:");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 28));
		lblNewLabel_2.setBounds(28, 137, 123, 33);
		contentPane.add(lblNewLabel_2);
		
		tfNome = new JTextField();
		tfNome.setFont(new Font("Arial", Font.PLAIN, 24));
		tfNome.setBounds(128, 49, 406, 32);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		tfCargo = new JTextField();
		tfCargo.setFont(new Font("Arial", Font.PLAIN, 24));
		tfCargo.setColumns(10);
		tfCargo.setBounds(128, 93, 406, 32);
		contentPane.add(tfCargo);
		
		tfSalario = new JTextField();
		tfSalario.setFont(new Font("Arial", Font.PLAIN, 24));
		tfSalario.setColumns(10);
		tfSalario.setBounds(128, 137, 406, 32);
		contentPane.add(tfSalario);
		
		JButton btnNewButton = new JButton("AUMENTAR SALARIO");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = tfNome.getText();
				String cargo = tfCargo.getText();
				double salario = Double.parseDouble(tfSalario.getText());
				double sal;
				
				if (salario <= 1500) {
					sal = salario * 1.3;
				} else if (salario <= 2000) {
					sal = salario * 1.2;
				} else {
					sal = salario * 1.1;
				}
				
				tfResultado.setText(""+nome+"\nCargo: "+cargo+"\nNovo Salario: R$"+sal);
				
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 20));
		btnNewButton.setBounds(10, 211, 251, 41);
		contentPane.add(btnNewButton);
		
		JButton btnDiminuirSalario = new JButton("DIMINUIR SALARIO");
		btnDiminuirSalario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = tfNome.getText();
				String cargo = tfCargo.getText();
				double salario = Double.parseDouble(tfSalario.getText());
				double sal;
				
				if (salario <= 1500) {
					sal = salario * 0.9;
				} else if (salario <= 2000) {
					sal = salario * 0.8;
				} else {
					sal = salario * 0.7;
				}
				
				tfResultado.setText(""+nome+" Cargo: "+cargo+" Novo Salario: R$"+sal);
			}
		});
		btnDiminuirSalario.setFont(new Font("Arial", Font.PLAIN, 20));
		btnDiminuirSalario.setBounds(289, 211, 251, 41);
		contentPane.add(btnDiminuirSalario);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setBounds(0, 0, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		tfResultado = new JTextField();
		tfResultado.setFont(new Font("Arial", Font.PLAIN, 20));
		tfResultado.setBounds(10, 276, 530, 112);
		contentPane.add(tfResultado);
		tfResultado.setColumns(10);
	}
}
