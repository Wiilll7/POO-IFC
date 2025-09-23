package MainPackage.Heranca.Pessoa;

public class PessoaMain {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa("Rodrigo", "Rua Uruguai");
		System.out.println(p);
		
		PessoaFisica pf = new PessoaFisica("Rodrigo", "Rua Uruguai");
		pf.setCpf("021.132.199-05");
		pf.setEstadoCivil("Casado");
		System.out.println(pf);
		
		PessoaJuridica pj = new PessoaJuridica("Rodrigo", "Rua Uruguai");
		pj.setCnpj("12.345.678/0001-95");
		pj.setTipoEmpresa("Varejo");
		System.out.println(pj);

	}

}
