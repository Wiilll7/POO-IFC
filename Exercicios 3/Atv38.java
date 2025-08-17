package exercicios3;
import java.util.Scanner;
public class Atv38 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Insira um numero inteiro positivo: ");
		int num = in.nextInt();
		String numeros = Integer.toString(num);
		for (int i = (numeros.length() - 1); i >= 0; i--) {
			System.out.print(numeros.charAt(i));
		}
		in.close();
	}
}
