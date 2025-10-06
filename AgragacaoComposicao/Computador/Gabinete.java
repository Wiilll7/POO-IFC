package MainPackage.AgregacaoComposicao.Computador;

public class Gabinete {

	private String modelo;
	private String tipo;
	private int balas;
	private PlacaMae placaMae;

	public Gabinete(String modelo, String tipo, int balas, PlacaMae placaMae) {
		this.modelo = modelo;
		this.tipo = tipo;
		this.balas = balas;
		this.placaMae = placaMae;
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
	public int getBalas() {
		return balas;
	}
	public void setBalas(int balas) {
		this.balas = balas;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Gabinete [modelo=");
		builder.append(modelo);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append(", balas=");
		builder.append(balas);
		builder.append(", placaMae=");
		builder.append(placaMae);
		builder.append("]");
		return builder.toString();
	}
	
}
