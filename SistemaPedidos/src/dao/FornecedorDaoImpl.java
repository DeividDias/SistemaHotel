package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.domain.Fornecedor;

public class FornecedorDaoImpl implements FornecedorDao {

	@PersistenceContext(unitName="SistemaHotel")
	private EntityManager entityManage;
	 
	@Override
	public List<Fornecedor> getFornecedores(Fornecedor fornecedor) {
		return entityManage.createQuery("from Fornecedor").getResultList();
	}

	@Override
	public List<Fornecedor> getFornecedores() {
		return entityManage.createQuery("from Fornecedor").getResultList();
	}
	
	@Override
	public void salvar(Fornecedor fornecedor) {
		entityManage.persist(fornecedor);
	}

	@Override
	public void atualizar(Fornecedor fornecedor) {
		salvar(entityManage.merge(fornecedor));
	}

	@Override
	public void excluir(Fornecedor fornecedor) {
		entityManage.remove(fornecedor);
	}

}
