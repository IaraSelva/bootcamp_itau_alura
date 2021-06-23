package Polimorfismo;

public class Gerente extends Funcionario implements Autenticavel {
	
	private Autenticador auth;
	
	private int senha;
	
	public Gerente() {
		this.auth = new Autenticador();
	}

	@Override
	public double getBonificacao() {
		System.out.println("Bonificação Gerente");		
		return super.getSalario() + 1000;
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public boolean autentica(int senha) {
		if(this.senha == senha){
			System.out.println("Acesso liberado");
			return true;
		}else {
			System.out.println("Acesso negado");
			return false;
		}
		
	}

}
