package exercicios4;
import java.util.Scanner;
public class Atv11 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Insira suas palavras separados por ';' : ");
		String palavra = in.nextLine();
		String[] res = palavra.split(";");
		int tam = res.length;
		for (int i = 0; i < tam; i++) {
			System.out.println(res[i]);
		}
		in.close();
	}
}
