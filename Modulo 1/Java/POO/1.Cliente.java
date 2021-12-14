package Generation;

public class Cliente {
	private int idCliente;
	private String nome;
	private int idade;

	public Cliente(int idCliente, String nome, int idade) {
		this.idCliente = idCliente;
		this.nome = nome;
		this.idade = idade;
	}
	public void ImprimirInfo() {
		System.out.println(
				"\nIdentificação Cliente: " + idCliente + "\nNome do Cliente: " + nome +"\nIdade do Cliente: " + idade);
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
