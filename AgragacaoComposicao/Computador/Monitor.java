package MainPackage.AgregacaoComposicao.Computador;

public class Monitor {

	private String marca;
	private String tipo;
	private String resolucao;
	
	public Monitor(String marca, String tipo, String resolucao) {
		this.marca = marca;
		this.tipo = tipo;
		this.resolucao = resolucao;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getResolucao() {
		return resolucao;
	}
	public void setResolucao(String resolucao) {
		this.resolucao = resolucao;
	}
	
}
