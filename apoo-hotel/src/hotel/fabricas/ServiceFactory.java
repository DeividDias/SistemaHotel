package hotel.fabricas;

import hotel.model.service.ClienteService;
import hotel.model.service.FidelidadeService;
import hotel.model.service.QuartoService;
import hotel.model.service.ReservaService;
import hotel.model.service.impl.ClienteServiceImpl;
import hotel.model.service.impl.FidelidadeServiceImpl;
import hotel.model.service.impl.QuartoServiceImpl;
import hotel.model.service.impl.ReservaServiceImpl;


public class ServiceFactory {
	
	public static QuartoService criarQuartoService() {
		return new QuartoServiceImpl();
	}
	
	public static ReservaService criarReservaService() {
		return new ReservaServiceImpl();
	}
	
	public static ClienteService criarClienteService() {
		return new ClienteServiceImpl();
	}

	public static FidelidadeService criarFidelidadeService() {
		return new FidelidadeServiceImpl();
	}
	
}
