package hotel.model.service.impl;

import hotel.fabricas.DaoFactory;
import hotel.model.dao.ClienteDao;
import hotel.model.dao.FidelidadeDao;
import hotel.model.dao.jpa.EM;
import hotel.model.dominio.Cliente;
import hotel.model.dominio.Fidelidade;
import hotel.model.service.FidelidadeService;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class FidelidadeServiceImpl implements FidelidadeService {

	private FidelidadeDao fidelidadeDao;
	private ClienteDao clienteDao;
	
	public FidelidadeServiceImpl() {
		fidelidadeDao = DaoFactory.criarFidelidadeDao();
		clienteDao = DaoFactory.criarClienteDao();
	}
	
	public List<Fidelidade> buscarTodos() throws Exception {
		return fidelidadeDao.buscarTodos();
	}
	
	@Override
	public Fidelidade inserir(BigDecimal pontos, String observacao, Integer codCliente) throws Exception {

		try {
			EM.get().getTransaction().begin();
			Cliente cli = clienteDao.buscar(codCliente);
			
			Fidelidade fidelidade = new Fidelidade(null,pontos,new Date(), observacao, cli);
			fidelidadeDao.inserirAtualizar(fidelidade);
			EM.get().getTransaction().commit();
			return fidelidade;
		}
		catch (Exception e) {
			if (EM.get().getTransaction().isActive())
				EM.get().getTransaction().rollback();
			throw new Exception("Erro ao inserir fidelidade! " + e.getMessage());
		}
	
	}

	@Override
	public Fidelidade buscar(Integer codFidelidade) throws Exception {
		return fidelidadeDao.buscar(codFidelidade);
	}

}
