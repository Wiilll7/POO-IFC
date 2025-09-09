package exercicios6.Atv5;

public class Cardapio {

	private int codigo;
	private int qnt;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getQnt() {
		return qnt;
	}
	public void setQnt(int qnt) {
		this.qnt = qnt;
	}
	
	public float valor() {
		float res = 0;
		
		switch (codigo) {
		case 100:
			res = qnt * 1.2f;
			break;
		
		case 101:
			res = qnt * 1.3f;
			break;
			
		case 102:
			res = qnt * 1.5f;
			break;
			
		case 103:
			res = qnt * 1.2f;
			break;
			
		case 104:
			res = qnt * 1.3f;
			break;
			
		case 105:
			res = qnt;
			break;
		}
		
		return res;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Quantidade: ");
		builder.append(qnt);
		builder.append("\nValor: R$");
		builder.append(valor());
		return builder.toString();
	}
	
	
	
}
