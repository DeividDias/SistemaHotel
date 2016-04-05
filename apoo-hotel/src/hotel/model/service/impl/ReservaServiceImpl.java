package hotel.model.service.impl;

import java.util.Date;
import java.util.List;

import hotel.fabricas.DaoFactory;
import hotel.model.dao.ClienteDao;
import hotel.model.dao.QuartoDao;
import hotel.model.dao.ReservaDao;
import hotel.model.dao.jpa.EM;
import hotel.model.dominio.Cliente;
import hotel.model.dominio.Quarto;
import hotel.model.dominio.Reserva;
import hotel.model.service.ReservaService;

public class ReservaServiceImpl implements ReservaService {
	
	private ReservaDao reservaDao;
	private QuartoDao quartoDao;
	private ClienteDao clienteDao;
	
	public ReservaServiceImpl() {
		reservaDao = DaoFactory.criarReservaDao();
		quartoDao = DaoFactory.criarQuartoDao();
		clienteDao = DaoFactory.criarClienteDao();
	}
	
	public Reserva inserir(Date dataEntrada, Date dataSaida, Integer codQuarto, Integer codCliente) throws Exception {
		try {
			EM.get().getTransaction().begin();
			
			Quarto quarto = quartoDao.buscar(codQuarto);
			Cliente cliente = clienteDao.buscar(codCliente);
			
			Reserva reserva = new Reserva(dataEntrada, dataSaida, quarto, cliente);
			reservaDao.inserirAtualizar(reserva);
			
			quarto.setReserva(reserva);
			quartoDao.inserirAtualizar(quarto);
			
			EM.get().getTransaction().commit();
			return reserva;
		}
		catch (Exception e) {
			if (EM.get().getTransaction().isActive())
				EM.get().getTransaction().rollback();
			throw new Exception("Erro ao inserir reserva! " + e.getMessage());
		}
	}
	
	public List<Reserva> buscarTodas() {
		return reservaDao.buscarTodos();
	}

}
