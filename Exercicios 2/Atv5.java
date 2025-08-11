package exercicios2;
import java.util.Scanner;
public class Atv5 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Entre com uma letra maiuscula: ");
		char letra = in.nextLine().charAt(0);
		if ((letra == 'A') || (letra == 'E') || (letra == 'I') || (letra == 'O') || (letra == 'U')) {
			System.out.println("É vogal");
		} else {
			System.out.println("Não é vogal");
		}
		in.close();
	}
}
