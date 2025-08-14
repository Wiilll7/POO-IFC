package exercicios3;
import java.util.Scanner;
public class Atv22 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		int voto;
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		System.out.println("Insira a quantidade de votantes: ");
		int votantes = in.nextInt();
		for (int i = 0; i < votantes; i++) {
			System.out.println("Votante "+i+", escolha em qual candidato deseja votar: \n"+
							   "1. Candidato 1. \n"+
							   "2. Candidato 2. \n"+
							   "3. Candidato 3.");
			voto = in.nextInt();
			if (voto == 1) {
				c1++;
			} else if (voto == 2) {
				c2++;
			} else {
				c3++;
			}
		}
		System.out.println("Candidato 1: "+c1+"\n"+
						   "Candidato 2: "+c2+"\n"+
						   "Candidato 3: "+c3);
		in.close();
	}
}