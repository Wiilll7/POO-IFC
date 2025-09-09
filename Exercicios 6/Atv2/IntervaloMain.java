package exercicios6.Atv2;
import java.util.Scanner;

public class IntervaloMain {

	public static void main(String[] args) {
		
		Intervalo I = new Intervalo();
		Scanner in = new Scanner(System.in);
		int inicio;
		int fim;
		
		System.out.println("Insira o inicio do intervalo: ");
		inicio = in.nextInt();
		
		System.out.println("Insira o fim do intervalo: ");
		fim = in.nextInt();
		
		I.setInicio(inicio);
		I.setFim(fim);
		
		System.out.println(I);
		
		in.close();
		
	}

}
