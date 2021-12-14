package Generation;

public class Patinete {
	private String tipo;
	private int quantiRodas;
	private int idade;

	public Patinete(String tipo, int rodas, int idade) {
		this.tipo = tipo;
		this.quantiRodas = rodas;
		this.idade = idade;
	}

	public void Info() {
		System.out.println("\nTipo do Patinete: " + tipo + "\tQuantidade de Rodas: " + quantiRodas
				+ "\nRecomendado para faixa de idade: " + idade);
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getQuantiRodas() {
		return quantiRodas;
	}

	public void setQuantiRodas(int quantiRodas) {
		this.quantiRodas = quantiRodas;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
