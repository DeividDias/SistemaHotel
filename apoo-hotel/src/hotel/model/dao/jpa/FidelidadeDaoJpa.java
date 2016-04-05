package hotel.model.dao.jpa;

import hotel.model.dao.FidelidadeDao;
import hotel.model.dominio.Fidelidade;

public class FidelidadeDaoJpa extends DaoGenericoJPA<Fidelidade, Integer> implements FidelidadeDao {

	@Override
	protected Integer getChave(Fidelidade e) {
		return e.getCodFidelidade();
	}

}
