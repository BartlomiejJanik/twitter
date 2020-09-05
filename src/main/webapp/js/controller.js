var articleApp = angular.module('articleApp', []);
console.log("test");
articleApp.controller('articleController', function ($scope, $http) {
        $scope.init = function () {
            $http({
                method: 'GET',
                url: 'rest/articles/',
                param: {}
            }).then(
                function (response) {
                    $scope.articles = response.data;
                }
            );
        };
    }
);