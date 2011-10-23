package br.padroes.templateMethod;

public class OrdenadorPorAno extends OrdenadorTemplate {

	@Override
	public boolean isPrimeiro(MusicaMP3 musica1, MusicaMP3 musica2) {
		if (musica1.ano.compareToIgnoreCase(musica2.ano) <= 0) {
			return true;
		}
		return false;
	}

}
