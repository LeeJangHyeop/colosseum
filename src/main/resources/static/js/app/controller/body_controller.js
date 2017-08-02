/**
 * Created by LeeJangHyeop on 2017. 7. 18..
 */
(function() {
    'use strict';

    angular
        .module('colosseum')
        .controller('BodyController', BodyController);

    function BodyController($uibModal) {
        var vm = this;

        activate();

        function activate() {
            // load applocation info
            vm.title = "Colosseum"

            // open modal when have no authentication
            var modalInstance = $uibModal.open({
                animation: true,
                backdrop: 'static',
                templateUrl: '/templates/login',
                controller: 'LoginController',
                controllerAs: 'vm',
                resolve: {
                    items: function () {
                        return vm;
                    }
                }
            });

            modalInstance.result.then(function () {
                console.log("!")
            }, function () {
                console.log("!@")
            });
        }
    }
})();