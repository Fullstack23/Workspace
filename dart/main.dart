import 'consulta.dart';
import 'medico.dart';
import 'paciente.dart';

void main() {
  Paciente paciente1 = Paciente("Ana Maria",60,"Rua B,456");
  Medico medico1 =Medico("Felipe Costa", "Cardiologia");

  Consulta consulta1 = Consulta(paciente1, medico1, DateTime.now());

  consulta1.detalhesConsulta();
}