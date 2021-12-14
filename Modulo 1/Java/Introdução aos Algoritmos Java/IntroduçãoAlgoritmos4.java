package Generation;

import java.util.Scanner;

public class IntroduçãoAlgoritmos4 {
	public static void main(String[] args) {
		
		int a,b,c;
		double r,s,d;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDefina um valor para A: ");
		a = leia.nextInt();
		System.out.println("\nDefina um valor para B: ");
		b = leia.nextInt();
		System.out.println("\nDefina um valor para C: ");
		c = leia.nextInt();
		
		r = Math.pow((a+b),2);
		s = Math.pow((b + c),2);
		d = (r+s) / 2;

		System.out.println("O valor de D é: "+Math.round(d)+", o valor de S é: "+Math.round(s)+" e o valor de R é: "+Math.round(r));
				
	}

}