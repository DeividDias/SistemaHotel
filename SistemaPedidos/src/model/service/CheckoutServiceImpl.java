package model.service;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import dao.CheckoutDao;
import model.domain.Checkout;

public class CheckoutServiceImpl implements CheckoutService {

	@Inject
	private CheckoutDao checkoutDao;
	
	@Override
	public List<Checkout> getCheckout(Checkout checkout) {
		return checkoutDao.getCheckout(checkout);
	}

	@Override
	@Transactional
	public void salvar(Checkout checkout) {
		checkoutDao.salvar(checkout);
	}

	@Override
	@Transactional
	public void atualizar(Checkout checkout) {
		checkoutDao.atualizar(checkout);
	}

	@Override
	@Transactional
	public void excluir(Integer codigoCheckout) {
		Checkout checkout = new Checkout();
		checkout.setQuarto(codigoCheckout);
		checkoutDao.excluir(checkout);
	}

	@Override
	public List<Checkout> getCheckout() {
		// TODO Auto-generated method stub
		return checkoutDao.getCheckout();
	}

}