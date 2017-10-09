package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import entidade.Funcionario;

public class FuncionarioDAO extends ConnectionDAO {

	private Connection conn;
	private PreparedStatement stmt;

	public FuncionarioDAO() {
		try {
			conn = getConnection();
			stmt = null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void salvar(Funcionario f) throws SQLException {

		try {

			stmt = conn.prepareStatement("insert into funcionario values (null, ?, ?, ?, ?, ?, md5(?), ?, ?)");

			stmt.setString(1, f.getNome());
			stmt.setString(2, f.getCpf());
			stmt.setString(3, f.getSexo());
			stmt.setString(4, f.getEmail());
			stmt.setString(5, f.getLogin());
			stmt.setString(6, f.getSenha());
			stmt.setDouble(7, f.getSalario());
			stmt.setLong(8, f.getMatricula());

			boolean flag = stmt.execute();

			if (flag) {
				throw new SQLException("Erro ao inserir o funcionario");
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
}
