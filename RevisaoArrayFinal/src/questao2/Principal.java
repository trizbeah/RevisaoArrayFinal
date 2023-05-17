package questao2;

public class Principal {
	
	public static void main(String[] args) {
		NumBinDec n = new NumBinDec();
		
		n.adicionarNumero(1);
		n.adicionarNumero(1);
		n.adicionarNumero(0);
		n.adicionarNumero(1);
		
		System.out.println(n.conversor());

	}

}
