import java.util.Scanner;
public class Atv2 {
	public static void main(String[]args) {
		System.out.println("Entre com um numero: ");
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		System.out.println("O número informado foi: " + num1);
		in.close();
	}
}
