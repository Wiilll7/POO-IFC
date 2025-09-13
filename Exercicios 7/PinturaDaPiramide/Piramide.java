package exercicios7.PinturaDaPiramide;

public class Piramide {

	private float h;
	private float ab;
	private int tipo;
	private final int CON = 2;
	
	public float getH() {
		return h;
	}
	public void setH(float h) {
		if (h > 0) {
			this.h = h;
		}
	}
	public float getAb() {
		return ab;
	}
	public void setAb(float ab) {
		if (ab > 0) {
			this.ab = ab;
		}
	}
	public float getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		if (tipo > 0 && tipo < 4) {
			this.tipo = tipo;
		}
	}
	
	public double al() {
		return Math.sqrt(Math.pow(h, CON)+Math.pow(ab, CON));
	}
	
	public double areaTriangulo() {
		return (ab*al());
	}
	
	public float areaBase() {
		return (ab*ab)*4;
	}
	
	public double areaTotal() {
		return areaBase() + (areaTriangulo()*4);
	}
	
	public double litros() {
		return areaTotal() / 4.76;
	}
	
	public float latas() {
		int res = 0;
		res += (litros()/18)+1;
		return res;
	}
	
	public float valor() {
		float res = 0;
		switch(tipo) {
		case 1:
			res = latas() * 127.90f;
			break;
		case 2:
			res = latas() * 258.98f;
			break;
		case 3:
			res = latas() * 344.34f;
			break;
		}
		return res;
	}
	
	public float volume() {
		return (areaBase() / 3) * h;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("h: ");
		builder.append(h);
		builder.append("\nab: ");
		builder.append(ab);
		builder.append("\ntipo: ");
		builder.append(tipo);
		builder.append("\nal: ");
		builder.append(al());
		builder.append("\nArea do Triangulo: ");
		builder.append(areaTriangulo());
		builder.append("\nArea da Base:");
		builder.append(areaBase());
		builder.append("\nArea Total: ");
		builder.append(areaTotal());
		builder.append("\nLitros: ");
		builder.append(litros());
		builder.append("\nLatas: ");
		builder.append(latas());
		builder.append("\nValor: ");
		builder.append(valor());
		builder.append("\nVolume: ");
		builder.append(volume());
		return builder.toString();
	}
	
	
}
