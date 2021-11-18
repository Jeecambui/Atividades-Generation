package Polimorfismo;

public class Cachorro extends Animal {
	private int numCachorro;
	private float pesoCachorro;

	public Cachorro(String nome, int idade, String tipoSom, boolean corre, boolean subir, float pesoCachorro, int numCachorro) {
		super(nome, idade, tipoSom, corre, subir);
		this.numCachorro = numCachorro;
		this.pesoCachorro = pesoCachorro;
	}

	// Imprimir informações
	public void imprimirInfo() {
		System.out.println("\nNome do Cachorro: " + getNome() + "\nIdade do Cachorro: " + getIdade() + "\nTipo de Som: "
				+ getTipoSom() + "\nEle corre: " + isCorre() + "\nCachorro sobe: " + isSubir() + "\nPeso do Cachorro"
				+ pesoCachorro + "\nNumero do Cachorro: " + numCachorro);
	}

	// getters e setters	
	public int getNumCachorro() {
		return numCachorro;
	}

	public void setNumCachorro(int numCachorro) {
		this.numCachorro = numCachorro;
	}

	public float getPesoCachorro() {
		return pesoCachorro;
	}

	public void setPesoCachorro(float pesoCachorro) {
		this.pesoCachorro = pesoCachorro;
	}

}
