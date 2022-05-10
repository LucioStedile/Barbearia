package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Cliente;

public class ClienteDao extends Cliente{
	Connection conn;
	
	public ResultSet autentClient(Cliente dados) {
		conn = new ConnectionFactory().getConnection();
		
		
		try {
			String sql = "select * from Cliente where nome= ? and cadastro = ?";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, dados.getNome());
			pstm.setInt(2, dados.getCadastro());
			
			ResultSet rs = pstm.executeQuery();
			
			return rs;
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
