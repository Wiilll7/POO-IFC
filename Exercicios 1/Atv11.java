import java.util.Scanner;
public class Atv11 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Insira sua altura: ");
		float altura = in.nextFloat();
		double pesoI = (72.7 * altura) - 58;
		System.out.println("O seu peso ideal é: " + pesoI);
		in.close();
	}
}
