package exercicios2;
import java.util.Scanner;
public class Atv18 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Informe o primeiro lado de um triangulo: ");
		int lado1 = in.nextInt();
		System.out.println("Informe o segundo lado de um triangulo: ");
		int lado2 = in.nextInt();
		System.out.println("Informe o terceiro lado de um triangulo: ");
		int lado3 = in.nextInt();
		if ((lado1 + lado2) > lado3 || (lado1 + lado3) > lado2 || (lado2 + lado3) > lado1) {
			if (lado1 == lado2 && lado1 == lado3) {
				System.out.println("O triângulo é equilátero.");
			} else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
				System.out.println("O triângulo é escaleno.");
			} else {
				System.out.println("O triângulo é isósceles.");
			}
		} else {
			System.out.println("Não é um triângulo.");
		}
		in.close();
	}
}
