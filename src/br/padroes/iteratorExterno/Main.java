package br.padroes.iteratorExterno;

public class Main {
	public static void main(String[] args) {
		AgregadoDeCanais canaisDeEsportes = new CanaisEsportes();
		System.out.println("Canais de Esporte:");
		for (IteradorInterface it = canaisDeEsportes.criarIterator(); !it
				.isDone(); it.next()) {
			System.out.println(it.currentItem().nome);
		}

		AgregadoDeCanais canaisDeFilmes = new CanaisFilmes();
		System.out.println("\nCanais de Filmes:");
		for (IteradorInterface it = canaisDeFilmes.criarIterator(); !it
				.isDone(); it.next()) {
			System.out.println(it.currentItem().nome);
		}
	}
}
