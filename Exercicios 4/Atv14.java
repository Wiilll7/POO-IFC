package exercicios4;
import java.util.Scanner;
public class Atv14 {
	public static void main (String[]args) {
		
		Scanner in = new Scanner(System.in);
		
		final int TAM = 30;
		int[] idades = new int[TAM];
		float[] alturas = new float[TAM];
		float med = 0;
		int cont = 0;
		
		for (int i = 0; i < TAM; i++) {
			System.out.println("Insira a idade da pessoa "+(i+1)+": ");
			idades[i] = in.nextInt();
			System.out.println("Insira a altura dessa pessoa: ");
			alturas[i] = in.nextFloat();
			med += alturas[i];
		}
		
		med = med / TAM;
		
		for (int i = 0; i < TAM; i++) {
			if (idades[i] > 13) {
				if (alturas[i] < med) {
					cont++;
				}
			}
		}
		
		System.out.println(cont+" pessoas com mais de 13 anos estão abaixo da média de altura.");
		in.close();
		
	}
}
