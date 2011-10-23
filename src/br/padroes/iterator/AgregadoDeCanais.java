package br.padroes.iterator;

import java.util.ArrayList;

public abstract class AgregadoDeCanais {
	protected ArrayList<Canal> canais;

	public AgregadoDeCanais() {
		canais = new ArrayList<Canal>();
	}

	public int count() {
		return canais.size();
	}

	public IteradorCanais criarIterator() {
		return new IteradorCanais(canais);
	}
}
