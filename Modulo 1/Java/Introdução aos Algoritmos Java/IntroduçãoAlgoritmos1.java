package Generation;

import java.util.Scanner;

public class IntroduçãoAlgoritmos1 {
	
	public static void main (String[] args) {
		int ano,mes,dia,total;
		
		Scanner ler = new Scanner(System.in);
			
		System.out.print("\nDigite os anos: ");
		
			System.out.println("Digite os anos: ");
			ano = ler.nextInt();
			
			System.out.println("Digite os meses: ");
			mes = ler.nextInt();
			
			System.out.println("Digite os dias: ");
			dia = ler.nextInt();
			
			total = ano*365 + mes*30 + dia;	
			System.out.println("\nIdade total em dias: "+total+"\n");
	}
}