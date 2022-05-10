package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.BancoDao;
import model.Banco;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Window.Type;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField tfUsuario;
	private JPasswordField pfSenha;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setAutoRequestFocus(false);
		setResizable(false);
		setForeground(new Color(192, 192, 192));
		setFont(new Font("Dialog", Font.BOLD, 12));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\lgste.000\\Documents\\Git\\Barbearia\\pincel.jpg"));
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(20, 20, 20, 20));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" Usu\u00E1rio");
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(54, 26, 84, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblSenha = new JLabel("  Senha");
		lblSenha.setForeground(Color.DARK_GRAY);
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSenha.setBounds(54, 90, 70, 27);
		contentPane.add(lblSenha);
		
		tfUsuario = new JTextField();
		tfUsuario.setFont(new Font("Tahoma", Font.BOLD, 16));
		tfUsuario.setBounds(10, 53, 138, 25);
		contentPane.add(tfUsuario);
		tfUsuario.setColumns(10);
		
		pfSenha = new JPasswordField();
		pfSenha.setFont(new Font("Tahoma", Font.PLAIN, 16));
		pfSenha.setBounds(10, 115, 138, 27);
		contentPane.add(pfSenha);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				
				Logar();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(49, 163, 89, 23);
		contentPane.add(btnNewButton);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\lgste.000\\Documents\\Git\\Barbearia\\pexels-josh-sorenson-995300.jpg"));
		lblNewLabel_1.setBounds(0, 0, 434, 261);
		contentPane.add(lblNewLabel_1);
	}
	
	private void Logar() {
		try {
			String usuario, senha;
			
			usuario = tfUsuario.getText();
			senha = new String(pfSenha.getPassword()) ;
			
			Banco bcBanco = new Banco();
			bcBanco.setUsuario(usuario);
			bcBanco.setSenha(senha);
			
			BancoDao autentUsuario = new BancoDao();
			ResultSet rsusuario = autentUsuario.autentUsuario(bcBanco);
			
			if(rsusuario.next()) {
				viewPrincipal telaPrincipal = new viewPrincipal();
				telaPrincipal.setVisible(true);
				
				dispose();
			}else {
				JOptionPane.showMessageDialog(null, "Usuário ou Senha Inválida!");
			}
			
		}catch(SQLException errException) {
			JOptionPane.showMessageDialog(null,"Erro ao tentar se Logar!" + errException);
		}
	}
}
