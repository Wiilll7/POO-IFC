package exercicios4;
import java.util.Scanner;
public class Atv3 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 4;
		float[] notas = new float[TAM];
		float media = 0;
		for (int i = 0; i < TAM; i++) {
			System.out.println("Insira sua "+(i+1)+" nota: ");
			notas[i] = in.nextFloat();
			media += notas[i];
		}
		for (int i = 0; i < TAM; i++) {
			System.out.println("Nota "+(i+1)+": "+notas[i]);
		}
		media = (media/4);
		System.out.println("Média: "+media);
		in.close();
	}
}
