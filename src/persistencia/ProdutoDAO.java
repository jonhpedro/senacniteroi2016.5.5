package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import entidade.Produto;

// DAO - Data Access Object
public class ProdutoDAO extends ConnectionDAO {

	private Connection conn;
	
	public ProdutoDAO() {
		try {
			conn = getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void salvar(Produto p) throws SQLException {
			// prepara a instrução para o banco
			PreparedStatement stmt = null;
		try {
			
			// ? (parameter ou coringa) - sao usados para representar os valores que seram passados 
			stmt = conn.prepareStatement("insert into produto values (null, ?, ?, ?, ?)");
			// definicao dos valores
			stmt.setString(1, p.getNmProduto());
			stmt.setString(2, p.getDescProduto());
			stmt.setDouble(3, p.getPreco());
			stmt.setInt(4, p.getQuantidade());
			
			/* execute() - dispara a instrucao para o banco 
			 * e retorna um boleano (true | false)
			 */
			boolean flag = stmt.execute();
			
			// gera um SQLException caso de algum erro ao inserir
			if(flag) {
				throw new SQLException("Erro ao inserir o produto");
			}
		} finally {
			if(stmt != null) {
				stmt.close();
			}
			
			if(conn != null) {
				conn.close();
			}
		}
	}	
}