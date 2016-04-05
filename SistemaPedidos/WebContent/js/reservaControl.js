angular
	.module('reservaModule',[])
	.controller('reservaControl', function($scope){
		
		$('input[name="daterange"]').daterangepicker({
			locale: {
				format: 'DD/MM/YYYY'
			}			
		});
		
		$scope.disponibilidade = disponibilidade;
		$scope.calcularTotal = calcularTotal;
		$scope.salvarReserva = salvarReserva;
		$scope.displayQuartos = false;
		$scope.displayFimReserva = false;
		$scope.displaySucessoReserva = false;
		$scope.displayErroReserva = false;
		$scope.reservavalor=0;
		$scope.valortotal=0;
		
		$scope.model = {};
		
		$scope.selecionado=[];
		
		$scope.qntDiarias = 0;
		$scope.nomecliente = 'Cliente não encontrado.';
	
		// This property will be bound to checkbox in table header
		$scope.model.allItemsSelected = false;
		
		$scope.model.quartos = [
			{codigo:1, tipo:'Standart', diaria:200, quantidade:'5'},
			{codigo:2, tipo:'Luxo', diaria:300, quantidade:'4'},
			{codigo:3, tipo:'Luxo Vista Mar', diaria:400, quantidade:'2'}
		];
		
		$scope.model.clientes = [
			{codigo:1, cpf:'19988877766', nome:'Tom Cruise'},
			{codigo:2, cpf:'16688877766', nome:'George Clooney'}
		];
		
		function disponibilidade() {
			$scope.displayQuartos = true;
		}
		
		 // This executes when entity in table is checked
		$scope.selectEntity = function () {
			// If any entity is not checked, then uncheck the "allItemsSelected" checkbox
			for (var i = 0; i < $scope.model.quartos.length; i++) {
				if (!$scope.model.quartos[i].isChecked) {
					$scope.model.allItemsSelected = false;
					return;
				}
			}

			//If not the check the "allItemsSelected" checkbox
			$scope.model.allItemsSelected = true;
		};

		// This executes when checkbox in table header is checked
		$scope.selectAll = function () {
			// Loop through all the quartos and set their isChecked property
			for (var i = 0; i < $scope.model.quartos.length; i++) {
				$scope.model.quartos[i].isChecked = $scope.model.allItemsSelected;
			}
		};
		
		function calcularTotal() {
			$scope.valortotal = 0;
			for (var i = 0; i < $scope.model.quartos.length; i++) {
				if($scope.model.allItemsSelected) {
					$scope.valortotal += $scope.model.quartos[i].diaria;
				} else {
					if ($scope.model.quartos[i].isChecked) {
						$scope.valortotal += $scope.model.quartos[i].diaria;
					}
				}
			}
			
			$scope.qntDiarias = $('input[name="daterange"]').data('daterangepicker').endDate.diff($('input[name="daterange"]').data('daterangepicker').startDate, 'days');
			
			$scope.valortotal = $scope.valortotal * $scope.qntDiarias;
			$scope.reservavalor = $scope.valortotal/2;
			
			
			$scope.displayFimReserva = true;
		};
		
		function salvarReserva() {
			$scope.displayErroReserva = false;
			$scope.displaySucessoReserva = false;
			
			for (var i = 0; i < $scope.model.clientes.length; i++) {
				if($scope.cpfcliente === $scope.model.clientes[i].cpf) {
					$scope.nomecliente = $scope.model.clientes[i].nome;
					$scope.displaySucessoReserva = true;
					return;
				}
			}
			
			$scope.displayErroReserva = true;
		};
		
	});
