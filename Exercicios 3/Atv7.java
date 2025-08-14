package exercicios3;
import java.util.Scanner;
public class Atv7 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Insira o primeiro número inteiro: ");
		int num1 = in.nextInt();
		System.out.println("Insira o segundo número inteiro: ");
		int num2 = in.nextInt();
		if (num1 > num2) {
			int troca = num1;
			num1 = num2;
			num2 = troca;
		}
		while (num1 < num2) {
			System.out.println(num1);
			num1++;
		}
		in.close();
	}
}
