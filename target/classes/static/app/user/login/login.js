(function () {
    angular.module("loginModule", ["ngAnimate"]);


    var loginController = function ($scope,$location) {

//        $scope.login = function () {
//            $location.path('/1');
//        };
    };


    angular.module("loginModule")
            .controller("loginController", loginController);

}());
