package exercicios2;
import java.util.Scanner;
public class Atv14 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Insira um dia correspondente da semana. (1-Domingo, 2- Segunda, etc.)");
		int dia = in.nextInt();
		if (dia == 1) {
			System.out.println("Domingo.");
		} else if (dia == 2) {
			System.out.println("Segunda.");
		} else if (dia == 3) {
			System.out.println("Terça.");
		} else if (dia == 4) {
			System.out.println("Quarta.");
		} else if (dia == 5) {
			System.out.println("Quinta.");
		} else if (dia == 6) {
			System.out.println("Sexta.");
		} else if (dia == 7) {
			System.out.println("Sabado.");
		} else {
			System.out.println("Valor inválido.");
		}
		in.close();
	}
}
