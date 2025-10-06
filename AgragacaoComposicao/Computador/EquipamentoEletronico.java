package MainPackage.AgregacaoComposicao.Computador;

public class EquipamentoEletronico {

	private float tensao;
	private float consumo;
	
	public EquipamentoEletronico(float tensao, float consumo) {
		this.tensao = tensao;
		this.consumo = consumo;
	}
	
	public float getTensao() {
		return tensao;
	}
	public void setTensao(float tensao) {
		this.tensao = tensao;
	}
	public float getConsumo() {
		return consumo;
	}
	public void setConsumo(float consumo) {
		this.consumo = consumo;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EquipamentoEletronico [tensao=");
		builder.append(tensao);
		builder.append(", consumo=");
		builder.append(consumo);
		builder.append("]");
		return builder.toString();
	}
	
}
