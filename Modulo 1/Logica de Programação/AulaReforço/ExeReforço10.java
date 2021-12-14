package pacote;

public class ExeReforço10 {
	public static void main(String[] args) {
		int num = 0;
		int num2 = 0;

		// while pede a condição ele nao sabe o inicio ou fim do valor da variavel
		while (num <= 10) {
			System.out.println("O numero é: " + num);
			num++;
		}

		// do while
		do {
			System.out.println("O valor do segundo numero é: " + num2);
			num2++;

		} while (num2 <= 5);
		
		for(int x=0;x<=3;x++) {
			System.out.println("o valor de x é: "+x);
		}
	}
}
