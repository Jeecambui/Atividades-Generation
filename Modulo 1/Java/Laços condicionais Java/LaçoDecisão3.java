package Generation;

import java.util.Scanner;

public class La�oDecis�o3 {
	public static void main (String []args) {
			
	int idade;
	
	Scanner leia = new Scanner(System.in);

	System.out.println("\nQual a idade? ");
	idade = leia.nextInt();
	
	if (idade>=10 && idade<=14)
		{
			System.out.println("\nVoc� est� na categoria Infantil");
		}
	else if(idade>=15 && idade<=17)
		{
			System.out.println("\nVoc� est� na categoria Juvenil");
		}
		else if(idade>=18 && idade<=25)
		{
			System.out.println("\nVoc� est� na categoria Adulto");
		}
		else 
		{
			System.out.println("\nN�o possui categoria");
		}
	}
}
