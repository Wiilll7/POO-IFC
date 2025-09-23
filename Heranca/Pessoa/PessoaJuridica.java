package MainPackage.Heranca.Pessoa;

public class PessoaJuridica extends Pessoa {

	private String cnpj;
	private String tipoEmpresa;
	
	public PessoaJuridica(String nome, String endereco) {
		super(nome, endereco);
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		if (cnpj.length() > 14)
		this.cnpj = cnpj;
	}

	public String getTipoEmpresa() {
		return tipoEmpresa;
	}

	public void setTipoEmpresa(String tipoEmpresa) {
		if (tipoEmpresa.length() > 3)
		this.tipoEmpresa = tipoEmpresa;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PessoaJuridica [cnpj=");
		builder.append(cnpj);
		builder.append(", tipoEmpresa=");
		builder.append(tipoEmpresa);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
