package hotel.model.service;

import hotel.model.dominio.Quarto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface QuartoService {
	
	Quarto inserir(Integer numero, String tipo,
			Boolean disponibilidade, BigDecimal valor) throws Exception;
	
	List<Quarto> buscarQuartosDisponiveis(Date dataEntrada, Date dataSaida);

	BigDecimal valorHospedagem(List<Integer> codigosQuartos, Date dataEntrada, Date dataSaida);
	
	Quarto buscarQuartoPeloNumero(Integer nroQuarto);

	List<Quarto> buscarTodos();

	Quarto buscar(Integer val);
}
