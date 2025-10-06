package MainPackage.AgregacaoComposicao.Computador;

public class Main {

	public static void main(String[] args) {
		
		Monitor monitor = new Monitor("Aopen", "Gamer", "1920x1080");
		Mouse mouse = new Mouse("Logitech", "Gamer");
		Teclado teclado = new Teclado("Hyperx", "Gamer");
		HD hd = new HD("Kingston", "HardDisk", 1024, 300);
		Memoria memoria = new Memoria("Kingston", "FuryS", 32000, 3600);
		Processador processador = new Processador("Intel", "i5", 4.2f, 24);
		PlacaMae pm = new PlacaMae("Gigabyte", "b560m", processador, hd, memoria);
		Gabinete gabinete = new Gabinete("Simple", "Preto", 12, pm);
		Computador computador = new Computador(220, 10, "IBM", "x64", gabinete, teclado, mouse, monitor);
		
		System.out.println(computador);

	}

}
