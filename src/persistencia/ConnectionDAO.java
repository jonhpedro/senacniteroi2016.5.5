package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// responsavel por abrir a conexao com o banco
public class ConnectionDAO {

	public ConnectionDAO() {

		try {
		// Definir a biblioteca (API), que sera responsavel pela comunicação com o banco de dados
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// Se caso o arquivo nao estiver dentro da pasta /lib ou em alguma parte do projeto, sera gerado um erro informando que a classe nao foi encontrada, por isso o tratamento "ClassNotFoundException"
			e.printStackTrace(); // <-- printStackTrace (detalha o erro ocorrido)
		}
	}

	protected Connection getConnection() throws SQLException {
		// URL de conexao com o banco de dados
		String url = "jdbc:mysql://localhost/projetodb";
		
		Connection conn = DriverManager.getConnection(url, "root", "");
		return conn;
	}
	
	public static void main(String[] args) throws SQLException {
		ConnectionDAO db = new ConnectionDAO();
		// Testa conexao
		Connection conexao = db.getConnection();
		System.out.println((!conexao.equals(null)) ? "Conexao aberta" : "Falha ao conectar" );
	}
}
