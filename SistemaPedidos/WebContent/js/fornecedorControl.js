angular
	.module('fornecedorModule',[])
	.controller('fornecedorControl', function($scope){

		$scope.seleciona = seleciona;
		$scope.limpar = limpar;
		$scope.salvar = salvar;

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