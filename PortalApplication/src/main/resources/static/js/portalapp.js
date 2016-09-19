var app = angular.module('app', ['ngRoute','ngResource']);
app.config(['$httpProvider', function($httpProvider) {
    $httpProvider.defaults.useXDomain = true;
    delete $httpProvider.defaults.headers.common['X-Requested-With'];
}
]);
app.config(function($sceDelegateProvider) {
	  $sceDelegateProvider.resourceUrlWhitelist([
	    // Allow same origin resource loads.
	    'self',
	    // Allow loading from outer templates domain.
	    'http://localhost:8081/**',
	    'http://localhost:9081/**',
	  ]); 
	});

app.config(function($routeProvider){
	
	$routeProvider
        .when('/custpage',{
            //templateUrl: '/views/users.html',
        	    	
        	//templateUrl:url1 ,
            //controller: 'customerController'
        	templateUrl:function(){
        		var act_go = document.getElementById("accountnumber").value;
        		var url1 = 'http://localhost:8081/custdetails?actno='+act_go;
        		//alert(url1);
        		return url1;
        	}
        })
        .when('/balpage',{
            templateUrl: function(){
        		var act_go = document.getElementById("accountnumber").value;
        		var url2 = 'http://localhost:9081/transdetails?actno='+act_go;
        		//alert(url1);
        		return url2;
            }
            //controller: 'balancedataController'
        })
        .otherwise(
            { redirectTo: '/'}
        );
});



