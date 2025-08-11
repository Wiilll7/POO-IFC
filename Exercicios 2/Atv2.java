package exercicios2;
import java.util.Scanner;
public class Atv2 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Entre com um numero: ");
		int num = in.nextInt();
		if (num > 0) {
			System.out.println("É maior que zero");
			} else if (num < 0) {
				System.out.println("É menor que zero");
			} else { 
				System.out.println("É zero");
			}
		in.close();
	}
}
