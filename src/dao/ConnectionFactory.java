package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {
		public Connection getConnection() {
			
			String connectionUrl = "jdbc:sqlserver://Endereço do banco no computador:1433;databaseName=BARBEARIA;user=sa;password=******";
			
			try {
				 return DriverManager.getConnection(connectionUrl);
			}catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
}
