programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		real a,b,c,E,d,f,x,y

		escreva("\nEntre com o valor de A: ")
		leia(a)
		escreva("\nEntre com o valor de B: ")
		leia(b)
		escreva("\nEntre com o valor de C: ")
		leia(c)
		escreva("\nEntre com o valor de D: ")
		leia(d)
		escreva("\nEntre com o valor de E: ")
		leia(E)
		escreva("\nEntre com o valor de F: ")
		leia(f)
		escreva("\nEntre com o valor de X: ")
		leia(x)
		escreva("\nEntre com o valor de Y: ")
		leia(y)

		x = (c*E - b*f) / (a*E - b*d)
		y = (a*f - c*d) / (a*E - b*d)

		escreva("\nO valor de X é de : ",mat.arredondar(x,2))
		escreva("\nO valor de Y é de : ",mat.arredondar(y,2)
		)
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