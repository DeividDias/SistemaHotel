package hotel.model.service;


import hotel.model.dominio.Fidelidade;
import java.math.BigDecimal;
import java.util.List;

public interface FidelidadeService {

	public List<Fidelidade> buscarTodos() throws Exception;
	public Fidelidade buscar(Integer codFidelidade) throws Exception;
	public Fidelidade inserir(BigDecimal pontos, String observacao, Integer codCliente) throws Exception;
}
