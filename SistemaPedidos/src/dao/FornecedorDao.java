package dao;

import java.util.List;

import model.domain.Fornecedor;

public interface FornecedorDao {

	List<Fornecedor> getFornecedores(Fornecedor fornecedor);

	void salvar(Fornecedor fornecedor);

	void atualizar(Fornecedor fornecedor);

	void excluir(Fornecedor fornecedor);

	List<Fornecedor> getFornecedores();

}
