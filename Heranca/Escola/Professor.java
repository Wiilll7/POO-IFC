package MainPackage.Heranca.Escola;

public class Professor extends Pessoa {

	private String disciplina;
	
	public Professor(int codigo, String nome, String endereco) {
		super(codigo, nome, endereco);
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		if (disciplina.length() > 3)
		this.disciplina = disciplina;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Professor [disciplina=");
		builder.append(disciplina);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
