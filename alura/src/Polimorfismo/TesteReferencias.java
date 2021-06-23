package Polimorfismo;

public class TesteReferencias {

	public static void main(String[] args) {

		
		Funcionario g1 = new Gerente();
		
		g1.setNome("Marcos");
		g1.setSalario(5000);
		
		//System.out.println(g1.getNome());
		//System.out.println(g1.getSalario());
				
		Editor e1 = new Editor();
		e1.setSalario(3500);
				
		ControleBonificacao controle = new ControleBonificacao();
		//controle.registra(g1);
		controle.registra(e1);
		
		System.out.println(controle.getSoma());
	}

}
