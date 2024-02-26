package controller;

public class VetorController {
	
	public VetorController() {
		// TODO Auto-generated constructor stub
	}
	
	//Função para encontrar o menor valor em um vetor usando parametros especificos
	public int menorValor(int[] vetor, int tamanho, int menorValor) {
		
		//A condicao de parada se da quando nao restam numeros a serem comparados no vetor
		if(tamanho<=0)
			return menorValor;
		
		/*compara-se a ultima posicao do vetor com o menor valor registrado 
		e segue comparando com versoes menores do mesmo vetor*/ 
		if(vetor[tamanho-1] < menorValor)
			menorValor = vetor[tamanho-1];
		
		return menorValor(vetor, --tamanho, menorValor);
		
	}
}
