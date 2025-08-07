import java.util.Scanner;
public class Atv10 {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Entre com um valor Inteiro: ");
		int int1 = in.nextInt();
		System.out.println("Entre com outro Inteiro: ");
		int int2 = in.nextInt();
		System.out.println("Entre com um valor Real: ");
		float real = in.nextFloat();
		System.out.println("o produto do dobro do primeiro com metade do segundo: " + ((2*int1) * (int2/2)));
		System.out.println("a soma do triplo do primeiro com o terceiro: " + ((3*int1) + real));
		System.out.println("o terceiro elevado ao cubo: " + Math.pow(real, 3));
		in.close(); 
	}
}
