package br.padroes.visitor;

public class ArvoreBinaria {
	No raiz;
	int quantidadeDeElementos;

	public ArvoreBinaria(int chaveRaiz) {
		raiz = new No(chaveRaiz);
		quantidadeDeElementos = 0;
	}

	public void inserir(int chave) {
		inserir(chave, raiz);
	}
	
	public void remover(int chave){
	}
	
	public void buscar(int chave){
		
	}

	private void inserir(int chave, No no) {
		if (no.getChave() == chave)
			return;
		if (chave > no.getChave()) {
			if (no.getDireito() == null) {
				no.setDireito(new No(chave));
				quantidadeDeElementos++;
				return;
			}
			inserir(chave, no.getDireito());
		} else {
			if (no.getEsquerdo() == null) {
				no.setEsquerdo(new No(chave));
				quantidadeDeElementos++;
				return;
			}
			inserir(chave, no.getEsquerdo());
		}
	}

	public void aceitarVisitante(ArvoreVisitor visitor) {
		visitor.visitar(raiz);
	}
}
