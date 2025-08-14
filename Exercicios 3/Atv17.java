package exercicios3;
import java.util.Scanner;
public class Atv17 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		boolean primo;
		primo = false;
		System.out.println("Insira um número inteiro: ");
		int num = in.nextInt();
		if (num < 1) {
			System.out.println("Não é primo.");
		} else if (num == 1) {
			System.out.println("É primo.");
		} else if (num > 1) {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					primo = false;
					break;
				} else {
					primo = true;
				}
			}
		}
		if (primo == true) {
			System.out.println("É primo.");
		} else {
			System.out.println("Não é primo.");
		}
		in.close();
	}
}
