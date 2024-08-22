// Tipos primitivos de variáveis em Javascript
// let nomedaPizzaria = "Pizzaria Sabores";
// let quantidadeDeSabores = 10;
// let taxaDeEntrega = 5.00;
// const pizzariaAberta = true;

// Estruturas de controle
// Calabresa, frango. Escolha outro sabor.
// let sabor = "calabresa";
// if (sabor == "calabrase") {
//     console.log("Você escolheu uma pizza de calabresa");
// } else if (sabor == "frango") {
//     console.log("Você escolheu uma pizza de frango");
// } else {
//     console.log("Escolha outro sabor:");
// }

// # Operadores condicionais
// ==, === -> (igualdade)
// !=, !== -> (diferente)
// >, <, <=, >= (comparação)

let precoPizza = 20;
let precoEntrega = 5;

// // Verificar se o preço da pizza é igual a 20;
// if (precoPizza == 20) {
//     console.log("O preço da pizza é 20" + precoPizza);
//     console.log(`O preço da pizza é ${precoEntrega} e essa é a 
//     nossa promoção e a taxa ${precoEntrega}`);
// }
// // Verificar se o preço da entega é mior que 3;
// if(precoPizza > 3){
//     console.log("O preço da entrega é maior que 3" + precoEntrega);
// }

// # Operadores lógicas
// && -> e
// || -> ou
// ! -> Negação
// let temQueijo = false;
// let temTomate = false;

// //Verificar se a pizza tem queijo e tomate
// if (temQueijo && temTomate) {
//     console.log("A pizza tem queijo e tomate");
// } else {
//     console.log("A pizza não tem queijo e tomate");
// }
// //Verificar se a pizza tem queijo ou tomate
// if (temQueijo || temTomate) {
//     console.log("A pizza tem queijo e tomate");
// } else {
//     console.log("A pizza não tem queijo e nem tomate.");
// }
// //Verificar se a pizza tem tomate;
// if (!temTomate) {
//     console.log("A pizza tem tomate");
// }
let saboresPizza = ["calabrasa", "mussarela", "marguerita"];
// let contador = 0;
// while (contador < saboresPizza.length) {
//     console.log(saboresPizza[contador]);
//     contador = contador + 1;
//     contador++;
// }
// for (let contador = 0; contador < saboresPizza.length; contador++) {
//     console.log(saboresPizza[contador]);
// }
// const sabores = ["Mussarela", "Calabresa",
//  "Frango com Catupiry", "Marguerita", "Portuguesa"];
// sabores.push("Quatro Queijos");
// let saiu = sabores.pop();
// console.log(saiu);
// sabores.shift();
// sabores.unshift("Peperonni");
// console.log(sabores);
// Exemplo 1 - Função sem parâmetros
// function boasVindas() {
//     console.log("Bem vindo à Pizzaria Sabores@!");
// }
// boasVindas();

// 2. Função com parâmentros.
// // -> Uma função que calcula po preço total de uma comanda 
// com base no preço e na quantidade de pizzas.

// function calcularPreco(preco, quantidade) {
//     let total = preco * quantidade;
//     console.log(`Preço total: R$ ${total.toFixed(2)}`);
// }
// calcularPreco(25,10);

// function calcularPreco(preco, quantidade) {
//     // total = preco * quantidade;
//     return preco * quantidade;
// }

// calcularPreco(25,10);

// 3. Função anônima
// const sabores = ["Mussarela", "Calabresa",
//  "Frango com Catupiry", "Marguerita", "Portuguesa"];

//  sabores.forEach(function(sabor) {
//     console.log(`Sabor: ${sabor}`);
//  });

//  function rodaARoda() {
//     console.log(sabores);
//  }
//  rodaARoda(sabores);

// const calcularPreco = (preco, quantidade) => {
//     let total = preco * quantidade;
//     total
    // console.log(`Preço total: R$ ${total.toFixed(2)}`);
// }
