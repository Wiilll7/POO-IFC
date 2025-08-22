package exercicios4;
import java.util.Scanner;
public class Atv6 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10;
		float[] media = new float[TAM];
		float nota = 0;
		int numAluno = 0;
		for (int i = 0; i < TAM; i++) {
			System.out.println("Aluno "+(i+1)+", insira a sua nota 1: ");
			nota += in.nextFloat();
			System.out.println("Aluno "+(i+1)+", insira a sua nota 2: ");
			nota += in.nextFloat();
			System.out.println("Aluno "+(i+1)+", insira a sua nota 3: ");
			nota += in.nextFloat();
			System.out.println("Aluno "+(i+1)+", insira a sua nota 4: ");
			nota += in.nextFloat();
			media[i] = nota / 4;
			nota = 0;
			if (media[i] >= 7) {
				numAluno++;
			}
		}
		System.out.println("Alunos com media maior ou igual a 7: "+numAluno);
		in.close();
	}
}
