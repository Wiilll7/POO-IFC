package exercicios4;
import java.util.Scanner;
public class Atv5 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 20;
		int[] num = new int[TAM];
		int[] par = new int[TAM];
		int[] impar = new int[TAM];
		int cPar = 0;
		int cImpar = 0;
		for (int i = 0; i < TAM; i++) {
			System.out.println("Insira um número inteiro: ");
			num[i] = in.nextInt();
			if (num[i] % 2 == 0) {
				par[cPar] = num[i];
				cPar++;
			} else {
				impar[cImpar] = num[i];
				cImpar++;
			}
		}
		for (int i = 0; i < TAM; i++) {
			System.out.println("Vetor com todos os numeros, posição "+i+": "+num[i]);
		}
		System.out.println("\n");
		for (int i = 0; i < cPar; i++) {
			System.out.println("Vetor de pares, posição "+i+": "+par[i]);
		}
		System.out.println("\n");
		for (int i = 0; i < cImpar; i++) {
			System.out.println("Vetor de impares, posição "+i+": "+impar[i]);
		}
		in.close();
	}
}
