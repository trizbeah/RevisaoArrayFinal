package questao2;

public class NumBinDec {
	
	private int[] vetorBinario = new int [4];
	private int total = 0;
	
	public void adicionarNumero (int numero) {
		this.vetorBinario[total] = numero;
		total++;
	}
	
	public int conversor () {
		int calculo;
		int resultado = 0;
		int k = vetorBinario.length;
		
		for (int i = 0; i < vetorBinario.length; i++) {
			calculo = (int) (vetorBinario[i] * Math.pow(2, k - 1));
			resultado += calculo;
			k--;
			
		}
		
		return resultado;
	}

}
