package br.padroes.flyweight;

import br.padroes.flyweight.FlyweightFactory.Sprites;

public class Cliente {
	public static void main(String[] args) {
		FlyweightFactory factory = new FlyweightFactory();

		factory.getFlyweight(Sprites.CENARIO_1).desenharImagem(new Ponto(0, 0));

		factory.getFlyweight(Sprites.JOGADOR).desenharImagem(new Ponto(10, 10));

		factory.getFlyweight(Sprites.INIMIGO_1).desenharImagem(
				new Ponto(100, 10));
		factory.getFlyweight(Sprites.INIMIGO_1).desenharImagem(
				new Ponto(120, 10));
		factory.getFlyweight(Sprites.INIMIGO_1).desenharImagem(
				new Ponto(140, 10));

		factory.getFlyweight(Sprites.INIMIGO_2).desenharImagem(
				new Ponto(60, 10));
		factory.getFlyweight(Sprites.INIMIGO_2).desenharImagem(
				new Ponto(50, 10));

		factory.getFlyweight(Sprites.INIMIGO_3).desenharImagem(
				new Ponto(170, 10));
	}
}
