package MainPackage.AgregacaoComposicao.CarroMotorPessoa;

public class Carro {
	
	private String fabricante;
	private String modelo;
	private String cor;
	private int ano;
	private Pessoa dono;
	private Motor motor;
	
	public Carro(Pessoa dono, Motor motor, String fabricante, String modelo, String cor, int ano) {
		this.dono = dono;
		this.motor = motor;
		setFabricante(fabricante);
		setModelo(modelo);
		setCor(cor);
		setAno(ano);
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Carro [fabricante=");
		builder.append(fabricante);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", cor=");
		builder.append(cor);
		builder.append(", ano=");
		builder.append(ano);
		builder.append(", dono=");
		builder.append(dono);
		builder.append(", motor=");
		builder.append(motor);
		builder.append("]");
		return builder.toString();
	}
	
}
