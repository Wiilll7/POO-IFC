package exercicios6.Atv7;

public class Pessoa {

	private String nome;
	private int idade;
	private float peso;
	private float altura;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public void engordar(float peso) {
		this.peso += peso;
	}
	
	public void emagrecer(float peso) {
		this.peso -= peso;
	}
	
	public void crescer(float altura) {
		this.altura += altura;
	}
	
	public void envelhecer(int idade) {
		this.idade += idade;
	}
	
}
