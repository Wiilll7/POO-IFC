package exercicios3;
import java.util.Scanner;
public class Atv9 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Entre com o valor inteiro da tabuada: ");
		int num = in.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(num+" x "+i+" = "+num * i);
		}
		in.close();
	}
}
