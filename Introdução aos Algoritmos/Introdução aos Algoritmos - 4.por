programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		inteiro a,b,c
		real r,s,d
	
		escreva("Defina um valor para A: ")
		leia(a)
		escreva("Defina um valor para B: ")
		leia(b)
		escreva("Defina um valor para C: ")
		leia(c)		

		r = mat.potencia((a + a),2)
		s = mat.potencia((b + c),2)
		d = (r+s) / 2

		escreva ("O valor de D é: ", mat.arredondar(d,2), " o valor de S é: ", mat.arredondar(s,2), " o valor de R é: ", mat.arredondar(r,2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 380; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */