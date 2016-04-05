angular
	.module('clienteModule', [])
	.controller('clienteControl', function ($scope) {

		$scope.seleciona = seleciona;
		$scope.limpar = limpar;
		$scope.salvar = salvar;

		$scope.clientes = [
			{ codigo: 1, nome: 'Joao', cpf: '000.111.222-33', email: 'joao@teste.com.br', endereco: 'Rua do Joao', telefone: '(034) 8888-9999', cidade: 'Uberlandia' },
	        { codigo: 2, nome: 'Maria', cpf: '001.121.232-97', email: 'maria@teste.com.br', endereco: 'Rua da Maria', telefone: '(034) 8888-9999', cidade: 'Uberaba' },
		];

		function seleciona(cliente) {
		    $scope.cliente = cliente;
		}

		function limpar(){
		    $scope.cliente = '';
		}

		function salvar(){
		    $scope.clientes.push($scope.cliente);
			$scope.fornecedor = '';
		}

	});