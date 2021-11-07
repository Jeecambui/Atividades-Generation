programa
{
	
	funcao inicio()
	{
		inteiro seg,min,hr,totalSeg, sobraHr, sobraMin

		escreva("\nInforme o tempo do evento: ")
		leia(totalSeg)
		hr = totalSeg /3600
		sobraHr = totalSeg - (hr*3600)
		min = sobraHr /60
		seg = sobraHr - (min*60)
		escreva("\nTempo do evento: ",hr , " h ", min , " min ", seg ," seg")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 319; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */