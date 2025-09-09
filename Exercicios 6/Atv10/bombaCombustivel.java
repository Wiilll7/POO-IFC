package exercicios6.Atv10;

public class bombaCombustivel {

	private String tipoCombustivel;
	private float valorLitro;
	private float quantidadeCombustivel;
	
	public String getTipoCombustivel() {
		return tipoCombustivel;
	}
	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	public float getValorLitro() {
		return valorLitro;
	}
	public void setValorLitro(float valorLitro) {
		this.valorLitro = valorLitro;
	}
	public float getQuantidadeCombustivel() {
		return quantidadeCombustivel;
	}
	public void setQuantidadeCombustivel(float quantidadeCombustivel) {
		this.quantidadeCombustivel = quantidadeCombustivel;
	}
	
	public float abastecerPorValor(float valor) {
		quantidadeCombustivel -= valor/valorLitro;
		return valor/valorLitro;
	}
	
	public float abastecerPorLitro(float litros) {
		quantidadeCombustivel -= litros;
		return litros * valorLitro;
	}
	
	public void alterarValor(float valor) {
		valorLitro = valor;
	}
	
	public void alterarCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	
}
