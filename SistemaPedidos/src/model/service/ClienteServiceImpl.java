package model.service;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import dao.ClienteDao;
import model.domain.Cliente;

public class ClienteServiceImpl implements ClienteService {

	@Inject
	private ClienteDao clienteDao;
	
	@Override
	public List<Cliente> getCliente(Cliente cliente) {
		return clienteDao.getClientes(cliente);
	}

	@Override
	@Transactional
	public void salvar(Cliente cliente) {
		clienteDao.salvar(cliente);
	}

	@Override
	@Transactional
	public void atualizar(Cliente cliente) {
		clienteDao.atualizar(cliente);
	}

	@Override
	@Transactional
	public void excluir(Integer codigoCliente) {
		Cliente cliente = new Cliente();
		cliente.setCodigo(codigoCliente);
		clienteDao.excluir(cliente);
	}

}
