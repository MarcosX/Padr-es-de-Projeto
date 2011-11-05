package br.padroes.command;

public class Compra {
	private static int CONTADOR_ID;
	protected int idNotaFiscal;
	protected String nomeDaLoja;
	protected double valorTotal;

	public Compra(String nomeDaLoja) {
		this.nomeDaLoja = nomeDaLoja;
		idNotaFiscal = ++CONTADOR_ID;
	}

	public void setValor(double valor) {
		this.valorTotal = valor;
	}

	public String getInfoNota() {
		return new String("Nota fiscal nº: " + idNotaFiscal + "\nLoja: "
				+ nomeDaLoja + "\nValor: " + valorTotal);
	}
}
