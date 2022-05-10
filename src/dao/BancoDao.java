package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import model.Banco;

public class BancoDao extends Banco{
	
	Connection conn;
	
	public ResultSet autentUsuario(Banco usuario) {
		conn = new ConnectionFactory().getConnection();
		
		try {
			String sql = "select * from BancoDeDados where usuario= ? and senha = ?";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, usuario.getUsuario());
			pstm.setString(2, usuario.getSenha());
			
			ResultSet rs = pstm.executeQuery();
			
			return rs;
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Usuario não encontrado!" + e);
			throw new RuntimeException(e);
		}
		
	}
	
}
