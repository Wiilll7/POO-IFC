import java.util.Scanner;
public class Atv7 {
	public static void main(String[]agrs) {
		Scanner in = new Scanner(System.in);
		System.out.println("Informe o tamanho de um lado do quadrado: ");
		float side = in.nextFloat();
		double area = Math.pow(side, 2);
		System.out.println("A area do quadrado é: " + area);
		in.close();
	}
}
