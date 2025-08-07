import java.util.Scanner;
public class Atv12 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Insira sua altura: ");
		float h = in.nextFloat();
		double pesoH = (72.7 * h) - 58;
		double pesoM = (62.1*h) - 44.7;
		System.out.println("O peso ideal para homens é: " + pesoH);
		System.out.println("O peso ideal para mulheres é: " + pesoM);
		in.close();
	}
}
