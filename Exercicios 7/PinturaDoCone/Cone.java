package exercicios7.PinturaDoCone;

public class Cone {

	private float r;
	private float h;
	private int tipo;
	
	public float getR() {
		return r;
	}
	public void setR(float r) {
		if (r > 0) {
			this.r = r;
		}
	}
	public float getH() {
		return h;
	}
	public void setH(float h) {
		if (h > 0) {
			this.h = h;
		}
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		if (tipo > 0 && tipo < 4) {
			this.tipo = tipo;
		}
	}
	
	public double geratriz() {
		return Math.sqrt(Math.pow(r, 2)+(Math.pow(h, 2)));
	}
	
	public double areaFundo() {
		return 3.14*Math.pow(r, 2);
	}
	
	public double areaLateral() {
		return geratriz()*r*3.14;
	}
	
	public double areaTotal() {
		return 3.14*r*(r + geratriz());
	}
	
	public double litros() {
		return areaTotal()*3.45;
	}
	
	public int latas() {
		int res = 0; 
		res += (litros() / 18) + 1;
		return res;
	}
	
	public float valor() {
		float res = 0;
		switch (tipo) {
		case 1:
			res = latas()*238.90f;
			break;
		case 2: 
			res = latas()*467.98f;
			break;
		case 3:
			res = latas()*758.34f;
			break;
		}
		return res;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Raio: ");
		builder.append(r);
		builder.append("\nAltura: ");
		builder.append(h);
		builder.append("\nTipo: ");
		builder.append(tipo);
		builder.append("\n--------------------");
		builder.append("\nGeratriz: ");
		builder.append(geratriz());
		builder.append("\nArea do Fundo: ");
		builder.append(areaFundo());
		builder.append("\nArea da Lateral: ");
		builder.append(areaLateral());
		builder.append("\nArea Total: ");
		builder.append(areaTotal());
		builder.append("\n--------------------");
		builder.append("\nLitros: ");
		builder.append(litros());
		builder.append("\nLatas: ");
		builder.append(latas());
		builder.append("\n--------------------");
		builder.append("\nPreco Total: ");
		builder.append(valor());
		return builder.toString();
	}
	
}
