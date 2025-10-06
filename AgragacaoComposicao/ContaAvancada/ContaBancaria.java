package MainPackage.AgregacaoComposicao.ContaAvancada;

public class ContaBancaria {

	private Banco banco;
	private int agencia;
	private int numeroDaConta;
	private double saldo;
	private Pessoa correntista;
	
	public ContaBancaria(Banco banco, Pessoa correntista, int agencia, int numeroDaConta, double saldo) {
		this.banco = banco;
		this.correntista = correntista;
		setAgencia(agencia);
		setNumeroDaConta(numeroDaConta);
		setSaldo(saldo);
	}
	
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumeroDaConta() {
		return numeroDaConta;
	}
	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}
	public double getSalario() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean deposito(double valor) {
		boolean v = true;
		
		if (valor > 0) {
			saldo += valor;
		} else {
			v = false;
		}
		
		return v;
	}
	
	public boolean saque(double valor) {
		boolean v = true;
		
		if (valor <= 0 || valor > saldo) {
			v = false;
		} else {
			saldo -= valor;
		}
		
		return v;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaBancaria [banco=");
		builder.append(banco);
		builder.append(", agencia=");
		builder.append(agencia);
		builder.append(", numeroDaConta=");
		builder.append(numeroDaConta);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append(", correntista=");
		builder.append(correntista);
		builder.append("]");
		return builder.toString();
	}
	
}
