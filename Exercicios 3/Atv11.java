package exercicios3;
import java.util.Scanner;
public class Atv11 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		int[] num;
		num = new int[10];
		int par = 0;
		int impar = 0;
		for (int i = 0; i<10; i++) {
			System.out.println("Insira um numero: ");
			num[i] = in.nextInt();
			if (num[i] % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		System.out.println("Números pares: "+par+"\n"+
						   "Números ímpares: "+impar);
		in.close();
	}
}
