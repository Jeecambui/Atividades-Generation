package Generation;

public class testePatinete {
	public static void main(String []args) {
		
		Patinete[] cadastro = new Patinete[3];

		cadastro[0] = new Patinete("Monociclo",1,18);
		cadastro[1] = new Patinete("Oxelo B1",2,4);
		cadastro[2] = new Patinete("Newfrog Dobrável",3,10);
	
		for (Patinete leia : cadastro) {
			leia.Info();
		}
	}
}
