angular.module("times").service("timesApi",function($http, config){
    this.getTorneio= function(){
    return $http.get(config.baseUrl+"/api-torneio/torneio");
}
})