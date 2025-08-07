import java.util.Scanner;
public class Atv13 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		float multa = 0;
		float excesso = 0;
		int i = 0;
		do {
			System.out.println("Informe o peso do peixe, em kg: ");
			float peso = in.nextFloat();
			if (peso > 50) {
				excesso = excesso + (peso - 50);
				multa = multa + (4 * (peso - 50));
			}
			System.out.println(
							"Quer contabilizar mais um peixe?\n"+
							"0. não\n"+
							"1. sim\n");
			i = in.nextInt();
		} while (i == 1);
		System.out.println("O total de peso excedente foi de: "+ excesso +" Kg.");
		System.out.println("O total de multa a se pagar é de: "+ multa +" reais.");
		in.close();
	}
}
