<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html >
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>


</head>
<body ng-app="myApp" ng-controller="myCtrl">
  <h1 class="btn"> {{msg}}</h1> 
  
  <table>
  <tr ng-repeat="x in mytable">
  <td></td>{{x.empid}}
  </tr>
  
  </table>
  <script>

var app = angular.module('myApp', []);
app.controller('myCtrl', function($scope,$http) {
 $scope.msg='Hello';
 
 $http.get("/rest/all")
 .then(function (response) {$scope.names = response.data.records;
 console.log($scope.names);
 console.log(angular);
 });
 
});
</script>
</body>
</html>