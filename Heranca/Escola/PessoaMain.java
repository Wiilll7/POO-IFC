package MainPackage.Heranca.Escola;

public class PessoaMain {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa(10, "Elano", "Rua uruguai");
		System.out.println(p);
		
		Aluno a = new Aluno(11, "Willian", "Rua Uruguai");
		a.setMatricula(150);
		System.out.println(a);
		
		Professor pr = new Professor(12, "Curvello", "Rua Carlos");
		pr.setDisciplina("POO-I");
		System.out.println(pr);

	}

}
