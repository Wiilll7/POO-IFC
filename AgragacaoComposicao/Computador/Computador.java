package MainPackage.AgregacaoComposicao.Computador;

public class Computador extends EquipamentoEletronico {

	private String marca;
	private String modelo;
	private Gabinete gabinete;
	private Teclado teclado;
	private Mouse mouse;
	private Monitor monitor;
	
	public Computador(float tensao, float consumo, String marca, String modelo, Gabinete gabinete, Teclado teclado, Mouse mouse, Monitor monitor) {
		super(tensao, consumo);
		this.marca = marca;
		this.modelo = modelo;
		this.gabinete = gabinete;
		this.teclado = teclado;
		this.mouse = mouse;
		this.monitor = monitor;
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
		builder.append("Computador [marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", gabinete=");
		builder.append(gabinete);
		builder.append(", teclado=");
		builder.append(teclado);
		builder.append(", mouse=");
		builder.append(mouse);
		builder.append(", monitor=");
		builder.append(monitor);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
