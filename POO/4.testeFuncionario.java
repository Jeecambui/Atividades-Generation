package Generation;

public class testeFuncionario {
	public static void main(String []args) {
		
		Funcionario[] cadastro = new Funcionario[5];

		cadastro[0] = new Funcionario(1, "Jeferson Silva", 26,"Rua das Pessoas Desenvolvedores","Ensino Superior Incompleto");
		cadastro[1] = new Funcionario(2, "Vash o Estouro da Boiada", 28,"Rua das Lampadas","Ensino Média Completo");
		cadastro[2] = new Funcionario(3, "Goku de Souza", 40,"Rua das Esferas do Dragon","Ensino Fundamental Completo");
		cadastro[3] = new Funcionario(4, "Ash Silqueira", 12,"Rua dos Pokemons","Ensino Medio Incompleto");
		cadastro[4] = new Funcionario(5, "Gohan de Souza", 15,"Rua da Corporação Casula","Ensino Superior Incompleto");

		
		for (Funcionario leia : cadastro) {
			leia.Info();

		}
	}
}