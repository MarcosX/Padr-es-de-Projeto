package br.padroes.iteratorExterno;

public interface IteradorInterface {
	void first();

	void next();

	boolean isDone();

	Canal currentItem();
}
