package sistemaEscolar;

public class Programa {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("José", "111", 22);
		Pessoa pessoa2 = new Pessoa("Maria", 22);
		Pessoa pessoa3 = new Pessoa("Leadnro", 22);
		Aluno a1 = new Aluno("Lais", "112", 17, "a23");
		Professor p1 = new Professor("Sergio", 52, "111");
		Professor p2 = new Professor("Renna", "111", 22, "22", "55");
		System.out.println(pessoa1);
		System.out.println(pessoa2);
		System.out.println(pessoa3);
		System.out.println(a1);
		System.out.println(p1);
		System.out.println(p2);
	}

}
