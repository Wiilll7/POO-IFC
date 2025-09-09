package exercicios6.Atv8;

public class BancoMain {

	public static void main(String[] args) {
		
		Banco conta = new Banco();
		
		conta.setNome("Willian");
		conta.setNumConta(81);
		conta.setSaldo(800);
		
		System.out.println(conta.getNome());
		System.out.println(conta.getNumConta());
		System.out.println(conta.getSaldo());
		
		conta.alteraNome("Elano");
		System.out.println(conta.getNome());
		
		conta.deposito(200);
		System.out.println(conta.getSaldo());
		
		conta.saque(100);
		System.out.println(conta.getSaldo());
		
	}

}