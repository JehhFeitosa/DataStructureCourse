package application;

import vetores_e_matrizes.ExibeVetor;
import vetores_e_matrizes.PesquisaVetor;
import vetores_e_matrizes.TamanhoMatriz;

public class Program {

	public static void main(String[] args) {

		ExibeVetor exibe = new ExibeVetor();
		exibe.inicio();
		
		PesquisaVetor pesquisa = new PesquisaVetor();
		pesquisa.inicio();
		
		TamanhoMatriz tamMatriz = new TamanhoMatriz();
		tamMatriz.inicio();
	}

}
