class Paciente {
  String nome;
  int idade;
  String endereco;

  Paciente(this.nome, this.idade, this.endereco);

  void mostrarInformacoes() {
    print("Nome: $nome, Idade: $idade, Endereço: $endereco");
  }
}