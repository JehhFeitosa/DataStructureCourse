package vetores_e_matrizes;

import java.util.Scanner;

public class PesquisaVetor {

		public void inicio() {
		int vetor[] = { 1, 3, 5, 7, 9 };
		int numero;
		boolean achou = false;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual número deseja procurar?");
		numero = sc.nextInt();
		
		for (int i = 0; i < vetor.length; i++) {
			
			if(vetor[i] == numero) {
			System.out.println("Encontrado na posição: " + i);
			achou = true;
			}
		}
		
		if(achou == false) {
			System.out.println("o número não está no vetor");
		}
	}

}
