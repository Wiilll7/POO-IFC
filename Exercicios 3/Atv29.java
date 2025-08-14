package exercicios3;
import java.util.Scanner;
public class Atv29 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Montar a tabuada de: ");
		int tab = in.nextInt();
		System.out.println("Começar por: ");
		int inicio = in.nextInt();
		System.out.println("Terminar por: ");
		int fim = in.nextInt();
		if (inicio > fim) {
			int troca = inicio;
			inicio = fim;
			fim = troca;
			System.out.println("Você inseriu o inicio e fim invertidos.");
		}
		for (int i = inicio; i <= fim; i++) {
			System.out.println(tab+" x "+i+" = "+(i*tab));
		}
		in.close();
	}
}
