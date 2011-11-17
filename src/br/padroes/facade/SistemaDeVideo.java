package br.padroes.facade;

public class SistemaDeVideo {
	public void configurarResolucao() {
		System.out.println("Resolução configurada");
	}

	public void configurarCores() {
		System.out.println("Esquema de cores configurado");
	}

	public void renderizarImagem(String imagem) {
		System.out.println("Imagem: " + imagem + " renderizada");
	}

}
