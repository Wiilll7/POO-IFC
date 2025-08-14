package exercicios3;
import java.util.Scanner;
public class Atv14 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Insira quantas casas voce deseja ver do numero: ");
		int casas = in.nextInt();
		int base = 1;
		int cima = 1;
		for (int i = 1; i <= casas; i++) {
			System.out.println(cima+"/"+base);
			cima++;
			base += 2;
		}
		in.close();
	}
}
