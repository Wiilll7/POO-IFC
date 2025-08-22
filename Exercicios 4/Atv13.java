package exercicios4;
import java.util.Scanner;
public class Atv13 {
	public static void main (String[]args) {
		
		Scanner in = new Scanner(System.in);
		
		final int TAM = 10;
		int[] prim = new int[TAM];
		int[] seg = new int[TAM];
		int[] terc = new int[20];
		int contP = 0;
		int contS = 0;
		
		for (int i = 0; i < TAM; i++) {
			System.out.println("Insira o "+(i+1)+" valor para o primeiro vetor: ");
			prim[i] = in.nextInt();
			System.out.println("Insira o "+(i+1)+" valor para o segundo vetor: ");
			seg[i] = in.nextInt();
		}
		
		for (int i = 0; i < 20; i++) {
			if (i % 2 == 0) {
				terc[i] = prim[contP];
				contP++;
			} else {
				terc[i] = seg[contS];
				contS++;
			}
			System.out.println((i+1)+" local do terceiro vetor: "+terc[i]);
		}
		
		in.close();
	}
}
