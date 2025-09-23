package MainPackage.Heranca.Escola;

public class Aluno extends Pessoa {

	private int matricula;
	
	public Aluno(int codigo, String nome, String endereco) {
		super(codigo, nome, endereco);
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		if (matricula > 0)
		this.matricula = matricula;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aluno [matricula=");
		builder.append(matricula);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
