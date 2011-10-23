package br.padroes.templateMethod;

public class OrdenadorPorNome extends OrdenadorTemplate {

	@Override
	public boolean isPrimeiro(MusicaMP3 musica1, MusicaMP3 musica2) {
		if (musica1.nome.compareToIgnoreCase(musica2.nome) <= 0) {
			return true;
		}
		return false;
	}

}
