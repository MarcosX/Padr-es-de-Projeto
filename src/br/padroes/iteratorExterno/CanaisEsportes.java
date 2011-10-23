package br.padroes.iteratorExterno;

import java.util.ArrayList;

public class CanaisEsportes implements AgregadoDeCanais {

	protected ArrayList<Canal> canais;

	public CanaisEsportes() {
		canais = new ArrayList<Canal>();
		canais.add(new Canal("Esporte ao vivo"));
		canais.add(new Canal("Basquete 2011"));
		canais.add(new Canal("Campeonato Italiano"));
		canais.add(new Canal("Campeonato Espanhol"));
		canais.add(new Canal("Campeonato Brasileiro"));
	}

	@Override
	public IteradorListaDeCanais criarIterator() {
		return new IteradorListaDeCanais(canais);
	}

}
