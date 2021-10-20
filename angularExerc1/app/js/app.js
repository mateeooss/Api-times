
angular.module("times", []);

const limitarCaract = (texto) => {
   texto > 10 ? texto.substr(0.10) +"..." : texto
}
