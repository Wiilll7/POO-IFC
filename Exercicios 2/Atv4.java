package exercicios2;
import java.util.Scanner;
public class Atv4 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Insira um ano, com os 4 digitos: ");
		int ano = in.nextInt();
		int ultimos = ano % 100;
		if (ultimos != 0) {
			if ((ano % 4) ==0) {
				System.out.println("É bissexto");
			} else {
				System.out.println("Não é bissexto");
			}
		} else if ((ano % 400) == 0) {
			System.out.println("É bissexto");
		} else {
			System.out.println("Não é bissexto");
		}
	in.close();
	}
}
