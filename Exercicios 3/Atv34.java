package exercicios3;
import java.util.Scanner;
public class Atv34 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		int num = 0;
		int um = 0;
		int dois = 0;
		int tres = 0;
		int quatro = 0;
		do {
			System.out.println("Insira o número: ");
			num = in.nextInt();
			if (num >= 0 && num <= 25) {
				um++;
			} else if (num > 25 && num <= 50) {
				dois++;
			} else if (num > 50 && num <= 75) {
				tres++;
			} else if (num > 75 && num <= 100) {
				quatro++;
			}
		} while (num >= 0);
		System.out.println( "[0, 25] - "+um+"\n"+
							"[26, 50] - "+dois+"\n"+
							"[51, 75] - "+tres+"\n"+
							"[76, 100] - "+quatro);
		in.close();
	}
}
