package exercicios2;
import java.util.Scanner;
public class Atv10 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Insira um numero: ");
		int num1 = in.nextInt();
		System.out.println("Insira outro numero: ");
		int num2 = in.nextInt();
		System.out.println("Insira outro numero: ");
		int num3 = in.nextInt();
		if (num1 > num2 && num1 > num3) {
			System.out.println("O maior é: "+ num1);
			if (num2 > num3) {
				System.out.println("O menor é: "+ num3);
			} else {
				System.out.println("O menor é: "+ num2);
			}
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("O maior é: "+ num2);
			if (num1 > num3) {
				System.out.println("O menor é: "+ num3);
			} else {
				System.out.println("O menor é: "+ num1);
			}
		} else if (num3 > num1 && num3 > num2) {
			System.out.println("O maior é: "+ num3);
			if (num1 > num2) {
				System.out.println("O menor é: "+ num2);
			} else {
				System.out.println("O menor é: "+ num1);
			}
		} else {
			System.out.println("Todos são iguais.");
		}
		
		in.close();
	}
}
