package br.padroes.singleton;


public class Main {

	public static void main(String[] args) {
		PrinterSpool printer = PrinterSpool.getInstance();
		Documento documento1 = new Documento("Doc1");
		Documento documento2 = new Documento("Doc2");
		
		printer.add(documento1);
		printer.add(documento2);
		
		System.out.println(printer);
		
		printer.imprimir();
		printer.imprimir();
		
		System.out.println(printer);
	}
	
}
