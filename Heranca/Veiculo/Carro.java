package MainPackage.Heranca.Veiculo;

public class Carro extends Veiculo {

	private int portas;
	
	public Carro(boolean motor) {
		super(motor);
	}

	public int getPortas() {
		return portas;
	}

	public void setPortas(int portas) {
		if (portas > 0)
		this.portas = portas;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Carro [portas=");
		builder.append(portas);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
