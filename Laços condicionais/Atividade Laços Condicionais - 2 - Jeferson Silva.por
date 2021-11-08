programa
{
	
	funcao inicio()
	{
		real	salTotal, salExcedente
		inteiro c, n, E

		escreva("\nEntre com o seu código: ")
		leia(c)
		escreva("\nEntre com a quantidade de horas trabalhadas: ")
		leia(n)

		se(n>50)
		{
			E = n - 50
			salExcedente = E * 20
			salTotal = 500 + salExcedente
		}
		senao
		{
			E = 0
			salExcedente = 0
			salTotal = n * 10	
		}

		escreva("\nCódigo: ",c)
		escreva("\nSalário Excedente: ", salExcedente)
		escreva("\nSalário Total: ", salTotal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 315; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */