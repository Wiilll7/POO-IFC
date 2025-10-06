package MainPackage.AgregacaoComposicao.HomeTheater;

public class SistemaSom extends EquipamentoEletronico {

	private String marca;
	private String modelo;
	private float potencia;
	
	public SistemaSom(float tensao, float consumo, String marca, String modelo, float potencia) {
		super(tensao, consumo);
		setMarca(marca);
		setModelo(modelo);
		setPotencia(potencia);
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
	public float getPotencia() {
		return potencia;
	}
	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SistemaSom [marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", potencia=");
		builder.append(potencia);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
