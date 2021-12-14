package Generation;

import java.util.Scanner;

public class LaçoDecisão1 {
	public static void main(String []args) {
		int n1,n2,n3,maior,menor;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o primeiro numero? ");
		n1 = leia.nextInt();
		System.out.println("\nEntre com o segundo numero? ");
		n2 = leia.nextInt();
		System.out.println("\nEntre com o terceiro numero? ");
		n3 = leia.nextInt();
		
      

        maior = Math.max(n2,Math.max(n3,n1));
        menor = Math.min(n2,Math.min(n3,n1));

        System.out.println(" Maior: " +maior+"\n Menor: " + menor);
	}
}
