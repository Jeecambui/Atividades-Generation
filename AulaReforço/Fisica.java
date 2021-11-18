package Polimorfismo;

public class Fisica extends Dados {
	public Fisica() {
		System.out.println("Classe Dados presente!");
	}

	private int cpf;
	private int idade;

	public Fisica(int cpf, int idade) {
		this.cpf = cpf;
		this.idade = idade;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String dadosCompletos() {
		return "\nO nome é " + getNome() + "\nIdade: " + getIdade() + "\nCPF: " + getCpf();
	}

}
