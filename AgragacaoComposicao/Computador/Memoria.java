package MainPackage.AgregacaoComposicao.Computador;

public class Memoria {

	private String marca;
	private String modelo;
	private float capacidade;
	private float velocidade;
	
	public Memoria(String marca, String modelo, float capacidade, float velocidade) {
		this.marca = marca;
		this.modelo = modelo;
		this.capacidade = capacidade;
		this.velocidade = velocidade;
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
	public float getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(float capacidade) {
		this.capacidade = capacidade;
	}
	public float getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Memoria [marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", capacidade=");
		builder.append(capacidade);
		builder.append(", velocidade=");
		builder.append(velocidade);
		builder.append("]");
		return builder.toString();
	}
	
}
