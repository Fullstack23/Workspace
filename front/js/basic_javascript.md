# Variáveis em Javascript
1. var -> escopo da função
2. let -> escopo de bloco
3. const -> escopo de bloco e o valor é constante.

## Tipos de variáveis
string -> Ex: let nomeDaPizzaria = "Pizzaria Sabores";
number -> inteiro - Ex: let quantidadeDeSabores = 10;
number -> double -> Ex: let taxaDeEntrega = 5.00;
boolean -> Ex: let pizzariaAberta = true;

* Dê nomes sugestivos
* Padrão cammelCase -> Ex: nomeDoUsuario;
* Tipagem dinâmica e fracas;
---------------------------------------------------------------
# Estruturas de controle
`if` -> Obrigatório, com condição lógica.
`else if` -> Opcional, com condição lógica. Pode ser utilizado várias vezes.
`else` -> Opcional, sem condição lógica.

Ex:
// let sabor = "calabresa";
let sabor = "frangoooo";
if(sabor == "calabresa") {
   console.log("Você escolheu uma pizza de calabresa");
} else if(sabor == "frango") {
    console.log("Você escolheu uma pizza de Frango");
} else {
    console.log("Escolha outro sabor.");
}

## Operadores condicionais
==, === -> (igualde);
!=, !== -> (diferente)
<,>, <=, >= (comparação)

Ex:
let precoPizza = 20;
let precoEntrega = 5;

// Verificar se o preço da pizza é igual a 20.
if(precoPizza == 20) {
    console.log(`O preço da pizza é ${precoPizza}.`); 
}

// Verificar se o preço da entrega é maior que 3
if(precoEntrega > 3) {
    console.log(`O preço da entrega é maior que ${precoEntrega}.`);
}
## Operadores Lógicos
`&&` -> (e)
`||` -> (ou)
`!` -> (não)

Ex:
let temQueijo = true;
let temTomate = false;

// Verificar se a pizza tem queijo e tomate
if(temQueijo && temTomate) {
    console.log("A pizza tem queijo e tomate.");
} else {
    console.log("A pizza não tem queijo e tomate.");
}

// Verificar se a pizza tem queijo ou tomate
if(temQueijo || temTomate) {
    console.log("A pizza tem queijo ou tomate.");
}

// Verificar se a pizza não tem tomate
if(!temTomate) {
    console.log("A pizza não tem tomate");
}

## Estrutura Switch
```javascript

let tamanhoPizza = "pequeno";
// pequeno, medio, grande
// que o tamanho é desconhecido
switch(tamanhoPizza) {
    case "pequeno":
        console.log("Você escolheu uma pizza pequena.");
        break;
    case "medio":
        console.log("Você escolheu uma pizza média.");
        break;
    case "grande":
        console.log("Você escolheu uma pizza grande.");
        break;
    default:
        console.log("Tamanho desconhecido.");
}

```



## Estrutura de dados
# Array
->É um conjunto de dados que armazena uma coleção de elementos. Esses elementos podem ser de qualquer tipo.
1. Criando um array
const sabores = ["Mussarela", "Calabresa",
 "Frango com Catupiry", "Marguerita", "Portuguesa"];

2. `push()` -> Adiciona um ou mais elementos ao final do array.
sabores.push("Quatro Queijos");
console.log(sabores);

3. `Pop()` -> Remove o último elemento de um array e retorna esse elemento.
let saiu = sabores.pop();
console.log(saiu);

4. `shift()` -> Remove o primeiro elemento do array.
sabores.shift();
console.log(sabores);
5. `unshift()` -> Adiciona um elemento ou mais elemetnos ao inìcio do array.

---------------------------------------------------------------

# FUNCTION
-> UMA FUNÇÃO EM js, QUE É UM BLOCO DE CÓDIGO PROJETADO PARA EXECUTAR UMA TAREFA ESPECÍFICA. UMA FUNÇÃO É DEFINIDADE UMA VEZ E PODE SER INVOCADA VÁRIAS VEZES, SENDO REUTILIZADA.

## Criando Funções
1.Função básica.
function boasVindas() {
    console.log("Bem vindo à Pizzaria Sabores!");
}
boasVindas();

// Função com parâmentros.
// -> Uma função que calcula po preço total de uma comanda com base no preço e na quantidade de pizzas.
function calcularPreco(preco, quantidade) {
    let total = preco * quantidade;
    console.log(`Preço total: R$ ${total.toFixed(2)}`);
}
 calcularPreco(25,10);

 2. Função com retorno de valor
function calcularPreco(preco, quantidade) {
    // total = preco * quantidade;
    return preco * quantidade;
}

calcularPreco(25,10);

3. Função anônima
-> É uma função sem nome. Ela é frequentemente usada como uma função callback.

```javascript
const sabores = ["Mussarela", "Calabresa",
 "Frango com Catupiry", "Marguerita", "Portuguesa"];

 sabores.forEach(function(sabor) {
    console.log(`Sabor: ${sabor}`);
 });
```

```javascript
3.Arrow function
-> são uma sintaxe mais curta para escrrver funções em JS.
Elas são utilizadas para organizar dados de uma maneira estruturada.
// const calcularPreco = (preco, quantidade) => {
//     let total = preco * quantidade;
//     total
    // console.log(`Preço total: R$ ${total.toFixed(2)}`);
// }
´´´
---------------------------------------------------------------
# Atalhos do VSCODE
CTRL+ALT+N -> Roda a extensão code runner.
CTRL+; -> Utilizamos para comentários com //.
CTRL+B -> Abre o explorador.
CTRL+C, CTRL+V -> Duplica a linha(as) atual(ais).
CTRL+J -> Abre o terminal.
SHIFT+ALT+F => Formatar o código.

---------------------------------------------------------------
# Padrão de cases
Padrão cammelCase -> Ex: nomeDoUsuario;

-----------------------------------------------------------

## Estruturas de repetição

//Tradicionais
1. LOOP WHILE
2. LOOP FOR
->São usadas para executar um bloco de código múltiplas vezes.

## While
-> O loop while executa um bloco de codígo enquanto uma condição for true (verdadeiro).

let saboresPizza = ["calabrasa", "mussarela", "marguerita"];
let contador = 0;
while (contador < saboresPizza.length) {
    console.log(saboresPizza[contador]);
    // contador = contador + 1;
    contador++;
}


## Loop FOr
-> O loop `for` é ,ais compacto e  geralmente utilizado quando se sabe de antemão quantas vezes o loop deve ser executado.

1. Sintaxe
for(inicialização; condição; incremento)
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
```