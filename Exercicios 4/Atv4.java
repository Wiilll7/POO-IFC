package exercicios4;
import java.util.Scanner;
public class Atv4 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10;
		char[] letra = new char[TAM];
		int cons = 0;
		for (int i = 0; i < TAM; i++) {
			System.out.println("Informe um caracter: ");
			letra[i] = in.nextLine().charAt(0);
		}
		for (int i = 0; i < TAM; i++) {
			if (letra[i] != 'a' && letra[i] != 'e' && letra[i] != 'i' && letra[i] != 'o' && letra[i] != 'u') {
				cons++;
				System.out.println(letra[i]);
			}
		}
		System.out.println("Número de consoantes: "+cons);
		in.close();
	}
}
