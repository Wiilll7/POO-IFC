package MainPackage.AgregacaoComposicao.Computador;

public class Teclado {

	private String marca;
	private String tipo;
	
	public Teclado(String marca, String tipo) {
		this.marca = marca;
		this.tipo = tipo;
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

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Teclado [marca=");
		builder.append(marca);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append("]");
		return builder.toString();
	}
	
}
