package br.edu.ifba.principal;

import br.edu.ifba.basicas.Conta;
import br.edu.ifba.cadastros.CadastrarConta;

public class Principal {

	public static void main(String[] args) {

		CadastrarConta cc = new CadastrarConta();

		Conta c1 = new Conta("Bea", 400);
		Conta c2 = new Conta("Luana", 800);
		Conta c3 = new Conta("Murilo", 1600);
		Conta c4 = new Conta("Mainha", 60000);

		cc.adicionarConta(c1);
		cc.adicionarConta(c2);
		cc.adicionarConta(c3);

		System.out.println("Lista de Contas: " + cc.listarContas());

		cc.adicionarPorPosicao(c4, 1);

		System.out.println("Lista de Contas: " + cc.listarContas());

		cc.removerPorPosicao(0);

		System.out.println("Lista de Contas: " + cc.listarContas());

		System.out.println("Conta procurada por nome: " + cc.procurar("Murilo"));

		System.out.println("Conta procurada por posição: " + cc.procurarConta(2));

	}

}
