package hotel.model.dao.jpa;

import hotel.model.dao.QuartoDao;
import hotel.model.dominio.Quarto;


public class QuartoDaoJpa extends DaoGenericoJPA<Quarto, Integer> implements QuartoDao {

	@Override
	protected Integer getChave(Quarto e) {
		return e.getCodQuarto();
	}
}
