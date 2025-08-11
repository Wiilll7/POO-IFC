package exercicios2;
import java.util.Scanner;
public class Atv22 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Insira um numero maior que 0 e menor que 1000");
		int num = in.nextInt();
		int centena = (num % 1000) / 100;
		int dezena = (num%100) / 10;
		int unidade = num % 10;
		if ((num > 0) && (num <10)) {
			System.out.println(num+" = "+unidade+" unidades.");
		} else if ((num > 0) && (num < 100)) {
			System.out.println(num+" = "+dezena+" dezenas e "+unidade+" unidades.");
		} else if ((num > 0) && (num < 1000)) {
			System.out.println(num+" = "+centena+" centenas e "+dezena+ " dezenas e "+unidade+" unidades.");
		} else {
			System.out.println("Número inváludo.");
		}
		in.close();
	}
}
