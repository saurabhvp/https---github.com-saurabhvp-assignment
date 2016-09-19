app.controller('usersController', function($scope) {
    $scope.headingTitle = "User List";
});

app.controller('rolesController', function($scope) {
    $scope.headingTitle = "Roles List";
});

/*
app.controller('customerController', function($scope, $http) {
   $scope.acts = [];
    //alert("1");
    _refreshPageData();
    //alert("5");
  //HTTP GET- get all employees collection
    function _refreshPageData() {
    	//alert(document.getElementById("ap"))
    	//alert(document.getElementById("ap").innerHTML);

    	var startT = new Date().getTime();
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
            var elapsed = new Date().getTime()-startT;
            // send the info to the server 
            //alert('Rendered in ' + elapsed + 'ms'); 
            document.getElementById("timeelapsed").innerHTML= elapsed +"ms";
            document.getElementById("timeelapsedB").innerHTML= "";
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


app.controller('balancedataController', function($scope, $http) {
   $scope.balances = [];
    //alert("2");
    _refreshPageData();
    //alert("5");
  //HTTP GET- get all employees collection
    function _refreshPageData() {
    	//alert(document.getElementById("ap"))
    	//alert(document.getElementById("ap").innerHTML);
    	var startT = new Date().getTime();
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
            var elapsed = new Date().getTime()-startT;
            // send the info to the server 
            //alert('Rendered in ' + elapsed + 'ms'); 
            document.getElementById("timeelapsed").innerHTML= elapsed +"ms (Bal Data) & ";
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
    	    //alert("3");
    	    _refreshPageData();
    	    //alert("5");
    	  //HTTP GET- get all employees collection
    	    function _refreshPageData() {
    	    	//alert(document.getElementById("ap"))
    	    	//alert(document.getElementById("ap").innerHTML);
    	    	var startT = new Date().getTime();
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
    	            var elapsed = new Date().getTime()-startT;
    	            // send the info to the server 
    	            //alert('Rendered in ' + elapsed + 'ms'); 
    	            document.getElementById("timeelapsedB").innerHTML= elapsed +"ms (Trans)";
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
*/