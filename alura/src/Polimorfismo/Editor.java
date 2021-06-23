package Polimorfismo;

public class Editor extends Funcionario {

	@Override
	public double getBonificacao() {
		System.out.println("Bonificação Editor");
		return 200;
	}

	
	
}
