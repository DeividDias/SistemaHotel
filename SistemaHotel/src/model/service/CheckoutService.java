package model.service;

import java.util.List;

import model.domain.Checkout;

public interface CheckoutService {

	List<Checkout> getCheckout(Checkout checkout);

	void salvar(Checkout checkout);

	void atualizar(Checkout checkout);

	void excluir(Integer codigoCheckout);

}
