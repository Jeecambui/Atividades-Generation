programa
{
	
	funcao inicio()
	{
		inteiro ano,mes,dia,total

		escreva("\nEntre com total de dias: ")
		leia(total)

		ano = total / 365
		mes = (total % 365) / 30 
		dia = (total % 365) % 30 

		escreva("\nVoce viveu: ",ano, " anos, ",mes," mes e ",dia," dia de vida!!!")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */