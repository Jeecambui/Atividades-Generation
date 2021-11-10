package pacote;

import java.util.Random;
import java.util.Scanner;

public class SortearNumero {
	public static void main(String args[]) {
		
		Random sortearNum = new Random();
		int n = sortearNum.nextInt(11);
		// 3 chances pra acertar
		// usuario digita o valor
		// Mensagem de ganhou usando if(n==)
		
		int num;
		Scanner leia = new Scanner(System.in);
		System.out.println("Vamos jogar o sorteio!!");
		
		

        for (int chances=0;chances<=3; chances++) {
        	System.out.println("\nDigite um número de 1 A 10: ");
        	num = leia.nextInt();
            if(num == n) {
				System.out.println("Parabens, você acertou !! :D");
			
            }else {
            	System.out.println("Você perdeuuu : ");
            }
        }	
	}
}
