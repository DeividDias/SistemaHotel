angular
    .module('checkout')
    .controller('pagarController', ['$modalInstance','$scope', '$http', 'items', function($modalInstance, $scope, $http, items) {
    	$scope.items = items;
        $scope.valorConsumo = items.valorConsumo;
        $scope.valorDiaria = items.valor;
        $scope.valorTotal = $scope.valorConsumo + $scope.valorDiaria;

        $scope.ok = ok;
        $scope.cancel = cancel;

        function ok () {
        	$http.delete("http://localhost:8080/SistemaPedidos/rs/checkout/" + $scope.items.quarto)
            $modalInstance.close($scope.items);
            cancel();
        };

        function cancel () {
            $modalInstance.dismiss('cancel');
        };


}]);
