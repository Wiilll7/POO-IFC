package MainPackage.Heranca.Ambiente;

public class Ambiente {

	private float area;

	public Ambiente(float area) {
		setArea(area);
	}
	
	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		if (area > 0)
		this.area = area;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ambiente [area=");
		builder.append(area);
		builder.append("]");
		return builder.toString();
	}
	
}
