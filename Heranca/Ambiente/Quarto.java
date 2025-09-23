package MainPackage.Heranca.Ambiente;

public class Quarto extends Ambiente {

	private int capacidade;
	
	public Quarto(float area) {
		super(area);
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		if (capacidade > 0)
		this.capacidade = capacidade;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Quarto [capacidade=");
		builder.append(capacidade);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
