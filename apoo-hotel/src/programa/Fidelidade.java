package programa;

import hotel.fabricas.ServiceFactory;
import hotel.model.dominio.Cliente;
import hotel.model.dominio.Quarto;
import hotel.model.service.ClienteService;
import hotel.model.service.FidelidadeService;
import hotel.model.service.QuartoService;
import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class Fidelidade {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		QuartoService quartoService = ServiceFactory.criarQuartoService();
		ClienteService clienteService = ServiceFactory.criarClienteService();
		FidelidadeService fidelidadeService = ServiceFactory.criarFidelidadeService();

		menu();
		int opcao = Integer.parseInt(sc.nextLine());
		try {

			while (opcao != 0) {
				switch (opcao) {
					case 1:
						System.out.println("Inserir novo Cliente!");
						System.out.println("\n----------------------------");
						System.out.println("Digite o codigo do cliente.");
						Integer codCliente = Integer.parseInt(sc.nextLine());
						System.out.println("Digite o nome do cliente.");
						String nome = sc.nextLine();
						System.out.println("Digite o cpf do cliente");
						String cpf = sc.nextLine();
						System.out.println("Digite o endereço do cliente");
						String endereco = sc.nextLine();
						System.out.println("Digite o telefone do cliente");
						String telefone = sc.nextLine();
						System.out.println("Digite o email do cliente");
						String email = sc.nextLine();

						Cliente cli = clienteService.inserir(codCliente, nome, cpf, endereco, telefone, email);

						System.out.println(cli);
						break;

					case 2:
						List<Cliente> clientes = clienteService.buscarTodos();
						System.out.println("Todos Clientes:");
						for (Cliente cliente : clientes) {
							System.out.println(cliente);
						}

						break;

					case 3:
						System.out.println("Digite o código do cliente:");
						Integer codigo = Integer.parseInt(sc.nextLine());
						Cliente cliente = clienteService.buscar(codigo);
						System.out.println(cliente);
						break;

					case 4:
						System.out.println("Registrar fidelidade");
						System.out.println("-----------------------------");

						System.out.println("Informe o código do cliente!");
						Integer codClienteFidel = Integer.parseInt(sc.nextLine());

						System.out.println("Informe os pontos obtidos pelo cliente");
						BigDecimal pontos = new BigDecimal(sc.nextLine());

						System.out.println("Informe a observação!");
						String observacao = sc.nextLine();

						hotel.model.dominio.Fidelidade fidelidade = fidelidadeService.inserir(pontos, observacao, codClienteFidel);

						System.out.println(fidelidade);
						System.out.println("Pontos cadastrados com sucesso!");
						break;

					case 5:
						List<hotel.model.dominio.Fidelidade> fidelidades = fidelidadeService.buscarTodos();
						System.out.println("Todas Fidelidades:");
						for (hotel.model.dominio.Fidelidade fidel : fidelidades) {
							System.out.println(fidel);
						}

						break;

					case 6:
						System.out.println("Digite o código da fidelidade:");
						Integer codFidelidade = Integer.parseInt(sc.nextLine());
						hotel.model.dominio.Fidelidade fideli = fidelidadeService.buscar(codFidelidade);
						System.out.println(fideli);
						break;
					case 7:
						List<Quarto> quartos = quartoService.buscarTodos();
						System.out.println("Todos Quartos:");
						for (Quarto quar : quartos) {
							System.out.println(quar);
						}
						break;
					case 8:
						System.out.println("Digite o código do quarto");
						Integer val = Integer.parseInt(sc.nextLine());
						Quarto quarto = quartoService.buscar(val);
						System.out.println(quarto);
						break;	
						
					case 9:
						System.out.println("Digite o código do cliente: ");
						int cod = Integer.parseInt(sc.nextLine());
						BigDecimal total = clienteService.totalPontos(cod);
						System.out.println("O total de pontos do cliente é : " + total);
						break;
					default:
						System.out.println("Opção não encontrada!");
						break;
				}
				System.out.println("\n\n");
				menu();
				opcao = Integer.parseInt(sc.nextLine());
			}

		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
		sc.close();
	}

	private static void menu(){
		
		System.out.println("[1] Inserir cliente");
		System.out.println("[2] Buscar todos clientes");
		System.out.println("[3] Buscar clientes");
		System.out.println("[4] Registrar fidelidade");
		System.out.println("[5] Buscar todas fidelidades");
		System.out.println("[6] Buscar fidelidade");
		System.out.println("[7] Buscar todos quartos");
		System.out.println("[8] Buscar quartos");
		System.out.println("[9] Total de pontos do cliente");
		System.out.println("[0] Sair");
		
		System.out.println("\nInforme a opção desejada:");
	}
	
}
