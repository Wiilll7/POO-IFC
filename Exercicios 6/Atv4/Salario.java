package exercicios6.Atv4;

public class Salario {

	private int hora;
	private float valorHora;
	
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public float getValorHora() {
		return valorHora;
	}
	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}
	
	public float salarioBruto() {
		return valorHora*hora;
	}
	
	public float salarioLiquido() {
		return salarioBruto() * 0.76f;
	}
	
	public float irPago() {
		return salarioBruto()*0.11f;
	}
	
	public float inssPago() {
		return salarioBruto()*0.08f;
	}
	
	public float sindicatoPago() {
		return salarioBruto()*0.05f;
	}
	
	public float totalDesconto() {
		return salarioBruto() - salarioLiquido();
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Salario Bruto: ");
		builder.append(salarioBruto());
		builder.append("\n Salario Liquido: ");
		builder.append(salarioLiquido());
		builder.append("\n IR pago: ");
		builder.append(irPago());
		builder.append("\n INSS pago: ");
		builder.append(inssPago());
		builder.append("\n Sindicato pago: ");
		builder.append(sindicatoPago());
		builder.append("\n Total de Desconto: ");
		builder.append(totalDesconto());
		return builder.toString();
	}
	
}
