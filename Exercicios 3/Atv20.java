package exercicios3;
import java.util.Scanner;
public class Atv20 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		float notas = 0;
		System.out.println("Insira o numero de notas: ");
		int numNota = in.nextInt();
		for (int i = 1; i <= numNota; i++) {
			System.out.println("Insira sua "+i+" nota: ");
			notas += in.nextFloat();
		}
		notas = notas / numNota;
		System.out.println("Sua média é: "+notas);
		in.close();
	}
}
