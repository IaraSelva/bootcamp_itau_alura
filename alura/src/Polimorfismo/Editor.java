package Polimorfismo;

public class Editor extends Funcionario {

	@Override
	public double getBonificacao() {
		System.out.println("Bonifica��o Editor");
		return 200;
	}

	
	
}
