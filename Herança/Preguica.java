package Polimorfismo;

public class Preguica extends Animal {

	private String subir;

	public Preguica(String nome, int idade, String som, String subir) {

		super(nome, idade, som);
		this.subir = subir;
	}

	public String getCorrer() {
		return subir;
	}

	public void setCorrer(String correr) {
		this.subir = correr;
	}

	public String getSom() {
		return ("O som da Preguiça: " + super.getSom());
	}
}
