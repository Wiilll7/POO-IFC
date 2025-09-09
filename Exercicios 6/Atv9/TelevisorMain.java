package exercicios6.Atv9;

public class TelevisorMain {

	public static void main(String[] args) {
		
		Televisor televisao = new Televisor();
		
		televisao.setCanal(2);
		televisao.setVolume(50);
		
		System.out.println(televisao.getCanal());
		System.out.println(televisao.getVolume());
		
		televisao.alterarCanal(5);
		System.out.println(televisao.getCanal());
		
		televisao.aumentarVolume(9);
		System.out.println(televisao.getVolume());
		
		televisao.diminuirVolume(8);
		System.out.println(televisao.getVolume());
		
	}

}
