package Polimorfismo;

public class TesteSistema {

	public static void main(String[] args) {

		Gerente g = new Gerente();
		g.setSenha(1234);
		
		//SistemaInterno sistema = new SistemaInterno();
		
		//Cliente c = new Cliente();
		//c.setSenha(2222);
		
		//sistema.autentica(g);
		//sistema.autentica(c);
		
		g.autentica(1234);
		
	}

}
