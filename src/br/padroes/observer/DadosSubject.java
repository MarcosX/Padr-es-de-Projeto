package br.padroes.observer;

import java.util.ArrayList;

public class DadosSubject {

	protected ArrayList<DadosObserver> observers;
	protected Dados dados;

	public DadosSubject() {
		observers = new ArrayList<DadosObserver>();
	}

	public void attach(DadosObserver observer) {
		observers.add(observer);
	}

	public void detach(int indice) {
		observers.remove(indice);
	}

	public void setState(Dados dados) {
		this.dados = dados;
		notifyObservers();
	}

	private void notifyObservers() {
		for (DadosObserver observer : observers) {
			observer.update();
		}
	}

	public Dados getState() {
		return dados;
	}

}
