package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entidade.Produto;

// DAO - Data Access Object
// extends é o conectivo de herança
public class ProdutoDAO extends ConnectionDAO {

	private Connection conn;
	// prepara a instrução para o banco
	private PreparedStatement stmt;

	public ProdutoDAO() {
		try {
			conn = getConnection();
			stmt = null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// try - catch - finally
	public void salvar(Produto p) throws SQLException {
		
		try {

			// ? (parameter ou coringa) - sao usados para representar os valores que seram
			// passados
			stmt = conn.prepareStatement("insert into produto values (null, ?, ?, ?, ?)");
			// definicao dos valores
			stmt.setString(1, p.getNmProduto());
			stmt.setString(2, p.getDescProduto());
			stmt.setDouble(3, p.getPreco());
			stmt.setInt(4, p.getQuantidade());

			/*
			 * execute() - dispara a instrucao para o banco e retorna um boleano (true |
			 * false)
			 */
			boolean flag = stmt.execute();

			// gera um SQLException caso de algum erro ao inserir
			if (flag) {
				throw new SQLException("Erro ao inserir o produto");
			}
		} finally {
			if (stmt != null) {
				stmt.close();
			}

			if (conn != null) {
				conn.close();
			}
		}
	}

	public Produto buscarPorId(Long id) throws SQLException {

		try {
			conn = getConnection();
			stmt = conn.prepareStatement("select * from produto where id = ?");

			stmt.setLong(1, id);

			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				Produto p = createProduto(rs);
				rs.close();
				return p;
			}
		} finally {
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
		return null;
	}

	public List<Produto> buscarPorNome(String nome) throws SQLException {

		List<Produto> produtos = new ArrayList<Produto>();

		try {
			conn = getConnection();
			stmt = conn.prepareStatement("select * from produto where lower(nmProduto) like ?");

			stmt.setString(1, "%" + nome.toLowerCase() + "%");

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Produto p = createProduto(rs);
				produtos.add(p);
			}

			rs.close();

		} finally {
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
		return produtos;
	}

	public List<Produto> listar() throws SQLException {

		List<Produto> produtos = new ArrayList<Produto>();

		try {
			conn = getConnection();
			stmt = conn.prepareStatement("select * from produto");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Produto p = createProduto(rs);
				produtos.add(p);
			}
			rs.close();
		} finally {
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
		return produtos;
	}

	public boolean excluir(Long id) throws SQLException {

		try {
			conn = getConnection();
			stmt = conn.prepareStatement("delete from produto where id = ?");
			stmt.setLong(1, id);
			int count = stmt.executeUpdate();
			boolean ok = count > 0;
			return ok;
		} finally {
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
	}

	public Produto createProduto(ResultSet rs) throws SQLException {
		Produto p = new Produto();

		p.setId(rs.getLong("id"));
		p.setNmProduto(rs.getString("nmProduto"));
		p.setDescProduto(rs.getString("descProduto"));
		p.setPreco(rs.getDouble("preco"));
		p.setQuantidade(rs.getInt("quantidade"));

		return p;
	}
}