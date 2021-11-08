programa
{
	
	funcao inicio()
	{
		real base, altura, triangulo

		escreva("\nQual é o tamanho da base do triangulo? ")
		leia(base)
		escreva("\nQual a altura do triangulo? ")
		leia(altura)

		limpa()

		triangulo = base * altura / 2

		se(base>0 e altura>0)
		{
			escreva("\nO valor digitado é valido !!!","\n", "\nO Tamanho do triangulo é de: ", triangulo, "\n")
		}
		senao
		{
			escreva("\n O valor não é valido !!!")
		}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 371; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */