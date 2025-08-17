package exercicios3;
import java.util.Scanner;
public class Atv31 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		int[] numAluno = new int[10];
		int[] alturaAluno = new int[10];
		int baixo = 9999;
		int alto = -9999;
		int numAlto = 0;
		int numBaixo = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("Insira o número do aluno "+(i+1)+": ");
			numAluno[i] = in.nextInt();
			System.out.println("Insira a altura desse aluno em centímetros: ");
			alturaAluno[i] = in.nextInt();
			if (alturaAluno[i] > alto) {
				alto = alturaAluno[i];
				numAlto = numAluno[i];
			}
			if (alturaAluno[i] < baixo) {
				baixo = alturaAluno[i];
				numBaixo = numAluno[i];
			}
		}
		System.out.println( "Aluno mais alto: \n"+
							"Número: "+numAlto+".\n"+
							"Altura: "+alto+" centímetros.");
		System.out.println( "Aluno mais baixo: \n"+
							"Número: "+numBaixo+".\n"+
							"Altura: "+baixo+" centímetros.");
		in.close();
	}
}
