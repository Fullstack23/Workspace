package sistemaEscolar;


public class Professor extends Pessoa{

	private String id;
	private String rg;

// Constructor
public Professor (String nome, String cpf, int idade, String id, String rg) {
	super(nome, cpf, idade);
	this.id = id;
	this.rg = rg;
	}

public Professor (String id, int idade, String rg) {
	super(id, rg, idade);
	this.id = id;
	this.rg = rg;
	}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getRg() {
	return rg;
}

public void setRg(String rg) {
	this.rg = rg;
}



	
   }

