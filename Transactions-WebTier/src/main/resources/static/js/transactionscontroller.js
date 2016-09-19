var app = angular.module('app', []);
app.config(['$httpProvider', function($httpProvider) {
    $httpProvider.defaults.useXDomain = true;
    delete $httpProvider.defaults.headers.common['X-Requested-With'];
}
]);

app.controller('balancedataController', function($scope, $http) {
   $scope.balances = [];
    //alert("1");
    _refreshPageData();
    //alert("5");
  //HTTP GET- get all employees collection
    function _refreshPageData() {
    	//alert(document.getElementById("ap"))
    	//alert(document.getElementById("ap").innerHTML);
    	var actno_from_ctrl = document.getElementById("ap").innerHTML;
    	var apiurl = 'http://localhost:9082/transactions/balancedata/get-by-actno?actno='+actno_from_ctrl;
        $http({
            method : 'GET',
            headers: {
            	'Access-Control-Allow-Origin':'*'
            },
            url : apiurl
        }).then(function successCallback(response) {
            $scope.balances = response.data;
            //alert("success: "+response.data);
        }, function errorCallback(response) {
        	$scope.balances = response.data;
            //alert("error:"+response);
        	//console.log(response.statusText);
        });
    }
       
        function _success(response) {
            _refreshPageData();
            _clearForm()
        }

        function _error(response) {
            console.log(response.statusText);
        }
        
        
        
    });
   
  
app.controller('transactionsController', function($scope, $http) {
    	   $scope.transactions = [];
    	    //alert("1");
    	    _refreshPageData();
    	    //alert("5");
    	  //HTTP GET- get all employees collection
    	    function _refreshPageData() {
    	    	//alert(document.getElementById("ap"))
    	    	//alert(document.getElementById("ap").innerHTML);
    	    	var actno_from_ctrl = document.getElementById("ap").innerHTML;
    	    	var apiurl = 'http://localhost:9082/transactions/get-by-actno?actno='+actno_from_ctrl;
    	        $http({
    	            method : 'GET',
    	            headers: {
    	            	'Access-Control-Allow-Origin':'*'
    	            },
    	            url : apiurl
    	        }).then(function successCallback(response) {
    	            $scope.transactions = response.data;
    	            //alert("success: "+response.data);
    	        }, function errorCallback(response) {
    	        	$scope.transactions = response.data;
    	            //alert("error:"+response);
    	        	//console.log(response.statusText);
    	       
    	        });
    	    }

    	        function _success(response) {
    	            _refreshPageData();
    	            _clearForm()
    	        }

    	        function _error(response) {
    	            console.log(response.statusText);
    	        }
    	        
    	        
    	        
    });
    	   
    
    
    
