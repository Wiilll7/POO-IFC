package exercicios6.Atv2;

public class Intervalo {

	private int inicio;
	private int fim;
	
	public int getInicio() {
		return inicio;
	}
	public void setInicio(int inicio) {
		this.inicio = inicio;
	}
	
	public int getFim() {
		return fim;
	}
	public void setFim(int fim) {
		this.fim = fim;
	}
	
	public String numeros() {
		
		String intervalo = "";
		
		if (inicio > fim) {
			int troca = inicio;
			inicio = fim;
			fim = troca;
			System.out.println("Voce inseriu o intervalo ao contrario, foi realizado a inverção automaticamente.");
		}
		
		for (int i = inicio; i <= fim; i++) {
			intervalo += i+" ";
		}
		
		return intervalo;	
	}
	
	public String toString() {
		StringBuilder out = new StringBuilder();
		out.append("O intervalo é: ");
		out.append(numeros());
		return out.toString();
	}
	
}
