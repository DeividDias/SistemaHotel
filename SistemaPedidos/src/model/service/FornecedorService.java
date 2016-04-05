package model.service;

import java.util.List;

import model.domain.Fornecedor;

public interface FornecedorService {

	void salvar(Fornecedor fornecedor);

	void atualizar(Fornecedor fornecedor);

	void excluir(Integer codigoFornecedor);

	List<Fornecedor> getFornecedores(Fornecedor fornecedor);

	List<Fornecedor> getFornecedores();

}
