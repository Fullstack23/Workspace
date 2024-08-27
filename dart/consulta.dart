import 'medico.dart';
import 'paciente.dart';

class Consulta {
 Paciente paciente;
 Medico medico;
 DateTime dataHora;

 Consulta(this.paciente, this.medico, this.dataHora);

 void detalhesConsulta() {
  print("Consulta marcada para ${dataHora} com o Dr. ${medico.nome} para o paciente ${paciente.nome}");
 }
}