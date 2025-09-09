package exercicios6.Atv9;

public class Televisor {

	private int volume;
	private int canal;
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		this.canal = canal;
	}
	
	public void aumentarVolume(int volume) {
		if (volume > 0 && this.volume <= (100 - volume)) {
			this.volume += volume;
		}
	}
	
	public void diminuirVolume(int volume) {
		if (volume > 0 && this.volume >= volume) {
			this.volume -= volume;
		}
	}
	
	public void alterarCanal(int canal) {
		this.canal = canal;
	}
	
}
