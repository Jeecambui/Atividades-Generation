programa
{
	
	funcao inicio()
	{
		inteiro idade

		escreva("\nQual é a idade do nadador? ")
		leia(idade)
		
		se (idade>=5 e idade<=7)
		{
			escreva("\nVocê está na categoria Infantil A")
		}
		senao se(idade>=8 e idade<=11)
		{
			escreva("\nVocê está na categoria Infantil B")
		}
		senao se(idade>=12 e idade<=13)
		{
			escreva("\nVocê está na categoria Juvenil A")
		}
		senao se (idade>=14 e idade<=17)
		{
			escreva("\nVocê está na categoria Juvenil B")
		}
		senao se(idade>=18)
		{
			escreva("\nVocê está na categoria Adulto")
		}			
		senao
			escreva("\nInfelizmente não possui uma categoria pra sua idade ainda D:", "\nNão desanime, daqui algum tempo você poderá iniciar")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 630; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */