package Generation;

public class Preguica extends Animal {
	public Preguica() {
		super("Animal Preguica");

	}

	@Override
	public void nome(String nomeAnimal) {
		System.out.println("\nNome do preguica: " + nomeAnimal);
	}

	@Override
	public void idade(int idadeAnimal) {
		System.out.println("\nIdade preguica: " + idadeAnimal);
	}

	@Override
	public void som(String somAnimal) {
		System.out.println("\nSom do preguica: " + somAnimal);
	}

	public void SubirArvores() {
		System.out.println("\nA preguica sobe ");

	}
}
