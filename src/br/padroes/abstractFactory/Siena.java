package br.padroes.abstractFactory;

public class Siena implements CarroSedan {

	@Override
	public void exibirInfoSedan() {
		System.out.println("Modelo: Siena\nFábrica: Fiat\nCategoria:Sedan");
	}

}
