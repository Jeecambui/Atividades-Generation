package Generation;

public class TesteCliente {
	public static void main(String[] args) {

		Cliente[] cadastro = new Cliente[2];

		cadastro[0] = new Cliente(1, "Jeferson Silva", 27);
		cadastro[1] = new Cliente(2, "Sergio Silveira", 40);

		
		for (Cliente le : cadastro) {
			le.ImprimirInfo();

		}
	}
}