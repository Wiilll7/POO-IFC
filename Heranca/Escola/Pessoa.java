package MainPackage.Heranca.Escola;

public class Pessoa {

	private int codigo;
	private String nome;
	private String endereco;
	
	public Pessoa(int codigo, String nome, String endereco) {
		setCodigo(codigo);
		setNome(nome);
		setEndereco(endereco);
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		if (codigo > 0)
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome.length() > 3)
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		if (endereco.length() > 3)
		this.endereco = endereco;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [codigo=");
		builder.append(codigo);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", endereco=");
		builder.append(endereco);
		builder.append("]");
		return builder.toString();
	}
	
}
