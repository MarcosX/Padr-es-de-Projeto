package br.padroes.singleton;

/**
 * @author Emanuell Faustino (emanuellfaustino@gmail.com)
 */
public class Documento implements Cloneable {

	private String texto;
	
	public Documento(String texto) {
		this.texto = texto;
	}
	
	public String getTexto() {
		return this.texto;
	}
	
	@Override
	public String toString() {
		return this.texto;
	}
	
	public Object clone() {
		return new Documento(this.texto);
	}
	
}
