angular
	.module('relPagamentoModule',[])
	.controller('relPagamentoControl', function($scope){

		$(document).ready(function () {

		(function ($) {

			$('#filter').keyup(function () {

				var rex = new RegExp($(this).val(), 'i');
				$('.searchable tr').hide();
				$('.searchable tr').filter(function () {
					return rex.test($(this).text());
				}).show();

			})
		}(jQuery));

	});

		$scope.seleciona = seleciona;
		$scope.limpar = limpar;
		$scope.salvar = salvar;

		$scope.quartos = [
			{codigo:101, nome:'Suite Standard 01', descricao:'Quarto luxo para caal', imagem: 'img/suiteStandard.jpg', status: 'Ocupado', hospede: 'CARLOS EDUARDO CARVALHO DANTAS', cpf:'534.454.834-51', dataCheckin:'30/07/2015', dataCheckout:'02/08/2015', valorHospedagem:879.45, valorDespesas:98.3, observacao: ""},
			{codigo:102, nome:'Suite Standard 02', descricao:'Quarto luxo para caal', imagem: 'img/suiteStandard.jpg', status: 'Livre', hospede: '', cpf:'', dataCheckin:'', dataCheckout:'', valorHospedagem:0, valorDespesas:0, observacao: "As caracteristicas incluem uma tranquila area de estar, colchoes de penas de luxo, roupa de cama egipcia de qualidade superior, controle individual do clima, Televisoes Interativas IP e sistema a prova de som de ultima geracao. Uma banheiro prodigo inclui uma ducha de alta vazao tipo spa e comodidades de banheiro premium."},
			{codigo:103, nome:'Suite Standard 03', descricao:'Quarto luxo para caal', imagem: 'img/suiteStandard.jpg', status: 'Ocupado', hospede: 'BRUNO GONCALVES ALENCAR', cpf:'541.463.221-61', dataCheckin:'12/08/2015', dataCheckout:'15/08/2015', valorHospedagem:554.35, valorDespesas:323.45, observacao: ""},
			{codigo:104, nome:'Suite Standard 04', descricao:'Quarto luxo para caal', imagem: 'img/suiteStandard.jpg', status: 'Livre', hospede: '', cpf:'', dataCheckin:'', dataCheckout:'', valorHospedagem:0, valorDespesas:0, observacao: "As caracteristicas incluem uma tranquila area de estar, colchoes de penas de luxo, roupa de cama egipcia de qualidade superior, controle individual do clima, Televisoes Interativas IP e sistema a prova de som de ultima geracao. Uma banheiro prodigo inclui uma ducha de alta vazao tipo spa e comodidades de banheiro premium."},
			{codigo:201, nome:'Suite High Lux 01', descricao:'Quarto luxo para caal', imagem: 'img/suiteHighLux.jpg', status: 'Ocupado', hospede: 'DILMA ROUSSEF', cpf:'621.124.141-61', dataCheckin:'12/01/2015', dataCheckout:'30/10/2015', valorHospedagem:12345.45, valorDespesas:35.50, observacao: ""},
			{codigo:202, nome:'Suite High Lux 02', descricao:'Quarto luxo para caal', imagem: 'img/suiteHighLux.jpg', status: 'Ocupado', hospede: 'MARIA FERNANDA SIQUEIRA', cpf:'655.5758122-51', dataCheckin:'01/08/2015', dataCheckout:'20/08/2015', valorHospedagem:5354.45, valorDespesas:88.34, observacao: ""},
			{codigo:203, nome:'Suite High Lux 03', descricao:'Quarto luxo para caal', imagem: 'img/suiteHighLux.jpg', status: 'Livre', hospede: '', cpf:'', dataCheckin:'', dataCheckout:'', valorHospedagem:0, valorDespesas:0, observacao: "As caracteristicas incluem uma tranquila area de estar, colchoes de penas de luxo, roupa de cama egipcia de qualidade superior, controle individual do clima, Televisoes Interativas IP e sistema a prova de som de ultima geracao. Uma banheiro prodigo inclui uma ducha de alta vazao tipo spa e comodidades de banheiro premium."},
			{codigo:204, nome:'Suite High Lux 04', descricao:'Quarto luxo para caal', imagem: 'img/suiteHighLux.jpg', status: 'Livre', hospede: '', cpf:'', dataCheckin:'', dataCheckout:'', valorHospedagem:0, valorDespesas:0, observacao: "As caracteristicas incluem uma tranquila area de estar, colchoes de penas de luxo, roupa de cama egipcia de qualidade superior, controle individual do clima, Televisoes Interativas IP e sistema a prova de som de ultima geracao. Uma banheiro prodigo inclui uma ducha de alta vazao tipo spa e comodidades de banheiro premium."},
			{codigo:301, nome:'Duplex Premmium 01', descricao:'Quarto luxo para caal', imagem: 'img/suitePremmium.jpg', status: 'Ocupado', hospede: 'Ocupado', hospede: 'MIGUEL DA ROCHA CORREIA LIMA', cpf:'621.811.521-12', dataCheckin:'03/07/2015', dataCheckout:'13/08/2015', valorHospedagem:734.43, valorDespesas:234.34, observacao: ""},
			{codigo:302, nome:'Duplex Premmium 02', descricao:'Quarto luxo para caal', imagem: 'img/suitePremmium.jpg', status: 'Livre', hospede: '', cpf:'', dataCheckin:'', dataCheckout:'', valorHospedagem:0, valorDespesas:0, observacao: "As caracteristicas incluem uma tranquila area de estar, colchoes de penas de luxo, roupa de cama egipcia de qualidade superior, controle individual do clima, Televisoes Interativas IP e sistema a prova de som de ultima geracao. Uma banheiro prodigo inclui uma ducha de alta vazao tipo spa e comodidades de banheiro premium."},
			{codigo:303, nome:'Duplex Premmium 03', descricao:'Quarto luxo para caal', imagem: 'img/suitePremmium.jpg', status: 'Livre', hospede: '', cpf:'', dataCheckin:'', dataCheckout:'', valorHospedagem:0, valorDespesas:0, observacao: "As caracteristicas incluem uma tranquila area de estar, colchoes de penas de luxo, roupa de cama egipcia de qualidade superior, controle individual do clima, Televisoes Interativas IP e sistema a prova de som de ultima geracao. Uma banheiro prodigo inclui uma ducha de alta vazao tipo spa e comodidades de banheiro premium."},
			{codigo:304, nome:'Duplex Premmium 01', descricao:'Quarto luxo para caal', imagem: 'img/suitePremmium.jpg', status: 'Livre', hospede: '', cpf:'', dataCheckin:'', dataCheckout:'', valorHospedagem:0, valorDespesas:0, observacao: "As caracteristicas incluem uma tranquila area de estar, colchoes de penas de luxo, roupa de cama egipcia de qualidade superior, controle individual do clima, Televisoes Interativas IP e sistema a prova de som de ultima geracao. Uma banheiro prodigo inclui uma ducha de alta vazao tipo spa e comodidades de banheiro premium."},
		];

		$scope.pagamentos = [
			{codigo:1, data:'01/01/2015', cliente: 'CARLOS EDUARDO CARVALHO DANTAS', cpf:'534.454.834-51', valor: 2345.43, notafiscal: 'http://www.nfe.fazenda.gov.br', quarto: 'Suite Standard 1', estadia: 7},
			{codigo:2, data:'14/01/2015', cliente: 'MARIA FERNANDA SIQUEIRA', cpf:'655.5758122-51', valor: 2344.53, notafiscal: 'http://www.nfe.fazenda.gov.br', quarto: 'Suite High Lux 2', estadia: 7},
			{codigo:3, data:'20/01/2015', cliente: 'BRUNO GONCALVES ALENCAR', cpf:'541.463.221-61', valor: 255.56, notafiscal: 'http://www.nfe.fazenda.gov.br', quarto: 'Suite Standard 4', estadia: 7},
			{codigo:4, data:'01/02/2015', cliente: 'DILMA ROUSSEF', cpf:'621.124.141-61', valor: 3434.53, notafiscal: 'http://www.nfe.fazenda.gov.br', quarto: 'Suite Standard 3', estadia: 7},
			{codigo:5, data:'21/02/2015', cliente: 'BARACK RUSSAIN OBAMA', cpf:'861.163.177-41', valor: 52345.43, notafiscal: 'http://www.nfe.fazenda.gov.br', quarto: 'Suite High Lux 2', estadia: 7},
			{codigo:6, data:'04/03/2015', cliente: 'MIGUEL DA ROCHA CORREIA LIMA', cpf:'621.811.521-12', valor: 235.43, notafiscal: 'http://www.nfe.fazenda.gov.br', quarto: 'Suite Premmium 4', estadia: 7},
			{codigo:7, data:'06/03/2015', cliente: 'TIAGO BORGES OLIVEIRA', cpf:'943.431.131-33', valor: 989.34, notafiscal: 'http://www.nfe.fazenda.gov.br', quarto: 'Suite Standard 4', estadia: 7},
			{codigo:8, data:'11/03/2015', cliente: 'ANA MARIA CONCEICAO', cpf:'121.446.156-13', valor: 987.24, notafiscal: 'http://www.nfe.fazenda.gov.br', quarto: 'Suite Standard 3', estadia: 7},
			{codigo:9, data:'30/03/2015', cliente: 'JOSE DE ALENCAR', cpf:'631.231.145-41', valor: 24532.54, notafiscal: 'http://www.nfe.fazenda.gov.br', quarto: 'Suite Standard 2', estadia: 7},
			{codigo:10, data:'30/03/2015', cliente: 'PAUL NEWMAN OBRIAN', cpf:'461.141.146-61', valor: 2245.63, notafiscal: 'http://www.nfe.fazenda.gov.br', quarto: 'Suite High Lux 3', estadia: 7},
			{codigo:11, data:'01/04/2015', cliente: 'MARIA FERNANDA', cpf:'541.123.151-51', valor: 798.38, notafiscal: 'http://www.nfe.fazenda.gov.br', quarto: 'Suite Premmium 4', estadia: 7},
			{codigo:12, data:'07/04/2015', cliente: 'MARCELO MACEDO DE MELO SILVA', cpf:'751.141.234-16', valor: 9868.68, notafiscal: 'http://www.nfe.fazenda.gov.br', quarto: 'Suite Standard 2', estadia: 7},
			{codigo:13, data:'09/05/2015', cliente: 'JEAN CARLO ALGUSTO CORREIA', cpf:'651.455.571-71', valor: 95850.10, notafiscal: 'http://www.nfe.fazenda.gov.br', quarto: 'Suite High Lux 3', estadia: 7},
			{codigo:14, data:'18/06/2015', cliente: 'GABRIELA ROCHA E SILVA', cpf:'751.544.317-51', valor: 90898.34, notafiscal: 'http://www.nfe.fazenda.gov.br', quarto: 'Suite High Lux 1', estadia: 7},
			{codigo:15, data:'01/06/2015', cliente: 'DILMA ROUSSEF', cpf:'651.441.729-71', valor: 980.45, notafiscal: 'http://www.nfe.fazenda.gov.br', quarto: 'Suite Standard 3', estadia: 7},
			{codigo:16, data:'22/07/2015', cliente: 'MIGUEL DA ROCHA CORREIA LIMA', cpf:'761.641.168-61', valor: 689.87, notafiscal: 'http://www.nfe.fazenda.gov.br', quarto: 'Suite Premmium 2', estadia: 7},
			{codigo:17, data:'10/08/2015', cliente: 'CARLOS EDUARDO CARVALHO DANTAS', cpf:'651.122.122-14', valor: 9687.23, notafiscal: 'http://www.nfe.fazenda.gov.br', quarto: 'Suite High Lux 1', estadia: 7},
			{codigo:18, data:'15/08/2015', cliente: 'JOÃO NORBERTO JUNIOR', cpf:'981.541.151-71', valor: 1345.25, notafiscal: 'http://www.nfe.fazenda.gov.br', quarto: 'Suite Standard 2', estadia: 7},
			{codigo:19, data:'20/08/2015', cliente: 'BARACK ROUSSAIN OBAMA', cpf:'861.551.611-61', valor: 897.34, notafiscal: 'http://www.nfe.fazenda.gov.br', quarto: 'Suite Premmium 4', estadia: 7},
			{codigo:20, data:'20/08/2015', cliente: 'MARCELO MACEDO DE MELO SILVA', cpf:'561.178.161-61', valor: 2445.234, notafiscal: 'http://www.nfe.fazenda.gov.br', quarto: 'Suite High Lux 2', estadia: 7},
			
		];
		
		$scope.fornecedores = [
			{codigo:1, nome:'zezinho', cnpj:'26315067000921'},
			{codigo:2, nome:'buteco', cnpj:'26315067000922'},
			{codigo:3, nome:'xinel', cnpj:'26315067000923'},
			{codigo:4, nome:'tiao', cnpj:'26315067000924'},
			{codigo:5, nome:'joao', cnpj:'26315067000925'}
		];

		function seleciona(fornecedor){
			$scope.fornecedor = fornecedor;
		}

		function limpar(){
			$scope.fornecedor = '';
		}

		function salvar(){
			$scope.fornecedores.push($scope.fornecedor);
			$scope.fornecedor = '';
		}

	});