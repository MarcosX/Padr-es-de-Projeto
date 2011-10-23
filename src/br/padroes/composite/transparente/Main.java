package br.padroes.composite.transparente;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// O usuário do código não precisa saber detalhes das implementações dos
		// objetos. Consegue manipular os objetos a partir da interface comum:
		// ArquivoComponent.
		ArquivoComponent minhaPasta = new ArquivoComposite("Minha Pasta/");
		ArquivoComponent meuVideo = new ArquivoVideo("meu video.avi");
		ArquivoComponent meuOutroVideo = new ArquivoVideo("serieS01E01.mkv");

		try {
			// Como a interface define operações comuns a todos os arquivo é
			// possível tentar inserir um arquivo em um arquivo
			meuVideo.adicionar(meuOutroVideo);
		} catch (Exception e) {
			// No entanto você deve tratar este tipo de comportamento com
			// exceções ou outros métodos
			System.out.println(e.getMessage());
		}

		try {
			minhaPasta.adicionar(meuVideo);
			minhaPasta.adicionar(meuOutroVideo);
			minhaPasta.printNomeDoArquivo();
		} catch (Exception e) {
			// Não será executado pois minha pasta é um ArquivoComposite e
			// possui todas as operações de gerenciamento dos arquivos
			// implementadas.
			System.out.println(e.getMessage());
		}

		try {
			// O problema dessa implementação é que o usuário do código precisa
			// sempre verificar se pode realizar as operações, pois não se tem
			// certeza sobre o tipo do objeto utilizado
			System.out.println("\nPesquisando arquivos:");
			minhaPasta.getArquivo(meuVideo.getNomeDoArquivo())
					.printNomeDoArquivo();
			System.out.println("\nRemover arquivos");
			minhaPasta.remover(meuVideo.getNomeDoArquivo());
			minhaPasta.printNomeDoArquivo();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
