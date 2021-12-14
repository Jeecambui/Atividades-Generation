import java.util.Scanner;

//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR) 

public class LaçoRepetição2 {

	public static void main(String[] args) {
		

		int num, somaNumero=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com um número: ");
		numero = leia.nextInt();
		
		do
		{
			if(numero%2==0)
			{
				somaNumero += numero;
				contNumero++;
			}
			System.out.println("\nEntre com um número: ");
			numero = leia.nextInt();
			
		}while(numero%2==0);
		
		if(contNumero==0)
		{
			System.out.println("\nNáo é possível fazer divisão por zero!!!");
		}
		else
		{
		media = somaNumero / contNumero;
		System.out.println("\nMédia dos números pares: "+media);
		}
	}

}

