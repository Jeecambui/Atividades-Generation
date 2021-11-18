package Polimorfismo;

public class TesteAnimal {

	public static void main(String[] args) {
		Preguica preguica = new Preguica("Flecha", 8, "nhãaaa", "subir");
		Cachorro cachorro = new Cachorro("Max", 4, "auau", "correr");
		Cavalo cavalo = new Cavalo("Tornado", 10, "iiirrrrí", "correr");

		Animal[] animais = new Animal[3];
		animais[0] = preguica;
		animais[1] = cachorro;
		animais[2] = cavalo;

		for (Animal lista : animais) {
			System.out.println("\n"+lista.getSom());
		}
	}
}