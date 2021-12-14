package Generation;

public class ContaBancaria {
	private String nome;
	private int numeroConta;
	private int idade;
	private String tipoConta;

	public ContaBancaria(String nome, int idade, int numeroConta, String tipoConta) {
		this.nome = nome;
		this.idade = idade;
		this.numeroConta = numeroConta;
		this.tipoConta = tipoConta;
	}

	public void Info() {
		System.out.println("\nNome do Cliente: " + nome + "\nIdade do Cliente: " + idade + "\nNumero da Conta: "
				+ numeroConta + "\t| Tipo de Conta" + tipoConta);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

}
