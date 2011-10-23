package br.padroes.templateMethod;

import java.util.ArrayList;

public class PlayList {
	protected ArrayList<MusicaMP3> musicas;
	protected OrdenadorTemplate ordenador;

	public PlayList(ModoDeReproducao modo) {
		musicas = new ArrayList<MusicaMP3>();
		switch (modo) {
		case porAno:
			ordenador = new OrdenadorPorAno();
			break;
		case porAutor:
			ordenador = new OrdenadorPorAutor();
			break;
		case porEstrela:
			ordenador = new OrdenadorPorEstrela();
			break;
		case porNome:
			ordenador = new OrdenadorPorNome();
			break;
		default:
			break;
		}
	}

	public void setModoDeReproducao(ModoDeReproducao modo) {
		ordenador = null;
		switch (modo) {
		case porAno:
			ordenador = new OrdenadorPorAno();
			break;
		case porAutor:
			ordenador = new OrdenadorPorAutor();
			break;
		case porEstrela:
			ordenador = new OrdenadorPorEstrela();
			break;
		case porNome:
			ordenador = new OrdenadorPorNome();
			break;
		default:
			break;
		}
	}

	public void adicionarMusica(String nome, String autor, String ano,
			int estrela) {
		musicas.add(new MusicaMP3(nome, autor, ano, estrela));
	}

	public void mostrarListaDeReproducao() {
		ArrayList<MusicaMP3> novaLista = new ArrayList<MusicaMP3>();
		novaLista = ordenador.ordenarMusica(musicas);

		for (MusicaMP3 musica : novaLista) {
			System.out.println(musica.nome + " - " + musica.autor + "\n Ano: "
					+ musica.ano + "\n Estrelas: " + musica.estrelas);
		}
	}
}
