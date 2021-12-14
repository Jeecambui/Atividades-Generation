package Generation;

import java.util.Scanner;

public class TesteAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();

		Animal animal = null;

		int x = 0;
		do {
			System.out.println("\nQual o tipo de seu animal?\n\n1-Cachorro | 2-Cavalo | 3-Preguiça |");
			x = leia.nextInt();
			if (x == 1) {
				animal = cachorro;
				System.out.println("\nQual o nome do seu cachorro?");
				String nome = leia.next();
				System.out.println("\nQuantos anos tem seu cachorro?");
				int idade = leia.nextInt();
				System.out.println("\nEssa é legal!!! Qual o som que seu cachorro emite?");
				String som = leia.next();

				System.out.println("---------------------------------------------------------");
				cachorro.nome(nome);
				cachorro.idade(idade);
				cachorro.som(som);
				cachorro.corre();
				
			} else if (x == 2) {
				animal = cavalo;
				System.out.println("\nQual o nome do seu cavalo?");
				String nome = leia.next();
				System.out.println("\nQuantos anos tem seu cavalo?");
				int idade = leia.nextInt();
				System.out.println("\nEssa é legal!!! Qual o som que seu cavalo emite?");
				String som = leia.next();

				System.out.println("---------------------------------------------------------");
				cavalo.nome(nome);
				cavalo.idade(idade);
				cavalo.som(som);
				cavalo.corre();
				
			} else if (x == 3) {
				animal = preguica;
				System.out.println("\nQual o nome da sua preguiça?");
				String nome = leia.next();
				System.out.println("\nQuantos anos tem sua preguiça?");
				int idade = leia.nextInt();
				System.out.println("\nEssa é legal!!! Qual o som que sua preguiça emite?");
				String som = leia.next();

				System.out.println("---------------------------------------------------------");
				preguica.nome(nome);
				preguica.idade(idade);
				preguica.som(som);
				preguica.SubirArvores();
				
			} else {
				System.out.println("\nInformação inválida!!!");
			}
		} while (x <= 0 || x >= 4);
	}

}
