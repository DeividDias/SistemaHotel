package model.service;

import java.util.List;

import model.domain.Cliente;

public interface ClienteService {

	List<Cliente> getCliente(Cliente cliente);

	void salvar(Cliente cliente);

	void atualizar(Cliente cliente);

	void excluir(Integer codigoCliente);

}
