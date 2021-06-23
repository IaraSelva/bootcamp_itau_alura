package Polimorfismo;

public class TesteGerente {

	public static void main(String[] args) {

		Gerente gerente = new Gerente();
		
		gerente.setNome("Marco");
		gerente.setCpf("2254123221");
		gerente.setSalario(5000);
		gerente.setSenha(666);
		
		System.out.println(gerente.getNome());
		System.out.println(gerente.getCpf());
		System.out.println(gerente.getSalario());
		System.out.println(gerente.getBonificacao());
		System.out.println(gerente.autentica(666));
	}

}
