angular
    .module('checkout')
    .controller('pagarController', ['$modalInstance','$scope', function($modalInstance, $scope) {
        $scope.valorConsumo = 50;
        $scope.valorDiaria = 220.32;
        $scope.valorTotal = $scope.valorConsumo + $scope.valorDiaria;

        $scope.ok = ok;
        $scope.cancel = cancel;

        function ok () {
            $modalInstance.close($scope.items);
            cancel();
        };

        function cancel () {
            $modalInstance.dismiss('cancel');
        };


}]);
