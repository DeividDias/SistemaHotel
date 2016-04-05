package hotel.model.service.impl;

import hotel.fabricas.DaoFactory;
import hotel.model.dao.QuartoDao;
import hotel.model.dao.jpa.EM;
import hotel.model.dominio.Quarto;
import hotel.model.service.QuartoService;
import hotel.util.DataUtil;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuartoServiceImpl implements QuartoService {

	private QuartoDao quartoDao;
	
	public QuartoServiceImpl() {
		quartoDao = DaoFactory.criarQuartoDao();
	}
	
	public Quarto inserir(Integer numero, String tipo,
			Boolean disponibilidade, BigDecimal valor) throws Exception {
		try {
			EM.get().getTransaction().begin();

			Quarto quarto = new Quarto(numero, tipo, disponibilidade, valor);
			quartoDao.inserirAtualizar(quarto);
			
			EM.get().getTransaction().commit();
			return quarto;
		}
		catch (Exception e) {
			if (EM.get().getTransaction().isActive())
				EM.get().getTransaction().rollback();
			throw new Exception("Erro ao inserir quarto! " + e.getMessage());
		}
	}
	
	public List<Quarto> buscarQuartosDisponiveis(Date dataEntrada, Date dataSaida) {
		List<Quarto> quartosDisponiveis = new ArrayList<Quarto>();
		
		for(Quarto quarto : quartoDao.buscarTodos()) {

			//verifica se não está ocupado
			if(quarto.getDisponibilidade()) { 
			
				//verifica se tem reserva
				if(quarto.getReserva() != null) {
					
					//verifica a data da reserva
					if (dataEntrada.compareTo(quarto.getReserva().getDataSaida()) >= 1) {
						quartosDisponiveis.add(quarto);
					}
					
				} else {
					quartosDisponiveis.add(quarto);
				}
			}
		}
		
		return quartosDisponiveis;
	}
	
	public BigDecimal valorHospedagem(List<Integer> codigosQuartos, Date dataEntrada, Date dataSaida) {
		int qntDias = DataUtil.diasEntreDatas(dataEntrada, dataSaida);
		
		BigDecimal valorTotal = new BigDecimal("0.00");
		
		for(Integer id : codigosQuartos) {
			Quarto quarto = quartoDao.buscar(id);
			BigDecimal valorQuarto = quarto.getValor().multiply(new BigDecimal(qntDias));
			valorTotal = valorTotal.add(valorQuarto);
		}
		
		return valorTotal;
	}
	
	public Quarto buscarQuartoPeloNumero(Integer nroQuarto) {
		for(Quarto quarto : quartoDao.buscarTodos()) {
			if(quarto.getNumero() == nroQuarto) {
				return quarto;
			}
		}
		return null;
	}

	@Override
	public List<Quarto> buscarTodos() {
		return quartoDao.buscarTodos();
	}

	@Override
	public Quarto buscar(Integer val) {
		return quartoDao.buscar(val);
	}
}
