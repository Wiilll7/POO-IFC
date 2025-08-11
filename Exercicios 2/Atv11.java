package exercicios2;
import java.util.Scanner;
public class Atv11 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Em que turno voce esta? \n"+
						   "M - Matutino. \n"+
						   "V - Vespertino. \n"+
						   "N - Noturno. \n");
		char turno = in.nextLine().charAt(0);
		if (turno == 'M' || turno == 'm') {
			System.out.println("Bom dia!");
		} else if (turno == 'V' || turno == 'v') {
			System.out.println("Boa tarde!");
		} else if (turno == 'N' || turno == 'n') {
			System.out.println("Boa noite!");
		} else {
			System.out.println("Turno inserido inválido.");
		}
		in.close();
	}
}
