angular
	.module('hospedagemModule', [])
	.controller('hospedagemControl', function ($scope) {
	    $('input[name="daterange"]').daterangepicker();

	    $scope.disponibilidade = disponibilidade;
	    $scope.seleciona = seleciona;
	    $scope.displayQuartos = false;

	    $scope.model = {};

	    // This property will be bound to checkbox in table header
	    $scope.model.allItemsSelected = false;

	    $scope.model.quartos = [
			{ codigo: 1, tipo: 'Standart', diaria: '150,00', quantidade: '2' },
			{ codigo: 2, tipo: 'Luxo', diaria: '200,00', quantidade: '3' }
	    ];

	    $scope.selecionado = [];

	    function disponibilidade() {
	        $scope.displayQuartos = true;
	    }

	    function seleciona(quarto) {
	        $scope.quarto = quarto;
	        $scope.selecionado.push(quarto);
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

	});
