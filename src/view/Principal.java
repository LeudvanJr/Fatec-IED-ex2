package view;

import controller.VetorController;

public class Principal {

	public static void main(String[] args) {
		
		VetorController vController = new VetorController();
		int[] vetor = {-1, 1, 8, -20, 2, 3};
		
		int resultado = vController.menorValor(vetor, 6, 3);
		System.out.println(resultado);
	}

}
