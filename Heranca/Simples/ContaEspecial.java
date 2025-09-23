package MainPackage.Heranca.Simples;

public class ContaEspecial extends Conta {

	private int diasSemJuros;
	private double limite;
	
	ContaEspecial(String banco, int agencia, int numeroConta, double saldo) {
		super(banco, agencia, numeroConta, saldo);
	}

	public int getDiasSemJuros() {
		return diasSemJuros;
	}

	public void setDiasSemJuros(int diasSemJuros) {
		if (diasSemJuros > 0)
		this.diasSemJuros = diasSemJuros;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		if (limite > 0)
		this.limite = limite;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaEspecial [diasSemJuros=");
		builder.append(diasSemJuros);
		builder.append(", limite=");
		builder.append(limite);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
