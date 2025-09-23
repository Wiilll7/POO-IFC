package MainPackage.Heranca.NaveEspacial;

public class Apollo11 extends NaveEspacial {

	private String tipoCombustivel;
	
	public Apollo11(double velocidade) {
		super(velocidade);
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		if (tipoCombustivel.length() > 3)
		this.tipoCombustivel = tipoCombustivel;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Apollo11 [tipoCombustivel=");
		builder.append(tipoCombustivel);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
