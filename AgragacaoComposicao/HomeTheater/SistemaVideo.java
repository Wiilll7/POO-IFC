package MainPackage.AgregacaoComposicao.HomeTheater;

public class SistemaVideo extends EquipamentoEletronico {

	private String marca;
	private String modelo;
	private String tipo;
	private String resolucao;
	
	public SistemaVideo(float tensao, float consumo, String marca, String modelo, String tipo, String resolucao) {
		super(tensao, consumo);
		setMarca(marca);
		setModelo(modelo);
		setTipo(tipo);
		setResolucao(resolucao);
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
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

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SistemaVideo [marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append(", resolucao=");
		builder.append(resolucao);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
		
}
