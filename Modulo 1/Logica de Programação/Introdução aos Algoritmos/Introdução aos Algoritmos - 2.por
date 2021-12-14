programa
{
	
	funcao inicio()
	{
		/*
		1 ano = 365 
		1  mes  = 30 
		1 dia = 1	
		*/

		inteiro ano,mes,dias,total

		escreva("\nEntre com quantos anos tem: ")
		leia(ano)
		escreva("\nEntre com quantos meses tem: ")
		leia(mes)
		escreva("\nEntre com quantos dias tem: ")
		leia(dias)

		total = ano*365 + mes*30 + dias

		escreva("\nTotal de dias: ",total)
		
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 220; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */