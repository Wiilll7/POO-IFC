package exercicios6.Atv8;

public class Banco {

	private int numConta;
	private String nome;
	private float saldo;
	
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public void alteraNome(String nome) {
		if (nome != null) {
			this.nome = nome;
		}
	}
	
	public void deposito(float saldo) {
		if (saldo > 0) {
			this.saldo += saldo;
		}
	}
	
	public void saque(float saldo) {
		if (saldo > 0 && saldo <= this.saldo) {
			this.saldo -= saldo;
		}
	}
	
	
}
