programa
{
	inclua biblioteca Matematica -->mat
	
	funcao inicio()
	{
		real n1,n2,n3,n4,res1,res2,res3,res4

		escreva("\nDigite primeiro numero: ")
		leia(n1)
		escreva("\nDigite segundo numero: ")
		leia(n2)
		escreva("\nDigite terceiro numero: ")
		leia(n3)
		escreva("\nDigite quarto numero: ")
		leia(n4)

		res1 = mat.raiz(n1,2)
		escreva("\nA Raiz quadrada do primeiro número é: ",mat.arredondar(res1, 2))

		res2 = mat.raiz(n2,2)
		escreva("\nA Raiz quadrada do segundo número é: ",mat.arredondar(res2, 2))

		res3 = mat.raiz(n3,2)
		escreva("\nA Raiz quadrada do terceiro número é: ",mat.arredondar(res3, 2))

		res4 = mat.raiz(n4,2)
		escreva("\nA Raiz quadrada do quarto número é: ",mat.arredondar(res4, 2))

		se(res3>=1000)
		{
			escreva("\nO valor do terceiro é maior que 1000")
		}
		senao
		{
			escreva("\nRaiz quadrada do primeiro ", mat.arredondar(res1, 2), "\nRaiz quadrada do segundo ", mat.arredondar(res2, 2), "\nRaiz quadrada do terceiro",mat.arredondar(res3, 2), "\nRaiz quadrada do quarto",mat.arredondar(res4, 2), "\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 911; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */