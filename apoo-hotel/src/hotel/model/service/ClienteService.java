package hotel.model.service;

import java.math.BigDecimal;
import java.util.List;

import hotel.model.dominio.Cliente;

public interface ClienteService {
	
	Cliente inserir(Integer codCliente, String nome, String cpf, String endereco, String telefone,
			String email) throws Exception;

	List<Cliente> buscarTodos();

	Cliente buscar(Integer codigo);

	BigDecimal totalPontos(int cod) throws Exception;

}
