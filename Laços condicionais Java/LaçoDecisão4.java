package Generation;

import java.util.Scanner;

public class LaçoDecisão4 {
	public static void main(String []args) {
		int num;
		double res;
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com um número: ");
		num = leia.nextInt();
		
		if(num % 2 ==0)
		{
			res = Math.sqrt(num);
		}
		else
		{
			res = Math.pow(num, 2);
		}
		System.out.println("\nResultado: "+res);
	}
}
