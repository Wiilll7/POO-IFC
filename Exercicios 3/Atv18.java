package exercicios3;
import java.util.Scanner;
public class Atv18 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		boolean primo;
		primo = false;
		String cont = " ";
		System.out.println("Insira um número inteiro: ");
		int num = in.nextInt();
		if (num < 1) {
			System.out.println("Não é primo.");
		} else if (num == 1) {
			System.out.println("É primo.");
		} else if (num > 1) {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					for (int j = 1; j <= num; j++) {
						if (num % j == 0) {
							cont += " "+j;
						}
					}
					System.out.println("Ele é divisivel por: "+cont);
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