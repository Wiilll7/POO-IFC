package exercicios4;
import java.util.Scanner;
public class Atv2 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10;
		float[] num = new float[TAM];
		for (int i = 0; i < TAM; i++) {
			System.out.println("Insira o numero para alocar na posição "+i+": ");
			num[i] = in.nextInt();
		}
		for (int i = TAM; i > 0;) {
			i--;
			System.out.println(i+" = "+num[i]);
		}
		in.close();
	}
}
