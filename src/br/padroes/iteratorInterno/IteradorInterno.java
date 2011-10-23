package br.padroes.iteratorInterno;

import br.padroes.iteratorExterno.Canal;
import br.padroes.iteratorExterno.IteradorInterface;

public abstract class IteradorInterno {

	IteradorInterface it;

	public void percorrerLista() {
		for (it.first(); !it.isDone(); it.next()) {
			operacao(it.currentItem());
		}
	}

	protected abstract void operacao(Canal canal);
}
