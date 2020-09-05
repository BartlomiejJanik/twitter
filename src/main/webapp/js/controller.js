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
    $scope.articleById = function (articleId) {
        $http({
            method: 'GET',
            url: 'rest/articles/' + articleId,
            param: {}
        }).then(
            function (response) {
                $scope.article = response.data;
            }
        );
    };
    }
);