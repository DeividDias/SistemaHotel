angular
    .module('roomServiceModule', [])
    .controller('roomServiceControl', function ($scope, $location) {

        $scope.servicoDeQuarto = new Object();

        $scope.produtos = [
            {nome:'Jantar', valor:10.10},
            {nome:'Lagosta', valor:57.60},
            {nome:'Refrigerante', valor:3.50},
            {nome:'Passadeira', valor:2.25}
        ];

        $scope.quartos = [01,10,15,22,37];

        $scope.seleciona = function seleciona(servicoDeQuarto) {
            $scope.servicoDeQuarto = servicoDeQuarto;
        }

        $scope.limpar = function limpar() {
            $scope.servicoDeQuarto = new Object();
        }

        $scope.salvar = function salvar() {
            if ($scope.servicoDeQuartos == undefined) {
                $scope.servicoDeQuartos = new Array();
            }
            $scope.servicoDeQuartos.push($scope.servicoDeQuarto);
            $scope.limpar();
        }

        $scope.remover = function remover() {
            if ($scope.servicoDeQuarto.codigo != null && $scope.servicoDeQuarto.codigo != undefined) {
                $scope.servicoDeQuartos.splice($scope.servicoDeQuartos.indexOf($scope.servicoDeQuarto));
                $scope.limpar();
            } else {
                alert('Escolha um serviço de quarto para apagar!');
            }
        }

        $scope.inserirProduto = function () {
            if ($scope.servicoDeQuarto.produtos == undefined) {
                $scope.servicoDeQuarto.produtos = new Array();
                $scope.countProduto = 0;
            }

            if ($scope.tmpProduto != undefined) {
                $scope.tmpProduto.id = $scope.countProduto++;
                $scope.servicoDeQuarto.produtos.push(angular.copy($scope.tmpProduto));
            }
        };

        $scope.removerProduto = function(produto) {
            $scope.servicoDeQuarto.produtos.splice($scope.servicoDeQuarto.produtos.indexOf(produto), 1);
        }
        
        $scope.calculaValor = function (produtos) {
            var total = 0.00;
            angular.forEach(produtos, function(produto) {
                total += parseFloat(produto.valor);
            });

            return total;
        }

    });