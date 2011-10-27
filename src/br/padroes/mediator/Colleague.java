package br.padroes.mediator;

public abstract class Colleague {
	protected Mediator mediator;

	public Colleague(Mediator m) {
		mediator = m;
	}

	public void enviarMensagem(String mensagem) {
		mediator.enviar(mensagem, this);
	}

	public abstract void receberMensagem(String mensagem);
}
