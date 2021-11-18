package Generation;

public class Cavalo extends Animal {
	public Cavalo() {
		super("Animal Cavalo");

	}

	@Override
	public void nome(String nomeAnimal) {
		System.out.println("\nNome do Cavalo: " + nomeAnimal);
	}

	@Override
	public void idade(int idadeAnimal) {
		System.out.println("\nIdade Cavalo: " + idadeAnimal);
	}

	@Override
	public void som(String somAnimal) {
		System.out.println("\nSom do Cavalo: " + somAnimal);
	}

	public void corre() {
		System.out.println("\nCavalo corre ");

	}
}
