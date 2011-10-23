package br.padroes.iteratorExterno;

public class CanaisFilmes implements AgregadoDeCanais {

	protected Canal[] canais;

	public CanaisFilmes() {
		canais = new Canal[4];
		canais[0] = new Canal("Cinemax");
		canais[1] = new Canal("HBO");
		canais[2] = new Canal("FOX");
		canais[3] = new Canal("Sony");
	}

	@Override
	public IteradorInterface criarIterator() {
		return new IteradorMatrizDeCanais(canais);
	}
}
