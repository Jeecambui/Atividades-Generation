programa
{
	// Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, 
	// P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula que efetua tal cálculo é:
	funcao inicio()
	{
		real x1,x2,y1,y2,d
		
		escreva("\nQual valor de X1?: ")
		leia(x1)
		escreva("\nQual valor de X2?: ")
		leia(x2)
		escreva("\nQual valor de Y1?: ")
		leia(y1)
		escreva("\nQual valor de Y2?: ")
		leia(y2)
		limpa()

		d = (x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)
		escreva("\nA Fórmula que efetua o cálculo é de: ", d)	

		
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 441; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */