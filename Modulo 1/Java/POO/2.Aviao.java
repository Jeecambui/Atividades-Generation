package Generation;

public class Aviao {
	private String nome;
	private String destino;
	private String embarque;
	private int numeroEmbarque;
	private int numeroCliente;

	public Aviao(int numeroCliente, String nome, int numeroEmbarque, String embarque, String destino) {
		this.numeroCliente = numeroCliente;
		this.nome = nome;
		this.numeroEmbarque = numeroEmbarque;
		this.embarque = embarque;
		this.destino = destino;
	}

	public void ImprimirInfo() {

		System.out.println("\nNúmero do Cliente: " + numeroCliente + "\nNome do Cliente: " + nome
				+ "\nNumero do Embarque: " + numeroEmbarque + "\t Embarque : " + embarque + "\tDestino: " + destino);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getEmbarque() {
		return embarque;
	}

	public void setEmbarque(String embarque) {
		this.embarque = embarque;
	}

	public int getNumeroEmbarque() {
		return numeroEmbarque;
	}

	public void setNumeroEmbarque(int numeroEmbarque) {
		this.numeroEmbarque = numeroEmbarque;
	}

	public int getNumeroCliente() {
		return numeroCliente;
	}

	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}

}