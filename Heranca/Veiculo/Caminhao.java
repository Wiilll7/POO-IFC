package MainPackage.Heranca.Veiculo;

public class Caminhao extends Veiculo {

	private int eixos;
	
	public Caminhao(boolean motor) {
		super(motor);
	}

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		if (eixos > 0)
		this.eixos = eixos;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Caminhao [eixos=");
		builder.append(eixos);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
