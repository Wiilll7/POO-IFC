package exercicios3;
import java.util.Scanner;
public class Atv12 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Entre com o valor de casa n: ");
		int casa = in.nextInt();
		int i = 1;
		int num1 = 0;
		int num2 = 1;
		int num3;
		System.out.println("1");
		while (i <= casa) {
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			System.out.println(num3);
			i++;
		}
		in.close();
	}
}
