package questao3;

import questao3.SegundoMaiorElemento;;

public class Principal {
	
	public static void main(String[] args) {
		SegundoMaiorElemento s = new SegundoMaiorElemento();
		
		s.adicionarNumero(5);
		s.adicionarNumero(7);
		s.adicionarNumero(9);
		s.adicionarNumero(3);
		
		System.out.println(s.descobrirSegundoMaior());

	}

}
