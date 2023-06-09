package br.edu.ifba.basicas;

public class Conta {

	private String nome;
	private int valor;

	public Conta() {
		super();
	}

	public Conta(String nome, int valor) {
		super();
		this.nome = nome;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Conta [nome=" + nome + ", valor=" + valor + "]";
	}

}
