package br.padroes.iteratorInterno;

import br.padroes.iteratorExterno.AgregadoDeCanais;
import br.padroes.iteratorExterno.CanaisEsportes;
import br.padroes.iteratorExterno.CanaisFilmes;

public class Main {
	public static void main(String[] args) {
		AgregadoDeCanais canaisDeEsportes = new CanaisEsportes();
		System.out.println("Canais de Esporte:");
		IteradorInterno it = new IteradorPrint(canaisDeEsportes.criarIterator());
		it.percorrerLista();

		AgregadoDeCanais canaisDeFilmes = new CanaisFilmes();
		System.out.println("\nCanais de Filmes:");
		it = new IteradorPrint(canaisDeFilmes.criarIterator());
		it.percorrerLista();
	}
}
