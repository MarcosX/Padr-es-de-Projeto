package br.padroes.composite.seguro;

import java.util.ArrayList;

public class ArquivoComposite extends ArquivoComponent {
	protected ArrayList<ArquivoComponent> arquivos;

	public ArquivoComposite(String nomeDoArquivo) {
		this.nomeDoArquivo = nomeDoArquivo;
		arquivos = new ArrayList<ArquivoComponent>();
	}

	@Override
	public void printNomeDoArquivo() {
		System.out.println(this.nomeDoArquivo);
		for (ArquivoComponent arquivoTmp : arquivos) {
			arquivoTmp.printNomeDoArquivo();
		}
	}

	public void adicionar(ArquivoComponent novoArquivo) {
		this.arquivos.add(novoArquivo);
	}

	public void remover(String nomeDoArquivo) throws Exception {
		for (ArquivoComponent arquivoTmp : arquivos) {
			if (arquivoTmp.getNomedoArquivo() == nomeDoArquivo) {
				this.arquivos.remove(arquivoTmp);
				return;
			}
		}
		throw new Exception("Não existe este arquivo");
	}

	public ArquivoComponent getArquivo(String nomeDoArquivo) throws Exception {
		for (ArquivoComponent arquivoTmp : arquivos) {
			if (arquivoTmp.getNomedoArquivo() == nomeDoArquivo) {
				return arquivoTmp;
			}
		}
		throw new Exception("Não existe este arquivo");
	}
}
