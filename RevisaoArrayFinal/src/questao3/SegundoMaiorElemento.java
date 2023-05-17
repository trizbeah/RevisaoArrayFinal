package questao3;

public class SegundoMaiorElemento {

	private int[] vetorNumero = new int[4];
	private int total = 0;

	public void adicionarNumero(int numero) {
		this.vetorNumero[total] = numero;
		total++;
	}
	
	public int descobrirSegundoMaior() {
		int m = 0;
		int m2 = 0;
		
		for (int i = 0; i < vetorNumero.length; i++) {
			if(m < vetorNumero[1]) {
				m = vetorNumero[i];
			}
			
		}
		
		for(int j = 0; j < vetorNumero.length; j++) {
			if(m2 < vetorNumero[j] && vetorNumero[j] != m) {
				m2 = vetorNumero[j];
			}
		}
		 return m2;
	}
}