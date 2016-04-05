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
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;

import model.domain.Fornecedor;
import model.service.FornecedorService;

@Path("/fornecedor")
@Produces({
	MediaType.APPLICATION_JSON,
	MediaType.APPLICATION_XML})
@Consumes({MediaType.APPLICATION_JSON,
		MediaType.TEXT_PLAIN})
public class FornecedorFacade {
	
	@Inject
	private FornecedorService fornecedorService;
	
	@GET
	public List<Fornecedor> getFornecedor(){
		return fornecedorService.getFornecedores();
	}
	
	@GET
	@Path("/{nome}")
	public Fornecedor getFornecedor(@PathParam("nome") String nome){
		if(nome.equalsIgnoreCase("Alpargatas")){
			return new Fornecedor(1, "Alpargatas", "teste@teste.com.br","92.671.473/0001-23");
		}
		
		throw new WebApplicationException("Fornecedor não encontrado", 404);
	}
	
	
	@POST
	public void setFornecedor(Fornecedor fornecedor){
		fornecedorService.salvar(fornecedor);
	}

	@PUT
	public void updateFornecedor(Fornecedor fornecedor){
		fornecedorService.atualizar(fornecedor);
	}

	@DELETE
	public void deleteFornecedor(Fornecedor fornecedor){
		fornecedorService.excluir(fornecedor.getCodigo());
	}

	
	
}
