package MainPackage.Heranca.NaveEspacial;

public class NaveEspacial {

	private double velocidadeMaxima;
	
	public NaveEspacial(double velocidade) {
		setVelocidadeMaxima(velocidade);
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		if (velocidadeMaxima > 0)
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("NaveEspacial [velocidadeMaxima=");
		builder.append(velocidadeMaxima);
		builder.append("]");
		return builder.toString();
	}
	
}
