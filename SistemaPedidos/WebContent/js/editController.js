angular
    .module('checkout')
    .controller('editController', ['$modalInstance', '$scope', 'items', '$http', function($modalInstance, $scope, items, $http) {
        $scope.items = items;

        $scope.nome = $scope.items.nome;
        $scope.dataent = $scope.items.dataent;
        $scope.datasai = $scope.items.datasai;
        $scope.valor = $scope.items.valor;
        $scope.qtdAcomod = $scope.items.qtdAcomp;

        $scope.ok = ok;
        $scope.cancel = cancel;

        function ok () {
        	
    		$http.put("http://localhost:8080/SistemaPedidos/rs/checkout", $scope.items)
    		.success(function(){
                $modalInstance.close($scope.items);
                cancel();
    		}).error(function(){
    			alert('erro');
    		});
        	
        };

        function cancel () {
            $modalInstance.dismiss('cancel');
        };

}]);
