/**
 * Created by LeeJangHyeop on 2017. 7. 16..
 */

(function() {
    'use strict';

    angular
        .module('colosseum', [
            'ngRoute',
            'ui.bootstrap'
        ])
        .config(config);

    function config($routeProvider) {
        $routeProvider
            .when('/', {
                templateUrl: '/templates/main',
                controller: 'MainController',
                controllerAs: 'vm'
            });
    }
})();