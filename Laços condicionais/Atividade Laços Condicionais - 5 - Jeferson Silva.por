programa
{
	
	funcao inicio()
	{
		real ip

		escreva("\nEntre com o índice de poluição: ")
		leia(ip)

		se(ip>=0.05 e ip<=0.25)
		{
			escreva("\nÍndice aceitável!!!")
		}
		senao se(ip>0.25 e ip<=0.3)
		{
			escreva("\n1º grupo são intimadas a suspenderem suas atividades")
		}
		senao se(ip>0.3 e ip<=0.4)
		{
			escreva("\n1º e 2º grupo são intimadas a suspenderem suas atividades,")
		}
		senao se(ip>0.4 e ip<=0.5)
		{
			escreva("\nTodos os grupos paralisem suas atividades")
		}
		senao
		{
			escreva("\nÍndice fora de notificação!!!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 465; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */