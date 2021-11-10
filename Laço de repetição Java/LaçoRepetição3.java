package Generation;

import java.util.Scanner;

public class LaçoRepetição3 {
	public static void main(String[] args) {

		int idade, cont21 = 0, cont50 = 0;

		Scanner leia = new Scanner(System.in);

		System.out.println("\nEntre com sua idade: ");
		idade = leia.nextInt();

		while(idade!=-99)
		{
			if (idade < 21) {
				cont21++;
			}
			if (idade > 50) {
				cont50++;
			}
			System.out.println("\nEntre com sua idade: ");
			idade = leia.nextInt();

			System.out.println("\nTemos: "+cont21+" pessoa(s) com menos de 21 anos");
			System.out.println("\nTemos: "+cont50+" pessoa(s) com mais de 50 anos");
		}

	}

}
