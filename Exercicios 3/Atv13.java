package exercicios3;
import java.util.Scanner;
public class Atv13 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Entre com o número da fatorial: ");
		int num = in.nextInt();
		int fatorial = 1;
		for (int i = num; i > 0; i--) {
			fatorial *= i;
		}
		System.out.println(fatorial);
		in.close();
	}
}
