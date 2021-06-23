package construtores;

public class TesteTributaveis {

	public static void main(String[] args) {

		
		ContaCorrente cc = new ContaCorrente(444, 12354);
		cc.deposita(500);
		cc.getSaldo();
		
		SeguroVida seguro = new SeguroVida();
		System.out.println(seguro.getValorImposto());
		
		CalculadorImposto calcula = new CalculadorImposto();
		calcula.regitra(cc);
		calcula.regitra(seguro);
		System.out.println(calcula.getTotalImposto());
		
		System.out.println(cc.getSaldo());
		
		System.out.println(cc.getValorImposto());
		
	}

}
