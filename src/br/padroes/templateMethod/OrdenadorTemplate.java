package br.padroes.templateMethod;

import java.util.ArrayList;

public abstract class OrdenadorTemplate {
	public abstract boolean isPrimeiro(MusicaMP3 musica1, MusicaMP3 musica2);

	protected ArrayList<MusicaMP3> ordenarMusica(ArrayList<MusicaMP3> lista) {
		ArrayList<MusicaMP3> novaLista = new ArrayList<MusicaMP3>();
		for (MusicaMP3 musicaMP3 : lista) {
			novaLista.add(musicaMP3);
		}

		for (int i = 0; i < novaLista.size(); i++) {
			for (int j = i; j < novaLista.size(); j++) {
				if (!isPrimeiro(novaLista.get(i), novaLista.get(j))) {
					MusicaMP3 temp = novaLista.get(j);
					novaLista.set(j, novaLista.get(i));
					novaLista.set(i, temp);
				}
			}
		}

		return novaLista;
	}
}
