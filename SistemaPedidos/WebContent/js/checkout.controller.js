angular
    .module('checkout')
    .controller('CheckOutController',['$scope','$modal','$http', function($scope, $modal, $http){
        /*$scope.hospedes = [
            {quarto: '1', nome: 'Joaquin da Silva', dataent: '01/05/2015', datasai: '05/05/2015', valor: '532.50'},
            {quarto: '15', nome: 'Maria Sebastiana', dataent: '15/07/2015', datasai: '18/07/2015', valor: '200.00'},
            {quarto: '7', nome: 'John', dataent: '21/03/2015', datasai: '28/03/2015', valor: '2356.00'},
            {quarto: '3', nome: 'Chiquinha', dataent: '01/05/2015', datasai: '05/05/2015', valor: '532.50'},
            {quarto: '5', nome: 'Jo�o Manuel', dataent: '01/05/2015', datasai: '05/05/2015', valor: '532.50'},
        ];*/

    	getRegistros();
    	
    	function getRegistros(){
    		$http.get("http://localhost:8080/SistemaPedidos/rs/checkout")
    		.success(function(hospedes){
    			console.log(hospedes);
    			$scope.hospedes = hospedes;
    		}).error(function(){
    			alert('erro');
    		});
    	}
        
        $scope.open = open;
        $scope.openPagar = openPagar;
        $scope.openConsumo = openConsumo;

        function open(hospede) {
            var modalInstance = $modal.open({
                templateUrl: 'editCheckout.html',
                controller: 'editController',
                resolve: {
                    items: function () {
                        return hospede;
                    }
                }
            });

            modalInstance.result.then(function(data) {
                getRegistros();
            });
        }

        function openPagar(hospede) {
            var modalInstance = $modal.open({
                templateUrl: 'pagarCheckout.html',
                controller: 'pagarController',
                resolve: {
                    items: function () {
                        return hospede;
                    }
                }
            });

            modalInstance.result.then(function(data) {
                console.log(data);
            });
        }

        function openConsumo() {
            var modalInstance = $modal.open({
                templateUrl: 'consumoCheckout.html',
                controller: 'consumoController'

            });

            modalInstance.result.then(function(data) {
                console.log(data);
            });
        }

    }]);