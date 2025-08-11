package exercicios2;
import java.util.Scanner;
public class Atv16 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Insira a primeira nota do semestre: ");
		float nota1 = in.nextFloat();
		System.out.println("Insira a segunda nota do semestre: ");
		float nota2 = in.nextFloat();
		double media = (nota1 + nota2)/2;
		if (media >= 0 && media < 3) {
			System.out.println("Reprovado.");
		} else if (media >= 3 && media < 7) {
			System.out.println("Em Exame.");
		} else if (media >= 7 && media <=10) {
			System.out.println("Aprovado.");
		} else {
			System.out.println("Notas inválidas.");
		}
		in.close();
	}
}
