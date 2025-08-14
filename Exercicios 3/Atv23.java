package exercicios3;
import java.util.Scanner;
public class Atv23 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		boolean qnt = true;
		int alunos;
		float total = 0;
		System.out.println("Informe o número de turmas: ");
		int turma = in.nextInt();
		for (int i = 1; i <= turma; i++) {
			do {
				System.out.println("Informe a quantidade de alunos da turma "+i+": ");
				alunos = in.nextInt();
				if (alunos < 0 || alunos > 40) {
					qnt = false;
					System.out.println("O número de alunos deve ser entre 0 e 40.");
				} else {
					qnt = true;
				}
			} while (qnt == false);
			total += alunos;
		}
		total = total / turma;
		System.out.println("A média de alunos por turma é: "+total);
		in.close();
	}
}
