package Generation;

public class Cachorro extends Animal{
	public Cachorro()
	{
		super("Animal Cachorro");

	}

	@Override
	public void nome(String nomeAnimal)
	{
		System.out.println("\nNome do cachorro: "+nomeAnimal);
	}
	@Override
	public void idade(int idadeAnimal)
	{
		System.out.println("\nIdade cachorro: "+idadeAnimal);
	}
	@Override
	public void som(String somAnimal)
	{
		System.out.println("\nSom do cachorro: "+somAnimal);
	}
	public void corre()
	{
		System.out.println("\nCachorro corre ");

	}
}

