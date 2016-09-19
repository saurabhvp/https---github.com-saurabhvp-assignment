
var app = angular.module('customerApp', ['ngRoute','ngResource']);
app.config(function($routeProvider){
    $routeProvider
        .when('/users',{
            templateUrl: '/views/users.html',
            controller: 'usersController'
        })
        .when('/roles',{
            templateUrl: '/views/roles.html',
            controller: 'rolesController'
        })
        .when('/customerdetails',{
            //templateUrl: '/views/customer.html',
            //controller: 'customerController'
        })
        .otherwise(
            { 
            	//redirectTo: '/',
            	//controller: 'customerController'
            }
        );
});

