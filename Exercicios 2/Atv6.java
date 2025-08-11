package exercicios2;
import java.util.Scanner;
public class Atv6 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Entre com um numero: ");
		int num = in.nextInt();
		if ((num % 2) == 0) {
			System.out.println("Transformado em impar: " + (num+1));
		} else {
			System.out.println("Transformado em par: " + (num+1));
		}
		in.close();
	}
}
