package MainPackage.Heranca.Pessoa;

public class PessoaFisica extends Pessoa {

	private String cpf;
	private String estadoCivil;
	
	public PessoaFisica(String nome, String endereco) {
		super(nome, endereco);
	}

	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		if (cpf.length() > 10) {
			this.cpf = cpf;
		}
	}
	
	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		if (estadoCivil.length() > 1)
		this.estadoCivil = estadoCivil;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PessoaFisica [cpf=");
		builder.append(cpf);
		builder.append(", estadoCivil=");
		builder.append(estadoCivil);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
