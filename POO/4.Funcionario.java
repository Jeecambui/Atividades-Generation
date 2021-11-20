package Generation;

public class Funcionario {
	private String nome;
	private int numeroFunc;
	private int idade;
	private String endereco;
	private String escolaridade;
	
	public Funcionario(int numeroFunc, String nome, int idade,  String endereco, String escolaridade) {
		this.numeroFunc = numeroFunc;
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.escolaridade = escolaridade;
	}

	public void Info() {
		System.out.println("\nNúmero do Funcionario: "+numeroFunc+"\nNome do Funcionario: "+nome+"\tIdade: "+idade+"\nEndereço: "+endereco+"\tEscolaridade: "+escolaridade);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroFunc() {
		return numeroFunc;
	}

	public void setNumeroFunc(int numeroFunc) {
		this.numeroFunc = numeroFunc;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}
}
