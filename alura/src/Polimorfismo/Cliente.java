package Polimorfismo;

public class Cliente implements Autenticavel {

	private Autenticador auth;
	
	public Cliente() {
		this.auth = new Autenticador();
	}
	
	@Override
	public void setSenha(int senha) {
		this.auth.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.auth.autentica(senha);
	}

	

}
