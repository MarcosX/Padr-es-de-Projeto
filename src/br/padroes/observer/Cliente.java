package br.padroes.observer;

public class Cliente {
	public static void main(String[] args) {
		DadosSubject dados = new DadosSubject();
		dados.attach(new TabelaObserver(dados));
		dados.attach(new BarraObserver(dados));
		dados.attach(new PorcentoObserver(dados));

		dados.setState(new Dados(7, 3, 1));
		dados.setState(new Dados(2, 3, 1));
	}
}
