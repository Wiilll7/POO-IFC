package MainPackage.AgregacaoComposicao.ContaAvancada;

public class CartaoCredito {

	private int numero;
	private String operadora;
	private double limite;
	private String tipoCartao;
	
	public CartaoCredito(int numero, double limite, String operadora, String tipoCartao) {
		setNumero(numero);
		setLimite(limite);
		setOperadora(operadora);
		setTipoCartao(tipoCartao);
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getOperadora() {
		return operadora;
	}
	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public String getTipoCartao() {
		return tipoCartao;
	}
	public void setTipoCartao(String tipoCartao) {
		this.tipoCartao = tipoCartao;
	}
	
}
