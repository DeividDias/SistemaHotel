package hotel.fabricas;

import hotel.model.dao.ClienteDao;
import hotel.model.dao.FidelidadeDao;
import hotel.model.dao.QuartoDao;
import hotel.model.dao.ReservaDao;
import hotel.model.dao.jpa.ClienteDaoJpa;
import hotel.model.dao.jpa.FidelidadeDaoJpa;
import hotel.model.dao.jpa.QuartoDaoJpa;
import hotel.model.dao.jpa.ReservaDaoJpa;


public class DaoFactory {

	public static QuartoDao criarQuartoDao() {
		return new QuartoDaoJpa();
	}
	
	public static ReservaDao criarReservaDao() {
		return new ReservaDaoJpa();
	}
	
	public static ClienteDao criarClienteDao() {
		return new ClienteDaoJpa();
	}

	public static FidelidadeDao criarFidelidadeDao() {
		return new FidelidadeDaoJpa();
	}
	
}
