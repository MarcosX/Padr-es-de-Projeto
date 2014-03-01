package br.padroes.singleton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Emanuell Faustino (emanuellfaustino@gmail.com)
 */
public class PrinterSpool {
	
	private static PrinterSpool instancia;
	private List<Documento> fila;
	
	private PrinterSpool() {
		this.fila = new ArrayList<Documento>();
	}
	
	public synchronized static PrinterSpool getInstance() {
		if(instancia == null) {
			instancia = new PrinterSpool();
		}
		return instancia;
	}
	
	public void add(Documento documento) {
		this.fila.add((Documento) documento.clone());
	}
	
	public void imprimir() {
		this.fila.remove(0);
	}
	
	public List<Documento> getFila() {
		return new ArrayList<Documento>(this.fila);
	}
	
	@Override
	public String toString() {
		return Arrays.toString(this.fila.toArray());
	}
	
}
