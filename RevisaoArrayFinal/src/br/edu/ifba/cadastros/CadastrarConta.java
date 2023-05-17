package br.edu.ifba.cadastros;

import java.util.Arrays;

import br.edu.ifba.basicas.Conta;

public class CadastrarConta {

	Conta[] listaConta = new Conta[3];
	int total = 0;

	public String listarContas() {
		return Arrays.toString(this.listaConta);
	}

	public void adicionarConta(Conta conta) {
		aumentarVetor();
		
		this.listaConta[this.total] = conta;
		this.total++;

	}

	public void adicionarPorPosicao(Conta conta, int posicao) {
		aumentarVetor();

		for (int i = this.total - 1; i >= posicao; i--) {
			this.listaConta[i + 1] = this.listaConta[i];
		}

		this.listaConta[posicao] = conta;
		this.total++;

	}

	public void removerPorPosicao(int posicao) {
		aumentarVetor();

		for (int i = posicao; i < this.total - 1; i++) {
			this.listaConta[i] = this.listaConta[i + 1];
		}

		this.listaConta[this.total - 1] = null;
		this.total--;

	}

	public Conta procurarConta(int posicao) {
		return this.listaConta[posicao];
	}

	public Conta procurar(String nome) {
		
		for (int i = 0; i < this.total; i++) {
			if (this.listaConta[i].getNome().equals(nome)) {
				return this.listaConta[i];
			}
		}

		return null;
	}

	private void aumentarVetor() {

		if (this.listaConta.length == this.total) {

			Conta[] newConta = new Conta[this.listaConta.length * 2];
			System.arraycopy(listaConta, 0, newConta, 0, this.listaConta.length);

			this.listaConta = newConta;

		}

	}
}
