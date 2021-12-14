package Generation;

public class testeContaBancaria {
	public static void main(String []args) {
		
		ContaBancaria[] cadastro = new ContaBancaria[2];

		cadastro[0] = new ContaBancaria("João Silva",23,12345,"Corrente");
		cadastro[1] = new ContaBancaria("Maria da Silva",34,54321,"Salario");
	
		for (ContaBancaria leia : cadastro) {
			leia.Info();
		}
	}
}
