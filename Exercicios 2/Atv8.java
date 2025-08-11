package exercicios2;
import java.util.Scanner;
public class Atv8 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Insira sua primeira nota: ");
		float nota1 = in.nextFloat();
		System.out.println("Insira sua segunda nota: ");
		float nota2 = in.nextFloat();
		double media = (nota1 + nota2)/2;
		if (media >= 7) {
			System.out.println("Aprovado!");
		} else {
			System.out.println("Reprovado!");
		}
		in.close();
	}
}
