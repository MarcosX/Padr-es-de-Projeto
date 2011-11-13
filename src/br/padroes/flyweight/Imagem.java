package br.padroes.flyweight;

//Estado extrínseco
public class Imagem {
	protected String nomeDaImagem;

	public Imagem(String imagem) {
		nomeDaImagem = imagem;
	}

	public void desenharImagem() {
		System.out.println(nomeDaImagem + " desenhada!");
	}
}
