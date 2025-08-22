package exercicios4;
import java.util.Scanner;
public class Atv7 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 5;
		int[] num = new int[TAM];
		int soma = 0;
		int mult = 0;
		for (int i = 0; i < TAM; i++) {
			System.out.println("Informe um número: ");
			num[i] = in.nextInt();
			soma += num[i];
			if (i == 0) {
				mult = num[i];
			} else {
				mult = mult + (mult*num[i]);
			}
		}
		System.out.println("Todos os números: ");
		for (int i = 0; i < TAM; i++) {
			System.out.println(num[i]);
		}
		System.out.println(" ");
		System.out.println("Soma dos números: "+soma);
		System.out.println(" ");
		System.out.println("Multiplicação dos números: "+mult);
		in.close();
	}
}
