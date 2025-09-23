package MainPackage.Heranca.Simples;

public class ContaSimples extends Conta {

	private double saldoPoupanca;
	
	public ContaSimples(String banco, int agencia, int numeroConta, double saldo) {
		super(banco, agencia, numeroConta, saldo);
	}

	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}

	public void setSaldoPoupanca(double saldoPoupanca) {
		if (saldoPoupanca >= 0)
		this.saldoPoupanca = saldoPoupanca;
	}
	
	public boolean depositoPoupanca(double valor) {
		boolean v = true;
		if (valor <= 0) {
			v = false;
		} else {
			saldoPoupanca += valor;
		}
		return v;
	}
	
	public boolean saquePoupanca(double valor) {
		boolean v = true;
		if (valor <= 0 || valor > saldoPoupanca) {
			v = false;
		} else {
			saldoPoupanca -= valor;
		}
		return v;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaSimples [saldoPoupanca=");
		builder.append(saldoPoupanca);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
