package Polimorfismo;

public class Juridica extends Dados {
	public Juridica() {
		System.out.println("\nClasse Dados presente!");
	}

	private long cnpj;
	private int telefone;

	public Juridica(long cnpj, int telefone) {
		this.cnpj = cnpj;
		this.telefone = telefone;
	}

	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public String dadosJuridico() {
		return "\nO nome é " + getNome() + "\nCNPJ: " +cnpj+"\nTelefone: "+telefone;
	}

}
