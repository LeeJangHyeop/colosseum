/**
 * Created by LeeJangHyeop on 2017. 7. 20..
 */
(function() {
    'use strict';

    angular
        .module('colosseum')
        .controller('LoginController', LoginController);

    function LoginController($uibModalInstance) {
        var vm = this;
        vm.login = login;
        vm.close = close;

        activate();

        function activate() {
            console.log("LoginController");
        }

        function login() {
            console.log("login!")
        }
        function close() {
        }
    }
})();