package hotel.model.dao.jpa;

import hotel.model.dao.ReservaDao;
import hotel.model.dominio.Reserva;

public class ReservaDaoJpa extends DaoGenericoJPA<Reserva, Integer> implements ReservaDao {

	@Override
	protected Integer getChave(Reserva e) {
		return e.getCodReserva();
	}
}
