import java.util.Scanner;
public class Atv9 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Entre com a temperatura em Farenheit: ");
		float tempF = in.nextFloat();
		double tempC = (tempF - 32)/1.8;
		System.out.println("A temperatura em celsius é: " + tempC);
		in.close();
	}
}
