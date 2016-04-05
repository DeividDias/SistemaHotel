angular
    .module('checkout')
    .controller('editController', ['$modalInstance', '$scope', 'items', function($modalInstance, $scope, items) {
        $scope.items = items;

        $scope.nome = $scope.items[0].nome;
        $scope.dataent = $scope.items[1].dataent;
        $scope.datasai = $scope.items[2].datasai;
        $scope.valor = $scope.items[3].valor;
        $scope.qtdAcompa = 2;

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
