package exercicios4;
import java.util.Scanner;
import java.util.Random;
public class Atv8 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		int tam;
		Random random = new Random();
		String alfabeto = "abcdefghijklmnopqrstuvwxyz";
		String senha = "";
		int pos;
		char val;
		do {
			System.out.println("Insira o tamanho da senha: ");
			tam = in.nextInt();
		} while (tam < 1 && tam > 25);
		char[] letra = new char[26];
		for (int i = 0; i < 26; i++) {
			letra[i] = alfabeto.charAt(i);
		}
		for (int i = 0; i < tam; i++) {
			if (i % 2 != 0) {
				do {
					pos = random.nextInt(alfabeto.length());
					val = letra[pos];
				} while (val != 'a' && val != 'e' && val != 'i' && val != 'o' && val != 'u');
				senha += val;
			} else {
				do {
					pos = random.nextInt(alfabeto.length());
					val = letra[pos];
				} while (val == 'a' || val == 'e' || val == 'i' || val == 'o' || val == 'u');
				senha += val;
			}
		}
		System.out.println("A sua senha gerada aleatória é: "+senha);
		in.close();
	}
}
