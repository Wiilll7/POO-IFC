package MainPackage.AgregacaoComposicao.ContaAvancada;

public class ContaEspecial extends ContaBancaria {

	private int diasSemJuros;
	private double limite;
	private CartaoCredito cartao;
	
	public ContaEspecial(Banco banco, Pessoa correntista, int agencia, int numeroDaConta, double saldo, int diasSemJuros, double limite, CartaoCredito cartao) {
		super(banco, correntista, agencia, numeroDaConta, saldo);
		this.diasSemJuros = diasSemJuros;
		this.limite = limite;
		this.cartao = cartao;
	}
	
	public int getDiasSemJuros() {
		return diasSemJuros;
	}
	public void setDiasSemJuros(int diasSemJuros) {
		this.diasSemJuros = diasSemJuros;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaEspecial [diasSemJuros=");
		builder.append(diasSemJuros);
		builder.append(", limite=");
		builder.append(limite);
		builder.append(", cartao=");
		builder.append(cartao);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
