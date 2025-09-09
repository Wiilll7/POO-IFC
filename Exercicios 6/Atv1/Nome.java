package exercicios6.Atv1;

public class Nome {
	
	private String primeiroNome;
	private String sobreNome;
	
	public String getPrimeiroNome() {
		return primeiroNome;
	}
	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String nomeCompleto() {
		return primeiroNome+" "+sobreNome;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Seu nome completo é: ");
		builder.append(nomeCompleto());
		return builder.toString();
	}
	
}
