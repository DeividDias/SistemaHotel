package dao;

import java.util.List;

import model.domain.Cliente;

public interface ClienteDao {

	List<Cliente> getClientes(Cliente cliente);

	void salvar(Cliente cliente);

	void atualizar(Cliente cliente);

	void excluir(Cliente cliente);

}
