package exercicios4;
import java.util.Scanner;
public class Atv15 {
	public static void main (String[]args) {
		
		Scanner in = new Scanner(System.in);
		
		final int TAM = 5;
		int[] num = new int[TAM];
		
		for (int i = 0; i < TAM; i++) {
			do {
				System.out.println("Insira o "+(i+1)+" valor: ");
				num[i] = in.nextInt();
				if (num[i] < 0 || num[i] > 20) {
					System.out.println("Números aceitos apenas entre 0 e 20.");
				}
			} while (num[i] < 0 || num[i] > 20);
		}
		
		for (int i = 0; i < TAM; i++) {
			String tab = "";
			for (int j = 0; j < num[i]; j++) {
				tab += "#";
			}
			System.out.println(num[i]+": "+tab);
		}
		
		in.close();
		
	}
}
