package exercicios3;
import java.util.Scanner;
public class Atv24 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		float valorCD;
		float valorTotal = 0;
		System.out.println("Informe a quantidade de CD que você tem: ");
		int cd = in.nextInt();
		for (int i = 1; i <= cd; i++) {
			System.out.println("Informe o valor do "+i+" CD: ");
			valorTotal += in.nextFloat();
		}
		valorCD = valorTotal / cd;
		System.out.println("Valor total investido na coleção: "+valorTotal+"\n"+
						   "Valor médio gasto em cada CD: "+valorCD);
		in.close();
	}
}
