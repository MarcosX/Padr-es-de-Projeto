package br.padroes.interpreter;

public abstract class NumeroRomanoInterpreter {
	public void interpretar(Contexto contexto) {
		if (contexto.getInput().length() == 0) {
			return;
		}
		// Os valores nove e quatro são os únicos que possuem duas casas
		// Ex: IV, IX
		if (contexto.getInput().startsWith(nove())) {
			adicionarValorOutput(contexto, 9);
			consumirDuasCasasDoInput(contexto);
		} else if (contexto.getInput().startsWith(quatro())) {
			adicionarValorOutput(contexto, 4);
			consumirDuasCasasDoInput(contexto);
		} else if (contexto.getInput().startsWith(cinco())) {
			adicionarValorOutput(contexto, 5);
			consumirUmaCasaInput(contexto);
		}
		// Os valores de um são os únicos que repetem, ex: III, CCC, MMM
		while (contexto.getInput().startsWith(um())) {
			adicionarValorOutput(contexto, 1);
			consumirUmaCasaInput(contexto);
		}
	}

	private void consumirUmaCasaInput(Contexto contexto) {
		contexto.setInput(contexto.getInput().substring(1));
	}

	private void consumirDuasCasasDoInput(Contexto contexto) {
		contexto.setInput(contexto.getInput().substring(2));
	}

	private void adicionarValorOutput(Contexto contexto, int numero) {
		contexto.setOutput(contexto.getOutput() + (numero * multiplicador()));
	}

	public abstract String um();

	public abstract String quatro();

	public abstract String cinco();

	public abstract String nove();

	public abstract int multiplicador();
}
