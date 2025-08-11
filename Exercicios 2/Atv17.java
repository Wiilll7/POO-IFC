package exercicios2;
import java.util.Scanner;
public class Atv17 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Insira a primeira nota do semestre: ");
		float nota1 = in.nextFloat();
		System.out.println("Insira a segunda nota do semestre: ");
		float nota2 = in.nextFloat();
		double media = (nota1 + nota2)/2;
		char conceito = ' ';
		if (media >= 0 && media < 4) {
			conceito = 'E';
		} else if (media >= 4 && media < 6) {
			conceito = 'D';
		} else if (media >=6 && media < 7.5) {
			conceito = 'C';
		} else if (media >= 7.5 && media < 9) {
			conceito = 'B';
		} else if (media >= 9 && media <= 10) {
			conceito = 'A';
		} else {
			System.out.println("Notas inválidas.");
		}
		if (conceito == 'A' || conceito == 'B' || conceito == 'C') {
			System.out.println("APROVADO");
		} else if (conceito == 'D' || conceito == 'E') {
			System.out.println("REPROVADO");
		}
		in.close();
	}
}
