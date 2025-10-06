package MainPackage.AgregacaoComposicao.ContaAvancada;

public class Banco {

	private int codigo;
	private String nome;
	private int numeroAgencias;
	
	public Banco(int codigo, int numeroAgencias, String nome) {
		setCodigo(codigo);
		setNumeroAgencias(numeroAgencias);
		setNome(nome);
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroAgencias() {
		return numeroAgencias;
	}
	public void setNumeroAgencias(int numeroAgencias) {
		this.numeroAgencias = numeroAgencias;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Banco [codigo=");
		builder.append(codigo);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", numeroAgencias=");
		builder.append(numeroAgencias);
		builder.append("]");
		return builder.toString();
	}
	
}
