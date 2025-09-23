package MainPackage.Heranca.Veiculo;

public class Moto extends Veiculo {

	private int cilindradas;
	
	public Moto(boolean motor) {
		super(motor);
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		if (cilindradas > 0)
		this.cilindradas = cilindradas;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Moto [cilindradas=");
		builder.append(cilindradas);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
