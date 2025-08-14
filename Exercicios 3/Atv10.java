package exercicios3;
import java.util.Scanner;
public class Atv10 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Insira o número de base: ");
		int base = in.nextInt();
		System.out.println("Insira o número do expoente: ");
		int expoente = in.nextInt();
		int res = 1;
		while (expoente >= 1) {
			expoente--;
			res = res * base;
		}
		System.out.println(res);
		in.close();
	}
}
