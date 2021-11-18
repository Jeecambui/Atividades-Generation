package Polimorfismo;

public class Cavalo extends Animal {
	private int numCavalo;
	private float pesoCavalo;

	public Cavalo(String nome, int idade, String tipoSom, boolean corre, boolean subir, float pesoCavalo, int numCavalo) {
		super(nome, idade, tipoSom, corre, subir);
		this.numCavalo = numCavalo;
		this.pesoCavalo = pesoCavalo;
	}
	
	// Imprimir informações
	public void imprimirInfo() {
		System.out.println("\nNome do Cavalo: " + getNome() + "\nIdade do Cavalo: " + getIdade() + "\nTipo de Som: "
				+ getTipoSom() + "\nEle corre: " + isCorre() + "\nCavalo sobe: " + isSubir() + "\nPeso do Cavalo"
				+ pesoCavalo + "\nNumero do Cavalo: " + numCavalo);
	}

	// getters e setters
	public int getNumCavalo() {
		return numCavalo;
	}

	public void setNumCavalo(int numCavalo) {
		this.numCavalo = numCavalo;
	}

	public float getPesoCavalo() {
		return pesoCavalo;
	}

	public void setPesoCavalo(float pesoCavalo) {
		this.pesoCavalo = pesoCavalo;
	}
	
}
