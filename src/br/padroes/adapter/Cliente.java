package br.padroes.adapter;

public class Cliente {
	public static void main(String[] args) {
		ImagemTarget imagem = new SDLImagemAdapter();
		imagem.carregarImagem("teste.png");
		imagem.desenharImagem(0, 0, 10, 10);

		imagem = new OpenGLImageAdapter();
		imagem.carregarImagem("teste.png");
		imagem.desenharImagem(0, 0, 10, 10);
	}
}
