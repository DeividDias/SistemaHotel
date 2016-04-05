package hotel.model.service.impl;

import java.math.BigDecimal;
import java.util.List;

import hotel.fabricas.DaoFactory;
import hotel.model.dao.ClienteDao;
import hotel.model.dao.jpa.EM;
import hotel.model.dominio.Cliente;
import hotel.model.service.ClienteService;

public class ClienteServiceImpl implements ClienteService {
	
	private ClienteDao clienteDao;
	
	public ClienteServiceImpl() {
		clienteDao = DaoFactory.criarClienteDao();
	}
	
	public Cliente inserir(Integer codCliente, String nome, String cpf, String endereco, String telefone,
			String email) throws Exception {
		try {
			EM.get().getTransaction().begin();

			Cliente cliente = new Cliente(codCliente, nome, cpf, endereco, telefone, email);
			clienteDao.inserirAtualizar(cliente);
			
			EM.get().getTransaction().commit();
			return cliente;
		}
		catch (Exception e) {
			if (EM.get().getTransaction().isActive())
				EM.get().getTransaction().rollback();
			throw new Exception("Erro ao inserir cliente! " + e.getMessage());
		}
	}

	@Override
	public List<Cliente> buscarTodos() {
		return clienteDao.buscarTodos();
	}

	@Override
	public Cliente buscar(Integer codigo) {
		return clienteDao.buscar(codigo);
	}

	@Override
	public BigDecimal totalPontos(int cod) throws Exception {
		try {
			Cliente cli = clienteDao.buscar(cod);
			if (cli == null) {
				throw new Exception("Código inexistente!");
			}
			else {
				return cli.totalPontos();
			}
		}
		catch (Exception e) {
			throw new Exception("Erro ao buscar pontos! " + e.getMessage());
		}
	}

}
