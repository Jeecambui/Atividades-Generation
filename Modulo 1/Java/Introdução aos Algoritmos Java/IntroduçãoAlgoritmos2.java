package Generation;

import java.util.Scanner;

public class IntroduçãoAlgoritmos2 {
	
	public static void main (String[] args) {
		int ano,mes,dia,total;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nDigite o total de dias: ");
		total = ler.nextInt();
				
		ano = total / 365;
		mes = (total % 365) / 30;
		dia = (total % 365) % 30;
		
		System.out.println("\nVoce vive: "+ano+ " anos, "+mes+" mes e "+dia+" dias");
		}
	}	