package Polimorfismo;

public class TesteDados {
	public static void main(String[] args) {
	
		Fisica f = new Fisica();
		f.setNome("Jhonatan");
		f.setIdade(26);
		f.setCpf(1234567890);
		String texto = f.dadosCompletos();
		
		System.out.println(texto);
		
		Juridica j = new Juridica();
		j.setNome("Empresa");
		j.setEmail("empresa@gmail.com");
		j.setCnpj(12345678910L);
		String texto2 = j.dadosJuridico();
		
		System.out.println(texto2);
		
	}

}
