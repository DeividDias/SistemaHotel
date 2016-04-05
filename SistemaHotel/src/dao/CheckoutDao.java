package dao;

import java.util.List;

import model.domain.Checkout;

public interface CheckoutDao {

	List<Checkout> getCheckout(Checkout checkout);

	void salvar(Checkout checkout);

	void atualizar(Checkout checkout);

	void excluir(Checkout checkout);

}
