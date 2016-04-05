package hotel.model.service;

import hotel.model.dominio.Reserva;

import java.util.Date;
import java.util.List;

public interface ReservaService {
	
	Reserva inserir(Date dataEntrada, Date dataSaida, Integer codQuarto, Integer codCliente) throws Exception;
	
	List<Reserva> buscarTodas();

}
