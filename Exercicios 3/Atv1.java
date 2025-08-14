package exercicios3;
import java.util.Scanner;
public class Atv1 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		float nota = 0;
		do {
			System.out.println("Insira uma nota entre zero e dez: ");
			nota = in.nextFloat();
			if (nota < 0 || nota > 10) {
				System.out.println("Nota inválida.");
			}
		} while (nota < 0 || nota > 10);
		System.out.println("Fim do programa.");
		in.close();
	}
}
