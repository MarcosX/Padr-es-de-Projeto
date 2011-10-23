package br.padroes.adapter;

public class OpenGLImageAdapter extends OpenGLImage implements ImagemTarget {

	@Override
	public void carregarImagem(String nomeDoArquivo) {
		glCarregarImagem(nomeDoArquivo);
	}

	@Override
	public void desenharImagem(int posX, int posY, int largura, int altura) {
		glDesenharImagem(posX, posY);
	}

}
