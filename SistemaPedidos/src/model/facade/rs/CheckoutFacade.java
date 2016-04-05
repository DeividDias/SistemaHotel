package model.facade.rs;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.domain.Checkout;
import model.domain.Cliente;
import model.service.CheckoutService;

@Path("/checkout")
@Produces(MediaType.APPLICATION_JSON)
@Consumes({MediaType.APPLICATION_JSON,
	MediaType.TEXT_PLAIN})
public class CheckoutFacade {

	@Inject
	private CheckoutService checkoutService;
	
	@GET
	public List<Checkout> getCheckout(){
		return checkoutService.getCheckout();
	}
	
	@GET
	@Path("{codigoCheckout}")
	public List<Cliente> getCheckout(@PathParam("codigoCheckout") Integer codigo){
		//return checkoutService.getCliente(checkout);
		return null;
	}
	
	@POST
	public void salvar(Checkout checkout){
		checkoutService.salvar(checkout);
	}
	
	@PUT
	public void atualizar(Checkout checkout){
		checkoutService.atualizar(checkout);
	}
	
	@DELETE
	@Path("{quarto}")
	public void excluir(@PathParam("quarto") Integer codigoCheckout){
		checkoutService.excluir(codigoCheckout);
	}
	
}
