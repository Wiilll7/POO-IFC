package MainPackage.Heranca.Ambiente;

public class Sala extends Ambiente {

	private boolean tv;
	
	public Sala(float area) {
		super(area);
	}

	public boolean isTv() {
		return tv;
	}

	public void setTv(boolean tv) {
		this.tv = tv;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Sala [tv=");
		builder.append(tv);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
