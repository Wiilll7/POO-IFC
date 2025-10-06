package MainPackage.AgregacaoComposicao.Computador;

public class PlacaMae {

	private String marca;
	private String modelo;
	private Processador processador;
	private HD hd;
	private Memoria memoria;
	
	public PlacaMae(String marca, String modelo, Processador processador, HD hd, Memoria memoria) {
		this.marca = marca;
		this.modelo = modelo;
		this.processador = processador;
		this.hd = hd;
		this.memoria = memoria;
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

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PlacaMae [marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", processador=");
		builder.append(processador);
		builder.append(", hd=");
		builder.append(hd);
		builder.append(", memoria=");
		builder.append(memoria);
		builder.append("]");
		return builder.toString();
	}
	
}
