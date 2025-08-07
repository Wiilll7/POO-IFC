import java.util.Scanner;
public class Atv6 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Informe o raio do circuo: ");
		float raio = in.nextFloat();
		double area = 3.14 * Math.pow(raio, 2);
		System.out.println("A area do circulo é: " + area);
		in.close();
	}
}
