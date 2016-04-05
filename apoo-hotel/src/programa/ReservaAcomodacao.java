package programa;

import hotel.fabricas.ServiceFactory;
import hotel.model.dominio.Quarto;
import hotel.model.dominio.Reserva;
import hotel.model.service.QuartoService;
import hotel.model.service.ReservaService;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ReservaAcomodacao {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Scanner sc = new Scanner(System.in);
		
		QuartoService quartoService = ServiceFactory.criarQuartoService();
		ReservaService reservaService = ServiceFactory.criarReservaService();
		//ClienteService clienteService = ServiceFactory.criarClienteService();
		
		//inserir 3 quartos:
		// 1 sem reserva
		// 1 com reserva (10/05/2015 - 15/05/2015)
		// 1 com reserva (20/06/2015 - 25/06/2015)
		
		//nova reserva: 23/06/2015 - 26/06/2015
		// 2 quartos disponiveis: 401 e 402
		
		//criar 1 cliente: nro 1
		
		
		try {
			
//			clienteService.inserir(1, "João Pereira", "08989945611", "Rua A, 21, Centro, Uberlandia, MG", "(34) 9900-6776", "joao@mail.com.br");
//			
//			quartoService.inserir(401, "Duplo", false, new BigDecimal("250,00"));
//			quartoService.inserir(402, "Simples", true, new BigDecimal("150,00"));
//			quartoService.inserir(403, "Duplo", true, new BigDecimal("250,00"));
//			
//			Quarto quarto402 = quartoService.buscarQuartoPeloNumero(402);
//			Quarto quarto403 = quartoService.buscarQuartoPeloNumero(403);
//			
//			
//			reservaService.inserir(sdf.parse("10/05/2015"), sdf.parse("15/05/2015"), quarto402.getCodQuarto(), 1);
//			reservaService.inserir(sdf.parse("20/06/2015"), sdf.parse("25/06/2015"), quarto403.getCodQuarto(), 1);
			
			
			
			
			System.out.println("\nDigite abaixo os dados solicitados da reserva! ");
			
			System.out.println("\nDigite a data de entrada (dd/MM/yyyy): ");
			Date dataEntrada = sdf.parse(sc.nextLine());
			
			System.out.println("\nDigite a data de saida (dd/MM/yyyy): ");
			Date dataSaida = sdf.parse(sc.nextLine());
			
			System.out.println("Digite a quantidade de quartos: ");
			int qntQuartos = Integer.parseInt(sc.nextLine());
			
			System.out.println("Digite a quantidade de pessoas (hospedes): ");
			int qntHospedes = Integer.parseInt(sc.nextLine());
			
			
			List<Quarto> quartos = quartoService.buscarQuartosDisponiveis(dataEntrada, dataSaida);
			if(!quartos.isEmpty()) {
				System.out.println("\nQuartos disponiveis");
			
				for(Quarto quarto : quartos) {
					System.out.println(quarto);
				}
			
				System.out.println("\nInforme o(s) código(s) do(s) quarto(s), quantidade solicitada: " + qntQuartos);
				List<Integer> codigosQuartos = new ArrayList<Integer>();
				for(int i=0; i<qntQuartos; i++) {
					System.out.println("Digite o código do quarto que deseja reservar: ");
					codigosQuartos.add( Integer.parseInt(sc.nextLine()) );
				}
				
				
				BigDecimal valorHospedagem = quartoService.valorHospedagem(codigosQuartos, dataEntrada, dataSaida);
				System.out.println("\nValor total da hospedagem: " + valorHospedagem);
				System.out.println("Valor da reserva: " + valorHospedagem.divide(new BigDecimal(2)));
				
				
				for(Integer cod : codigosQuartos) {
					reservaService.inserir(dataEntrada, dataSaida, cod , 1);
					
				}
				
				System.out.println("\nReserva realizada com sucesso!");
				
				for(Reserva reserva : reservaService.buscarTodas()) {
					System.out.println(reserva);
				}
			
			
			} else {
				System.out.println("\nNão há quartos disponiveis para a data informada!");
			}
			
		} catch (Exception e) {
			System.out.println("Erro no sistema: " + e.getMessage());
		}

		sc.close();
		
	}

}
