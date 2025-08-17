package exercicios3;
import java.util.Scanner;
public class Atv37 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		int x = 1;
		int alunos = 0;
		int notaTotal = 0;
		int maior = 0;
		int menor = 11;
		System.out.println("(Professor) Informe o gabarito: ");
		String gabarito = in.nextLine();
		do {
			int nota = 0;
			alunos++;
			System.out.println("Aluno "+alunos+", informe seu gabarito: ");
			String gabaritoA = in.nextLine();
			for (int i = 0; i < 10; i++) {
				if (gabarito.charAt(i) == gabaritoA.charAt(i)) {
					nota++;
					notaTotal++;
				}
			}
			if (nota > maior) {
				maior = nota;
			}
			if (nota < menor) {
				menor = nota;
			}
			System.out.println( "Quer colocar o gabarito de mais um aluno? \n"+
								"1. Sim \n"+
								"2. Não");
			x = in.nextInt();
			in.nextLine();
		} while (x == 1);
		System.out.println( "Maior nota: "+maior+"\n"+
							"Menor nota: "+menor+"\n"+
							"Total de alunos: "+alunos+"\n"+
							"Média das notas: "+(notaTotal / alunos));
		in.close();
	}
}
