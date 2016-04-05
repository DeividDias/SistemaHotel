package model.service;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import dao.FornecedorDao;
import model.domain.Fornecedor;

public class FornecedorServiceImpl implements FornecedorService {

	@Inject
	private FornecedorDao fornecedorDao;
	
	@Override
	public List<Fornecedor> getFornecedores(Fornecedor fornecedor) {
		return fornecedorDao.getFornecedores(fornecedor);
	}

	@Override
	public List<Fornecedor> getFornecedores() {
		return fornecedorDao.getFornecedores();
	}
	
	@Override
	@Transactional
	public void salvar(Fornecedor fornecedor) {
		fornecedorDao.salvar(fornecedor);
	}

	@Override
	@Transactional
	public void atualizar(Fornecedor fornecedor) {
		fornecedorDao.atualizar(fornecedor);
	}

	@Override
	@Transactional
	public void excluir(Integer codigoFornecedor) {
		Fornecedor fornecedor = new Fornecedor();
		fornecedor.setCodigo(codigoFornecedor);
		fornecedorDao.excluir(fornecedor);
	}

}
