// void main() {
//   print("Hello World!");
// }

// void main() {
//   int primeiroNumero = 3;
//   double segundoNumero = 4.5;
//   bool estaChovendo = true;
//   bool estaChovendo2 = false;
//   String nomeCompleto = "Heitor Benjamim";

//   var naoFazIsso = "Dart é vida!";
//   print('Primeiro número: R\$$primeiroNumero segundo número: $segundoNumero NomeCompleto: $nomeCompleto');
// }

// void main() {
//   var nomes = ["Ana", "Bia", "Mariana"];
//   print(nomes);
//   nomes.add("Daniela");
//   print(nomes);
//   print(nomes[2]);
//   print(nomes.length);
// }

// void main() {
//   Set<int> conjunto = {0, 1, 2, 3, 4, 5};
//   print(conjunto.length);
//   print(conjunto is Set);
// }

// void main() {
//   Map<String,double> notasDosAlunos = {
//     "Ana": 7.9,
//     "Bia": 9.1,
//     "Mariana":7.7,
//   };

//   for(var chave in notasDosAlunos.keys){
//   print('Chave = $chave');
//   };
//   for(var valor in notasDosAlunos.values){
//   print('Valor = $valor');   
//   };
//   for (var registro in notasDosAlunos.entries) {
//    print('${registro.key} = ${registro.value}');
//   };
// }

class Pessoa {
  String nome ;
  int idade;

  Pessoa(this.nome, this.idade);

  void mostrarDados(){
    print('Nome: $nome, Idade: $idade');
  }
}