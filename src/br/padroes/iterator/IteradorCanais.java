package br.padroes.iterator;

import java.util.ArrayList;

public class IteradorCanais {

	ArrayList<Canal> lista;
	int contador;

	protected IteradorCanais(ArrayList<Canal> lista) {
		this.lista = lista;
		contador = 0;
	}

	public void first() {
		contador = 0;
	}

	public void proximoCanal() {
		contador++;
	}

	public void voltarCanal() {
		contador--;
	}

	public boolean isDone() {
		return contador == lista.size();
	}

	private Canal currentItem() {
		if (isDone()) {
			contador = lista.size() - 1;
		} else if (contador < 0) {
			contador = 0;
		}
		return lista.get(contador);
	}

	public String getNomeCanal() {
		return currentItem().nome;
	}
}
