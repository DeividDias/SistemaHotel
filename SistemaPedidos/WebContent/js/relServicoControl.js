angular
	.module('relServicoModule',[])
	.controller('relServicoControl', function($scope){

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

		$scope.servicos = [
			{codigo:1, descricao:'Lavanderia', valor:987.89},
			{codigo:2, descricao:'Jantar Executivo', valor:734.83},
			{codigo:3, descricao:'Choffer', valor:244.23},
			{codigo:4, descricao:'Internet', valor:873.34},
			{codigo:5, descricao:'Academia', valor:323.44},
			{codigo:6, descricao:'Sala de Reunioes', valor:123.43},
		];

		function seleciona(Servico){
			$scope.Servico = Servico;
		}

		function limpar(){
			$scope.Servico = '';
		}

		function salvar(){
			$scope.fornecedores.push($scope.fornecedor);
			$scope.fornecedor = '';
		}

	});