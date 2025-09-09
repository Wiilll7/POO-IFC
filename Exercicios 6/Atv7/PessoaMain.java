package exercicios6.Atv7;

public class PessoaMain {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		
		pessoa.setAltura(1.70f);
		pessoa.setIdade(18);
		pessoa.setNome("Willian");
		pessoa.setPeso(60);
		
		System.out.println(pessoa.getAltura());
		System.out.println(pessoa.getIdade());
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getPeso());
		
		pessoa.engordar(2);
		System.out.println(pessoa.getPeso());
		
		pessoa.emagrecer(4);
		System.out.println(pessoa.getPeso());
		
		pessoa.crescer(0.02f);
		System.out.println(pessoa.getAltura());
		
		pessoa.envelhecer(1);
		System.out.println(pessoa.getIdade());
		
	}

}
