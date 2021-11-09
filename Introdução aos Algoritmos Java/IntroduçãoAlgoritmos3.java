package Generation;

import java.util.Scanner;

public class IntroduçãoAlgoritmos3 {
	public static void main (String[] args) {
	
	int seg,min,hr,totalSeg, sobraHr, sobraMin;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("\nInforme o tempo do evento: ");
	totalSeg = leia.nextInt();
	
	hr = totalSeg /3600;
	sobraHr = totalSeg - (hr*3600);
	min = sobraHr /60;
	seg = sobraHr - (min*60);
	
	System.out.println("\nTempo do evento: "+hr+" h "+min+" min "+seg+" seg");
	}
}