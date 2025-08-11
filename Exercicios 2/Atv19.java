package exercicios2;
import java.util.Scanner;
public class Atv19 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Insira o valor de A: ");
		int a = in.nextInt();
		if (a != 0) {
			System.out.println("Insira o valor de B: ");
			int b = in.nextInt();
			System.out.println("Insira o valor de C: ");
			int c = in.nextInt();
			double delta = (Math.pow(b, 2) - (4*a*c));
			if (delta < 0) {
				System.out.println("A expressão não possui raízes reais.");
			} else if (delta == 0) {
				double raiz = (-b) / (2*a);
				System.out.println("A expressão possui apenas uma raíz, sendo ela: x = "+raiz);
			} else {
				double raizDelta = Math.sqrt(delta);
				double raiz1 = ((-b)+raizDelta) / (2*a);
				double raiz2 = ((-b)-raizDelta) / (2*a);
				System.out.println("A expressão possui duas raízes:\n"+
								   "Raíz 1: x = "+raiz1+"\n"+
								   "Raíz 2: x = "+raiz2);
			}
		} else {
			System.out.println("Não é uma equação do segundo grau.");
		}
		in.close();
	}
}
