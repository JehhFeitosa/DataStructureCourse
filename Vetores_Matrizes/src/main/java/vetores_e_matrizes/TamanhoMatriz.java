package vetores_e_matrizes;

import java.util.Random;

public class TamanhoMatriz {

	Random random = new Random();

	public void inicio() {

		int tamanho = 5;

		int[][] matriz = new int[tamanho][tamanho];

		for (int linha = 0; linha < tamanho; linha++) {

			for (int coluna = 0; coluna < tamanho; coluna++) {
				matriz[linha][coluna] = random.nextInt(9);
				System.out.print("[" + matriz[linha][coluna] + "]");
			}
			System.out.println();
		}
	}
}
