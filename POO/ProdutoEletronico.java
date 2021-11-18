package Generation;

public class ProdutoEletronico {
	private String nome;
	private double valor;

	public ProdutoEletronico(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}

	public void ImprimirInfo() {

		System.out.println(nome + " \t Valor: " + valor);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
