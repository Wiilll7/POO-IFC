import java.util.Scanner;
public class Atv3 {
	public static void main(String[]args) {
		System.out.println("Entre com um valor: ");
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		System.out.println("Entre com outro valor: ");
		int num2 = in.nextInt();
		var soma = num1 + num2;
		System.out.println("A soma dos dois números é: " + soma);
		in.close();
		
	}
}
