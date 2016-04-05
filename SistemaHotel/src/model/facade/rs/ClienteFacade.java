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

import model.domain.Cliente;
import model.service.ClienteService;

@Path("/cliente")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ClienteFacade {

	@Inject
	private ClienteService clienteService;
	
	@GET
	@Path("{codigoCliente}/{nomeCliente}")
	public List<Cliente> getClientes(@PathParam("codigoCliente") Integer codigo, @PathParam("nomeCliente") String nome){
		Cliente cliente = new Cliente();
		cliente.setCodigo(codigo);
		cliente.setNome(nome);
		
		return clienteService.getCliente(cliente);
	}
	
	@POST
	public void salvarCliente(Cliente cliente){
		clienteService.salvar(cliente);
	}
	
	@PUT
	public void atualizarCliente(Cliente cliente){
		clienteService.atualizar(cliente);
	}
	
	@DELETE
	@Path("{codigoCliente}")
	public void excluirCliente(@PathParam("codigoCliente") Integer codigoCliente){
		clienteService.excluir(codigoCliente);
	}
}
