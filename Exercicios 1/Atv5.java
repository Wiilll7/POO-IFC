import java.util.Scanner;
public class Atv5 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Entre com um valor em metros: ");
		float num = in.nextFloat();
		var res = num * 100;
		System.out.println("O valor em centimetros é: " + res);
		in.close();
	}
}
