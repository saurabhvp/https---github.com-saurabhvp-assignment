var custapp = angular.module('customerApp', []);
custapp.config(['$httpProvider', function($httpProvider) {
    $httpProvider.defaults.useXDomain = true;
    delete $httpProvider.defaults.headers.common['X-Requested-With'];
}
]);

custapp.controller('customerController', function($scope, $http) {
   $scope.acts = [];
    //alert("1");
    _refreshPageData();
    //alert("5");
  //HTTP GET- get all employees collection
    function _refreshPageData() {
    	//alert(document.getElementById("ap"))
    	//alert(document.getElementById("ap").innerHTML);
    	var actno_from_ctrl = document.getElementById("ap").innerHTML;
    	var apiurl = 'http://localhost:8080/customer/get-by-actno?actno='+actno_from_ctrl;
        $http({
            method : 'GET',
            headers: {
            	'Access-Control-Allow-Origin':'*'
            },
            url : apiurl
        }).then(function successCallback(response) {
            $scope.acts = response.data;
            //alert("success: "+response.data);
        }, function errorCallback(response) {
        	$scope.acts = response.data;
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