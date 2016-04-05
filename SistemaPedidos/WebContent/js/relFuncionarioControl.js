angular
	.module('relFuncionarioModule',[])
	.controller('relFuncionarioControl', function($scope){

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

		$scope.funcionarios = [
			{codigo:1, data:'01/01/2015', nome: 'DILMA ROUSSEF', cpf:'534.454.834-51', funcao: 'Gerente'},
			{codigo:2, data:'14/01/2015', nome: 'JEAN CARLO ALGUSTO CORREIA', cpf:'655.5758122-51', funcao: 'Subgerente'},			
			{codigo:3, data:'20/01/2015', nome: 'BRUNO GONCALVES ALENCAR', cpf:'541.463.221-61', funcao: 'Aux. Administrativo'},
			{codigo:4, data:'01/02/2015', nome: 'MIGUEL DA ROCHA CORREIA LIMA', cpf:'621.124.141-61', funcao: 'Aux. Administrativo'},
			{codigo:5, data:'21/02/2015', nome: 'JOSE DE ALENCAR', cpf:'861.163.177-41', funcao: 'Aux. Administrativo'},
			{codigo:6, data:'04/03/2015', nome: 'MIGUEL DA ROCHA CORREIA LIMA', cpf:'621.811.521-12', funcao: 'Aux. Limpeza'},
			{codigo:7, data:'06/03/2015', nome: 'TIAGO BORGES OLIVEIRA', cpf:'943.431.131-33', funcao: 'Aux. Limpeza'},
			{codigo:8, data:'11/03/2015', nome: 'ANA MARIA CONCEICAO', cpf:'121.446.156-13', funcao: 'Aux. Limpeza'},
			{codigo:9, data:'30/03/2015', nome: 'BARACK RUSSAIN OBAMA', cpf:'631.231.145-41', funcao: 'Cozinheira'},
			{codigo:10, data:'30/03/2015', nome: 'PAUL NEWMAN OBRIAN', cpf:'461.141.146-61', funcao: 'Aux. Cozinha'},
			{codigo:11, data:'01/04/2015', nome: 'MARIA FERNANDA', cpf:'541.123.151-51', funcao: 'Aux. Cozinha'},
			{codigo:12, data:'07/04/2015', nome: 'MARCELO MACEDO DE MELO SILVA', cpf:'751.141.234-16', funcao: 'Motorista'},
			{codigo:13, data:'09/05/2015', nome: 'JOAO DA SILVA', cpf:'651.455.571-71', funcao: 'Motorista'},
			{codigo:14, data:'18/06/2015', nome: 'CARLOS EDUARDO CARVALHO DANTAS', cpf:'751.544.317-51', funcao: 'Camareira'},
			{codigo:15, data:'01/06/2015', nome: 'DILMA ROUSSEF', cpf:'651.441.729-71', funcao: 'Camareira'},		
			{codigo:16, data:'22/07/2015', nome: 'CLAUDIO MIGUEL DA SILVA', cpf:'761.641.168-61', funcao: 'Camareira'},
			{codigo:17, data:'10/08/2015', nome: 'MARIA FERNANDA SIQUEIRA', cpf:'651.122.122-14', funcao: 'Camareira'}
		];

		function seleciona(funcionario){
			$scope.funcionario = funcionario;
		}

		function limpar(){
			$scope.funcionario = '';
		}

		function salvar(){
			$scope.fornecedores.push($scope.fornecedor);
			$scope.fornecedor = '';
		}

	});