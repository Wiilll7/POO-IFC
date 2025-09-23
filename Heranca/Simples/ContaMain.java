package MainPackage.Heranca.Simples;

public class ContaMain {

	public static void main(String[] args) {
		
		Conta c = new Conta("Viacredi", 015, 15, 500);
		c.deposito(200);
		c.saque(300);
		System.out.println(c);
		
		ContaEspecial ce = new ContaEspecial("Viacredi", 015, 15, 500);
		ce.setDiasSemJuros(5);
		ce.setLimite(1000);
		System.out.println(ce);
		
		ContaSimples cs = new ContaSimples("Viacredi", 015, 15, 500);
		cs.setSaldoPoupanca(1000);
		cs.deposito(200);
		cs.saque(100);
		System.out.println(cs);

	}

}
