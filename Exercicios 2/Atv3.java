package exercicios2;
import java.util.Scanner;
public class Atv3 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		char letra = in.nextLine().charAt(0);
		if (letra =='m') {
			System.out.println("M - Masculino");
		} else if (letra == 'F') {
			System.out.println("F - Feminino");
		} else {
			System.out.println("Letra Inválida.");
		}
		in.close();
	}
}
