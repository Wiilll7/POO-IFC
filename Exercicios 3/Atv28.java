package exercicios3;
import java.util.Scanner;
public class Atv28 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		int x = 1;
		int i = 1;
		float temp;
		float maior = -99999;
		float menor = 99999;
		do {
			System.out.println("Informe a temperatura "+i+": ");
			temp = in.nextFloat();
			if (temp > maior) {
				maior = temp;
			} 
			if (temp < menor) {
				menor = temp;
			}
			i++;
			System.out.println("Digite 1 para adicionar mais uma temperatura e 0 para parar.");
			x = in.nextInt();
		} while (x == 1);
		System.out.println("A temperatura mais alta é: "+maior);
		System.out.println("A temperatura mais baixa é: "+menor);
		in.close();
	}
}
