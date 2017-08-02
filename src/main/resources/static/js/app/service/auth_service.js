/**
 * Created by LeeJangHyeop on 2017. 7. 24..
 */
(function() {
    'use strict';

    angular
        .module('colosseum')
        .factory('AuthService', AuthService);

    function AuthService($http) {
        return {
            getData: getData
        };

        function getData() {
            return $http.get('/api/data')
                .then(getDataSuccess)
                .catch(getDataFailed);

            function getDataSuccess(response) {
                return response.data.results;
            }

            function getDataFailed(error) {
                alert('error');
            }
        }
    }
}();