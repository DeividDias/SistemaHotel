package hotel.model.dao.jpa;

import hotel.model.dao.ClienteDao;
import hotel.model.dominio.Cliente;


public class ClienteDaoJpa extends DaoGenericoJPA<Cliente, Integer> implements ClienteDao {

	@Override
	protected Integer getChave(Cliente e) {
		return e.getCodCliente();
	}
}
