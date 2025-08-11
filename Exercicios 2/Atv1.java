package exercicios2;
import java.util.Scanner;
public class Atv1 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Entre com um numero: ");
		int num1 = in.nextInt();
		System.out.println("Entre com outro numero: ");
		int num2 = in.nextInt();
		if (num1 > num2) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}
		in.close();
	}
}
