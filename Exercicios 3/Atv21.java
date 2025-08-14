package exercicios3;
import java.util.Scanner;
public class Atv21 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		int idades = 0;
		System.out.println("Informe a quantidade de pessoas: ");
		int pessoas = in.nextInt();
		for (int i = 1; i <= pessoas; i++) {
			System.out.println("Insira a idade da "+i+" pessoa: ");
			idades += in.nextInt();
		}
		idades = idades / pessoas;
		if (idades <= 25) {
			System.out.println("Turma jovem.");
		} else if (idades < 60) {
			System.out.println("Turma adulta.");
		} else {
			System.out.println("Turma idosa.");
		}
		in.close();
	}
}
