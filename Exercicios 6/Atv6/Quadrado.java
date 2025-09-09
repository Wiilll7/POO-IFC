package exercicios6.Atv6;

public class Quadrado {

	private int tamLado;

	public int getTamLado() {
		return tamLado;
	}

	public void setTamLado(int tamLado) {
		this.tamLado = tamLado;
	}
	
	public int retornaLado() {
		return tamLado;
	}
	
	public int area() {
		return tamLado*tamLado;
	}
	
	public void alterarLado(int tamLado) {
		this.tamLado = tamLado;
	}
	
}
