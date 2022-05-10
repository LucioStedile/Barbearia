package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class viewPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfTelefone;
	private JTextField tfTipoCorte;
	private JTextField tfPreco_1;
	private JTextField tfTipoBarba;
	private JTextField tfPreco_2;
	private JTextField tfCadastro;
	private JTextField tfTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewPrincipal frame = new viewPrincipal();
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
	public viewPrincipal() {
		setTitle("BARBEARIA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 754, 536);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CADASTRAR CLIENTE");
		lblNewLabel.setEnabled(false);
		lblNewLabel.setBackground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblNewLabel.setForeground(new Color(64, 64, 64));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(5, 5, 728, 42);
		contentPane.add(lblNewLabel);
		
		JLabel lbNome = new JLabel("Nome:");
		lbNome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbNome.setBounds(10, 107, 74, 20);
		contentPane.add(lbNome);
		
		tfNome = new JTextField();
		tfNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfNome.setBounds(64, 107, 559, 22);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		JLabel lbTelefone = new JLabel("Telefone:");
		lbTelefone.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbTelefone.setBounds(10, 162, 74, 22);
		contentPane.add(lbTelefone);
		
		tfTelefone = new JTextField();
		tfTelefone.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfTelefone.setBounds(81, 162, 227, 22);
		contentPane.add(tfTelefone);
		tfTelefone.setColumns(10);
		
		JLabel lbTipoCorte = new JLabel("Tipo de Corte:");
		lbTipoCorte.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbTipoCorte.setBounds(10, 220, 103, 22);
		contentPane.add(lbTipoCorte);
		
		tfTipoCorte = new JTextField();
		tfTipoCorte.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfTipoCorte.setBounds(123, 222, 333, 22);
		contentPane.add(tfTipoCorte);
		tfTipoCorte.setColumns(10);
		
		JLabel lbPreco_1 = new JLabel("Pre\u00E7o R$");
		lbPreco_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbPreco_1.setBounds(466, 222, 74, 20);
		contentPane.add(lbPreco_1);
		
		tfPreco_1 = new JTextField();
		tfPreco_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfPreco_1.setBounds(537, 222, 86, 22);
		contentPane.add(tfPreco_1);
		tfPreco_1.setColumns(10);
		
		JLabel lbTipoBarba = new JLabel("Tipo de Barba:");
		lbTipoBarba.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbTipoBarba.setBounds(10, 274, 115, 20);
		contentPane.add(lbTipoBarba);
		
		tfTipoBarba = new JTextField();
		tfTipoBarba.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfTipoBarba.setBounds(123, 275, 333, 22);
		contentPane.add(tfTipoBarba);
		tfTipoBarba.setColumns(10);
		
		JLabel lbPreco_2 = new JLabel("Pre\u00E7o R$");
		lbPreco_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbPreco_2.setBounds(466, 274, 74, 20);
		contentPane.add(lbPreco_2);
		
		tfPreco_2 = new JTextField();
		tfPreco_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfPreco_2.setColumns(10);
		tfPreco_2.setBounds(537, 276, 86, 22);
		contentPane.add(tfPreco_2);
		
		tfCadastro = new JTextField();
		tfCadastro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfCadastro.setBounds(101, 368, 128, 20);
		contentPane.add(tfCadastro);
		tfCadastro.setColumns(10);
		
		JLabel lbCadastro = new JLabel("N\u00BA Cadastro:");
		lbCadastro.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbCadastro.setBounds(5, 370, 97, 17);
		contentPane.add(lbCadastro);
		
		JLabel lbTipoPagamento = new JLabel("Tipo de Pagamento:");
		lbTipoPagamento.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbTipoPagamento.setBounds(10, 316, 149, 20);
		contentPane.add(lbTipoPagamento);
		
		JRadioButton rbDebito = new JRadioButton("D\u00E9bito");
		rbDebito.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rbDebito.setBounds(165, 317, 74, 23);
		contentPane.add(rbDebito);
		
		JRadioButton rbDinheiro = new JRadioButton("Dinheiro");
		rbDinheiro.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rbDinheiro.setBounds(386, 315, 91, 23);
		contentPane.add(rbDinheiro);
		
		JRadioButton rbCredito = new JRadioButton("Credito");
		rbCredito.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rbCredito.setBounds(275, 317, 109, 23);
		contentPane.add(rbCredito);
		
		JLabel lbTotal = new JLabel("Total");
		lbTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lbTotal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbTotal.setBounds(614, 336, 44, 20);
		contentPane.add(lbTotal);
		
		tfTotal = new JTextField();
		tfTotal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfTotal.setBounds(592, 367, 97, 20);
		contentPane.add(tfTotal);
		tfTotal.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("R$:");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_9.setBounds(561, 368, 32, 19);
		contentPane.add(lblNewLabel_9);
		
		JButton btnCadastro = new JButton("Cadastrar");
		btnCadastro.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCadastro.setBounds(52, 438, 109, 23);
		contentPane.add(btnCadastro);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnEditar.setBounds(176, 438, 89, 23);
		contentPane.add(btnEditar);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCalcular.setBounds(452, 438, 103, 23);
		contentPane.add(btnCalcular);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSair.setBounds(565, 438, 89, 23);
		contentPane.add(btnSair);
		
		JButton btnEncontrarCliente = new JButton("Encontrar Cliente");
		btnEncontrarCliente.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnEncontrarCliente.setBounds(275, 438, 167, 23);
		contentPane.add(btnEncontrarCliente);
	}
	
	private void Salvar() {
		String nome;
		int cadastro;
		
		nome = tfNome.getName();
		cadastro = new Integer (tfCadastro.getCadastro());
	}
}
