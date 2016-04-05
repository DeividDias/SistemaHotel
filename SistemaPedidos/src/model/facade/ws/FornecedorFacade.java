package model.facade.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import model.domain.Fornecedor;

@WebService(serviceName="ws/fornecedor")
public class FornecedorFacade {

	@WebMethod(operationName="getFornecedor")
	public Fornecedor getFornecedor(){
		return new Fornecedor(1, "Alpargatas", "teste@teste.com.br","92.671.473/0001-23");
	}
	
}
