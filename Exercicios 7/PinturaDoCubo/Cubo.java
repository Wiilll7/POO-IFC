package exercicios7.PinturaDoCubo;

public class Cubo {
	
	private float a;
	private float rendimento;
	private int tipo;
	private final int CON = 3;
	
	public float getA() {
		return a;
	}
	public void setA(float a) {
		if (a > 0) {
			this.a = a;
		}
	}
	public float getRendimento() {
		return rendimento;
	}
	public void setRendimento(float rendimento) {
		if (rendimento > 0) {
			this.rendimento = rendimento;
		}
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		if (tipo > 0 && tipo <= CON) {
			this.tipo = tipo;
		}
	}
	
	public float areaBase() {
		return a*a;
	}
	
	public float areaTotal() {
		return areaBase() * 6;
	}
	
	public double volume() {
		return Math.pow(a, CON);
	}
	
	public double diagonalCubo() {
		return a * Math.sqrt(CON);
	}
	
	public float litrosTinta() {
		return areaTotal() / rendimento;
	}
	
	public int latasTinta() {
		int qnt = 0; 
		qnt += (litrosTinta()/18) + 1;
		return qnt;
	}
	
	public float valorTotal() {
		float res = 0;
		switch (tipo) {
		case 1:
			res = latasTinta() * 101.90f;
			break;
		case 2:
			res = latasTinta() * 212.45f;
			break;
		case 3:
			res = latasTinta() * 345.56f;
			break;
		}
		return res;
	}
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("a: ");
		builder.append(a);
		builder.append("\nRendimento: ");
		builder.append(rendimento);
		builder.append("\nTipo de Tinta: ");
		builder.append(tipo);
		builder.append("\n-----------------------");
		builder.append("\nArea da Base: ");
		builder.append(areaBase());
		builder.append("\nArea Total: ");
		builder.append(areaTotal());
		builder.append("\nVolume: ");
		builder.append(volume());
		builder.append("\nDiagonal do Cubo: ");
		builder.append(diagonalCubo());
		builder.append("\nLitros de Tinta: ");
		builder.append(litrosTinta());
		builder.append("\nLatas de Tinta: ");
		builder.append(latasTinta());
		builder.append("\nValor Total: ");
		builder.append(valorTotal());
		return builder.toString();
	}
}
