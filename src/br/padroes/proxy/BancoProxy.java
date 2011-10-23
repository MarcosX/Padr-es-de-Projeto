package br.padroes.proxy;

public class BancoProxy extends BancoUsuarios {

	protected String usuario, senha;

	public BancoProxy(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}

	@Override
	public String getNumeroDeUsuarios() {
		if (temPermissaoDeAcesso()) {
			return super.getNumeroDeUsuarios();
		}
		return null;
	}

	@Override
	public String getUsuariosConectados() {
		if (temPermissaoDeAcesso()) {
			return super.getUsuariosConectados();
		}
		return null;
	}

	private boolean temPermissaoDeAcesso() {
		return usuario == "admin" && senha == "admin";
	}
}
