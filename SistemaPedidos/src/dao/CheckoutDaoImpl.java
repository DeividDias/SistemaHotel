package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.domain.Checkout;

public class CheckoutDaoImpl implements CheckoutDao {

	@PersistenceContext(unitName="SistemaHotel")
	private EntityManager entityManage;
	 
	@Override
	public List<Checkout> getCheckout(Checkout checkout) {
		return entityManage.createQuery("from Checkout").getResultList();
	}

	@Override
	public void salvar(Checkout checkout) {
		entityManage.persist(checkout);
	}

	@Override
	public void atualizar(Checkout checkout) {
		salvar(entityManage.merge(checkout));
	}

	@Override
	public void excluir(Checkout checkout) {
		entityManage.remove(entityManage.getReference(Checkout.class, checkout.getQuarto()));
	}

	@Override
	public List<Checkout> getCheckout() {
		return entityManage.createQuery("from Checkout").getResultList();	}

}
