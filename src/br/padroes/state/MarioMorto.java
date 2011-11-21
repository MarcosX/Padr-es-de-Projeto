package br.padroes.state;

public class MarioMorto implements MarioState {

	@Override
	public MarioState pegarCogumelo() {
		return null;
	}

	@Override
	public MarioState pegarFlor() {
		return null;
	}

	@Override
	public MarioState pegarPena() {
		return null;
	}

	@Override
	public MarioState levarDano() {
		return null;
	}

}
