package br.padroes.composite.seguro;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// O cliente precisa conhecer a implementação das classes concretas,
		// pois a interface de um ArquivoVideo é diferente de um
		// ArquivoComposite
		ArquivoComponent meuVideo = new ArquivoVideo("meu video.rmvb");
		ArquivoComponent meuOutroVideo = new ArquivoVideo("novo video.rmvb");
		// No entanto previne que o usuário possa fazer esse tipo de chamada:
		// meuVideo.adicionar(meuOutroVideo);

		ArquivoComponent minhaPasta = new ArquivoComposite("minha pasta/");

		// Para utilizar os métodos específicos de um composite é necessário
		// realizar um cast. Mas é preciso ter certeza que o objeto pode ser
		// convertido, caso contrário uma exceção será disparada
		((ArquivoComposite) minhaPasta).adicionar(meuVideo);
		((ArquivoComposite) minhaPasta).adicionar(meuOutroVideo);
		minhaPasta.printNomeDoArquivo();

	}

}
