package sistemaEscolar;


//extends
public class Aluno extends Pessoa{

	//Declarar o atributo do aluno
	private String matricula;
	
	//Constructor
	public Aluno(String nome, String cpf, int idade, String matricula) {
		super(nome, cpf, idade);
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
}


