package exercicios4;
import java.util.Scanner;
public class Atv9 {
	public static void mani (String[]args) {
		Scanner in = new Scanner(System.in);
		String texto;
		int pos = 0;
		System.out.println("Entre com o texto: ");
		texto = in.nextLine();
		char[] letras = new char[texto.length()];
		for (int i = 0; i < texto.length(); i++) {
			if (texto.charAt(i) != ' ') {
				letras[pos] = texto.charAt(i);
				pos++;
			}
		}
		for (int i = 0; i < pos; i++) {
			System.out.println("Char armazenado na posição "+i+": "+letras[i]);
		}
		in.close();
	}
}
