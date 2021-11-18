package Generation;

public class TesteEletronico {
	public static void main(String[] args) {

		ProdutoEletronico[] produtos = new ProdutoEletronico[3];

		produtos[0] = new ProdutoEletronico("Mouse", 100);
		produtos[1] = new ProdutoEletronico("Monitor", 1.200);
		produtos[2] = new ProdutoEletronico("Televisão", 900);

		for (ProdutoEletronico le : produtos) {
			le.ImprimirInfo();
		}
	}

}
