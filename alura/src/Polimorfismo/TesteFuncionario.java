package Polimorfismo;

public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario nico = new Editor();
		
		nico.setNome("Nico");
		nico.setCpf("40588877544");
		nico.setSalario(3500.00);
		
		Funcionario xis = new Gerente();
		xis.setSalario(1500);
		
		System.out.println(nico.getBonificacao());
		System.out.println(xis.getBonificacao());
		
	}

}
