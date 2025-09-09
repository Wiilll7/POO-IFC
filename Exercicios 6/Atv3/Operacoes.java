package exercicios6.Atv3;

public class Operacoes {

	private int numUm;
	private int numDois;
	private int operacao;
	
	public int getNumUm() {
		return numUm;
	}
	public void setNumUm(int numUm) {
		this.numUm = numUm;
	}
	public int getNumDois() {
		return numDois;
	}
	public void setNumDois(int numDois) {
		this.numDois = numDois;
	}
	public int getOperacao() {
		return operacao;
	}
	public void setOperacao(int operacao) {
		this.operacao = operacao;
	}
	
	public int resultado() {
		int res = 0;
		
		switch (operacao){
		case 1:
			res = numUm + numDois;
			break;
		case 2:
			res = numUm - numDois;
			break;
		case 3:
			res = numUm * numDois;
			break;
		case 4:
			res = numUm / numDois;
			break;
		}
		
		return res;
	}
	
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		if (operacao > 0 && operacao < 5) {
			builder.append("O resultado é: "+resultado());
		} else {
			builder.append("Operação inválida.");
		}
		return builder.toString();
	}
	
}
