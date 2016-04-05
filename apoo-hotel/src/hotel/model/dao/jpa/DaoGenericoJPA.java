package hotel.model.dao.jpa;

import hotel.model.dao.DaoGenerico;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;


public abstract class DaoGenericoJPA<E extends Serializable, ID extends Serializable> implements DaoGenerico<E, ID> {

	protected abstract ID getChave(E e);
	
 	protected EntityManager em;
 	
	private final Class<E> oClass;

	@SuppressWarnings("unchecked")
	public DaoGenericoJPA() {
		em = EM.get();
		this.oClass = (Class<E>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}

	public void inserirAtualizar(E e) {
		if (getChave(e) != null)
			e = em.merge(e);
		em.persist(e);
	}

	public E buscar(ID id) {
		return (E) em.find(oClass, id);
	}

	public void atualizar(E e) {
		e = em.merge(e);
		em.persist(e);
	}

	public void excluir(E e) {
		e = em.merge(e);
		em.remove(e);
	}

	@SuppressWarnings("unchecked")
	public List<E> buscarTodos() {
		String jpql = "SELECT obj FROM " + oClass.getSimpleName() + " obj";
		Query query = em.createQuery(jpql);
		return query.getResultList();
	}
}
