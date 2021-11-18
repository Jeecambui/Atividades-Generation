package Polimorfismo;

public abstract class Animal {
	private String nome;
	private int idade;
	private String tipoSom;
	private boolean corre;
	private boolean subir;

	public Animal(String nome, int idade, String tipoSom, boolean corre, boolean subir) {
		this.nome = nome;
		this.idade = idade;
		this.tipoSom = tipoSom;
		this.corre = corre;
		this.subir = subir;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getTipoSom() {
		return tipoSom;
	}

	public void setTipoSom(String tipoSom) {
		this.tipoSom = tipoSom;
	}

	public boolean isCorre() {
		return corre;
	}

	public void setCorre(boolean corre) {
		this.corre = corre;
	}

	public boolean isSubir() {
		return subir;
	}

	public void setSubir(boolean subir) {
		this.subir = subir;
	}


}
