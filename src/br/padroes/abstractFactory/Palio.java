package br.padroes.abstractFactory;

public class Palio implements CarroPopular {

	@Override
	public void exibirInfoPopular() {
		System.out.println("Modelo: Palio\nFábrica: Fiat\nCategoria:Popular");
	}

}
