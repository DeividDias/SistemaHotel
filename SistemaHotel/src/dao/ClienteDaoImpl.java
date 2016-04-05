package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

import model.domain.Cliente;

public class ClienteDaoImpl implements ClienteDao {

	@PersistenceContext(unitName="SistemaPedidos")
	private EntityManager entityManage;
	 
	@Override
	public List<Cliente> getClientes(Cliente cliente) {
		return entityManage.createQuery("from Cliente").getResultList();
	}

	@Override
	public void salvar(Cliente cliente) {
		entityManage.persist(cliente);
	}

	@Override
	public void atualizar(Cliente cliente) {
		salvar(entityManage.merge(cliente));
	}

	@Override
	public void excluir(Cliente cliente) {
		entityManage.remove(cliente);
	}

}
