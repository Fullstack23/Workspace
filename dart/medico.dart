import 'paciente.dart';

class Medico {
  String nome;
  String especialidade;

  Medico(this.nome, this.especialidade);

  void realizarConsulta(Paciente paciente) {
    print("Dr. $nome está realizando uma consulta com ${paciente.nome}.");
  }
}