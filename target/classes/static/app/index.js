(function () {
    //index module
    angular.module("indexModule", ["ngRoute", "loginModule", "viewModule"]);

    //route config
    angular.module("indexModule").config(function ($routeProvider) {
        $routeProvider
                .when("/", {
                    templateUrl: "app/login/login.html",
                    controller: "loginController"
                })
                .when("/view-1", {
                    templateUrl: "app/view/view1.html",
                    controller: "viewController"
                })
                .when("/view-2", {
                    templateUrl: "app/view/view2.html",
                    controller: "viewController"
                })
                .when("/view-3", {
                    templateUrl: "app/view/view3.html",
                    controller: "viewController"
                })
                .when("/view-4", {
                    templateUrl: "app/view/view4.html",
                    controller: "viewController"
                })
                .when("/view-5", {
                    templateUrl: "app/view/view5.html",
                    controller: "viewController"
                })
                .when("/view-6", {
                    templateUrl: "app/view/view6.html",
                    controller: "viewController"
                })
                .when("/view-7", {
                    templateUrl: "app/view/view7.html",
                    controller: "viewController"
                })
                .when("/view-8", {
                    templateUrl: "app/view/view8.html",
                    controller: "viewController"
                })
                .when("/view-9", {
                    templateUrl: "app/view/view9.html",
                    controller: "viewController"
                })
                 .when("/view-10", {
                    templateUrl: "app/view/view10.html",
                    controller: "viewController"
                })
                 .when("/view-11", {
                    templateUrl: "app/view/view11.html",
                    controller: "viewController"
                })
                 .when("/view-12", {
                    templateUrl: "app/view/view12.html",
                    controller: "viewController"
                })
                .otherwise({
                    redirectTo: "/"
                });
    });

}());

