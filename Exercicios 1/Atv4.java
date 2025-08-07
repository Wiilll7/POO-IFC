import java.util.Scanner;
public class Atv4 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Entre com a sua primeira nota: ");
		float nota1 = in.nextFloat();
		System.out.println("Entre com a sua segunda nota: ");
		float nota2 = in.nextFloat();
		System.out.println("Entre com a sua terceira nota: ");
		float nota3 = in.nextFloat();
		System.out.println("Entre com a sua quarta nota: ");
		float nota4 = in.nextFloat();
		var media = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.println("A sua m média bimestral é de: " + media);
		in.close();
	}
}
