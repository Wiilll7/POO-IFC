package MainPackage.AgregacaoComposicao.ContaAvancada;

public class Main {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa("Willian", "Ituporanga");
		Banco b = new Banco(10, 015, "Itau");
		ContaBancaria cb = new ContaBancaria(b, p, 021, 181920, 350);
		ContaSimples cs = new ContaSimples(b, p, 021, 181920, 500, 600);
		CartaoCredito cc = new CartaoCredito(101010, 900, "Elo", "Debito");
		ContaEspecial ce = new ContaEspecial(b, p, 021, 01010101, 2390, 8, 3000, cc);
		System.out.println(cb);
		System.out.println(cs);
		System.out.println(ce);

	}

}
