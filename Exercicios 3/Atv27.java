package exercicios3;
import java.util.Scanner;
public class Atv27 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		int x = 1;
		do {
			int i = 0;
			float[] preco = new float[999];
			float soma = 0;
			do {
				System.out.println("Informe o preço do produto "+(i+1)+": ");
				i++;
				preco[i] = in.nextFloat();
				soma += preco[i];
			} while (preco[i] != 0);
			for (int j = 1; j <= i; j++) {
				System.out.println("Produto "+j+": R$"+preco[j]);
			}
			System.out.println("Total: R$"+soma);
			System.out.println("Quanto em dinheiro o cliente pagou: ");
			float dinheiro = in.nextFloat();
			System.out.println("Dinheiro: R$"+dinheiro);
			float troco = dinheiro - soma;
			System.out.println("Troco: R$"+troco);
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("Pressione 1 para repetir e 0 para sair.");
			x = in.nextInt();
		} while (x == 1);
		System.out.println("Operação finalizada!");
		in.close();
	}
}
