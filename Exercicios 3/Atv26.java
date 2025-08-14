package exercicios3;
import java.util.Scanner;
public class Atv26 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Informe o preço de cada pão: ");
		float pao = in.nextFloat();
		float preco = 0;
		for (int i = 1; i <= 50; i++) {
			System.out.println(i+" - R$"+(preco += pao));
		}
		in.close();
	}
}
