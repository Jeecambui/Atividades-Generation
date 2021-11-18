package Polimorfismo;

public class Cavalo extends Animal {

	private String correr;

	public Cavalo(String nome, int idade, String som, String correr) {

		super(nome, idade, som);
		this.correr = correr;
	}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}

	public String getSom() {
		return ("O som do cavalo: " + super.getSom());
	}
}
