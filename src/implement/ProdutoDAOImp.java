package implement;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entidade.Produto;
import persistencia.ProdutoDAO;

public class ProdutoDAOImp {

	private ProdutoDAO pd;

	public ProdutoDAOImp() {
		pd = new ProdutoDAO();
	}

	public Boolean gravar(Produto p) {
		try {
			pd.salvar(p);
			return Boolean.TRUE;
		} catch (SQLException e) {
			e.printStackTrace();
			return Boolean.FALSE;
		}
	}
	
	public List<Produto> listar() {
		try {
			return pd.listar();
		} catch (SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	
	public List<Produto> buscaNome(String nome) {

		try {
			return pd.buscarPorNome(nome);
		} catch (SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	
	public Produto buscaId(Long id) {
		try {
			return pd.buscarPorId(id);
		} catch (SQLException e) {
			e.printStackTrace();
			return new Produto();
		}
	}
	
	public Boolean deletar(Long id) {
		try {
			pd.excluir(id);
			return Boolean.TRUE;
		} catch (SQLException e) {
			e.printStackTrace();
			return Boolean.FALSE;
		}
	}
}
