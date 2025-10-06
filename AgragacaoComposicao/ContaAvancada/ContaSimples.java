package MainPackage.AgregacaoComposicao.ContaAvancada;

public class ContaSimples extends ContaBancaria {

	private double saldoPoupanca;

	public ContaSimples(Banco banco, Pessoa correntista, int agencia, int numeroDaConta, double saldo, double saldoPoupanca) {
		super(banco, correntista, agencia, numeroDaConta, saldo);
		this.saldoPoupanca = saldoPoupanca;
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
		
		if (valor > 0) {
			saldoPoupanca += valor;
		} else {
			v = false;
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
